/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registration.and.log.in.details;

/**
 *
 * @author ST10128332
 */
public class Response 
{
 String response = "I see you there";
 
 public String returnResponse()
 {
 
 return response;
 
 }
 public int calculateNumResponses(int initialResponsecount, int newResponses)
 {     
    
int totalResponses = initialResponsecount+ newResponses;
 
return totalResponses;
 }
 }
 
