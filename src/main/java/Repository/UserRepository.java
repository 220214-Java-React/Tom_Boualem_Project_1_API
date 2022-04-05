package Repository;

import java.sql.*;
import java.util.List;

import Util.ConnectionFactory;
import model.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class UserRepository implements DAO<User>{
    private static final Logger logger = LogManager.getLogger(UserRepository.class);
    @Override
    //Method to add the new admin to database-we must enter the NOT NULL values
    public void create(User user){
        // in this step  we write SQL to create a user to the DB
        Connection connection = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = "insert into ers_users (USER_id,username,Email,password,Given_Name,Surname,ROLE_ID) values (?,?,?,?,?,?,?)";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, user.getUserID());
            stmt.setString(2, user.getUsername());
            stmt.setString(3, user.getemail());
            stmt.setString(4, user.getPassword());
            stmt.setString(5, user.getGiven_Name());
            stmt.setString(6, user.getSurname());
            stmt.setString( 7,user.getrole());

            stmt.executeUpdate();
        } catch (SQLException e) {
            logger.warn(e.getMessage(), e);
        } finally {
            if(connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //---------------------------------------------------------------------
    public User getByUsername(String username){
        User user = null;

        try (Connection connection = ConnectionFactory.getConnection()) {
            String sql = "select * from ers_users where username = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, username);
            //-----------------
            ResultSet resultSet = stmt.executeQuery();
            //-----------------
            if(resultSet.next()){
                user = new User(
                        resultSet.getString("username"),
                        resultSet.getString("password")
                );
            }
        } catch (SQLException e) {
            logger.warn(e.getMessage(), e);
        }
        return user;
    }
  // I want to sort by the ROle_ID to make sure Admin is separete
    public User getRole_ID(String ROLE_ID){
        User user = null;
        try (Connection connection = ConnectionFactory.getConnection()) {
            String sql = "select * from ers_users where Role_ID = ('?')";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, ROLE_ID);
            ResultSet resultSet = stmt.executeQuery();
            if(resultSet.next()){
                user = new User(
                        resultSet.getString("username"),
                        resultSet.getString("password")
                );
            }
        } catch (SQLException e) {
            logger.warn(e.getMessage(), e);
        }
        return user;
    }
    //------------------------------------------------------------
    // select * from users where id = ?
    @Override
    public User getById(String user_id){
        User user = null;
        String sql = "select * from ers_users where user_id = (?)";
        Connection connection;
        try{
            connection = ConnectionFactory.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, user_id);

            ResultSet rs = stmt.executeQuery();

            if(rs.next()){
                user = new User(
                        rs.getString("username"),
                        rs.getString("password")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
    // select * from users
    @Override
    public List<User> getAll(){
        return null;
    }
    @Override
    public void update(User user){

    }
    // delete from users where id = ?
    @Override
    public void deleteById(String user_id){

    }
}
