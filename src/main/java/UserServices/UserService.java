package UserServices;
import Repository.UserRepository;
import model.User;
import org.apache.logging.log4j.Logger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import Util.ScannerFactory;
import org.apache.logging.log4j.LogManager;
public class UserService {
    private static User currentUser;
    private final Logger logger;
    private final Scanner scanner;
    private final MessageDigest messageDigest;
    private final UserRepository userRepository;
    public UserService() throws NoSuchAlgorithmException {
        this.logger = LogManager.getLogger(UserService.class);
        this.scanner = ScannerFactory.getScanner();
        this.messageDigest = MessageDigest.getInstance("SHA-512");
        this.userRepository = new UserRepository();
        currentUser = null;
    }
    public void register(){
        System.out.println("\n-- Create User --");
        userRepository.create(buildUser());
    }
    public User login(){
        System.out.println("\n Login ");
        return validate();
    }
    public static User getCurrentUser(){
        return currentUser;
    }
    private User validate(){
        User user = new User(getUsername(), getPassword());
        return isValid(user) ? user : null;
    }
    //-----------------------------------------------
    private boolean isValid(User user){
        User dbUser = userRepository.getByUsername(user.getUsername());
        if(dbUser != null){
            if(dbUser.getPassword().equals(user.getPassword())) {
                currentUser = dbUser;
                return true;
            }
        }
        System.out.println("Invalid credentials.");
        return false;
    }
    //---------------------------------------------------------
    private User buildUser(){

        User user = new User(getUserID(),getUsername(),getEmail(),
                getPassword(),getGiven_Name(),getSurName(),getRoleId());
        return !exists(user) ? user : buildUser();
    }
   //---------------------------------------------
    private String getUsername(){
        String username = "";
        boolean valid = false;
        while(!valid){
            System.out.print("Username: ");
            username = scanner.nextLine();

            //TODO: Username validation
            if(username.length() > 4){
                valid = true;
            } else {
                System.out.println("Username must be longer than 4 characters.");
            }
        }
        return username;
    }
    private String getPassword(){
        String password = "";
        boolean valid = false;

        while(!valid){
            System.out.print("Password: ");
            password = scanner.nextLine();

            //TODO: Password validation
            if(password.length() > 4){
                valid = true;
            } else{
                System.out.println("Password must be longer than 4 characters.");
            }
        }
        return encryptPassword(password);
    }
    //----------------------------------------------
 private String getUserID(){
        String userId;
     System.out.print("userId: ");
     userId = scanner.nextLine();
     return userId;
};
    private String getEmail(){
        String Email;
        System.out.print("Email: ");
        Email = scanner.nextLine();
        return Email;
    };
    private String getGiven_Name(){
        String Given_Name;
        System.out.print("Given_Name: ");
        Given_Name = scanner.nextLine();
        return Given_Name;
    }
    private String getSurName(){
        String SurName;
        System.out.print("SurName: ");
        SurName = scanner.nextLine();
        return SurName;
    };
    private String getRoleId(){
        String RoleID;
        System.out.print("Role ID: ");
        RoleID = scanner.nextLine();
        return RoleID;
    };

    private boolean exists(User user){
        // need to check if the username exists
        if (userRepository.getByUsername(user.getUsername()) == null){
            return false;
        } else{
            System.out.println("Username already exists.");
            return true;
        }

        // if method returns null -> the user doesnt exist !(true)

//        return !(userRepository.getUserByUsername(user.getUsername()) == null);

        // if it does, let them know and return true

        // if it doesn't return false
    }
    private String encryptPassword(String password){
        return new String(messageDigest.digest(password.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
    }


}
