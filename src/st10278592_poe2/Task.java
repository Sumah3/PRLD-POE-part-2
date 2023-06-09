/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st10278592_poe2;

import javax.swing.JOptionPane;

   

public class Task {

     
     private String taskNames;
     private String taskDescription;
     private String developerDetails;
     private String taskIDs;
     private String taskStatus;
     private int taskDuration = 0;
     private int taskNumber ;
     
     
     
    // constructor
     public Task(String taskNames,String developerDetails,int taskDuration,String taskStatus, int taskNumber) {
         this.taskNames = taskNames;
         this.developerDetails =developerDetails;
         this.taskDuration =taskDuration;
         this.taskStatus =taskStatus;
         this.taskNumber =taskNumber;
        
     }
/**
 * -------------- 
 */
     public boolean checkTaskDescription(String taskDescription){
         // returns true or false value based on if the task desc. is less than 50 characters long.
         
         boolean TaskDescriptionLessThan50;
         if(taskDescription.length() <= 50){     // if the lenth is less than 50 it retrun true
            TaskDescriptionLessThan50 = true;
            JOptionPane.showMessageDialog(null, "Task successfully captured");
         }else {
            TaskDescriptionLessThan50 = false;   // otherwise it will return a false value
            JOptionPane.showMessageDialog(null, "“Please enter a task description of less than 50 characters");
         }
         return TaskDescriptionLessThan50;
     }
     
/**
 * ------------------- generating the task ID ------------------------
 */

    public String createTaskID() { 
        // will create and set the ID using a setter method.
      String temptaskID = taskNames.substring(0,2)+ ":"+taskNumber +":" +
                 developerDetails.substring(developerDetails.length()-3,developerDetails.length());
                    // ^^ to get the last 3 chars of a the devlopers name and surname using a substring method 
                    
     // converting string to uppercase:
     String taskID = temptaskID.toUpperCase();
     setTaskIDs(taskID);
     return taskID;
    }    
     
    public void retrunTaskDetails() {
        JOptionPane.showMessageDialog(null, 
                 "Task Status : " + taskStatus 
               + "\n Developer Details : " + developerDetails
               + "\n Task Number : " + taskNumber
               + "\n Task Name : " + taskNames
               + "\n Task Description : " + taskDescription
               + "\n Task ID : " + taskIDs
               + "\n Duration : " + taskDuration);
    } 
     
    public static int returnTotalHours(int taskTime){
        int totalHours = 0;
        
        totalHours = taskTime + totalHours;
        return totalHours;
    }
/**
 * ______________________________________________________________________________
 * 
 * ||||====------------------=*| GETTERS & SETTERS |*=-------------------====||||
 * ______________________________________________________________________________
 */
     
    /**
     * @return the taskNames
     */
    public String getTaskNames() {
        return taskNames;
    }

    /**
     * @param taskNames the taskNames to set
     */
    public void setTaskNames(String taskNames) {
        this.taskNames = taskNames;
    }

    /**
     * @return the taskDescriptions
     */
    public String getTaskDescription() {
        return taskDescription;
    }

    /**
     * @param taskDescriptions the taskDescriptions to set
     */
    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    /**
     * @return the developerDetails
     */
    public String getDeveloperDetails() {
        return developerDetails;
    }

    /**
     * @param developerDetails the developerDetails to set
     */
    public void setDeveloperDetails(String developerDetails) {
        this.developerDetails = developerDetails;
    }

    /**
     * @return the taskIDs
     */
    public String getTaskIDs() {
        return taskIDs;
    }

    /**
     * @param taskIDs the taskIDs to set
     */
    public void setTaskIDs(String taskIDs) {
        this.taskIDs = taskIDs;
    }

    /**
     * @return the taskStatus
     */
    public String getTaskStatus() {
        return taskStatus;
    }

    /**
     * @param taskStatus the taskStatus to set
     */
    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }
    
    
    
}
     

   
   
