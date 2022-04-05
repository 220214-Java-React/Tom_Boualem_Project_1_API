package UserServices;
import model.Reimbursements;
import model.User;
import UserServices.UserService;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.*;
public class FinanceManager extends User {
<<<<<<< HEAD
    public void FinancemanagerLogin() throws NoSuchAlgorithmException {
        UserService login = new UserService();
        login.login();
      Reimbursements FinaceManagerRS=new Reimbursements();
=======

    public void manager() throws NoSuchAlgorithmException {

>>>>>>> 709e8b99ff963207584a253b0256578399927c36

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
