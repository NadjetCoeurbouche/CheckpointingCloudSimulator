package com.nadjetkerbouche.checkpointingsimu;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nadjet KERBOUCHE
 */
public class ApproachFinalResults extends javax.swing.JFrame {

    /**
     * Creates new form ApproachFinalResults
     */
    public ApproachFinalResults() {
        initComponents();
    }
    
    int fault_occ_time;
    int checkpoint_interval;
    int last_checkpoint_time;
    int wasted_time;
    int new_response_time;
    int final_exe_time;
    int deadline;
    float penalty_cost;
    float penaltyPercentage1;
    float penaltyPercentage2;
    float penaltyPercentage3;
    float price;
    float exePercentage;
    int previouseResponseTime;
    int nbInsLeft;
    int nbInsPrevious;
    int newVCPU;
    
    
public void approach_results(){
 
    last_checkpoint_time = (fault_occ_time /checkpoint_interval) * checkpoint_interval;
    exePercentage = (last_checkpoint_time * 100)/ previouseResponseTime;
    nbInsLeft = (int) (exePercentage * nbInsPrevious); 
    new_response_time = nbInsLeft / newVCPU;

    DefaultTableModel resultModel = (DefaultTableModel)resultTable.getModel();

wasted_time = fault_occ_time - last_checkpoint_time;

final_exe_time = last_checkpoint_time + wasted_time + new_response_time;
 
if(deadline <= final_exe_time){
penalty_cost = ((penaltyPercentage1 + penaltyPercentage2 + penaltyPercentage3) /3) * price;
}
else {
    if (final_exe_time >= ((float) 0.1 * deadline) &&  final_exe_time < ((float) 0.25 * deadline) ){
    penalty_cost = ((penaltyPercentage1 + penaltyPercentage1 + penaltyPercentage2 + penaltyPercentage3) /4) * price;
   
    }
    else if (final_exe_time >= ((float) 0.25 * deadline) &&  final_exe_time <((float) 0.50* deadline) ) {
       penalty_cost = ((penaltyPercentage1 + penaltyPercentage2 +  penaltyPercentage2 + penaltyPercentage3) /4) * price;

    }
    else{
           penalty_cost = ((penaltyPercentage1 + penaltyPercentage2 +  penaltyPercentage2 + penaltyPercentage3 + penaltyPercentage3) /4) * price;

    }

}
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        fpLabel = new javax.swing.JLabel();
        fot = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        fpLabel.setText("Failure percentage:");

        fot.setText("Fault occurrence time:");

        resultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Task ID", "Deadline", "Remaining Time", "Penalty cost"
            }
        ));
        jScrollPane1.setViewportView(resultTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(fot)
                        .addGap(87, 87, 87)
                        .addComponent(fpLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(495, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fot)
                    .addComponent(fpLabel))
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(224, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fot;
    private javax.swing.JLabel fpLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable resultTable;
    // End of variables declaration//GEN-END:variables
}
