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
       private int vmID;
    private String vmType;
    private int computeCapacity;
    private int ramCapacity;
    private int storageCapacity;
    private float faultPercentage;
    private String Status;

    public VirtualMachine(int vmID, String vmType, int computeCapacity, int ramCapacity, int storageCapacity, float faultPercentage, String status) {
        this.vmID = vmID;
        this.vmType = vmType;
        this.computeCapacity = computeCapacity;
        this.ramCapacity = ramCapacity;
        this.storageCapacity = storageCapacity;
        this.faultPercentage = faultPercentage;
        Status = status;
    }

    public int getVmID() {
        return vmID;
    }

    public void setVmID(int vmID) {
        this.vmID = vmID;
    }

    public String getVmType() {
        return vmType;
    }

    public void setVmType(String vmType) {
        this.vmType = vmType;
    }

    public int getComputeCapacity() {
        return computeCapacity;
    }

    public void setComputeCapacity(int computeCapacity) {
        this.computeCapacity = computeCapacity;
    }

    public int getRamCapacity() {
        return ramCapacity;
    }

    public void setRamCapacity(int ramCapacity) {
        this.ramCapacity = ramCapacity;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public float getFaultPercentage() {
        return faultPercentage;
    }

    public void setFaultPercentage(float faultPercentage) {
        this.faultPercentage = faultPercentage;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}