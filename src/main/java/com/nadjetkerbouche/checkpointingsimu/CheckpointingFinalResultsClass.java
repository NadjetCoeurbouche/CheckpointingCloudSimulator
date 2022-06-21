package com.nadjetkerbouche.checkpointingsimu;

/**
 *
 * @author Nadjet KERBOUCHE
 */
public class CheckpointingFinalResultsClass {
    int taskID;
    float final_response_time;
    float penaltyCost;
    int earnings;
    float failure_percentage;
    String approach_case;

    public CheckpointingFinalResultsClass(int taskID, float final_response_time, float penaltyCost, int earnings, float failure_percentage, String approach_case) {
        this.taskID = taskID;
        this.final_response_time = final_response_time;
        this.penaltyCost = penaltyCost;
        this.earnings = earnings;
        this.failure_percentage = failure_percentage;
        this.approach_case = approach_case;

    }   
    public String toString() {
        return " " + taskID + "\t" + final_response_time + "\t" + penaltyCost + 
                "\t" + earnings + "\t" + failure_percentage + "\t" + approach_case;
     
    }
}
