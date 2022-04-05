package UserServices;
import model.Reimbursements;
import model.User;
import UserServices.UserService;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.*;

public class FinanceManager extends User {

    public void FinancemanagerLogin() throws NoSuchAlgorithmException {
        UserService login = new UserService();
        login.login();
<<<<<<< HEAD
      Reimbursements FinaceManagerRS=new Reimbursements();




=======
    }

    public void viewAll() {

    }

    public void viewByType() {

    }

    public void approveOrDeny () {
>>>>>>> 79994273035ad20e7e98629e861218c1aba0f738

    }


}
