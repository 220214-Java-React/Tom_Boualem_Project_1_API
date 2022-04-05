package Repository;


// Store reimbursements made by employee.

import Util.ConnectionFactory;
import model.Reimbursements;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReimbursementRepository {

<<<<<<< HEAD



=======
    private static final Logger logger = LogManager.getLogger(ReimbursementRepository.class);


    public void create(Reimbursements reimbursements) {
        Connection connection = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = "insert into ers_reimbursements(reimbursement_ID, amount, paymentID, author_ID, resolver_ID," +
                    "status_ID, type_ID, description, submitted, resolved)";

            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, reimbursements.getreimbursement_ID());
            stmt.setDouble(2, reimbursements.getamount());
            stmt.setString(3, reimbursements.getpaymentID());
            stmt.setString(4, reimbursements.getauthor_ID());
            stmt.setString(5, reimbursements.getresolver_ID());
            stmt.setString(6, reimbursements.getstatus_ID());
            stmt.setString(7, reimbursements.gettype_ID());
            stmt.setString(8, reimbursements.getdescription());
            stmt.setTimestamp(9, reimbursements.getsubmitted());
            stmt.setTimestamp(10, reimbursements.getresolved());


        } catch (SQLException e) {
            logger.warn(e.getMessage(), e);
            e.printStackTrace();
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

    // ------

    public Reimbursements getByreimbursement_ID(String reimbursement_ID) {
        Reimbursements reimbursements = null;
        try (Connection connection = ConnectionFactory.getConnection()) {
            String sql = "select * from ers_reimbursements where reimbursement_ID = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, reimbursement_ID);
            ResultSet resultSet = stmt.executeQuery();
            if(resultSet.next()) {
                reimbursements = new Reimbursements(
                        resultSet.getString("reimbursement_ID"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return reimbursements;
    }

>>>>>>> 709e8b99ff963207584a253b0256578399927c36
}
