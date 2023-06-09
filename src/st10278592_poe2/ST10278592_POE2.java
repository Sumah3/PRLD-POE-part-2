/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package st10278592_poe2;

import javax.swing.JOptionPane;


public class ST10278592_POE2 {

    private static String menuchoice;
    public static int noTasks;
    
    public static void main(String[] args) {
    String TaskName;    
    String TaskDescription;
    String Developerdetails ;       
    String TaskDuration ;
    String TaskStatus;
            
        displayMenu();
        
    
// if statement determining what task was selected     

        if(menuchoice.equals("1")){
            // user selected add tasks option :
            taskAmount();
            taskLoop();
        } else 
        if(menuchoice.equals( "2")){
            // user chose to show a report :
            JOptionPane.showMessageDialog(null,"Coming Soon");
            System.exit(0);
        } else 
        if(menuchoice.equals( "3")){
            // user chose to quit :
            System.exit(0);
        }else {
        JOptionPane.showMessageDialog(null, "invalid option selected!");
            // user didnt pick a valid option
            System.exit(0);
        }
        
    }
    
    
/** 
 * -------------------*= Methods =*--------------------
 */ 
    
    
  /**
   * ----- DISLPLAYING MENU METHOD --------
  */  
    public static void displayMenu(){   
//Displaing the heading and menu options for the user 
        String optionSelected = JOptionPane.showInputDialog(
                "---WELCOME TO EASY KANBAN ---"+ 
                "\n select an option by typing its corresponding number" 
        +       "\n (1) Add Tasks "
        +       "\n (2) Show report "
        +       "\n (3) Quit ");
        menuchoice = optionSelected;
    }
  
 /**
  * -----Asking user for information ---------
  */
   public static void taskAmount(){
       String stringTaskAmount = JOptionPane.showInputDialog("enter amount of tasks you would like to create");
       noTasks = Integer.parseInt(stringTaskAmount);
       
   } 
  
   /**
    *| |||==----------------*[ loop for continuosly adding the tasks information ]*------------------==||| |
    */
       public static void taskLoop(){
       int counter = 0;
       while(noTasks>0){    // using the amount of tasks we need to do as a 'countdown'         
        
       // getting task info from user :    
       String TaskName = JOptionPane.showInputDialog("please enter task " + counter + "'s name");      
       String TaskDescription = JOptionPane.showInputDialog("please enter task " + counter + "'s description");     
       String Developerdetails = JOptionPane.showInputDialog("enter the developers details (name and surname) for task " + counter );       
       int TaskDuration = Integer.parseInt(JOptionPane.showInputDialog("please enter the amount of time you think you're goiung to spend on task " + counter ));      
       String TaskStatus = JOptionPane.showInputDialog("please enter the status of task" + counter + ":\n  - to do \n  - done \n  - doing");
       
       
       // creating task object
       Task newTask = new Task(TaskName,Developerdetails,TaskDuration,TaskStatus,counter);
       
       // checking if task decription is less than 50 chars otherwise the description is not captured.
       boolean taskDescriptionCheck = newTask.checkTaskDescription(TaskDescription);
            if(taskDescriptionCheck == true){
                newTask.setTaskDescription(TaskDescription);
            } else {
                newTask.setTaskDescription("not captured");
            }
            
       
       newTask.returnTotalHours(TaskDuration);
       
       newTask.createTaskID();  
       newTask.retrunTaskDetails();
       
          counter = counter+1 ;
          noTasks = noTasks - 1;
           
           
       }
       
   }
}
