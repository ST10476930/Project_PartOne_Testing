/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package group_2.prog5121_project;

import static group_2.prog5121_project.LogIn.phoneChecker;
import javax.swing.JOptionPane;

/**
 *
 * @author anele
 */
public class PROG5121_Project {
/*
 chatGpt prompt:
create a regular expression-based cell phone checker that ensures that 
the cell phone number contains 
international country code followed by the number 
no more than ten characters long in java
    */
    public static void main(String[] args) {
        String[] numbers = {
            "+11234567890",    // Valid
            "+911234567890",   // not valid
            "+4412345678",     // Valid
            "1234567890",      // not valid
            "+12abc567890",    // not valid
            "+123456"          // Valid 
        };//OpenAI.(2025).ChatGPT(April 20 version)[Large language model]
//https://chatgpt.com/c/6803e649-3e6c-8011-a76f-94745bf34121

   for (String number : numbers) {
    System.out.println(number + " → " + (phoneChecker(number) ? "Valid" : "Invalid"));
        }
   
   //Prompting user to enter their details
   String username = JOptionPane.showInputDialog(null, "Please enter your username",
           "Username", JOptionPane.INFORMATION_MESSAGE);
   String password = JOptionPane.showInputDialog(null, "Please create strong password",
          "Password", JOptionPane.INFORMATION_MESSAGE);
   int cellPhone = Integer.parseInt(JOptionPane.showInputDialog(null,
           "Please enter your cell number", "CellPhone Number",
           JOptionPane.INFORMATION_MESSAGE));
  
    }
}
