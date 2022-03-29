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

    public static void run(){
        configure();
        System.out.println("-- Welcome --");

        while(true){
            if(currentUser == null){
                mainMenu();

            } else if (currentUser) {
                homeMenuAdmin();

            }
        }
    }

    private static void mainMenu(){
        switch(MenuService.main.display()){
            case 1: currentUser = userService.login();
                break;
            case 2: userService.register();
                break;
            case 0: System.exit(0);
                break;
            default:
                break;
        }
    }

    private static void homeMenuAdmin(){
        switch(MenuService.AdminMenu.display()){
            case 1: ;
                break;
            case 2: ;
                break;
            case 3: ;
                break;
            case 0: currentUser = null;
                break;
            default:
                break;
        }
    }

    private static void configure(){
        currentUser = null;
        logger = LogManager.getLogger(Application.class);

        try {
            userService = new UserService();
        } catch (NoSuchAlgorithmException e) {
            logger.warn(e.getMessage(), e);
        }

    }
}