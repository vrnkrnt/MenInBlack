/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenInBlack;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/*
 * @author Emil Lager
 * @author Josefin Olsson
 * @author Karin Mäki-Kala
 * @author Veronika Ranta
 */

public class RegAgent extends javax.swing.JFrame {

    private static InfDB idb;
    
    /**
     * Creates new form RegAgent
     */
    public RegAgent(InfDB idb) {
        initComponents();
        this.idb = idb;
        valjOmrade();
        valjAdmin();
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bTillbaka = new javax.swing.JButton();
        bRegistrera = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inputNamn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        inputTelefon = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        inputAnstDat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        inputLosenord = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        comboValjAdmin = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        comboValjOmrade = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bTillbaka.setText("Tillbaka");
        bTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTillbakaActionPerformed(evt);
            }
        });

        bRegistrera.setText("Registrera");
        bRegistrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegistreraActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Registrera ny agent");

        jLabel2.setText("Namn:");

        jLabel3.setText("Telefon:");

        jLabel4.setText("Anställningsdatum:");

        jLabel5.setText("Administratör J/N:");

        jLabel6.setText("Lösenord:");

        comboValjAdmin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj" }));

        jLabel7.setText("Område:");

        comboValjOmrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputNamn)
                            .addComponent(comboValjOmrade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputTelefon)
                            .addComponent(inputAnstDat)
                            .addComponent(inputLosenord)
                            .addComponent(comboValjAdmin, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(168, 168, 168))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(bRegistrera, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bTillbaka, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(inputNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(inputTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(inputAnstDat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(comboValjAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(inputLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(comboValjOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bTillbaka)
                    .addComponent(bRegistrera))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTillbakaActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_bTillbakaActionPerformed

    private void bRegistreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegistreraActionPerformed
        if(Validering.textFaltHarVarde(inputNamn) && Validering.textFaltHarVarde(inputLosenord)
                && Validering.textFaltHarVarde(inputAnstDat) && Validering.textFaltHarVarde(inputTelefon))
        {
            try {
                String id = idb.getAutoIncrement("agent", "Agent_ID"); 
                String namn = inputNamn.getText();
                String telefon = inputTelefon.getText();                
                String anstallningsDatum = inputAnstDat.getText();
                String admin = comboValjAdmin.getSelectedItem().toString();
                String losenord = inputLosenord.getText();
                String omrade = comboValjOmrade.getSelectedItem().toString();

                String omradesID = idb.fetchSingle("SELECT Omrades_ID FROM omrade WHERE benamning = '" + omrade + "'");
                String fraga = "INSERT INTO Agent VALUE(" + id + ", '" + namn + "', '" + telefon + "', "
                        + "'" + anstallningsDatum + "', '" + admin + "', '" + losenord + "', " + omradesID + ");";
                if(Validering.originalPass(losenord, "Agent", idb))
                {
                    idb.insert(fraga);
                    JOptionPane.showMessageDialog(null, "En agent har lagts till!");
                    this.setVisible(false);
                }
            }
            catch (InfException ex)
            {
                JOptionPane.showMessageDialog(null, "Kunde inte lägga till agent :( ");
            }
        }
    }//GEN-LAST:event_bRegistreraActionPerformed

    private void valjOmrade() {
        String fraga = "SELECT Benamning FROM omrade";
        ArrayList<String> allaOmraden;
        try {

            allaOmraden = idb.fetchColumn(fraga);

            for (String omrade : allaOmraden) {
                comboValjOmrade.addItem(omrade);
            }

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + e.getMessage());
        }
    }
    
    private void valjAdmin() {
        comboValjAdmin.addItem("J");
        comboValjAdmin.addItem("N");
    }

                
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
            java.util.logging.Logger.getLogger(RegAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegAgent(idb).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bRegistrera;
    private javax.swing.JButton bTillbaka;
    private javax.swing.JComboBox<String> comboValjAdmin;
    private javax.swing.JComboBox<String> comboValjOmrade;
    private javax.swing.JTextField inputAnstDat;
    private javax.swing.JTextField inputLosenord;
    private javax.swing.JTextField inputNamn;
    private javax.swing.JTextField inputTelefon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
