package com.nadjetkerbouche.checkpointingsimu;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nadjet KERBOUCHE
 */
public class BestVmsList extends javax.swing.JFrame {

    /**
     * Creates new form BestVmsList
     */
    public BestVmsList() {
        initComponents();
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        bestVMsTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tasksList = new javax.swing.JList<>();
        jButton2 = new javax.swing.JButton();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bestVMsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ranking", "vm ID", "Response time", "Failure Percentage", "10% ", "25%", "50%"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(bestVMsTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 810, 440));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, -1, -1));

        jButton1.setText("Show tasks");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        tasksList.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tasksList.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tasksList.setSelectionBackground(new java.awt.Color(204, 255, 204));
        tasksList.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tasksList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tasksListMousePressed(evt);
            }
        });
        jScrollPane4.setViewportView(tasksList);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 250, 590));

        jButton2.setText("Generate Final assignment list");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 540, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
 VM_SLA_data_UI vm_sla = new  VM_SLA_data_UI();
    int vmID;
    float responseTimeExpected;
    float faultPercentage;
    float penaltyPercentage1;
    float penaltyPercentage2;
    float penaltyPercentage3;

    public BestVmsList( int vmID, float responseTimeExpected, float faultPercentage, float penaltyPercentage1, float penaltyPercentage2, float penaltyPercentage3) {
        this.vmID = vmID;
        this.responseTimeExpected = responseTimeExpected;
        this.faultPercentage = faultPercentage;
        this.penaltyPercentage1 = penaltyPercentage1;
        this.penaltyPercentage2 = penaltyPercentage2;
        this.penaltyPercentage3 = penaltyPercentage3;
    }
public static ArrayList<BestVmsList> bestVmsList = null;
 public String toString() {
        return " " + vmID + "\t" + responseTimeExpected + "\t" + faultPercentage +  "\t" + penaltyPercentage1 + "\t" + penaltyPercentage2 + "\t" + penaltyPercentage3;
     
    }
 
  
    
public void tasks_list(){

    DefaultListModel list_model = new DefaultListModel();

// creating button for each task
 
  for(int i =0; i < vm_sla.slaList.size(); i++){
    
    
      //ArrayList to JList (tasks List)
    
     list_model.addElement(vm_sla.slaList.get(i).slaID);
  }
  tasksList.setModel(list_model);
}

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
tasks_list();
        // TODO add your handling code here:
         
    }//GEN-LAST:event_jButton1ActionPerformed

   
    public void fill_table(int selectedTask ){
    int insCount;
    bestVmsList = new ArrayList<BestVmsList>();
                DefaultTableModel vmsModel = (DefaultTableModel)bestVMsTable.getModel();
String[] dataRow = null;

    insCount = vm_sla.slaList.get(selectedTask).instructionCount;
        System.out.println("size " + vm_sla.vmList.size() );
        
for (int i =0; i< vm_sla.vmList.size(); i ++){
    
        vmID = vm_sla.vmList.get(i).vmID;
        responseTimeExpected = insCount / vm_sla.vmList.get(i).computeCapacity;
        faultPercentage = vm_sla.vmList.get(i).faultPercentage;
        penaltyPercentage1 = vm_sla.slaList.get(selectedTask).price  * vm_sla.slaList.get(selectedTask).penaltyPercentage1;
        penaltyPercentage2 = vm_sla.slaList.get(selectedTask).price  * vm_sla.slaList.get(selectedTask).penaltyPercentage2;
        penaltyPercentage3 = vm_sla.slaList.get(selectedTask).price  * vm_sla.slaList.get(selectedTask).penaltyPercentage3;
                           
   Object[] data = {i, vmID, responseTimeExpected, faultPercentage, penaltyPercentage1, penaltyPercentage2, penaltyPercentage3};
//adding data to our best vms table        
vmsModel.addRow(data);

BestVmsList  firstList = new BestVmsList(vmID, responseTimeExpected, faultPercentage, penaltyPercentage1, penaltyPercentage2, penaltyPercentage3);
bestVmsList.add(firstList);
	//   Collections.sort(bestVmsList);
 
   // System.out.println("vms penaltyPercentage1 yaaay: " + bestVmsList.get(i) );


}}



  
    private void tasksListMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tasksListMousePressed
                DefaultTableModel vmsModel = (DefaultTableModel)bestVMsTable.getModel();

        vmsModel.setRowCount(0);

 int index = tasksList.getSelectedIndex();

        Object taskID = tasksList.getSelectedValue();  
        Integer selectedTask = Integer.parseInt(taskID.toString());

                System.out.println("Selected Task ID" + selectedTask );
                 fill_table(selectedTask);
                
    }//GEN-LAST:event_tasksListMousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
new Final_List().setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

     
    /**
     * @param args the command line arguments
     */
  
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
            java.util.logging.Logger.getLogger(BestVmsList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BestVmsList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BestVmsList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BestVmsList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BestVmsList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bestVMsTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<String> tasksList;
    // End of variables declaration//GEN-END:variables


  

  
}
