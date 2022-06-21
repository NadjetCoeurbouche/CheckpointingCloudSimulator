/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nadjetkerbouche.checkpointingsimu;

/**
 *
 * @author Nadjet KERBOUCHE
 */
public class VirtualMachine {
       int vmID;
     String vmType;
     int computeCapacity;
     int ramCapacity;
     int storageCapacity;
     float faultPercentage;
     String Status;

    public VirtualMachine(int vmID, String vmType, int computeCapacity, int ramCapacity, int storageCapacity, float faultPercentage, String status) {
        this.vmID = vmID;
        this.vmType = vmType;
        this.computeCapacity = computeCapacity;
        this.ramCapacity = ramCapacity;
        this.storageCapacity = storageCapacity;
        this.faultPercentage = faultPercentage;
        Status = status;
    }

 public String toString() {
        return " " + vmID + "\t" + vmType + "\t" + computeCapacity + 
                "\t" + ramCapacity + "\t" + storageCapacity + "\t" + faultPercentage + "\t" + Status;
     
    }

    String vmID() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}