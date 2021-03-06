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

    public AndraAlien(InfDB idb) {
        initComponents();
        this.idb = idb;
        valjAlien();
        valjPlats();
        valjAnsvarigAgent();
        inputAntal.setVisible(false);
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
        inputLosenord = new javax.swing.JPasswordField();

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

        comboValdAlien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj alien" }));

        inputName.setColumns(8);

        inputRegDat.setColumns(8);

        inputTelNR.setColumns(8);

        comboValdPlats.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj plats" }));

        comboValdAgent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj agent" }));

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

        comboValdRas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj ras", "Boglodite", "Squid", "Worm" }));
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bTillbaka, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(bAndra, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bVisaInformation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tillhorRas, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
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
                                    .addComponent(inputTelNR)
                                    .addComponent(comboValdPlats, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboValdRas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboValdAgent, javax.swing.GroupLayout.Alignment.TRAILING, 0, 98, Short.MAX_VALUE)
                                    .addComponent(inputName)
                                    .addComponent(inputLosenord)
                                    .addComponent(inputRegDat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                    .addComponent(comboValdAlien, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(120, 120, 120)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputAntal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 22, Short.MAX_VALUE)
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
                        .addGap(0, 45, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTillbakaActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_bTillbakaActionPerformed

    private void bVisaInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVisaInformationActionPerformed
        jTextArea1.setText("");

        ArrayList<HashMap<String, String>> valdAlien;

        try {
            String namn = comboValdAlien.getSelectedItem().toString();
            String alienID = idb.fetchSingle("SELECT Alien_ID FROM alien WHERE Namn = '" + namn + "'");
            String fraga = "SELECT * FROM alien WHERE Alien_ID = " + alienID;
            valdAlien = idb.fetchRows(fraga);
            String platsNamn = idb.fetchSingle("SELECT Benamning FROM plats WHERE Plats_ID IN "
                    + "(SELECT Plats FROM alien WHERE Alien_ID = " + alienID + ")");
            String ansvarigAgent = idb.fetchSingle("SELECT Namn FROM agent WHERE Agent_ID IN "
                    + "(SELECT Ansvarig_Agent FROM alien WHERE Alien_ID = " + alienID + ");");

            for (HashMap<String, String> alien : valdAlien) {
                jTextArea1.append("ID:\t" + alien.get("Alien_ID") + "\n");
                jTextArea1.append("Namn:\t" + alien.get("Namn") + "\n");
                jTextArea1.append("Tel.nr.:\t" + alien.get("Telefon") + "\n");
                jTextArea1.append("Reg.dat.:\t" + alien.get("Registreringsdatum") + "\n");
                jTextArea1.append("Område:\t" + platsNamn + "\n");
                jTextArea1.append("Ansvarig agent:\t" + ansvarigAgent + "\n");
                jTextArea1.append("");
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Kunde inte hämta information om alien.\n"
                    + e.getMessage());
        }
    }//GEN-LAST:event_bVisaInformationActionPerformed

    private void bAndraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAndraActionPerformed
        try {
            String alienNamn = comboValdAlien.getSelectedItem().toString();
            String alienID = idb.fetchSingle("SELECT Alien_ID FROM alien WHERE Namn = '" + alienNamn + "'");
            String nyttNamn = inputName.getText();
            String nyttDatum = inputRegDat.getText();
            String nyttLosen = new String(inputLosenord.getPassword());
            String nyttTele = inputTelNR.getText();

            if (comboValdAlien.getSelectedIndex() > 0) {
                if (nyttNamn != null && !nyttNamn.isEmpty()) {
                    String updateraNamn = "UPDATE alien SET Namn = '" + nyttNamn + "' WHERE Alien_ID = " + alienID;
                    idb.update(updateraNamn);
                }
                if (nyttDatum != null && !nyttDatum.isEmpty()) {
                    String updateraDatum = "UPDATE alien SET Registreringsdatum = '" + nyttDatum + "' WHERE Alien_ID = " + alienID;
                    idb.update(updateraDatum);
                }
                if (nyttLosen != null && !nyttLosen.isEmpty()) {
                    String updateraLosen = "UPDATE alien SET Losenord = '" + nyttLosen + "' WHERE Alien_ID = " + alienID;
                    idb.update(updateraLosen);
                }
                if (nyttTele != null && !nyttTele.isEmpty()) {
                    String updateraTele = "UPDATE alien SET Telefon = '" + nyttTele + "' WHERE Alien_ID = " + alienID;
                    idb.update(updateraTele);
                }
                if (comboValdPlats.getSelectedIndex() > 0) {
                    String nyPlats = comboValdPlats.getSelectedItem().toString();
                    String platsID = idb.fetchSingle("SELE  CT Plats_ID FROM plats WHERE Benamning = '" + nyPlats + "'");
                    String updateraPlats = "UPDATE alien SET Plats = " + platsID + " WHERE Alien_ID = " + alienID;
                    idb.update(updateraPlats);
                }
                if (comboValdAgent.getSelectedIndex() > 0) {
                    String nyAnsvarigAgent = comboValdAgent.getSelectedItem().toString();
                    String agentID = idb.fetchSingle("SELECT Agent_ID FROM agent WHERE Namn = '" + nyAnsvarigAgent + "'");
                    String updateraAnsvarigAgent = "UPDATE alien SET Ansvarig_Agent = " + agentID + " WHERE Alien_ID = " + alienID;
                    idb.update(updateraAnsvarigAgent);
                }
                if (comboValdRas.getSelectedIndex() > 0) {
                    String nyRas = comboValdRas.getSelectedItem().toString();
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
                }

                alienUppdaterad();
                this.setVisible(false);

            } else {
                JOptionPane.showMessageDialog(null, "Välj alien.");
            }
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

    public void alienUppdaterad() {
        JOptionPane.showMessageDialog(null, "En alien har uppdaterats!");
        this.setVisible(false);
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
    private javax.swing.JPasswordField inputLosenord;
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
