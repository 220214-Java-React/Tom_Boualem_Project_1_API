package UserServices;
import model.Reimbursements;
import Util.ScannerFactory;
import model.User;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Employee extends User {
    private Scanner scanner;
    static int amount;
    static String type;
    static String message;
    public void Employee() throws NoSuchAlgorithmException {
        UserService login = new UserService();
        login.login();
        Reimbursements EmployeeRS=new Reimbursements();
    }
    public void submit() {
        this.scanner = ScannerFactory.getScanner();
        System.out.println("Enter the Reimbursement Amount: ");
        System.out.print("$ ");
        amount = scanner.nextInt();
        System.out.println("Enter the Reimbursement Type (Hotel, Food, Travel, or Misc.): ");
        type = scanner.nextLine();

        System.out.println("Message: ");
        message = scanner.nextLine();
    }
    public void view() {
    }
    public void update() {

    }
}
