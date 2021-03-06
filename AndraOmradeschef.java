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
public class AndraOmradeschef extends javax.swing.JFrame {

    private static InfDB idb;

    public AndraOmradeschef(InfDB idb) {
        initComponents();
        this.idb = idb;
        valjOmradeNamn();
        nyOmradesChef();
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
        comboValjOmrade = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        bBekrafta = new javax.swing.JButton();
        bTillbaka = new javax.swing.JButton();
        comboBoxNyChef = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Välj område:");

        comboValjOmrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Område" }));

        jLabel2.setText("Ny områdeschef:");

        bBekrafta.setText("Bekräfta");
        bBekrafta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBekraftaActionPerformed(evt);
            }
        });

        bTillbaka.setText("Tillbaka");
        bTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTillbakaActionPerformed(evt);
            }
        });

        comboBoxNyChef.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Agenter" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Ändra områdeschef");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(15, 15, 15)
                        .addComponent(comboBoxNyChef, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(37, 37, 37)
                        .addComponent(comboValjOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bBekrafta, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                    .addComponent(bTillbaka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboValjOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(bBekrafta)
                    .addComponent(comboBoxNyChef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(bTillbaka)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bBekraftaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBekraftaActionPerformed

        try {
            String valtOmrade = comboValjOmrade.getSelectedItem().toString();
            String nyOmradeschef = comboBoxNyChef.getSelectedItem().toString();

            String omradesID = idb.fetchSingle("SELECT Omrades_ID FROM Omrade WHERE benamning = '" + valtOmrade + "';");
            String agentID = idb.fetchSingle("SELECT Agent_ID FROM Agent WHERE namn = '" + nyOmradeschef + "';");
            idb.delete("DELETE FROM omradeschef where Agent_ID =" + agentID);
            idb.delete("DELETE FROM omradeschef where omrade = " + omradesID);

            String fraga = "insert into Omradeschef values (" + agentID + ", " + omradesID + ")";
            idb.insert(fraga);
            JOptionPane.showMessageDialog(null, "Områdeschefen är ändrad");

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel. ");
            System.out.print(e.getMessage());
        }
    }//GEN-LAST:event_bBekraftaActionPerformed

    private void bTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTillbakaActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_bTillbakaActionPerformed

    private void valjOmradeNamn() {
        String fraga = "SELECT Benamning from omrade";

        ArrayList<String> allaOmraden;

        try {
            allaOmraden = idb.fetchColumn(fraga);

            for (String Benamning : allaOmraden) {
                comboValjOmrade.addItem(Benamning);
            }

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + e.getMessage());
        }
    }

    private void nyOmradesChef() {
        String fraga2 = "SELECT namn from Agent WHERE Administrator = 'J'";

        ArrayList<String> allaOmradeschefer;

        try {
            allaOmradeschefer = idb.fetchColumn(fraga2);

            for (String namn : allaOmradeschefer) {
                comboBoxNyChef.addItem(namn);
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBekrafta;
    private javax.swing.JButton bTillbaka;
    private javax.swing.JComboBox<String> comboBoxNyChef;
    private javax.swing.JComboBox<String> comboValjOmrade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
