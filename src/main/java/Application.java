import UserServices.UserService;
import model.Reimbursements;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

import model.User;
import UserServices.MenuService;

public class Application {
    private static User currentUser;
    private static UserService userService;
    private static Reimbursements reimbursement;
    private static Logger logger;
    public static void run() throws NoSuchAlgorithmException {
        configure();
        System.out.println("-- Welcome To ERS System--");
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
            switch (MenuService.main.display()) {
                case 1: currentUser =userService.login();
                    homeMenuAdmin();
                    break;
                case 2:
                    currentUser= userService.login();
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
  // ---------- Admin menu
    private static void homeMenuAdmin() throws NoSuchAlgorithmException {
        switch (MenuService.AdminMenu.display()) {
            case 1:
                List <User> users=new ArrayList<User>();
                UserService userService=new UserService();
                userService.register();
                users.add( new User());
                System.out.println("You have added a new User(Employee)");
                //CreateUser();
                break;
            case 2: //UpdateUser();
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
    // ManagerFunctions  is Boualem Task
    private static void homeMenuFinanceManager() {
            switch (MenuService.ManagerMenu.display()) {
                case 1: reimbursement.reimbursement();
                    break;
                case 2://view all reimbursement and sort base on TYpe or status

                    break;
                case 3://AproveReimbursement();
                    break;
                case 0:
                    currentUser = null;
                    break;
                default:
                    break;
            }
            //  Employee is Tom Task
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
            reimbursement= new Reimbursements();
        }
    }
