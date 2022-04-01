package UserServices;

import model.User;

import java.security.NoSuchAlgorithmException;

public class Employee extends User {

    public void Employee() throws NoSuchAlgorithmException {

        UserService login = new UserService();
        login.login();
    }

    public void submit() {

    }

    public void view() {

    }

    public void update() {

    }
}
