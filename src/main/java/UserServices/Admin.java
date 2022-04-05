package UserServices;
import model.User;

import java.security.NoSuchAlgorithmException;

import java.util.ArrayList;


public class Admin extends User {
    public void createUser() throws NoSuchAlgorithmException {
        UserService register = new UserService();
        register.register();
    }




}
