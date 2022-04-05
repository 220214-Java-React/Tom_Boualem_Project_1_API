package UserServices;
import model.Reimbursements;
import Util.ScannerFactory;
import model.User;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLOutput;
import java.util.Scanner;
<<<<<<< HEAD
=======
import java.util.Random;

>>>>>>> 709e8b99ff963207584a253b0256578399927c36
public class Employee extends User {
    private Scanner scanner;
    static String author_ID;
    static int amount;
<<<<<<< HEAD
    static String type;
    static String message;
=======
    static String type_ID;
    static String description;


>>>>>>> 709e8b99ff963207584a253b0256578399927c36
    public void Employee() throws NoSuchAlgorithmException {
        UserService login = new UserService();
        login.login();
        Reimbursements EmployeeRS=new Reimbursements();
    }
    public void submit() {
        this.scanner = ScannerFactory.getScanner();
<<<<<<< HEAD
        System.out.println("Enter the Reimbursement Amount: ");
        System.out.print("$ ");
=======

        System.out.println("Enter User ID: ");
        author_ID = scanner.nextLine();

        System.out.println("Enter the Reimbursement Amount: $ ");
>>>>>>> 709e8b99ff963207584a253b0256578399927c36
        amount = scanner.nextInt();
        System.out.println("Enter the Reimbursement Type (Hotel, Food, Travel, or Misc.): ");
        type_ID = scanner.nextLine();

        System.out.println("Message: ");
<<<<<<< HEAD
        message = scanner.nextLine();
=======
        description = scanner.nextLine();


>>>>>>> 709e8b99ff963207584a253b0256578399927c36
    }
    public void view() {
    }
    public void update() {

    }
}
