package UserServices;

import model.Reimbursements;
import model.User;

import java.security.NoSuchAlgorithmException;

public class Employee extends User {

    public void Employee() throws NoSuchAlgorithmException {

        UserService login = new UserService();
        login.login();

        Reimbursements EmployeeRS=new Reimbursements();
    }
}
