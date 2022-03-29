package model;




public class User {


    private String user_id;
    private String username;
    private String password;
    private String Given_Name;
    private String Surname;
    private String email;
    private boolean is_active;
    private String role;

    public User(){
    }
    public User (String username, String password){
        this.username = username;
        this.password = password;
    }
    public User (String user_id, String username,
                 String password, String email,
                 String Given_Name, String Surname
                        , String role) {
        this.user_id = user_id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.Given_Name = Given_Name;
        this.Surname = Surname;
        this.role = role;
    }
    public String getUserID(){return user_id;}
    public void setID (String user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }


    public String getPassword(){
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getemail(){
        return email;
    }
    public void setemail(String email) {
        this.email = email;
    }


    public String getGiven_Name() {
        return Given_Name;
    }
    public void setGiven_Name(String Given_Name){
        this.Given_Name = Given_Name;
    }


    public String getSurname() {
        return Surname;
    }
    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public String getrole(){return role;}
    public void setrole(String role) {this.role = role;}
}
