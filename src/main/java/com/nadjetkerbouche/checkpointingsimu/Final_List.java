package com.nadjetkerbouche.checkpointingsimu;

import static com.nadjetkerbouche.checkpointingsimu.BestVmsList.bestVmsList;
import static com.nadjetkerbouche.checkpointingsimu.VM_SLA_data_UI.slaList;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nadjet KERBOUCHE
 */
public class Final_List extends javax.swing.JFrame {

    /**
     * Creates new form finalList
     */
    public Final_List() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        finalListTable = new javax.swing.JTable();
        AssignTasksBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        finalListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Task ID", "VM ID", "Response time expected", "Penalty cost", "Checkpointing count", "checkpointing interval"
            }
        ));
        finalListTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(finalListTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 870, 440));

        AssignTasksBtn.setText("Assign tasks");
        getContentPane().add(AssignTasksBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 540, -1, -1));

        jButton1.setText("show");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
assignment();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    BestVmsList bestVMs = new BestVmsList();
     VM_SLA_data_UI vm_sla = new  VM_SLA_data_UI();
     public static ArrayList<Final_List> finalVmsList = null;

    int vmID;
    float responseTimeExpected;
    float faultPercentage;
    float penaltyPercentage;
    float checkpointing;
    float interval;
    int fidelity = 1;
    int [] vmRanking  = new int [vm_sla.vmList.size()] ; 
    int [] tasksRanking = new int [vm_sla.slaList.size()] ; 
    
    public Final_List(int vmID, float responseTimeExpected, float penaltyPercentage, float checkpointing, float interval) {
        this.vmID = vmID;
        this.responseTimeExpected = responseTimeExpected;
        this.penaltyPercentage = penaltyPercentage;
        this.checkpointing = checkpointing;
        this.interval = interval;
    }
    
    public String toString() {
        return " " + vmID + "\t" + responseTimeExpected + "\t"  + penaltyPercentage + "\t" + checkpointing + "\t" + interval;
     
    }

  /*    
    public boolean exist (int k){
     boolean valide = true;
 for (int i = 0; i < vmRanking.length; i++ ){
    if (k == vmRanking[i]){
    valide = false;
    }   
 }
 return valide;
 }*/
 
    /*
 int [] sortVMs(ArrayList<VirtualMachine> vmsList){

     int [] vmTest  = new int [vmsList.size()] ; 
 
 for(int i = 0; i< vmsList.size(); i++){
  vmTest [i] =  vmsList.get(i).computeCapacity;
 }
  int s = 0;
  int i=0;
  int max;

    while( i < vmsList.size()){ 
        // initializing best vm as vm[0]
        max = i;
    //searching for vm with max CPU capacity    
   for(int j=i+1; j <vmsList.size(); j++ ){

 if(!exist(j) && max < vmTest[j]) {
    max = j;
}

}
vmRanking[s] = vmsList.get(max).vmID;

} 
s++;
   
        return vmRanking;
 }*/
 
// Fisrt I thought of finding the highest penalty cost bcz all the tasks have the same VMs ranking
 // I need to compare current task deadline with all vms expctd res_time to calculate checkpointing interval in next step
public void assignment(){
     for(int s = 0; s<slaList.size(); s++){
        System.out.println("ana f final: " + slaList.get(s)); 
         System.out.println("fill_table" + bestVMs.fill_table(s));
         }
    DefaultTableModel finalModel = (DefaultTableModel)finalListTable.getModel();
    Object data [] = new Object [vm_sla.slaList.size()];   
    float responseTimeExpected;
     for (int i =0; i < vm_sla.slaList.size(); i ++){
 data[0] = slaList.get(i).slaID;
 data[1] = bestVmsList.get(i).vmID;
 responseTimeExpected = vm_sla.slaList.get(i).instructionCount / vm_sla.vmList.get(i).computeCapacity; 
data[2] = bestVMs.fill_table(slaList.get(i).slaID - 1).get(i).responseTimeExpected;
 data[3] = bestVMs.fill_table(i).get(i).total_penalty_cost;
 checkpointing =  bestVMs.fill_table(i).get(i).total_penalty_cost * fidelity * bestVMs.fill_table(slaList.get(i).slaID - 1).get(i).responseTimeExpected* bestVMs.fill_table(slaList.get(i).slaID - 1).get(i).faultPercentage;
 data[4] = checkpointing; 
 interval = bestVMs.fill_table(slaList.get(i).slaID - 1).get(i).responseTimeExpected / checkpointing;
 data[5] = interval;
    
 finalModel.addRow(data);

   }
   /*float highest_penalty_cost = 0;
   float fidelity = 1;
       finalVmsList = new ArrayList<Final_List>();
       
DefaultTableModel finalModel = (DefaultTableModel)finalListTable.getModel();

        for (int i = 0; i < bestVMs.bestVmsList.size(); i++){
 
            for(int j = 0; j <= bestVmsList.size(); j++){
             
               penalty_cost2 = ((bestVmsList.get(j).penaltyPercentage1 +bestVmsList.get(j).penaltyPercentage2 + bestVmsList.get(j).penaltyPercentage3)/3) * vm_sla.slaList.get(j).price;

                // searching for appropriate vm
                if (bestVmsList.get(i).responseTimeExpected <= vm_sla.slaList.get(i).deadline){
                    
                    // searching for task with high penalty
                    if( highest_penalty_cost){
   
                        vmID = vm_sla.vmList.get(i).vmID;
                        responseTimeExpected = bestVmsList.get(i).responseTimeExpected;
                        penaltyPercentage = penalty_cost1;
                        checkpointing = vm_sla.vmList.get(i).faultPercentage  * fidelity * 1 * responseTimeExpected ;
                        interval = responseTimeExpected / checkpointing;

                   
                       finalList  = new Final_List( vmID, responseTimeExpected, penaltyPercentage, checkpointing, interval);
                       
            Object[] finalData = { vmID, responseTimeExpected, penaltyPercentage, checkpointing, interval};

}
                } 
                else{
            penalty_cost1 = ((vm_sla.slaList.get(i).penaltyPercentage1 + vm_sla.slaList.get(i).penaltyPercentage1 + vm_sla.slaList.get(i).penaltyPercentage2 + vm_sla.slaList.get(i).penaltyPercentage3)/4) *vm_sla.slaList.get(i).price;       
              vmID = vm_sla.vmList.get(i).vmID;
                        responseTimeExpected = bestVmsList.get(i).responseTimeExpected;
                        penaltyPercentage = penalty_cost1;
                        checkpointing = vm_sla.vmList.get(i).faultPercentage  * fidelity * 1 * responseTimeExpected ;
                        interval = responseTimeExpected / checkpointing;

                   finalList  = new Final_List( vmID, responseTimeExpected, penaltyPercentage, checkpointing, interval);      
                     Object[] finalData = { vmID, responseTimeExpected, penaltyPercentage, checkpointing, interval};
                             finalModel.addRow(finalData);
 }
       
                    
                }
            }
            finalVmsList.add(finalList);  

                               
*/
}
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Final_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Final_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Final_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Final_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Final_List().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AssignTasksBtn;
    private javax.swing.JTable finalListTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
