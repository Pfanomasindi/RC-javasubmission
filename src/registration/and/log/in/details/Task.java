
package registration.and.log.in.details;

/**
 *
 * @author ST10128332
 */
public class Task 
{
   String[] tskName;
    int taskNumber;
    String[] taskDescription;
    String[] developerDetails;
    int[] taskDuration;
    String[] taskID;
    String[] taskStatus;

    
    public Task(int noOfTask)
    {
        tskName = new String[noOfTask];
        taskNumber = 0;
        taskDescription = new String[noOfTask];
        developerDetails = new String[noOfTask];
        taskDuration = new int[noOfTask];
        taskID = new String[noOfTask];
        taskStatus = new String[noOfTask];       
    }
    
    public boolean checkTaskDescription(String description)
    {
         return (description.length() <= 50);                
    }
    public String creareTaskID(int taskNumber)
    {
        taskID[taskNumber] = tskName[taskNumber].substring(0, 2).toUpperCase() + ":" + taskNumber + ":" + developerDetails[taskNumber].substring(developerDetails[taskNumber].length() - 3).toUpperCase(); 
        return taskID[taskNumber];
    }
    public void printTaskDeatils(int TotalTasks)
    {
        System.out.print("\n\nTasks saved so far....\n");
        System.out.print("\n\ttaskID\ttaskName\tDuration\tStatus\tDescription\tDeveloper\n");
        for(int a = 0; a < TotalTasks; a++)
        {
            System.out.print("\n" + (a+1) + ".\t" + taskID[a] + "\t" + tskName[a] + "\t" + taskDuration[a] + "\t" + taskStatus[a] + "\t" + taskDescription[a] + "\t" + developerDetails[a]);            
        }
        System.out.print("\n\nTotal tasks duration : " + returnTotalhours(TotalTasks) + "\n\n");
    }
    
    public int returnTotalhours(int TotalTasks)
    {
        int totalHours = 0;
        for(int a = 0; a < TotalTasks;a++)
            totalHours = totalHours + taskDuration[a];        
        return totalHours;
    }
      
}
