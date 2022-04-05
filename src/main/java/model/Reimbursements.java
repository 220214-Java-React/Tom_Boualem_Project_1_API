package model;
import java.sql.Timestamp;
import java.util.*;
public class Reimbursements  {
    List <Reimbursements>RS=new ArrayList<>();
    private String reimbursement_ID;
    private double amount;
    private String paymentID;
    private String author_ID;
    private String resolver_ID;
    private String status_ID; 
    private String type_ID;
    private String description;
    private Timestamp submitted;
    private Timestamp resolved;
    public Reimbursements(){ };

    public Reimbursements (String reimbursement_ID, double amount, String paymentID, String author_ID,
                           String resolver_ID, String status_ID, String type_ID, String description, 
                           Timestamp submitted,  Timestamp resolved)
    {this.reimbursement_ID = reimbursement_ID;this.amount = amount;this.paymentID = paymentID;this.author_ID = author_ID;this.resolver_ID = resolver_ID;
        this.status_ID = status_ID;this.type_ID = type_ID;
        this.description = description;this.submitted = submitted;this.resolved = resolved;}

    public Reimbursements(String userID, String rs_id, Double amount,String status_ID) {
    }
    public Reimbursements(String reimbursement_id) {
    }
    //Getters and Setters:
    //Reimbursement ID -----------------------------------
    public String getreimbursement_ID() {
        return reimbursement_ID;
    }
    public void setreimbursement_ID(String reimbursement_ID) {this.reimbursement_ID = reimbursement_ID;}
    //Amount -----------------------------------------------
    public double getamount() {return amount;}
    public void setamount(double amount) {this.amount = amount;}
    //Payment ID ------------------------------------------------
    public String getpaymentID() {return paymentID;}
    public void setpaymentID(String paymentID) {this.paymentID = paymentID;}
    //Author ID -----------------------------------------------------
    public String getauthor_ID() {return author_ID;}
    public void setauthor_ID(String author_ID) {this.author_ID = author_ID;}
    //Resolver ID ---------------------------------------------------
    public String getresolver_ID() {return resolver_ID;}
    public void setresolver_ID(String resolver_ID) {this.resolver_ID = resolver_ID;}
    //Status ID -------------------------------------------------------
    public String getstatus_ID() {return status_ID;}
    public void setstatus_ID(String status_ID) {this.status_ID = status_ID;}
   //Type ID ----------------------------------------------------------
    public String gettype_ID() { return type_ID;}
    public void settype_ID(String type_ID) {this.type_ID = type_ID;}
    //Description ---------------------------------------------------------
    public String getdescription() {return description;}
    public void setdescription(String description) {this.description = description;}
    //Submitted Status ----------------------------------------------------
    public java.sql.Timestamp getsubmitted() {return submitted;}
    public void setsubmitted(Timestamp submitted) {this.submitted = submitted;}
    //Resolved Status ----------------------------------------------------------
   public java.sql.Timestamp getresolved() {return resolved;}
    public void setresolved(Timestamp resolved) {this.resolved = resolved;}
    // END OF GETTERS AND SETTERS
public void addToRSList(){
    Scanner sc1=new Scanner(System.in);
    Scanner sc2=new Scanner(System.in);
    int ch;
    do { System.out.println("1.to create an RS");
        System.out.println("2.to view all RS");
        System.out.println("3.to search by an Status");
        System.out.println("4.to Delete an RS");
        System.out.println("5.to update  an RS");
        System.out.println("Please Select What you want to do:");
        ch=sc1.nextInt();
        User currentUser=new User();
        switch (ch) {
            case 1:
            String author_ID= currentUser.getUserID();
            System.out.println("User ID :  "+author_ID);
            System.out.println("Enter RS ID");
            String RS_ID =sc1.nextLine();
            System.out.println("Enter RS Amount :");
            Double Amount=sc2.nextDouble();
            status_ID="Pending";
                RS.add(new Reimbursements(author_ID,RS_ID,Amount,status_ID));
            break;
            case 2:
                System.out.println("++++++++++++++++++++++++++++++++++");
                Iterator<Reimbursements> i=RS.iterator();
                while(i.hasNext()){
                    Reimbursements rs=i.next();
                    System.out.println(rs);
                }
                System.out.println("++++++++++++++++++++++++++++++++++++");
                System.out.println(RS);
             break;
            case 3:
                boolean found=false;
                System.out.println("select a status ID to search : ");
                String status_ID=sc2.nextLine();
               i=RS.iterator();
               while(i.hasNext()){
                   Reimbursements rs=i.next();
                   if(rs.getstatus_ID()==status_ID){
                    System.out.println(rs);
                    found=true;
                   }
               }
               System.out.println("++++++++++++++++++++++++++++++++++++++++");
               if(!found){System.out.println("Status Not Found");}
            break;
// ================= we can use this in the admin to remove users/delete them
            case 4:
                found=false;
                System.out.println("Enter Rs_IS to delete : ");
                RS_ID= sc2.nextLine();
                System.out.println("++++++++++++++++++++++++++++++++++");
                i=RS.iterator();
                while(i.hasNext() ){
                    Reimbursements rs= i.next();
                    if (rs.getreimbursement_ID()==RS_ID){
                        i.remove();
                        found=true;
                    }
                } if (!found){System.out.println("RS Not Found");}else {System.out.println("Rs deleted successfully !!!");
                }
                break;
//========================================== update RS Status ---
            case 5:
                found =false;
                System.out.println("Enter RS Status to update");
                String statusID=sc2.nextLine();
                System.out.println(" ++++++++++++++++++++++++++++++++++++");

                ListIterator<Reimbursements>li=RS.listIterator();
                while(li.hasNext()){
                    Reimbursements rs=li.next();
                    if(rs.getstatus_ID()==statusID){


                        author_ID =getauthor_ID();
                        RS_ID=getreimbursement_ID();
                        Amount=getamount();
                        System.out.println(author_ID+" "+RS_ID+" "+ Amount);
                        System.out.println("Enter a new status :");
                        statusID=sc2.nextLine();
                    li.set(new Reimbursements(author_ID,RS_ID,Amount,statusID));
                    found=true;
                    }
                }
                if (!found){ System.out.println("Status not found");}
                else {System.out.println(" has been Record updated");}
                 break;
        }
        }while(ch!=0);
    }
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public void ManagerUpdateRS(){
        List <Reimbursements>RS=new ArrayList<>();
        Scanner sc1=new Scanner(System.in);
        Scanner sc2=new Scanner(System.in);
        int ch;
        do {
            System.out.println("1.to view all RS");
            System.out.println("2.to search by an Status");
            System.out.println("3.to update  an RS");
            System.out.println("Please Select What you want to do:");
            ch=sc1.nextInt();
            User currentUser=new User();
            switch (ch) {
                case 1:
                    System.out.println("+++++++++++++++the Manager ca view all reimbursements +++++++++++++++++++");
                    Iterator<Reimbursements> i=RS.iterator();
                    while(i.hasNext()){
                        Reimbursements rs=i.next();
                        System.out.println(rs);
                    }
                    System.out.println("++++++++++++++++++++++++++++++++++++");
                    System.out.println(RS);
                    break;
                case 2:
                    boolean found=false;
                    System.out.println("select a status ID to search : ");
                    String status_ID=sc2.nextLine();
                    i=RS.iterator();
                    while(i.hasNext()){
                        Reimbursements rs=i.next();
                        if(rs.getstatus_ID()==status_ID){
                            System.out.println(rs);
                            found=true;
                        }
                    }
                    System.out.println("++++++++++++++++++++++++++++++++++++++++");
                    if(!found){System.out.println("Status Not Found");}
                    break;
                case 3: // ===== ,Manager can Update RS Status
                    found =false;
                    System.out.println("Enter RS Status to update");
                    String statusID=sc2.nextLine();
                    System.out.println(" ++++++++++++++++++++++++++++++++++++");
                    ListIterator<Reimbursements>li=RS.listIterator();
                    while(li.hasNext()){
                        Reimbursements rs=li.next();
                        if(rs.getstatus_ID()==statusID){
                            author_ID =getauthor_ID();
                            String RS_ID=getreimbursement_ID();
                            Double Amount=getamount();
                            System.out.println(author_ID+" "+RS_ID+" "+ Amount);
                            System.out.println("Enter a new status :");
                            statusID=sc2.nextLine();
                            li.set(new Reimbursements(author_ID,RS_ID,Amount,statusID));
                            found=true;
                        }
                    }
                    if (!found){ System.out.println("Status not found");}
                    else {System.out.println("Record  has been updated");}
                    break;
            }
        }while(ch!=0);
    }
}




