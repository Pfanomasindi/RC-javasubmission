/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registration.and.log.in.details;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Test;


/**
 *
 * @author ST10128332
 */
public class TaskTest {
    
    public TaskTest(String tName)
    {
     String expectedString = "Add Task Feature";
     String actual new String();
     assertEquals(expectedString,actual);
    }

    @Test
    public void testCheckTaskDescription()
    {
    String expectedString = "create add Task ta add task users";
    return (expectedString.length() <== 50);
        
    }

    @Test
    public void testCreareTaskID() {
    }

    @Test
    public void testPrintTaskDeatils() 
    {
     String expectedString = "mike smith";
        System.out.print("mike smith");
        
    }

    @Test
    public void testReturnTotalhours(boolean returntotalHours) 
    {
      int totalHours = 10;
       return returntotalHours ;
        
    }
    
}
