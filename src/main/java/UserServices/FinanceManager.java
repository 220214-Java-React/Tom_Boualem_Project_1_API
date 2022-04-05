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
      Reimbursements FinaceManagerRS=new Reimbursements();

    }

    Reimbursements rs=new Reimbursements();




    public void viewAll() {


    }

    public void viewByType() {

    }

    public void approveOrDeny () {
        rs.getresolver_ID();
        rs.getreimbursement_ID();


    }


}
