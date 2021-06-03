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
public class RegAlien extends javax.swing.JFrame {

    private InfDB idb;

    public RegAlien(InfDB idb) {
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
        inputDat = new javax.swing.JTextField();
        inputTele = new javax.swing.JTextField();
        bRegistrera = new javax.swing.JButton();
        jComboPlats = new javax.swing.JComboBox<>();
        jComboAgent = new javax.swing.JComboBox<>();
        jComboRas = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        inputPass = new javax.swing.JPasswordField();
        bTillbaka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Registrera ny alien");

        jLabel3.setText("Namn");

        jLabel4.setText("Lösenord");

        jLabel5.setText("Reg. datum");

        jLabel6.setText("Telefon");

        jLabel7.setText("Plats");

        jLabel8.setText("Ansvarig agent");

        bRegistrera.setText("Registrera");
        bRegistrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegistreraActionPerformed(evt);
            }
        });

        jComboPlats.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj plats" }));

        jComboAgent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj agent" }));

        jComboRas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj ras" }));

        jLabel2.setText("Ras");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(264, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(1, 1, 1))
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel4)
                            .addComponent(jComboPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboRas, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(inputTele, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(inputDat, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputPass, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(142, 142, 142))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bRegistrera, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(inputPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(inputDat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(inputTele, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(bRegistrera))
        );

        bTillbaka.setText("Tillbaka");
        bTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTillbakaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bTillbaka, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bTillbaka)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bRegistreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegistreraActionPerformed

        if (Validering.textFaltHarVarde(inputName) && Validering.textFaltHarVarde(inputPass)
                && Validering.textFaltHarVarde(inputDat) && Validering.textFaltHarVarde(inputTele)) {
            try {
                String id = idb.getAutoIncrement("ALIEN", "ALIEN_ID");
                String namn = "'" + inputName.getText() + "'";
                String pass = new String(inputPass.getPassword());
                String date = "'" + inputDat.getText() + "'";
                String tele = "'" + inputTele.getText() + "'";
                String plats = jComboPlats.getSelectedItem().toString();
                String agentNamn = jComboAgent.getSelectedItem().toString();
                String ras = jComboRas.getSelectedItem().toString();
                String agentID = idb.fetchSingle("select agent_id from agent where namn = '" + agentNamn + "'");
                String platsID = idb.fetchSingle("select plats_id from plats where benamning = '" + plats + "'");
                String q = "INSERT INTO ALIEN (ALIEN_ID, REGISTRERINGSDATUM, LOSENORD, NAMN, TELEFON, PLATS, ANSVARIG_AGENT)"
                        + " VALUES (" + id + "," + date + "," + "'" + pass + "'" + "," + namn + "," + tele + "," + platsID
                        + "," + agentID + ")";
                idb.insert(q);

                switch (ras) {
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
                        dispose();
                }
            } catch (InfException ex) {
                JOptionPane.showMessageDialog(null, "Kunde inte lägga till alien :( ");
            }
        }


    }//GEN-LAST:event_bRegistreraActionPerformed

    private void bTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTillbakaActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_bTillbakaActionPerformed

    private void fyllAgentCombo() {
        String fraga = "SELECT Namn FROM agent";
        ArrayList<String> allaAgenter;
        try {

            allaAgenter = idb.fetchColumn(fraga);

            for (String agentNamn : allaAgenter) {
                jComboAgent.addItem(agentNamn);
            }

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + e.getMessage());
        }
    }

    private void fyllPlatsCombo() {
        ArrayList<String> platser;
        try {
            platser = idb.fetchColumn("select benamning from plats");
            for (String enPlats : platser) {
                jComboPlats.addItem(enPlats);
            }
        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Kunde inte fylla combobox!");
        } catch (NullPointerException npe) {
            JOptionPane.showMessageDialog(null, "Finns ingen data att hämta.");
        }

    }

    private void fyllRasCombo() {
        String bog = "Boglodite";
        String squid = "Squid";
        String worm = "Worm";

        jComboRas.addItem(bog);
        jComboRas.addItem(squid);
        jComboRas.addItem(worm);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bRegistrera;
    private javax.swing.JButton bTillbaka;
    private javax.swing.JTextField inputDat;
    private javax.swing.JTextField inputName;
    private javax.swing.JPasswordField inputPass;
    private javax.swing.JTextField inputTele;
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
