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
public class MessageTest
{
    Message Message = new Message ();
    public MessageTest() { }

    @Test
    public void testGetMessage() 
    {
        String expected = "I have arrived";
        String actual = Message. getMessage();
        assertEquals(expected,actual);
    }
    
}
