/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package group_2.prog5121_project;

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
      LogIn e = new LogIn("kyl_1", "ch&&sec@ke99!", +27784569867 );
      
      
      boolean condition = e.checkUserName();
    }

    @Test
    public void testCheckPasswordComplexity() {
    }

}
