import UserServices.*;
import Util.ScannerFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import Repository.UserRepository;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import model.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.security.NoSuchAlgorithmException;


public class Application {
    private static User currentUser;
    private static UserService userService;
    private static Logger logger;
    public static void run() throws NoSuchAlgorithmException {
        configure();
        System.out.println("-- Welcome --");
        while(true){
            if(currentUser == null){
                mainMenu();
            } else if (currentUser.getrole()=="11") {
                homeMenuAdmin();
            }else if (currentUser.getrole()=="13"){
                homeMenuFinanceManager();
            }
            else if (currentUser.getrole() =="12"){
                homeMenuEmployee();
            };
            }
        }
    private static void mainMenu() throws NoSuchAlgorithmException {
        switch(MenuService.main.display()){
            case 1: homeMenuAdmin();
                break;
            case 2: homeMenuFinanceManager();
                break;
            case 3: homeMenuEmployee();
                  break;
            case 0: System.exit(0);
                break;
            default:
                break;
        }
    }

    static Admin admin = new Admin();      // ---------- Admin menu
    private static void homeMenuAdmin() throws NoSuchAlgorithmException {
        switch (MenuService.AdminMenu.display()) {
            case 1: admin.createUser();
                break;
            case 2: admin.updateUser();
                break;
            case 3: admin.deleteUser();
                break;
            case 0:
                currentUser = null;
                break;
            default:
                break;
        }
    }

    static FinanceManager manager = new FinanceManager();
    private static void homeMenuFinanceManager() {
            switch (MenuService.ManagerMenu.display()) {
                case 1: manager.viewAll();
                    break;
                case 2: manager.viewByType();
                    break;
                case 3: manager.approveOrDeny();
                    break;
                case 0:
                    currentUser = null;
                    break;
                default:
                    break;
            }
        }

        static Employee employee = new Employee();
        private static void homeMenuEmployee() {
                switch (MenuService.EmployeeMenu.display()) {
                    case 1: employee.submit();
                        break;
                    case 2: employee.view();
                        break;
                    case 3: employee.update();
                        break;
                    case 0:
                        currentUser = null;
                        break;
                    default:
                        break;
                }
            }
        private static void configure () {
            currentUser = null;
            logger = LogManager.getLogger(Application.class);

            try {
                userService = new UserService();
            } catch (NoSuchAlgorithmException e) {
                logger.warn(e.getMessage(), e);
            }
            //ReimbursementsService= new ReimbursementsService();
        }
    }
