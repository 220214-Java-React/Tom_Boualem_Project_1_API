package UserServices;
import model.User;

import java.security.NoSuchAlgorithmException;

import java.util.ArrayList;


public class Admin extends User {

    public void admin() throws NoSuchAlgorithmException {
        UserService login = new UserService();
        login.login();
        // NEED LOGIN VALIDATION
        Admin admin = new Admin();
        ArrayList<Admin> admins = new ArrayList<>();
        admins.add(admin);
        UserService userService = new UserService();
        userService.login();
        //-------------------------
        //currentUser

// the ad
    }

    public void createUser() throws NoSuchAlgorithmException {
        UserService register = new UserService();
        register.register();
    }

}
