/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jodicelukeendicott.riskofrain2database;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import static jodicelukeendicott.riskofrain2database.Main.mmw;

/**
 *
 * @author lukej
 */
public class SurvivorSelectionWin extends javax.swing.JFrame {

    DefaultListModel dlm;
    ArrayList<Survivor>sl;
     int idx = -1;
    /**
     * Creates new form SurvivorSelectionWin
     */
    public SurvivorSelectionWin() {
        dlm = new DefaultListModel();
        sl = new ArrayList<>();
       
        
        initComponents();
        try{
            ReadFiles rf = new ReadFiles();
            sl = rf.readSurvivortxtFile();
        } catch (FileNotFoundException ex) {
          System.out.println("Error:"+ex);
        }
          sl.forEach(itm -> {
              dlm.addElement(itm);
                    }); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem5 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jbtnSurvInfo = new javax.swing.JButton();
        jbtnBack = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        exporttoJson = new javax.swing.JMenuItem();
        exporttotxt = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        menutoRuns = new javax.swing.JMenuItem();
        menutoItem = new javax.swing.JMenuItem();
        menutoEnemy = new javax.swing.JMenuItem();

        jMenuItem5.setText("jMenuItem5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jList1.setModel(dlm);
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jbtnSurvInfo.setText("Get Survivor Info");
        jbtnSurvInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSurvInfoActionPerformed(evt);
            }
        });

        jbtnBack.setText("Back to Main Menu");
        jbtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBackActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jMenu5.setText("Export As..");

        exporttoJson.setText(".Json File");
        exporttoJson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exporttoJsonActionPerformed(evt);
            }
        });
        jMenu5.add(exporttoJson);

        exporttotxt.setText(".txt File");
        exporttotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exporttotxtActionPerformed(evt);
            }
        });
        jMenu5.add(exporttotxt);

        jMenu1.add(jMenu5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Navigate");

        jMenu3.setText("Go To");

        menutoRuns.setText("Run Log");
        menutoRuns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menutoRunsActionPerformed(evt);
            }
        });
        jMenu3.add(menutoRuns);

        menutoItem.setText("Item Database");
        menutoItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menutoItemActionPerformed(evt);
            }
        });
        jMenu3.add(menutoItem);

        menutoEnemy.setText("Enemy Database");
        menutoEnemy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menutoEnemyActionPerformed(evt);
            }
        });
        jMenu3.add(menutoEnemy);

        jMenu2.add(jMenu3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtnSurvInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnSurvInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnSurvInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSurvInfoActionPerformed
           if(idx>-1){
   SurvivorWin giw = new SurvivorWin((Survivor) dlm.getElementAt(idx));
   giw.setVisible(true);
       }
       else{
           JOptionPane.showMessageDialog(null, "You need to select an item");
       }
    }//GEN-LAST:event_jbtnSurvInfoActionPerformed

    private void jbtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBackActionPerformed
       this.setVisible(false);
       mmw.setVisible(true);
    }//GEN-LAST:event_jbtnBackActionPerformed

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
   if(evt.getValueIsAdjusting()){
       idx = evt.getLastIndex();
        jbtnSurvInfo.setEnabled(true);
   }
    }//GEN-LAST:event_jList1ValueChanged

    private void menutoRunsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menutoRunsActionPerformed
        this.setVisible(false);
        RunLogWin  runs =new RunLogWin();
        runs.setVisible(true);
    }//GEN-LAST:event_menutoRunsActionPerformed

    private void menutoEnemyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menutoEnemyActionPerformed
        this.setVisible(false);
        EnemySelectionWin enwin = new EnemySelectionWin();
        enwin.setVisible(true);
    }//GEN-LAST:event_menutoEnemyActionPerformed

    private void exporttoJsonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exporttoJsonActionPerformed
     if(dlm.size()==0){
         JOptionPane.showMessageDialog(null, "There is nothing to export");
      }
      else{
        WriteFiles.printSurvivor(dlm,1);
        }
    }//GEN-LAST:event_exporttoJsonActionPerformed

    private void exporttotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exporttotxtActionPerformed
         if(dlm.size()==0){
         JOptionPane.showMessageDialog(null, "There is nothing to export");
      }
      else{
        WriteFiles.printSurvivor(dlm,2);
      }
        
    }//GEN-LAST:event_exporttotxtActionPerformed

    private void menutoItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menutoItemActionPerformed
       this.setVisible(false);
        GameItemSelectionWin itmwin = new GameItemSelectionWin();
        itmwin.setVisible(true);
    }//GEN-LAST:event_menutoItemActionPerformed

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
            java.util.logging.Logger.getLogger(SurvivorSelectionWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SurvivorSelectionWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SurvivorSelectionWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SurvivorSelectionWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SurvivorSelectionWin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem exporttoJson;
    private javax.swing.JMenuItem exporttotxt;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnBack;
    private javax.swing.JButton jbtnSurvInfo;
    private javax.swing.JMenuItem menutoEnemy;
    private javax.swing.JMenuItem menutoItem;
    private javax.swing.JMenuItem menutoRuns;
    // End of variables declaration//GEN-END:variables
}
