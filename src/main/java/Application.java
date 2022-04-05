import UserServices.UserService;
import model.Reimbursements;
import UserServices.*;
import Util.ScannerFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import model.User;
import UserServices.MenuService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.security.NoSuchAlgorithmException;
public class Application {
    private static User currentUser;
    private static UserService userService;
    private static Reimbursements reimbursement;
    private static Logger logger;

    public static void run() throws NoSuchAlgorithmException {
        configure();
        System.out.println("-- Welcome To ERS System--");
        while (true) {
            if (currentUser == null) {
                mainMenu();
            } else if (currentUser.getrole() == "11") {
                homeMenuAdmin();
            } else if (currentUser.getrole() == "13") {
                homeMenuFinanceManager();
            } else if (currentUser.getrole() == "12") {
                homeMenuEmployee();
            }
<<<<<<< HEAD
            ;
=======
        }
    private static void mainMenu() throws NoSuchAlgorithmException {
        switch(MenuService.main.display()){
            case 1: currentUser = userService.login();
            homeMenuAdmin();
                break;
            case 2: currentUser = userService.login();
            homeMenuFinanceManager();
                break;
            case 3: currentUser = userService.login();
            homeMenuEmployee();
                  break;
            case 0: System.exit(0);
                break;
            default:
                break;
>>>>>>> 709e8b99ff963207584a253b0256578399927c36
        }
    }

    private static void homeMenuFinanceManager() {
    }

    private static void mainMenu() throws NoSuchAlgorithmException {
        switch (MenuService.main.display()) {
            case 1:
                currentUser = userService.login();
                homeMenuAdmin();
                break;
            case 2:
                currentUser = userService.login();
                homeMenuFinanceManager();
                break;
            case 3:
                currentUser = userService.login();
                homeMenuEmployee();
                break;
            case 0:
                System.exit(0);
                break;
            default:
                break;
        }
    }

<<<<<<< HEAD
    // ---------- Admin menu
    private static void homeMenuAdmin() throws NoSuchAlgorithmException {
        switch (MenuService.AdminMenu.display()) {
            case 1:
                userService.login();

        }

        Admin admin = new Admin();      // ---------- Admin menu
        private static void homeMenuAdmin () {
            switch (MenuService.AdminMenu.display()) {
                case 1:
                    admin.createUser();
=======
    static FinanceManager manager = new FinanceManager();
    private static void homeMenuFinanceManager() {
            switch (MenuService.ManagerMenu.display()) {
                case 1:
                    manager.viewAll();
>>>>>>> 709e8b99ff963207584a253b0256578399927c36
                    break;
                case 2:
                    admin.updateUser();

                    break;
                case 3:
                    admin.deleteUser();
                    break;
                case 0:
                    currentUser = null;
                    break;
                default:
                    break;
            }
        }
        // ManagerFunctions  is Boualem Task

        FinanceManager manager = new FinanceManager();
        private static void homeMenuFinanceManager () {
            switch (MenuService.ManagerMenu.display()) {
                case 1:
                    //manager.viewAll();
                    userService.login();
                    reimbursement.ManagerUpdateRS();
                    break;
                case 2:
                    //request registration
                case 0:
                    currentUser = null;
                    break;
            }
            //  Employee is Tom Task
        }
        Employee employee = new Employee();
        private static void homeMenuEmployee () {
            switch (MenuService.EmployeeMenu.display()) {
                case 1:
                    employee.submit();
                    break;
                case 2:
                    employee.view();
                    break;
                case 3:
                    employee.update();
                    break;
                case 0:
                    currentUser = null;
                    break;
                default:
                    break;
            }
        }
    }
    private static void configure() {

        currentUser = null;
        logger = LogManager.getLogger(Application.class);

        try {
            userService = new UserService();
        } catch (NoSuchAlgorithmException e) {
            logger.warn(e.getMessage(), e);
        }
        reimbursement = new Reimbursements();
    }
}

