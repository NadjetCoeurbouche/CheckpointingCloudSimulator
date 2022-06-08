package com.nadjetkerbouche.checkpointingsimu;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Collections.list;
import java.util.logging.Level;
import static java.util.logging.Level.parse;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nadjet KERBOUCHE
 */
public class VM_SLA_data_UI extends javax.swing.JFrame {

    public VM_SLA_data_UI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        sidePanel = new javax.swing.JPanel();
        dashboardBtn = new javax.swing.JButton();
        vmBtn = new javax.swing.JButton();
        customerBtn = new javax.swing.JButton();
        slaBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        vmsTable = new javax.swing.JTable();
        importSLAFileBtn = new javax.swing.JButton();
        clearTableBtn = new javax.swing.JButton();
        importVMFileBtn1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        slaTable = new javax.swing.JTable();
        bestVMs = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidePanel.setBackground(new java.awt.Color(187, 225, 250));
        sidePanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        dashboardBtn.setBackground(new java.awt.Color(187, 225, 250));
        dashboardBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        dashboardBtn.setText("Dashboard");

        vmBtn.setBackground(new java.awt.Color(187, 225, 250));
        vmBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        vmBtn.setText("Virtual Machines");
        vmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vmBtnActionPerformed(evt);
            }
        });

        customerBtn.setBackground(new java.awt.Color(187, 225, 250));
        customerBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        customerBtn.setText("Customers");
        customerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerBtnActionPerformed(evt);
            }
        });

        slaBtn.setBackground(new java.awt.Color(187, 225, 250));
        slaBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        slaBtn.setText("SLAs");
        slaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slaBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vmBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
            .addComponent(dashboardBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(slaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(customerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(dashboardBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vmBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(slaBtn)
                .addGap(14, 14, 14)
                .addComponent(customerBtn)
                .addContainerGap(407, Short.MAX_VALUE))
        );

        getContentPane().add(sidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 720));

        vmsTable.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        vmsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "VM ID", "Type", "vCPU", "vRAM", "vStorage", "Failure Percentage", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        vmsTable.setToolTipText("");
        vmsTable.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(vmsTable);
        vmsTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 1010, 270));

        importSLAFileBtn.setBackground(new java.awt.Color(50, 130, 184));
        importSLAFileBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        importSLAFileBtn.setForeground(new java.awt.Color(187, 225, 250));
        importSLAFileBtn.setText("Import SLAs Data");
        importSLAFileBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        importSLAFileBtn.setBorderPainted(false);
        importSLAFileBtn.setFocusPainted(false);
        importSLAFileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importSLAFileBtnActionPerformed(evt);
            }
        });
        getContentPane().add(importSLAFileBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, 160, 40));

        clearTableBtn.setText("Clear Table");
        clearTableBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearTableBtnActionPerformed(evt);
            }
        });
        getContentPane().add(clearTableBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 20, 140, 40));

        importVMFileBtn1.setBackground(new java.awt.Color(50, 130, 184));
        importVMFileBtn1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        importVMFileBtn1.setForeground(new java.awt.Color(187, 225, 250));
        importVMFileBtn1.setText("Import VMs Data");
        importVMFileBtn1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        importVMFileBtn1.setBorderPainted(false);
        importVMFileBtn1.setFocusPainted(false);
        importVMFileBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importVMFileBtn1ActionPerformed(evt);
            }
        });
        getContentPane().add(importVMFileBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 20, 160, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(27, 38, 44));
        jLabel2.setText("Virtual Machines");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(27, 38, 44));
        jLabel1.setText("Service Level Agreements");

        slaTable.setAutoCreateRowSorter(true);
        slaTable.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        slaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SLA ID", "Customer ID", "Instructions Count", "Response time expected", "Deadline", "Price", "10%", "25%", "50%", "Details"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        slaTable.setColumnSelectionAllowed(true);
        slaTable.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(slaTable);
        slaTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        bestVMs.setText("Generate Best VMs List");
        bestVMs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bestVMsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1010, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(114, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bestVMs)
                .addGap(104, 104, 104))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(373, 373, 373)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bestVMs)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 1140, 810));

        pack();
    }// </editor-fold>//GEN-END:initComponents

