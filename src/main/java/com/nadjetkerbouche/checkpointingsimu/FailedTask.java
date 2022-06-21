/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nadjetkerbouche.checkpointingsimu;

/**
 *
 * @author Nadjet KERBOUCHE
 */
public class FailedTask {
    int taskId;
    int vmID;
    int failureOccTime;

    public FailedTask(int taskId, int vmID, int failureOccTime) {
        this.taskId = taskId;
        this.vmID = vmID;
        this.failureOccTime = failureOccTime;
    }
      public String toString() {
        return " " + taskId + "\t" + vmID + "\t" +  failureOccTime ;
     
    }  
}
