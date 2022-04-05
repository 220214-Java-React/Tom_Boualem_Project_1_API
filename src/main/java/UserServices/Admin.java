package UserServices;
import model.User;

import java.security.NoSuchAlgorithmException;

import java.util.ArrayList;


public class Admin extends User {
    public void createUser() throws NoSuchAlgorithmException {
        UserService register = new UserService();
        register.register();
    }

<<<<<<< HEAD


=======
    public void updateUser() {

    }

    public void deleteUser() {

    }
>>>>>>> 79994273035ad20e7e98629e861218c1aba0f738

}
