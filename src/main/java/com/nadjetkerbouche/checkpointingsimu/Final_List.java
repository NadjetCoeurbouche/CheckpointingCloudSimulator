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
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        finalListTable.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        finalListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Task ID", "VM ID", "Response time expected", "Penalty Cost Expected", "Checkpoint count", "checkpointing interval", "status"
            }
        ));
        finalListTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        finalListTable.setGridColor(new java.awt.Color(255, 255, 255));
        finalListTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(finalListTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 870, 260));

        AssignTasksBtn.setText("Run tasks");
        AssignTasksBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssignTasksBtnActionPerformed(evt);
            }
        });
        getContentPane().add(AssignTasksBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Tasks Final Assignement List");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

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
    public float checkpointing;
    public float interval;
    float fidelity = (float) 0.4;
    String status ;
    
    public Final_List( int slaID, int vmID, float faultPercentage, float responseTimeExpected, float penaltyPercentage, 
            float checkpointing, float interval,   String status) {
       this.slaID = slaID;
        this.vmID = vmID;
        this.faultPercentage =  faultPercentage;
        this.responseTimeExpected = responseTimeExpected;
        this.penaltyPercentage = penaltyPercentage;
        this.checkpointing = checkpointing;
        this.interval = interval;
        this.status = status;
    }
    
    public String toString() {
        return " " + slaID + "\t" + vmID + "\t" +  faultPercentage + "\t" + 
                responseTimeExpected + "\t"  + penaltyPercentage + "\t" + checkpointing + "\t" + interval + "\t" + status;
     
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
            faultPercentage = bestVmsList.get(i).faultPercentage;
            responseTimeExpected = bestVMs.fill_table(i).get(i).responseTimeExpected; 
            float penaltycostFactor = bestVMs.fill_table(i).get(i).total_penalty_cost / bestVMs.fill_table(0).get(0).total_penalty_cost;
            checkpointing =   penaltycostFactor* fidelity * bestVMs.fill_table(i).get(i).responseTimeExpected* bestVMs.fill_table(i).get(i).faultPercentage;
            interval = bestVMs.fill_table(i).get(i).responseTimeExpected / checkpointing;
            status =  bestVMs.fill_table(i).get(i).status;
 data[0] = slaList.get(i).slaID;
 data[1] = bestVmsList.get(i).vmID;
 data[2] = convertTime(responseTimeExpected);
 data[3] = bestVMs.fill_table(i).get(i).total_penalty_cost;
 data[4] = checkpointing;           
 data[5] = convertTime(interval);
 data[6] = status ;


 Final_List finalList = new Final_List  (slaID, vmID,faultPercentage, responseTimeExpected, penaltycostFactor,checkpointing,interval, status );
 
 finalModel.addRow(data);
 
 finalVmsList.add(finalList);

     }
}
   
public String convertTime(float time){
    
                    int sec = (int) (time % 60);
		    int min = (int) ((time / 60)%60);
		    int hours = (int) ((time/60)/60);
		 String intervalString = String.format("%02d:%02d:%02d", hours, min, sec);
                 return intervalString;
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AssignTasksBtn;
    private javax.swing.JTable finalListTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
