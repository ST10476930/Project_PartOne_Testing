/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package group_2.prog5121_project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author anele
 */
public class LogInTest {
    
    public LogInTest() {
    
    }
    @Test
    public void testCheckUserName() {
        LogIn e = new LogIn("kyl_1", "Ch&&sec@k99!", "+27838978671");
        
         boolean condition = e.checkUserName();
        
        Assertions.assertTrue(condition);
        
    }
    
    @Test
    public void testCheckPasswordComplexity() {
        LogIn e = new LogIn("kyl_1", "Ch&&sec@k99!", "+27838978671");
        
         boolean condition = e.checkPasswordComplexity();
        
        Assertions.assertTrue(condition);
    }

    @Test
    public void testRegisterUser() {
        LogIn e = new LogIn("kyl_1", "Ch&&sec@k99!", "+27838978671");
         String expected = "log in details invalid";
         
         String actual = e.registerUser();
        
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPhoneChecker() {
        LogIn e = new LogIn("kyl_1", "Ch&&sec@k99!", "+27838978671");
        
         boolean condition = e.phoneChecker("+27838978671");
        
        Assertions.assertTrue(condition);
    }

    @Test
    public void testLoginUser() {
        LogIn e = new LogIn("kyl_1", "Ch&&sec@k99!", "+27838978671");
        
         boolean condition = e.loginUser();
        
        Assertions.assertTrue(condition);
    }

    @Test
    public void testReturnLoginStatus() {
        LogIn e = new LogIn("kyl_1", "Ch&&sec@k99!", "+27838978671");
        String expected = "Log in successful";
         String actual = e.returnLoginStatus();
        
        Assertions.assertEquals(expected, actual);
    }
    
}
