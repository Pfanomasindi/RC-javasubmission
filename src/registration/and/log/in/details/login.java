
package registration.and.log.in.details;
import java.util.Scanner;
/**
 *
 * @author ST10128332
 */
public class login {
    
     boolean checkUserName(String Username  ) {
          boolean UserNamePassed;
        UserNamePassed = false;
        boolean length;
        length = false;
        boolean underscore ;
        underscore = false;
       
        boolean letters;
        letters = false;
        if(Username.length()>=5)
            
        {
        } else {
            length = true;
       }
        char[] alphabets = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        for(int a = 0; a < Username.length(); a++)
        {
            for(int b = 0; b < 26; b++)
            {
                if(Username.charAt(a) == alphabets[b])
                {
                    letters= true;
                    b=28;
                    a = Username.length()+2;
                }
            }
        }char[] SpecialChar = {'_'};
         for(int a = 0; a < Username.length(); a++)
         {
             
             {
                  int b = 1;
                 if(Username.charAt(a) != SpecialChar[b])
                 {
                 } else {
                     underscore = true;
                 }
             }
         }
        if(length==true && underscore==true  && letters==true)
        {
            UserNamePassed = true;
        }
        
        return UserNamePassed;
         
         
     }
   
     boolean checkPasswordComplexity(String Pword) {
        boolean PassWordPassed;
        PassWordPassed = false;
        boolean length;
        length = false;
        boolean letters;
        letters = false;
        boolean number;
        number = false;
        boolean c4;
        c4 = false;
        
        if(Pword.length() <= 8)
        {
           length = true;
        }
        char[] alphabets = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        for(int a = 0; a < Pword.length(); a++)
        {
            for(int b = 0; b < 26; b++)
            {
                if(Pword.charAt(a) == alphabets[b])
                {
                    letters = true;
                    b=28;
                    a = Pword.length()+2;
                }
            }
        }
        char[] numbers = {'0','1','2','3','4','5','6','7','8','9'};
        for(int a = 0; a < Pword.length(); a++)
        {
            for(int b = 0; b < 10; b++)
            {
                if(Pword.charAt(a) == numbers[b])
                {
                    number = true;
                }
            }
        }
         char[] SpecialChar = {'#','~','!','@','$','%','^','&','*','(',')','_','-','+','{','[','}',']','|','?',',','.','/'};
         for(int a = 0; a < Pword.length(); a++)
         {
             for(int b = 0; b < 23; b++)
             {
                 if(Pword.charAt(a) == SpecialChar[b])
                 {
                     c4 = true;
                 }
             }
         }
        if(length==true && letters==true && number==true && c4==true)
        {
            PassWordPassed = true;
        }
        return PassWordPassed;
    
    }
   boolean loginUser(  ){
          
          
          
          
     return true;
      }
   String registerUser(){
       
       Scanner Scan = new Scanner(System.in);
      String username = null;
    String password;
    String firstname;
    String lastname;    
   System.out.println("registration");
   
       System.out.println("enter your firstname");
   firstname=Scan.next();
       System.out.println("enter your last name");
   lastname=Scan.next();
   
   while (! checkUserName(username) )
       System.out.println("enter username  ");   
       username = Scan.next();
       if(checkUserName(username)  ){
       
       }
         String Pword = null;
       while (!checkPasswordComplexity( Pword) )
       System.out.println("enter username  ");   
       username = Scan.next();
       if(checkPasswordComplexity( Pword)  ){
       
       }
   
   return "user successfuly registerd" ;
   }
   String returnLoginStatus(String checkUserName, String UserNamePassed, String checkPasswordComplexity, String PassWordPassed) {
        String SuccessfulLogin = null;
     String Afailedlogin= null;
     if( checkUserName.equals(UserNamePassed) &&  PassWordPassed.equals(checkPasswordComplexity)  ){
         System.out.println("SuccessfulLogin " + SuccessfulLogin   );
     } else {
         
         System.out.println("Afailedlogin" + Afailedlogin );
     }
    
         
         
         return SuccessfulLogin; 
        
       
    }
}
  