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
public class AlienStart extends javax.swing.JFrame {

    private InfDB idb;
    private static String id;

    public AlienStart(InfDB idb, String id) {
        initComponents();
        this.idb = idb;
        this.id = id;
        visaMinInformation();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jAndraLosen = new javax.swing.JButton();
        jVisaOchef = new javax.swing.JButton();
        jVisaAliens = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        bLoggaUt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jAndraLosen.setText("Ändra lösenord");
        jAndraLosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAndraLosenActionPerformed(evt);
            }
        });

        jVisaOchef.setText("Visa min områdeschef");
        jVisaOchef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVisaOchefActionPerformed(evt);
            }
        });

        jVisaAliens.setText("Visa aliens i mitt område");
        jVisaAliens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVisaAliensActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Min information");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        bLoggaUt.setText("Logga ut");
        bLoggaUt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLoggaUtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jVisaAliens, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                                    .addComponent(jAndraLosen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jVisaOchef, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bLoggaUt, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(315, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jVisaOchef)
                        .addGap(18, 18, 18)
                        .addComponent(jAndraLosen)
                        .addGap(18, 18, 18)
                        .addComponent(jVisaAliens)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bLoggaUt)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jAndraLosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAndraLosenActionPerformed
        new AndraLosenAlien(idb, id).setVisible(true);
    }//GEN-LAST:event_jAndraLosenActionPerformed

    private void jVisaOchefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVisaOchefActionPerformed
        new VisaAliensOmradesChef(idb, id).setVisible(true);
    }//GEN-LAST:event_jVisaOchefActionPerformed

    private void jVisaAliensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVisaAliensActionPerformed
        new VisaAliensIAlienomrade(idb, id).setVisible(true);
    }//GEN-LAST:event_jVisaAliensActionPerformed

    private void bLoggaUtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLoggaUtActionPerformed
        new LogIn(idb).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bLoggaUtActionPerformed

    private void visaMinInformation() {

        ArrayList<HashMap<String, String>> valdAlien;

        try {
            String fraga = "SELECT * FROM alien WHERE Alien_ID = " + id;
            valdAlien = idb.fetchRows(fraga);
            String omradeNamn = idb.fetchSingle("SELECT Benamning FROM omrade WHERE Omrades_ID IN "
                    + "(SELECT Omrade FROM Agent WHERE Agent_ID = " + id + ");");
            String ansvarigAgent = idb.fetchSingle("SELECT Namn FROM agent WHERE Agent_ID IN "
                    + "(SELECT Ansvarig_Agent FROM alien WHERE Alien_ID = " + id + ");");

            for (HashMap<String, String> alien : valdAlien) {
                jTextArea1.append("ID:\t" + alien.get("Alien_ID") + "\n");
                jTextArea1.append("Namn:\t" + alien.get("Namn") + "\n");
                jTextArea1.append("Tel.nr.:\t" + alien.get("Telefon") + "\n");
                jTextArea1.append("Reg.dat.:\t" + alien.get("Registreringsdatum") + "\n");
                jTextArea1.append("Område:\t" + omradeNamn + "\n");
                jTextArea1.append("Ansvarig agent:\t" + ansvarigAgent + "\n");
                jTextArea1.append("");
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Kunde inte visa aliens information. \n"
                    + e.getMessage());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bLoggaUt;
    private javax.swing.JButton jAndraLosen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jVisaAliens;
    private javax.swing.JButton jVisaOchef;
    // End of variables declaration//GEN-END:variables
}
