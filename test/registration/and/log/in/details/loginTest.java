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
public class loginTest 
{
    
    public loginTest()
    {
        login 11 = new login();
        System.out.print("11.loginUser");
    }

    @Test
    public void tesReturnloginstatus(boolean returnloginsuccess) 
    {
     String expectedString = "you have successfully logged in";
        return returnloginsuccess = false;
    }
    
}
