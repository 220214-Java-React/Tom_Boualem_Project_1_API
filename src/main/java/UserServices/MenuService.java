package UserServices;
import Util.ScannerFactory;
import UserServices.*;
    public class MenuService {
        // This is a static init block
        static {
            main = new Main();
            AdminMenu = new Admin();
            ManagerMenu = new FinanceManager();
            EmployeeMenu = new Employee();
        }

        public static Main main;
        //----------------------------
        public static Admin AdminMenu;
        public static FinanceManager ManagerMenu;
        public static Employee EmployeeMenu;

        //----------------------------------
        public static class Main extends Menu {
            private final String[] menuOptions = {
                    "What is your Role?",
                    "1) Admin ", "2)Financial Manager ",
                    "3)Employee ", "0) to Exit"
            };
            private Main() {
                super(ScannerFactory.getScanner());
            }
            //--------------------------
            public int display() {
                System.out.println("\n-- Main Menu --");
                return super.display(this.menuOptions);
            }
        }
        // ---- Admin Menu
        public static class Admin extends Menu {
            private final String[] menuOptions = {
                    "1) Create User",
                    "2) Update User",
                    "3) Delete User",
                    "0) Log Out"
            };

            private Admin() {
                super(ScannerFactory.getScanner());
            }

            public int display() {
                System.out.println("\n-- Admin Menu --");
                return super.display(this.menuOptions);
            }
        }
            //--------------------------------------------
            // Financial Manager Menu
            public static class FinanceManager extends Menu {
                private final String[] menuOptions = {
                        "1) Create Reimbursement",
                        "2) Aprove Reimbursement ",
                        "3) View All Reimbursements ",
                        "0) Log Out"
                };
                private FinanceManager() {
                    super(ScannerFactory.getScanner());
                }
                public int display() {
                    System.out.println("\n-- Manager Menu --");
                    return super.display(this.menuOptions);
                }
            }
            public static class Employee extends Menu {
                private final String[] menuOptions = {
                        "1) Submit New Reimbursement",
                        "2) See All your Reimbursement",
                        "3) update your pending Reimbursement ",
                        "0) Log Out"
                };
                private Employee() {
                    super(ScannerFactory.getScanner());
                }
                public int display() {
                    System.out.println("\n-- Employee Menu --");
                    return super.display(this.menuOptions);
                }
            }
    }







