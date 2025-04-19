/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group_2.prog5121_project;

/**
 *
 * @author anele
 */
public class LogIn {
    
   /* private static final String PASSWORD_PATTERN =
            "^(?=.*[0-9])" +           // at least one digit
            "(?=.*[a-z])" +            // at least one lowercase letter
            "(?=.*[A-Z])" +            // at least one uppercase letter
            "(?=.*[@#$%^&+=!])" +      // at least one special character
            "(?=\\S+$)" +              // no whitespace
            ".{8,}$";                  // at least 8 characters
 */
    private String username;
     private String password;
     private int cellphone;
   
    
public LogIn(String user, String password, int cell){
    this.username = user;
    this.password = password;
    this.cellphone = cell;
    
    
}
 public boolean checkUserName()  {
     return username.contains("_") && username.length() <= 5;
 } 
 public boolean checkPasswordComplexity() {
      return (password.length() < 8) && (!password.matches(".*[A-Z].*")) 
             && (!password.matches(".*[a-z].*"))  
        && (!password.matches(".*\\d.*"))   
        && (!password.matches(".*[@#$%^&+=!].*"))  
         && (password.contains(" ")) ;
                 
 }
     
     
 } 
 }
}