public static ArrayList<SLA> slaList  = null;
public static ArrayList<VirtualMachine> vmList = null;

    private void customerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerBtnActionPerformed

    private void vmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vmBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vmBtnActionPerformed
 private String filePath(){
 
JFileChooser fileChooser = new JFileChooser();        
      String filePath = null ;
      int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
             filePath =  selectedFile.getAbsolutePath();
            System.out.println("Selected file: " + filePath);
    
}  
      return filePath;

    }       
    private void importSLAFileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importSLAFileBtnActionPerformed

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(filePath()));
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(VM_SLA_data_UI.class.getName()).log(Level.SEVERE, null, ex);
        }
        DefaultTableModel model = (DefaultTableModel)slaTable.getModel();
        // get lines from txt file
        Object[] tableLines = br.lines().toArray();
                slaList = new ArrayList<SLA>();

        // extratct data from lines
        // set data to jtable model
         for(int i = 0; i < tableLines.length; i++)
            {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split(" ");
                                model.addRow(dataRow);
 
                int slaID = Integer.parseInt(dataRow[0]);
                int customerID = Integer.parseInt(dataRow[1]);
                 int instructionCount = Integer.parseInt(dataRow[2]);
                 int responseTime = Integer.parseInt(dataRow[3]);
                 int deadline = Integer.parseInt(dataRow[4]); 
                 int price = Integer.parseInt(dataRow[5]);
                 float penaltyPercentage1 = Float.parseFloat(dataRow[6]);
                 float penaltyPercentage2 = Float.parseFloat(dataRow[7]);
                 float penaltyPercentage3 = Float.parseFloat(dataRow[8]);
                 String status = dataRow[9];
                     
SLA sla = new SLA(slaID, customerID, instructionCount, responseTime, deadline, price, penaltyPercentage1, penaltyPercentage2, penaltyPercentage3, status);

slaList.add(sla);

System.out.println("List" + slaList.get(i));   
        }
        
    }//GEN-LAST:event_importSLAFileBtnActionPerformed

    private void slaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slaBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_slaBtnActionPerformed

    private void importVMFileBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importVMFileBtn1ActionPerformed
    
        // Defining BufferReader instance
        BufferedReader br = null;
    
        try {
            // Initializing BufferReader instance
            br = new BufferedReader(new FileReader(filePath()));
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(VM_SLA_data_UI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Defining vmsTable Model
        DefaultTableModel model = (DefaultTableModel)vmsTable.getModel();
        // get lines from txt file
        Object[] tableLines = br.lines().toArray();
        // Initializing vmList
        vmList = new ArrayList<VirtualMachine>();
        // extratct data from lines
        for (Object tableLine : tableLines) {
            String line = tableLine.toString().trim();
            String[] dataRow = line.split(" ");
            
             int vmID = Integer.parseInt(dataRow[0]);
             String vType = dataRow[1];
             int vCPU = Integer.parseInt(dataRow[2]);
             int vRAM = Integer.parseInt(dataRow[3]);
             int vStorage = Integer.parseInt(dataRow[4]);
             float failure = Float.parseFloat(dataRow[5]);
             String status = dataRow[6];
        // Initializing vm instance
             
VirtualMachine vm = new VirtualMachine(vmID, vType, vCPU, vRAM, vStorage, failure, status);
     // adding vms to vmList
vmList.add(vm);

        // set data to jtable model
        model.addRow(dataRow);
        }
            
            }//GEN-LAST:event_importVMFileBtn1ActionPerformed

    private void clearTableBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearTableBtnActionPerformed
 DefaultTableModel tabVM = (DefaultTableModel) vmsTable.getModel();
        tabVM.setRowCount(0);
        DefaultTableModel tabSLA = (DefaultTableModel) slaTable.getModel();
        tabSLA.setRowCount(0);    }//GEN-LAST:event_clearTableBtnActionPerformed

    private void bestVMsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bestVMsActionPerformed

new BestVmsList().setVisible(true);    }//GEN-LAST:event_bestVMsActionPerformed

    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VM_SLA_data_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new VM_SLA_data_UI().setVisible(true);
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bestVMs;
    private javax.swing.JButton clearTableBtn;
    private javax.swing.JButton customerBtn;
    private javax.swing.JButton dashboardBtn;
    private javax.swing.JButton importSLAFileBtn;
    private javax.swing.JButton importVMFileBtn1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JButton slaBtn;
    private javax.swing.JTable slaTable;
    private javax.swing.JButton vmBtn;
    private javax.swing.JTable vmsTable;
    // End of variables declaration//GEN-END:variables

    private String SLA(SLA get) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
