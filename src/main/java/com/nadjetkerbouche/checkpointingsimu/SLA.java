/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nadjetkerbouche.checkpointingsimu;

/**
 *
 * @author Nadjet KERBOUCHE
 */
public class SLA {
     private int slaID;
    private int customerID;
    private int instructionNumber;
    private int responseTime;
    private int deadline;
    private int price;
    private int penaltyPercentage1;
    private int penaltyPercentage2;
    private int penaltyPercentage3;
    private String status;

    public SLA(int slaID, int customerID, int instructionNumber, int responseTime, int deadline, int price, int penaltyPercentage1, int penaltyPercentage2, int penaltyPercentage3, String status) {
        this.slaID = slaID;
        this.customerID = customerID;
        this.instructionNumber = instructionNumber;
        this.responseTime = responseTime;
        this.deadline = deadline;
        this.price = price;
        this.penaltyPercentage1 = penaltyPercentage1;
        this.penaltyPercentage2 = penaltyPercentage2;
        this.penaltyPercentage3 = penaltyPercentage3;
        this.status = status;
    }

    public int getSlaID() {
        return slaID;
    }

    public void setSlaID(int slaID) {
        this.slaID = slaID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getInstructionNumber() {
        return instructionNumber;
    }

    public void setInstructionNumber(int instructionNumber) {
        this.instructionNumber = instructionNumber;
    }

    public int getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(int responseTime) {
        this.responseTime = responseTime;
    }

    public int getDeadline() {
        return deadline;
    }

    public void setDeadline(int deadline) {
        this.deadline = deadline;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPenaltyPercentage1() {
        return penaltyPercentage1;
    }

    public void setPenaltyPercentage1(int penaltyPercentage1) {
        this.penaltyPercentage1 = penaltyPercentage1;
    }

    public int getPenaltyPercentage2() {
        return penaltyPercentage2;
    }

    public void setPenaltyPercentage2(int penaltyPercentage2) {
        this.penaltyPercentage2 = penaltyPercentage2;
    }

    public int getPenaltyPercentage3() {
        return penaltyPercentage3;
    }

    public void setPenaltyPercentage3(int penaltyPercentage3) {
        this.penaltyPercentage3 = penaltyPercentage3;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
}
