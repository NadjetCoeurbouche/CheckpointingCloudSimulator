package com.nadjetkerbouche.checkpointingsimu;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
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
        jScrollPane2 = new javax.swing.JScrollPane();
        slaTable = new javax.swing.JTable();
        importVMFileBtn1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

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
            .addComponent(vmBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
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
                .addContainerGap(509, Short.MAX_VALUE))
        );

        getContentPane().add(sidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 820));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 1100, 310));

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

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, 1100, 340));

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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(27, 38, 44));
        jLabel1.setText("Service Level Agreements");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(27, 38, 44));
        jLabel2.setText("Virtual Machines");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1140, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 1140, 810));

        pack();
    }// </editor-fold>//GEN-END:initComponents
ArrayList<VirtualMachine> vmList = null ;
ArrayList<SLA> slaList ;
VirtualMachine vm; 
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
        // extratct data from lines
        // set data to jtable model
        for (Object tableLine : tableLines) {
         for(int i = 0; i < tableLines.length; i++)
            {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split(" ");
                model.addRow(dataRow);
            }
            
        }
        
    }//GEN-LAST:event_importSLAFileBtnActionPerformed

    private void slaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slaBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_slaBtnActionPerformed

    private void importVMFileBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importVMFileBtn1ActionPerformed
     BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(filePath()));
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(VM_SLA_data_UI.class.getName()).log(Level.SEVERE, null, ex);
        }
        DefaultTableModel model = (DefaultTableModel)vmsTable.getModel();
        // get lines from txt file
        Object[] tableLines = br.lines().toArray();
        // extratct data from lines
        // set data to jtable model
        for (Object tableLine : tableLines) {
            String line = tableLine.toString().trim();
            String[] dataRow = line.split(" ");
            
/*vm = new VirtualMachine(Integer.parseInt(dataRow[0]), dataRow[1], Integer.parseInt(dataRow[2]), Integer.parseInt(dataRow[3]), Integer.parseInt(dataRow[4]), Float.parseFloat(dataRow[5]),dataRow[6]);
vmList.add(vm);
            System.out.println("vm " + vmList.toString());*/
        model.addRow(dataRow);
        }
            
            }//GEN-LAST:event_importVMFileBtn1ActionPerformed

    private void clearTableBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearTableBtnActionPerformed
vmsTable.setModel(new DefaultTableModel());
    }//GEN-LAST:event_clearTableBtnActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
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
}
