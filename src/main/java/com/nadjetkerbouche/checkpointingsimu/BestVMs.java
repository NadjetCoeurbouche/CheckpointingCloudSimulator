
package com.nadjetkerbouche.checkpointingsimu;

/**
 *
 * @author Nadjet KERBOUCHE
 */
public class BestVMs implements Comparable<BestVMs>{
    int vmID;
    float responseTimeExpected;
    float faultPercentage;
    float penaltyPercentage1;
    float penaltyPercentage2;
    float penaltyPercentage3;
   float total_penalty_cost;


    public BestVMs(int vmID, float responseTimeExpected, float faultPercentage, float penaltyPercentage1, float penaltyPercentage2, float penaltyPercentage3, float total_penalty_cost) {
        this.vmID = vmID;
        this.responseTimeExpected = responseTimeExpected;
        this.faultPercentage = faultPercentage;
        this.penaltyPercentage1 = penaltyPercentage1;
        this.penaltyPercentage2 = penaltyPercentage2;
        this.penaltyPercentage3 = penaltyPercentage3;
        this.total_penalty_cost = total_penalty_cost;
   
}

    BestVMs() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String toString() {
        return " "+ "\t" + vmID + "\t" + responseTimeExpected + "\t" + faultPercentage +  "\t" + penaltyPercentage1 + "\t" + penaltyPercentage2 + "\t" + penaltyPercentage3 + "\t" + total_penalty_cost;
     
    }
    
// this class used to access to Comparable methods so that we can sort data    
    @Override
    public int compareTo(BestVMs o) {
         Float t1 = Float.valueOf(this.responseTimeExpected);
         Float t2 = Float.valueOf(o.responseTimeExpected);
          Float t3 = Float.valueOf(this.faultPercentage);
          Float t4 = Float.valueOf(o.faultPercentage);
                int result;
                result = (int)(t1 - t2);
                if(result == 0){
                result = t3.compareTo(t4);
            }
              return  result ;
     
     
    }
  
}