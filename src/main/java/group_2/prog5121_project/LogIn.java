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
     private static final String cell = "^\\+\\d{1,4}\\d{1,10}$";//validates the international code
     private static final String username1 = "Luc_5";
    private static final String password1 = "P@12word";
 
    private String username;
     private String password;
     private int cellPhone;
   
    
public LogIn(String user, String password, int cell){
    this.username = user;
    this.password = password;
    this.cellPhone = cell;
    
    
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
     
public void registerUser()   {
    /*
 chatGpt prompt:
create a regular expression-based cell phone checker that ensures that 
the cell phone number contains 
international country code followed by the number 
no more than ten characters long in java
    */
         if (checkUserName() == false) {
      System.out.println("Username is incorrectly formatted");
        
    if (checkPasswordComplexity()== false){
       System.out.println("Password is invalid");
    }
  
    
         }
         


}
public static boolean phoneChecker(String cellNo) {
        return cellNo != null && cellNo.matches(cell); 
//checks if the number entered has the international country code
    }//OpenAI.(2025).ChatGPT(April 20 version)[Large language model]
//https://chatgpt.com/c/6803e649-3e6c-8011-a76f-94745bf34121

    





   
   


 
 
}
