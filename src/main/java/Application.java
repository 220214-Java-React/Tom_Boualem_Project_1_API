import UserServices.Admin;
import UserServices.FinanceManager;
import UserServices.UserService;
import Util.ScannerFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import Repository.UserRepository;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import model.User;
import UserServices.MenuService;
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
          // ---------- Admin menu
    private static void homeMenuAdmin() throws NoSuchAlgorithmException {
        switch (MenuService.AdminMenu.display()) {
            case 1://CreateUser();
                break;
            case 2://UpdateUser();
                break;
            case 3://DeleteUser();
                break;
            case 0:
                currentUser = null;
                break;
            default:
                break;
        }
    }
    private static void homeMenuFinanceManager() {
            switch (MenuService.ManagerMenu.display()) {
                case 1://ViewAllReimbursements();
                    break;
                case 2: //ViewReimbursementsByStatus();
                    break;
                case 3://AproveReimbursement();
                    break;
                case 0:
                    currentUser = null;
                    break;
                default:
                    break;
            }
        }
        private static void homeMenuEmployee() {
                switch (MenuService.EmployeeMenu.display()) {
                    case 1://submitReimbursement() ;
                        break;
                    case 2://viewReimbursements();
                        break;
                    case 3://UpdateReimbursement();
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
