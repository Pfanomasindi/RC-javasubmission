
package registration.and.log.in.details;
import java.util.Scanner;
/**
 *
 * @author ST10128332
 */

public class REGISTRATIONANDLOGINDETAILS {

    
      public static void main(String[] args) {
       Scanner Input = new Scanner(System.in);      
        String username;
    String password;
    String firstname;
    String lastname;      
    
 
    
        System.out.println("CREATE AN ACCOUTNT ");  
        System.out.println("PLEASE ENTER YOUR USERNAME");
        username = Input.nextLine();
         boolean Username;
       Username = false;
         
         if( Username != true  ){
            System.out.println(" username successfully captured  ");
         }else {
             System.out.println(" correctly formatted, please ensure that username contains an underscore and is not more than 5 characters   ");
         }
    
      System.out.println(" PLEASE ENTER PASSWORD  ");
        password = Input.nextLine();   
        boolean Password;
        Password = false;
           if(Password != true) 
           {
               System.out.println("password successfully captured  ");
           }else{
               System.out.println("password is not correctly formatted, please ensure that password contains at least 8 characters , a capital letter ,a number and special character ");
           }
         System.out.println("PLEASE ENTER YOUR FIRSTNAME");
        firstname = Input.nextLine();
        
         System.out.println("PLEASE ENTER YOUR LASTNAME");
        lastname = Input.nextLine();
     
     if(( Username != true  )&&  (Password != true)   ){
         System.out.println("  WELCOME " +  firstname   +  lastname +" you are successfully registerd"  );
     }else{
        System.out.println(" username or passwork is incorrect , please try again ");
    }
     
       Scanner scan = new Scanner(System.in);
        int numberOfTasks;
        
        System.out.print("Welcome to EasyKanban");
        System.out.print("\n\nHow many tasks do you wish to enter : ");
        numberOfTasks = scan.nextInt();
        if(numberOfTasks > 0)
        {
            Task task1 = new Task(numberOfTasks);
        
            System.out.print("\n\nThank you, You may now start capturing the tasks,\n should you wish to Quit just press 3..");
            for(int a = 0; a < numberOfTasks; a++)
            {
                System.out.print("\n\n1). Add tasks");
                System.out.print("\n2). Show report");
                System.out.print("\n3). Quit\n\nPick and option : ");
            
                int option = scan.nextInt();
                if(option == 1)
                {                  
                    task1.taskNumber = a;
                    System.out.print("Enter this task's name : ");
                    task1.tskName[a] = scan.next();
                    System.out.print("Enter this task's description : ");
                    task1.taskDescription[a] = scan.next();
                    while(!task1.checkTaskDescription(task1.taskDescription[a]))
                    {
                        System.out.print("Description shouldn't be more than 50 characters, Please try again : ");
                        task1.taskDescription[a] = scan.next();                    
                    }                 
                    
                    System.out.print("Enter this task's developer details : ");
                    task1.developerDetails[a] = scan.next();
                    System.out.print("Enter this task's duration (in hours) : ");
                    task1.taskDuration[a] = scan.nextInt();
                    System.out.print("Enter this task status, Choose one from the below \n");
                    System.out.print("\n1. To Do");
                    System.out.print("\n2. Done");
                    System.out.print("\n3. Doing");
                    System.out.print("\nenter number before the option of your choice : ");
                    int choice = scan.nextInt();
                    while(choice < 1 || choice > 3)
                    {
                        System.out.print("\nRange is between 1 and 3, please try again : ");
                        choice = scan.nextInt();                    
                    }
                    if(choice == 1)
                        task1.taskStatus[a] = "To Do";
                    if(choice == 2)
                        task1.taskStatus[a] = "Done";
                    if(choice == 3)
                        task1.taskStatus[a] = "Doing";
                    
                    task1.creareTaskID(a);                        
                }
                if(option == 2)
                {
                    task1.printTaskDeatils(a);
                    a--;
                }
                if(option == 3)
                {
                    a = numberOfTasks;
                }            
            }         
          
//     login section     
     login ll = new login();
          System.out.println(" LOGIN");

    String usern;
    
    
     System.out.print("Enter username : ");
        usern = Input.next();
       boolean UsernameCorrect;
       UsernameCorrect = false;
        if( UsernameCorrect == true)
        {
            System.out.print("Username Successfully caputured");            
        }
        else
        {
            System.out.print("Username is not correctly formatted");
        }  
    
        boolean PwordCorrect;
        
        PwordCorrect = false;
        System.out.print("Enter password : ");
        password = Input.next();
        PwordCorrect = ll.checkPasswordComplexity(password);
        if(PwordCorrect == true)
        {
            System.out.print("Password Successfully caputured");
            System.out.println("welcome back"+ firstname+ lastname);
        }
        else
        {
            System.out.print("Password is not correctly formatted");
        }
        
    
        
    }  

}
  