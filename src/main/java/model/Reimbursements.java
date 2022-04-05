package model;
import java.text.SimpleDateFormat;
import java.util.*;
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

    //------------------------------------------------------------
    int paymentID;
    private int getPaymentID() {return pID = (int) (Math.random() * range) + min;}
    //--------------------------------------------------------------
    Scanner sc = new Scanner(System.in);
    Scanner sc1= new Scanner(System.in);
    int pID = getPaymentID();
    int rID = getReimbursement_ID();
    Collection<Reimbursements> reimbursement = new ArrayList<Reimbursements>();

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














