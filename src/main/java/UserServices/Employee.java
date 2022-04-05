package UserServices;

import Util.ScannerFactory;
import model.User;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;

public class Employee extends User {


    private Scanner scanner;
    static String author_ID;
    static int amount;
    static String type_ID;
    static String description;


    public void Employee() throws NoSuchAlgorithmException {

        UserService login = new UserService();
        login.login();
    }

    public void submit() {
        this.scanner = ScannerFactory.getScanner();

        System.out.println("Enter User ID: ");
        author_ID = scanner.nextLine();

        System.out.println("Enter the Reimbursement Amount: $ ");
        amount = scanner.nextInt();

        System.out.println("Enter the Reimbursement Type (Hotel, Food, Travel, or Misc.): ");
        type_ID = scanner.nextLine();

        System.out.println("Message: ");
        description = scanner.nextLine();


    }

    public void view() {

    }

    public void update() {

    }
}
