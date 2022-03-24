package UserServices;

import java.security.NoSuchAlgorithmException;

public class Employee {

    public void employee() throws NoSuchAlgorithmException {

        UserService login = new UserService();
        login.login();
    }
}
