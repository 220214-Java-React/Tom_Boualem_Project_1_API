package model;
import java.text.SimpleDateFormat;
import java.util.*;
<<<<<<< HEAD
public class Reimbursements {
    String Status;
    double amount;
    String description;
    String  submitted;
    String resolved;
    String Type;
    //-----------------
    int Reimbursement_ID;
    int max = 999999;
    int min = 111111;
    int range = max - min + 1;
    private int getReimbursement_ID() {
        return Reimbursement_ID = (int) (Math.random() * range) + min;
        }
=======


public class Reimbursements  {

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
    
    
    public Reimbursements(){
    
    }

    public Reimbursements (String reimbursement_ID, double amount, String paymentID, String author_ID, 
                           String resolver_ID, String status_ID, String type_ID, String description, 
                           Timestamp submitted,  Timestamp resolved)
    {
        this.reimbursement_ID = reimbursement_ID; 
        this.amount = amount;
        this.paymentID = paymentID;
        this.author_ID = author_ID;
        this.resolver_ID = resolver_ID;
        this.status_ID = status_ID;
        this.type_ID = type_ID;
        this.description = description; 
        this.submitted = submitted;
        this.resolved = resolved;
        
    }
    
    //Getters and Setters:
    
    //Reimbursement ID -----------------------------------
    public String getreimbursement_ID() {
        return reimbursement_ID;
    }
    public void setreimbursement_ID(String reimbursement_ID) {
        this.reimbursement_ID = reimbursement_ID;
    }

    
    //Amount -----------------------------------------------
    public double getamount() {
        return amount;
    }
    public void setamount(double amount) {
        this.amount = amount;
    }

    
    //Payment ID ------------------------------------------------
    public String getpaymentID() {
        return paymentID;
    }
    public void setpaymentID(String paymentID) {
        this.paymentID = paymentID;
    }

    
    
    //Author ID -----------------------------------------------------
    public String getauthor_ID() {
        return author_ID;
    }
    public void setauthor_ID(String author_ID) {
        this.author_ID = author_ID;
    }
    
    
    //Resolver ID ---------------------------------------------------
    public String getresolver_ID() {
        return resolver_ID;
    }
    public void setresolver_ID(String resolver_ID) {
        this.resolver_ID = resolver_ID;
    }
    
    
    //Status ID -------------------------------------------------------
    public String getstatus_ID() {
        return status_ID;
    }
    public void setstatus_ID(String status_ID) {
        this.status_ID = status_ID;
    }
    
    
    //Type ID ----------------------------------------------------------
    public String gettype_ID() {
        return type_ID;
    }
    public void settype_ID(String type_ID) {
        this.type_ID = type_ID;
    }
    
    
    //Description ---------------------------------------------------------
    public String getdescription() {
        return description;
    }
    public void setdescription(String description) {
        this.description = description;
    }
    
    
    //Submitted Status ----------------------------------------------------
    public Timestamp getsubmitted() {
        return submitted;
    }
    public void setsubmitted(Timestamp submitted) {
        this.submitted = submitted;
    }
    
    
    //Resolved Status ----------------------------------------------------------
    public Timestamp getresolved() {
        return resolved;
    }
    public void setresolved(Timestamp resolved) {
        this.resolved = resolved;
    }


    // END OF GETTERS AND SETTERS
    

>>>>>>> 79994273035ad20e7e98629e861218c1aba0f738

    //------------------------------------------------------------
    int paymentID;
    private int getPaymentID() {return pID = (int) (Math.random() * range) + min;}
    //--------------------------------------------------------------
    Scanner sc = new Scanner(System.in);
    Scanner sc1= new Scanner(System.in);
    int pID = getPaymentID();
    int rID = getReimbursement_ID();
    Collection<Reimbursements> reimbursement = new ArrayList<Reimbursements>();

<<<<<<< HEAD
    //----------------------------------
    public void reimbursement() {
        String submitted = new SimpleDateFormat("yyyy/MM/dd -- HH:mm:ss").format(new Date());
        this.submitted = submitted;
        getRSType();
        System.out.println("Date Submitted :" + submitted);
        //----------

        //------------
        System.out.println("Enter the amount");
        this.amount = sc.nextDouble();
        //-----------------
        System.out.print("Please enter a Description");
        this.description = sc1.nextLine();
        // ----------------------------------
          getRSstatus();
        }
   private void getRSstatus () {
        String status[] = {"Pending", "Approved", "Denied"};
        System.out.println("Enter 1) to Approve  the RS or 2) to Deny or 0) to let it pending");
            int s = sc.nextInt();
        if (s==1){
            this.paymentID = this.pID;
              this.Status = status[s];
            String Resolved = new SimpleDateFormat("yyyy/MM/dd -- HH:mm:ss").format(new Date());
            this.resolved=Resolved;
            System.out.println( "This RS: "+this.Reimbursement_ID + "--Payment ID : "+this.paymentID+" has been  Aproved on: "+this.resolved);
          }else if (s==2) {this.Status=status[s];
            String Resolved = new SimpleDateFormat("yyyy/MM/dd -- HH:mm:ss").format(new Date());
            this.resolved=Resolved;
            System.out.println( "This RS " + this.Reimbursement_ID +"  " +" has been  Denied on :"+this.resolved);
        } else if(s==0) {
            this.Status=status[s];
            System.out.println("This RS " + this.Reimbursement_ID +"The status of the RS is pending"); }
    }
    private void getRSType(){
        String Type[] = {"Other","Lodging", "Travel", "Food"};
        System.out.println("please select type of  RS :  1)Lodging 2)travel 3)Food or 0) for Other");
        int t = sc.nextInt();
        if (t==1){
            this.Type = Type[t];
            System.out.println( "This RS "+this.Reimbursement_ID + "Type is :" +this.Type);
        }else if (t==2) {this.Type=Type[t];
               System.out.println( "This RS " + this.Reimbursement_ID +"  " +" Type is  :"+this.Type);
        } else if(t==3) {
            this.Type=Type[t];
            System.out.println("This RS " + this.Reimbursement_ID +"The status of the RS is pending"); }
        if(t==0) {
            this.Type=Type[t];
            System.out.println("This RS " + this.Reimbursement_ID +" is of type "+this.Type); }
    }
}














=======
}
>>>>>>> 79994273035ad20e7e98629e861218c1aba0f738
