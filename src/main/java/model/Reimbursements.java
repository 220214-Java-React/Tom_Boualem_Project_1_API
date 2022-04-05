package model;

import java.sql.Timestamp;
import java.util.*;


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

    public Reimbursements(String reimbursement_id) {
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
    



}