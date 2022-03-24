package UserServices;
import model.User;

import java.security.NoSuchAlgorithmException;

import java.util.ArrayList;


public class Admin extends User {


    public void admin() throws NoSuchAlgorithmException {
        //Temporary


        UserService login = new UserService();
        login.login();
        // NEED LOGIN VALIDATION
        Admin admin = new Admin();
        ArrayList<Admin> admins  = new ArrayList<>();
        admins.add(admin);


        String option = null;
        System.out.println("Hello, please choose an option:");
        System.out.println("Add User");
        System.out.println("Update User");
        System.out.println("Delete User");

        if (option.equals("Add User")){
            Admin create = new Admin();
            create.createManager();

        }
    }

    public void createManager() throws NoSuchAlgorithmException {

        UserService register = new UserService();
        register.register();

    }

}
