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
public class ResponseTest {
    Response response = new Response();
    
    public ResponseTest() {
    }

    @Test
    public void testreturnResponse() 
    {
      
      String expected = "I see you there";
      String actual = response.returnResponse();
      assertEquals(expected,actual);
    }

    @Test
    public void testCalculateNumResponses() 
    {
     int expected = 50;  
     int actual = response.calculateNumResponses(10, 40);
     
     assertEquals(expected,actual);
    }
    
    
}
