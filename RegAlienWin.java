package MenInBlack;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Emillager
 */
public class RegAlienWin extends javax.swing.JFrame {
    private InfDB idb;
    /**
     * Creates new form RegAlienWin
     */
    public RegAlienWin(InfDB idb) {
        initComponents();
        this.idb = idb;
        fyllAgentCombo();
        fyllPlatsCombo();
        fyllRasCombo();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        inputName = new javax.swing.JTextField();
        inputPass = new javax.swing.JTextField();
        inputDat = new javax.swing.JTextField();
        inputTele = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jComboPlats = new javax.swing.JComboBox<>();
        jComboAgent = new javax.swing.JComboBox<>();
        jComboRas = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Registrera ny alien");

        jLabel3.setText("Namn");

        jLabel4.setText("Lösenord");

        jLabel5.setText("Reg. datum");

        jLabel6.setText("Telefon");

        jLabel7.setText("Plats");

        jLabel8.setText("Ansvarig agent");

        inputName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNameActionPerformed(evt);
            }
        });

        inputDat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDatActionPerformed(evt);
            }
        });

        inputTele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTeleActionPerformed(evt);
            }
        });

        jButton1.setText("Registrera");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboPlats.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboPlats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboPlatsActionPerformed(evt);
            }
        });

        jComboAgent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboRas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboRas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboRasActionPerformed(evt);
            }
        });

        jLabel2.setText("Ras");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputTele, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(inputDat, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(inputPass, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboPlats, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(jComboAgent, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboRas, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(inputPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(inputDat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputTele, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel2))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(jButton1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 117, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputTeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTeleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTeleActionPerformed

    private void inputNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNameActionPerformed

    private void inputDatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputDatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputDatActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(Validering.textFaltHarVarde(inputName) && Validering.textFaltHarVarde(inputPass)
                && Validering.textFaltHarVarde(inputDat) && Validering.textFaltHarVarde(inputTele))
        {
            try {
                String id = idb.getAutoIncrement("ALIEN", "ALIEN_ID"); 
                //String id = inputID.getText();
                //int intID = Integer.parseInt(id);
                String namn = "'" + inputName.getText() + "'";
                String pass = "'" + inputPass.getText() + "'";
                String date = "'" + inputDat.getText() + "'";
                String tele = "'" + inputTele.getText() + "'";
                String plats = jComboPlats.getSelectedItem().toString();
                String agentNamn = jComboAgent.getSelectedItem().toString();
                String ras = jComboRas.getSelectedItem().toString();
                String agentID = idb.fetchSingle("select agent_id from agent where namn = '" + agentNamn + "'");
                String platsID = idb.fetchSingle("select plats_id from plats where benamning = '" + plats + "'");
                String q = "INSERT INTO ALIEN (ALIEN_ID, REGISTRERINGSDATUM, LOSENORD, NAMN, TELEFON, PLATS, ANSVARIG_AGENT)"
                            + " VALUES (" + id + "," + date + "," + pass + "," + namn + "," + tele + "," + platsID
                            + "," + agentID + ")";
                idb.insert(q);

                switch(ras)
                {
                    case "Boglodite":
                    new Boglodite(idb, id).setVisible(true);
                    dispose();
                    break;

                    case "Squid":
                    new Squid(idb, id).setVisible(true);
                    dispose();
                    break;

                    case "Worm":
                    String addWorm = ("INSERT INTO WORM VALUES (" + id + ")");
                    idb.insert(addWorm);
                    JOptionPane.showMessageDialog(null, "En worm har registrerats!");
                }


            }
            catch (InfException ex)
            {
                JOptionPane.showMessageDialog(null, "Kunde inte lägga till alien :( ");
            }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboPlatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboPlatsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboPlatsActionPerformed

    private void jComboRasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboRasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboRasActionPerformed

//    private void fyllAgentCombo(){
//        comboAgent.removeAllItems();
//        ArrayList<String> agenter;
//        try {
//            agenter = idb.fetchColumn("select namn from agent where administrator = 'J'");
//            for (String enAgent : agenter) {
//                comboAgent.addItem(enAgent);
//            }
//        } catch (InfException ex) {
//            JOptionPane.showMessageDialog(null, "Kunde inte fylla combobox!");
//        } catch (NullPointerException npe){
//            JOptionPane.showMessageDialog(null, "Finns ingen data att hämta.");
//        }
//
//    }
    
    private void fyllAgentCombo()
    {
        jComboAgent.removeAllItems();
        ArrayList<String> admins;//skapar en ArrayList för samtliga admins
        try {
           admins = idb.fetchColumn("select namn from agent where administrator = 'J'");
        for (String enAgent : admins) {
            jComboAgent.addItem(enAgent); //läger till varje admins namn
        }
        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Kunde inte fylla combobox!");
        } catch (NullPointerException npe){
            JOptionPane.showMessageDialog(null, "Finns ingen data att hämta.");
        }
    }
    
    private void fyllPlatsCombo()
    {
        jComboPlats.removeAllItems();
        ArrayList<String> platser;//skapar en ArrayList för samtliga platser
        try {
           platser = idb.fetchColumn("select benamning from plats");
        for (String enPlats : platser) {
            jComboPlats.addItem(enPlats); //läger till varje admins namn
        }
        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Kunde inte fylla combobox!");
        } catch (NullPointerException npe){
            JOptionPane.showMessageDialog(null, "Finns ingen data att hämta.");
        }
    
    }
 
    private void fyllRasCombo()
    {
        jComboRas.removeAllItems();
        String bog = "Boglodite";
        String squid = "Squid";
        String worm = "Worm";
        
        jComboRas.addItem(bog);
        jComboRas.addItem(squid);
        jComboRas.addItem(worm);
        
        
    
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField inputDat;
    private javax.swing.JTextField inputName;
    private javax.swing.JTextField inputPass;
    private javax.swing.JTextField inputTele;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboAgent;
    private javax.swing.JComboBox<String> jComboPlats;
    private javax.swing.JComboBox<String> jComboRas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
