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
public class RaderaAlien extends javax.swing.JFrame {

    private static InfDB idb;

    public RaderaAlien(InfDB idb) {
        initComponents();
        this.idb = idb;
        fyllAlienCombo();
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
        jLabel3 = new javax.swing.JLabel();
        bRadera = new javax.swing.JButton();
        bTillbaka = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        visaAlienInfo = new javax.swing.JTextArea();
        bInfo = new javax.swing.JButton();
        alienCombo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Radera alien");

        jLabel3.setText("Välj alien:");

        bRadera.setText("Radera alien");
        bRadera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRaderaActionPerformed(evt);
            }
        });

        bTillbaka.setText("Tillbaka");
        bTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTillbakaActionPerformed(evt);
            }
        });

        visaAlienInfo.setColumns(20);
        visaAlienInfo.setRows(5);
        jScrollPane1.setViewportView(visaAlienInfo);

        bInfo.setText("Visa info om alien");
        bInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bInfoActionPerformed(evt);
            }
        });

        alienCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bRadera)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bTillbaka, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(alienCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(bInfo)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(alienCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bRadera)
                    .addComponent(bTillbaka))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fyllAlienCombo() {
        try {
            ArrayList<String> aliens;
            aliens = idb.fetchColumn("SELECT NAMN FROM ALIEN");
            for (String enAlien : aliens) {
                alienCombo.addItem(enAlien);
            }
        } catch (InfException ex) {

        }
    }
    private void bRaderaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRaderaActionPerformed
        try {
            String valdAlien = alienCombo.getSelectedItem().toString();
            if (valdAlien != null) {
                String alienID = idb.fetchSingle("SELECT ALIEN_ID FROM ALIEN WHERE NAMN = '" + valdAlien + "'");
                String raderaBog = "DELETE FROM BOGLODITE WHERE ALIEN_ID =" + alienID;
                String raderaSquid = "DELETE FROM SQUID WHERE ALIEN_ID =" + alienID;
                String raderaWorm = "DELETE FROM WORM WHERE ALIEN_ID = " + alienID;
                idb.delete(raderaBog);
                idb.delete(raderaSquid);
                idb.delete(raderaWorm);
                String fraga = "DELETE FROM ALIEN WHERE NAMN = '" + valdAlien + "';";
                idb.delete(fraga);
                JOptionPane.showMessageDialog(null, "Alien har raderats.");
                this.setVisible(false);
            }

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel. "
                    + e.getMessage());
        }

    }//GEN-LAST:event_bRaderaActionPerformed

    private void bTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTillbakaActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_bTillbakaActionPerformed

    private void bInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInfoActionPerformed
        visaAlienInfo.setText("");
        String namn = alienCombo.getSelectedItem().toString();
        ArrayList<HashMap<String, String>> soktAlien;
        if (namn != null) {
            try {
                String fraga = "SELECT * FROM alien WHERE Namn = '" + namn + "'";
                soktAlien = idb.fetchRows(fraga);
                String omradeNamn = idb.fetchSingle("SELECT Benamning FROM plats WHERE Plats_ID IN "
                        + "(SELECT plats FROM alien WHERE namn = '" + namn + "')");
                String ansvarigAgent = idb.fetchSingle("SELECT Namn FROM agent WHERE Agent_ID IN "
                        + "(SELECT Ansvarig_Agent FROM alien WHERE namn = '" + namn + "');");

                for (HashMap<String, String> alien : soktAlien) {
                    visaAlienInfo.append("ID: " + alien.get("Alien_ID") + "\n");
                    visaAlienInfo.append("Namn: " + alien.get("Namn") + "\n");
                    visaAlienInfo.append("Telefonnummer: " + alien.get("Telefon") + "\n");
                    visaAlienInfo.append("Registreringsdatum: " + alien.get("Registreringsdatum") + "\n");
                    visaAlienInfo.append("Område: " + omradeNamn + "\n");
                    visaAlienInfo.append("Ansvarig agent: " + ansvarigAgent + "\n");
                }
            } catch (InfException e) {
                JOptionPane.showMessageDialog(null, "Något gick fel. "
                        + e.getMessage());
            }
        }
    }//GEN-LAST:event_bInfoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> alienCombo;
    private javax.swing.JButton bInfo;
    private javax.swing.JButton bRadera;
    private javax.swing.JButton bTillbaka;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea visaAlienInfo;
    // End of variables declaration//GEN-END:variables
}
