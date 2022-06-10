package com.nadjetkerbouche.checkpointingsimu;

import static com.nadjetkerbouche.checkpointingsimu.BestVmsList.bestVmsList;
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
                "Task ID", "Response time expected", "Penalty cost", "Checkpointing count", "checkpointing interval"
            }
        ));
        jScrollPane1.setViewportView(finalListTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 850, 560));

        AssignTasksBtn.setText("Assign tasks");
        getContentPane().add(AssignTasksBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 610, -1, -1));

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
        
    Final_List finalList = null;
// Fisrt I thought of finding the highest penalty cost bcz all the tasks have the same VMs ranking
 // I need to compare current task deadline with all vms expctd res_time to calculate checkpointing interval in next step

public void assignment(){
   float highest_penalty_cost = 0;
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
