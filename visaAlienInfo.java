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
public class VisaAlienInfo extends javax.swing.JFrame {

    private InfDB idb;

    public VisaAlienInfo(InfDB idb) {
        initComponents();
        this.idb = idb;
        valjAlien();
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
        bVisa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        bTillbaka = new javax.swing.JButton();
        comboValdAlien = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Välj namn:");

        bVisa.setText("Visa");
        bVisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVisaActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(25);
        jTextArea1.setRows(8);
        jScrollPane1.setViewportView(jTextArea1);

        bTillbaka.setText("Tillbaka");
        bTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTillbakaActionPerformed(evt);
            }
        });

        comboValdAlien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj alien" }));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Visa aliens information");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bTillbaka))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(comboValdAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(bVisa)))
                                .addGap(0, 135, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(bVisa)
                    .addComponent(comboValdAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bTillbaka)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bVisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVisaActionPerformed

        jTextArea1.setText("");

        ArrayList<HashMap<String, String>> valdAlien;

        try {
            String alienNamn = comboValdAlien.getSelectedItem().toString();
            String alienID = idb.fetchSingle("SELECT Alien_ID FROM alien WHERE Namn = '" + alienNamn + "'");
            String fraga = "SELECT* FROM ALIEN WHERE Alien_ID = " + alienID;
            String platsNamn = idb.fetchSingle("SELECT Benamning FROM plats WHERE Plats_ID IN "
                    + "(SELECT Plats FROM alien WHERE Alien_ID = " + alienID + ");");
            String ansvarigAgent = idb.fetchSingle("SELECT Namn FROM agent WHERE Agent_ID IN "
                    + "(SELECT Ansvarig_Agent FROM alien WHERE Alien_ID = " + alienID + ");");
            valdAlien = idb.fetchRows(fraga);

            for (HashMap<String, String> alien : valdAlien) {
                jTextArea1.append("ID:\t\t" + alien.get("Alien_ID") + "\n");
                jTextArea1.append("Namn:\t\t" + alien.get("Namn") + "\n");
                jTextArea1.append("Telefonnummer:  \t" + alien.get("Telefon") + "\n");
                jTextArea1.append("Registreringsdatum:\t" + alien.get("Registreringsdatum") + "\n");
                jTextArea1.append("Plats:\t\t" + platsNamn + "\n");
                jTextArea1.append("Ansvarig agent:  \t" + ansvarigAgent + "\n");
                jTextArea1.append("");
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel. "
                    + e.getMessage());
        }
    }//GEN-LAST:event_bVisaActionPerformed

    private void bTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTillbakaActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_bTillbakaActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bTillbaka;
    private javax.swing.JButton bVisa;
    private javax.swing.JComboBox<String> comboValdAlien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
