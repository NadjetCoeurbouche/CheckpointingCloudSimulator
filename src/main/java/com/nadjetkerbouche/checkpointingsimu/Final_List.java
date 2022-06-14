package com.nadjetkerbouche.checkpointingsimu;

import static com.nadjetkerbouche.checkpointingsimu.BestVmsList.bestVmsList;
import static com.nadjetkerbouche.checkpointingsimu.VM_SLA_data_UI.slaList;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        assignment();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        finalListTable = new javax.swing.JTable();
        AssignTasksBtn = new javax.swing.JButton();

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

        AssignTasksBtn.setText("Run tasks");
        AssignTasksBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssignTasksBtnActionPerformed(evt);
            }
        });
        getContentPane().add(AssignTasksBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 530, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AssignTasksBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AssignTasksBtnActionPerformed
        try {
            new monitoringTasks().setVisible(true);         // TODO add your handling code here:
            // TODO add your handling code here:
        } catch (InterruptedException ex) {
            Logger.getLogger(Final_List.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AssignTasksBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    
    BestVmsList bestVMs = new BestVmsList();
     VM_SLA_data_UI vm_sla = new  VM_SLA_data_UI();
     public static ArrayList<Final_List> finalVmsList = null;
    int slaID;
    int vmID;
    float responseTimeExpected;
    float faultPercentage;
    float penaltyPercentage;
    float checkpointing;
    float interval;
    float fidelity = (float) 0.4;
    
    
    public Final_List( int slaID, int vmID, float responseTimeExpected, float penaltyPercentage, float checkpointing, float interval) {
       this.slaID = slaID;
        this.vmID = vmID;
        this.responseTimeExpected = responseTimeExpected;
        this.penaltyPercentage = penaltyPercentage;
        this.checkpointing = checkpointing;
        this.interval = interval;
    }
    
    public String toString() {
        return " " + slaID + "\t" + vmID + "\t" + responseTimeExpected + "\t"  + penaltyPercentage + "\t" + checkpointing + "\t" + interval;
     
    }  
 
// Fisrt I thought of finding the highest penalty cost bcz all the tasks have the same VMs ranking
 // I need to compare current task deadline with all vms expctd res_time to calculate checkpointing interval in next step
public void assignment(){
     finalVmsList = new  ArrayList<Final_List>() ;   
    DefaultTableModel finalModel = (DefaultTableModel)finalListTable.getModel();
    Object data [] = new Object [vm_sla.slaList.size()];   
   
     for (int i =0; i < vm_sla.slaList.size(); i ++){
         slaID =slaList.get(i).slaID;
         vmID = bestVmsList.get(i).vmID;
         
 data[0] = slaList.get(i).slaID;
 data[1] = bestVmsList.get(i).vmID;
 responseTimeExpected = vm_sla.slaList.get(i).instructionCount / vm_sla.vmList.get(i).computeCapacity; 
 data[2] = bestVMs.fill_table(slaList.get(i).slaID - 1).get(i).responseTimeExpected;
 data[3] = bestVMs.fill_table(i).get(i).total_penalty_cost;
 float penaltycostFactor = bestVMs.fill_table(i).get(i).total_penalty_cost / bestVMs.fill_table(0).get(0).total_penalty_cost;
 checkpointing =   penaltycostFactor* fidelity * bestVMs.fill_table(slaList.get(i).slaID - 1).get(i).responseTimeExpected* bestVMs.fill_table(slaList.get(i).slaID - 1).get(i).faultPercentage;
         
 data[4] = checkpointing; 
 interval = bestVMs.fill_table(slaList.get(i).slaID - 1).get(i).responseTimeExpected / checkpointing;
 data[5] = interval;
 Final_List finalList = new Final_List  (slaID, vmID, responseTimeExpected,penaltycostFactor,checkpointing,interval );
 finalModel.addRow(data);
 finalVmsList.add(finalList);
     }
}
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AssignTasksBtn;
    private javax.swing.JTable finalListTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
