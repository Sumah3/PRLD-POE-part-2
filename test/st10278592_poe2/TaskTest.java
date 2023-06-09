/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package st10278592_poe2;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author summe
 */
public class TaskTest {
    
    // test data 1:
     private String taskName1 = "Login Feature";
     private String taskDescription1 = "Create Login to authenticate users";
     private String developerDetail1 = "Robyn Harrison ";
     private String taskID1 ;
     private String taskStatus1 ="To Do";
     private int taskDuration1 = 8;
     private int taskNumber1 = 0;
    
     // test data 2 :
     private String taskName2 = "Add Task Feature";
     private String taskDescription2 = "Create Add Task feature to add task users";
     private String developerDetail2 = "Mike Smith";
     private String taskID2;
     private String taskStatus2 = "Doing";
     private int taskDuration2 = 8;
     private int taskNumber2 = 1;
     
        
     
    //------------------- TESTING DATA SET 1 : -----------------//
     
     /**
     * Test of checkTaskDescription method, of class Task.
     */
    @Test
    public void checkTaskDescription1 () {
       
       
       Task test = new Task(taskName1,developerDetail1,taskDuration1,taskStatus1,taskNumber1);
       boolean actual = test.checkTaskDescription(taskDescription1);
       
       boolean expectedResult = true;
       
       assertEquals(expectedResult,actual);
            }
     
    
       /**
     * Test of createTaskID method, of class Task.
     */
    @Test
    public void createTaskID1 (){
        
        Task test = new Task(taskName1,developerDetail1,taskDuration1,taskStatus1,taskNumber1);
        String actual = test.createTaskID();
        
        String expectedResult = "LO:0:SON";
        assertEquals(expectedResult,actual);
    }
    
    
    
     //------------------- TESTING DATA SET 2 : -----------------//
    
    /**
     * Test of checkTaskDescription method, of class Task.
     */
    @Test
    public void checkTaskDescription2 () {
       
       Task test = new Task(taskName2,developerDetail2,taskDuration2,taskStatus2,taskNumber2);
       boolean actual = test.checkTaskDescription(taskDescription2);
       
       boolean expectedResult = true;
       
       assertEquals(expectedResult,actual);
            }
    
    /**
     * Test of createTaskID method, of class Task.
     */
    @Test
    public void createTaskID2 (){
        
        Task test = new Task(taskName2,developerDetail2,taskDuration2,taskStatus2,taskNumber2);
        String actual = test.createTaskID();
        
        String expectedResult = "AD:1:ITH";
        assertEquals(expectedResult,actual);
    }
       
    
    
}