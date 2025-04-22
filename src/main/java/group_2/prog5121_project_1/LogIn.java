/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group_2.prog5121_project_1;

/**
 *
 * @author anele
 */
public class LogIn {
    

private static final String cell = "^\\+\\d{1,4}\\d{1,10}$";//validates the international code
     private static final String username1 = "kyl_1";//Stored username for testing purposes
    private static final String password1 = "ch&&sec@ke99!";//Stored username for testing 
 
    private String username;
     private String password;
     private String cellPhone;
   
    
public LogIn(String username, String password, String cellPhone){
    this.username = username;
    this.password = password;
    this.cellPhone = cellPhone;
    
    
}
 public boolean checkUserName()  {
    if (username.contains("_") && username.length() <= 5){
        return true;
    }else{
        return false;
    }
 } 
 public boolean checkPasswordComplexity() {
      if ((password.length() < 8) && (!password.matches(".*[A-Z].*")) 
             && (!password.matches(".*[a-z].*"))  
        && (!password.matches(".*\\d.*"))   
        && (!password.matches(".*[@#$%^&+=!].*"))  
         && (password.contains(" "))) {
          return false;
      }else{
          return true;
      }
                 
 } //OpenAI.(2025).ChatGPT (April 19 version)[Large language model]
     
public String registerUser()   {
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
  String message = "log in details invalid";       
return message;

}
public  static boolean phoneChecker(String cellNo) {
   
    return cellNo != null && cellNo.matches(cell); 
//checks if the number entered has the international country code
    }//OpenAI.(2025).ChatGPT(April 20 version)[Large language model]
//https://chatgpt.com/c/6803e649-3e6c-8011-a76f-94745bf34121

    
public boolean loginUser(){
    System.out.println(username1 + username);
  if (username1.equals(username) && password1.equals(password)) {
  return false;    
  }else { 
 return true;
}
}

//method that tells the user the status of their log in,if it was successful or not
public  String returnLoginStatus() {
   if (loginUser() == true) {
       System.out.println("Login successful");
       
   }else{
       if (loginUser() == false) {
           System.out.println("Failed login");
       }
   }
   String message;      
   return message = "Log in successful";
        
}
}

