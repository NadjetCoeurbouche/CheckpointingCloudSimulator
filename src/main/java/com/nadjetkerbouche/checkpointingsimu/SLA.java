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
     int slaID;
     int customerID;
     int instructionCount;
     int responseTime;
     int deadline;
     int price;
     float penaltyPercentage1;
     float penaltyPercentage2;
     float penaltyPercentage3;
     String status;

    public SLA(int slaID, int customerID, int instructionCount, int responseTime, int deadline, int price, float penaltyPercentage1, float penaltyPercentage2, float penaltyPercentage3, String status) {
        this.slaID = slaID;
        this.customerID = customerID;
        this.instructionCount = instructionCount;
        this.responseTime = responseTime;
        this.deadline = deadline;
        this.price = price;
        this.penaltyPercentage1 = penaltyPercentage1;
        this.penaltyPercentage2 = penaltyPercentage2;
        this.penaltyPercentage3 = penaltyPercentage3;
        this.status = status;
    }
 public String toString() {
        return " " + slaID + "\t" + customerID + "\t" + instructionCount + 
                "\t" + responseTime + "\t" + deadline + "\t" + price + "\t" + penaltyPercentage1 + "\t" + penaltyPercentage2 + "\t" + penaltyPercentage3 + "\t" + status;
     
    }
}
