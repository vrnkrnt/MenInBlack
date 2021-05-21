/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenInBlack;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/*
 * @author Emil Lager
 * @author Josefin Olsson
 * @author Karin Mäki-Kala
 * @author Veronika Ranta
 */
public class AndraAlien extends javax.swing.JFrame {

    private static InfDB idb;

    /**
     * Creates new form AndraAlien
     */
    public AndraAlien(InfDB idb) {
        initComponents();
        this.idb = idb;
        valjAlien();
        valjPlats();
        valjAnsvarigAgent();
        inputAntal.setVisible(false);
        //fyllRasCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        comboValdAlien = new javax.swing.JComboBox<>();
        inputName = new javax.swing.JTextField();
        inputRegDat = new javax.swing.JTextField();
        inputLosenord = new javax.swing.JTextField();
        inputTelNR = new javax.swing.JTextField();
        comboValdPlats = new javax.swing.JComboBox<>();
        comboValdAgent = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        bAndra = new javax.swing.JButton();
        bVisaInformation = new javax.swing.JButton();
        bTillbaka = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        comboValdRas = new javax.swing.JComboBox<>();
        tillhorRas = new javax.swing.JLabel();
        inputAntal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Ändra alien");

        jLabel2.setText("Välj alien:");

        jLabel3.setText("Nytt namn:");

        jLabel4.setText("Nytt registreringsdatum:");

        jLabel5.setText("Nytt lösenord:");

        jLabel6.setText("Nytt telefonnummer:");

        jLabel7.setText("Ny plats:");

        jLabel8.setText("Ny ansvarig agent:");

        comboValdAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboValdAlienActionPerformed(evt);
            }
        });

        inputName.setColumns(8);

        inputRegDat.setColumns(8);

        inputLosenord.setColumns(8);

        inputTelNR.setColumns(8);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        bAndra.setText("Ändra");
        bAndra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAndraActionPerformed(evt);
            }
        });

        bVisaInformation.setText("Visa info ▷");
        bVisaInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVisaInformationActionPerformed(evt);
            }
        });

        bTillbaka.setText("Tillbaka");
        bTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTillbakaActionPerformed(evt);
            }
        });

        jLabel9.setText("Ny ras:");

        comboValdRas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boglodite", "Squid", "Worm" }));
        comboValdRas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboValdRasActionPerformed(evt);
            }
        });

        inputAntal.setColumns(8);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bAndra, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboValdAgent, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboValdAlien, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(inputRegDat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                            .addComponent(inputLosenord, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(inputTelNR, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(comboValdPlats, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboValdRas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bVisaInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(bTillbaka, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tillhorRas, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputAntal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(143, 143, 143))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(comboValdAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bVisaInformation))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(inputRegDat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(inputLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bTillbaka)
                        .addComponent(bAndra))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(inputTelNR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(comboValdPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(comboValdAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(comboValdRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tillhorRas)
                            .addComponent(inputAntal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 44, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTillbakaActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_bTillbakaActionPerformed

    private void comboValdAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboValdAlienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboValdAlienActionPerformed

    private void bVisaInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVisaInformationActionPerformed
        jTextArea1.setText("");

        ArrayList<HashMap<String, String>> valdAlien;

        try {
            String namn = comboValdAlien.getSelectedItem().toString();
            String fraga = "SELECT * FROM alien WHERE NAMN = '" + namn + "'";
            valdAlien = idb.fetchRows(fraga);

            for (HashMap<String, String> alien : valdAlien) {
                jTextArea1.append("ID:\t" + alien.get("Alien_ID") + "\n");
                jTextArea1.append("Namn:\t" + alien.get("Namn") + "\n");
                jTextArea1.append("Tel. nr.:\t" + alien.get("Telefon") + "\n");
                jTextArea1.append("Reg. dat.:\t" + alien.get("Registreringsdatum") + "\n");
                jTextArea1.append("Område:\t" + alien.get("Plats") + "\n");
                jTextArea1.append("Ansvarig agent:\t" + alien.get("Ansvarig_Agent") + "\n");
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel. "
                    + e.getMessage());
        }
    }//GEN-LAST:event_bVisaInformationActionPerformed

    private void bAndraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAndraActionPerformed
        try {
            String alienNamn = comboValdAlien.getSelectedItem().toString();
            String alienID = idb.fetchSingle("SELECT Alien_ID FROM alien WHERE Namn = '" + alienNamn + "'");
            String nyttNamn = inputName.getText();
            String nyttDatum = inputRegDat.getText();
            String nyttPass = inputLosenord.getText();
            String nyttTele = inputTelNR.getText();
            String nyPlats = comboValdPlats.getSelectedItem().toString();
            String nyAnsvarigAgent = comboValdAgent.getSelectedItem().toString();
            String nyRas = comboValdRas.getSelectedItem().toString();
            String platsID = idb.fetchSingle("SELECT Plats_ID FROM plats WHERE Benamning = '" + nyPlats + "'");
            String agentID = idb.fetchSingle("SELECT Agent_ID FROM agent WHERE Namn = '" + nyAnsvarigAgent + "'");
            String fraga = "UPDATE alien SET Alien_ID = " + alienID + ", Registreringsdatum = '" + nyttDatum + "', "
                    + "losenord = '" + nyttPass + "', Namn = '" + nyttNamn + "', Telefon = '" + nyttTele + "', Plats = " + platsID + ", "
                    + "Ansvarig_Agent = " + agentID + " WHERE Alien_ID = " + alienID;
            idb.update(fraga);
            
            String raderaGammalRas = "DELETE FROM boglodite WHERE Alien_ID = " + alienID;
            String raderaGammal = "DELETE FROM worm WHERE Alien_ID = " + alienID;
            String radera = "DELETE FROM squid WHERE Alien_ID = " + alienID;
            idb.delete(raderaGammalRas);
            idb.delete(raderaGammal);
            idb.delete(radera);
            
            if (nyRas.equalsIgnoreCase("Boglodite")) {
                String antalBoogies = inputAntal.getText();
                String uppdateraRas = "INSERT INTO boglodite VALUES(" + alienID + ", " + antalBoogies + ")";
                idb.insert(uppdateraRas);
            }
            if (nyRas.equalsIgnoreCase("Squid")) {
                String antalArmar = inputAntal.getText();
                String uppdateraRas = "INSERT INTO squid VALUES(" + alienID + ", " + antalArmar + ")";
                idb.insert(uppdateraRas);
            }
            if (nyRas.equalsIgnoreCase("Worm")) {
                String uppdateraRas = "INSERT INTO worm VALUES(" + alienID + ")";
                idb.insert(uppdateraRas);
            }
            
            JOptionPane.showMessageDialog(null, "En alien har uppdaterats!");
            this.setVisible(false);
            new AndraAlien(idb).setVisible(true);
            

        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Kunde inte lägga till alien :( " + ex.getMessage());
        }
    }//GEN-LAST:event_bAndraActionPerformed

    private void comboValdRasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboValdRasActionPerformed
        String valdRas = comboValdRas.getSelectedItem().toString();

        if (valdRas.equalsIgnoreCase("Boglodite")) {
            tillhorRas.setText("Antal boogies: ");
            inputAntal.setVisible(true);
        }
        if (valdRas.equalsIgnoreCase("Squid")) {
            tillhorRas.setText("Antal armar: ");
            inputAntal.setVisible(true);
        }
        if (valdRas.equalsIgnoreCase("Worm")) {
            tillhorRas.setText("");
            inputAntal.setVisible(false);
        }
    }//GEN-LAST:event_comboValdRasActionPerformed

    private void valjAlien() {
        String fraga = "SELECT Namn FROM alien";
        ArrayList<String> allaAliens;
        try {

            allaAliens = idb.fetchColumn(fraga);

            for (String alienNamn : allaAliens) {
                comboValdAlien.addItem(alienNamn);
            }

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + e.getMessage());
        }
    }
    
    private void ransaFalt()
    {
        inputName.setText("");
        inputRegDat.setText("");
        inputName.setText("");
        inputTelNR.setText("");
        inputLosenord.setText("");
        inputAntal.setText("");
    }

    private void valjPlats() {
        String fraga = "SELECT Benamning FROM plats";
        ArrayList<String> allaPlatser;
        try {

            allaPlatser = idb.fetchColumn(fraga);

            for (String platsNamn : allaPlatser) {
                comboValdPlats.addItem(platsNamn);
            }

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + e.getMessage());
        }
    }

    private void valjAnsvarigAgent() {
        String fraga = "SELECT Namn FROM agent";
        ArrayList<String> allaAgenter;
        try {

            allaAgenter = idb.fetchColumn(fraga);

            for (String agentNamn : allaAgenter) {
                comboValdAgent.addItem(agentNamn);
            }

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + e.getMessage());
        }
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
            java.util.logging.Logger.getLogger(AndraAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AndraAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AndraAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AndraAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AndraAlien(idb).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAndra;
    private javax.swing.JButton bTillbaka;
    private javax.swing.JButton bVisaInformation;
    private javax.swing.JComboBox<String> comboValdAgent;
    private javax.swing.JComboBox<String> comboValdAlien;
    private javax.swing.JComboBox<String> comboValdPlats;
    private javax.swing.JComboBox<String> comboValdRas;
    private javax.swing.JTextField inputAntal;
    private javax.swing.JTextField inputLosenord;
    private javax.swing.JTextField inputName;
    private javax.swing.JTextField inputRegDat;
    private javax.swing.JTextField inputTelNR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel tillhorRas;
    // End of variables declaration//GEN-END:variables
}
