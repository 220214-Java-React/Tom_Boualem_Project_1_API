
import UserServices.*;
import Util.ScannerFactory;

import java.security.NoSuchAlgorithmException;
import java.util.Scanner;


public class Application {


    public static void run() throws NoSuchAlgorithmException {
        Scanner scanner = new Scanner(System.in);
        String role = null;

        while (true) {

            System.out.println("Please Enter Status:");
            System.out.println("Admin type 'A'");
            System.out.println("Admin type 'F'");
            System.out.println("Admin type 'E'");
            role = scanner.next();

            if (role.equals("A")) {

                Admin a = new Admin();
                a.admin();


            } else if (role.equals("F")){

                FinanceManager f = new FinanceManager();
                f.manager();

            } else if (role.equals("E")) {

                Employee e = new Employee();
                e.employee();

            }
        }

    }

}
