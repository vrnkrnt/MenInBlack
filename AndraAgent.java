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
public class AndraAgent extends javax.swing.JFrame {

    private static InfDB idb;

    public AndraAgent(InfDB idb) {
        initComponents();
        this.idb = idb;
        valjAgent();
        valjOmrade();
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
        comboValjAgent = new javax.swing.JComboBox<>();
        inputNamn = new javax.swing.JTextField();
        inputTel = new javax.swing.JTextField();
        comboOmrade = new javax.swing.JComboBox<>();
        comboAdmin = new javax.swing.JComboBox<>();
        bInfo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        bTillbaka = new javax.swing.JButton();
        bAndra = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        inputAnstDat = new javax.swing.JTextField();
        inputLosen = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Ändra agent");

        jLabel2.setText("Välj agent:");

        jLabel3.setText("Nytt namn: ");

        jLabel4.setText("Nytt telefonnummer:");

        jLabel5.setText("Administratör J/N:");

        jLabel6.setText("Nytt lösenord:");

        jLabel7.setText("Nytt område: ");

        comboValjAgent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj agent" }));

        comboOmrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj område" }));

        comboAdmin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj", "J", "N" }));

        bInfo.setText("Visa info ▷");
        bInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bInfoActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        bTillbaka.setText("Tillbaka");
        bTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTillbakaActionPerformed(evt);
            }
        });

        bAndra.setText("Ändra");
        bAndra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAndraActionPerformed(evt);
            }
        });

        jLabel8.setText("Nytt anställningsdatum:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bAndra, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel1)))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboAdmin, 0, 136, Short.MAX_VALUE)
                            .addComponent(comboValjAgent, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputNamn)
                            .addComponent(inputTel)
                            .addComponent(inputAnstDat)
                            .addComponent(comboOmrade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(inputLosen))))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bTillbaka, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(bInfo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(comboValjAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(inputNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(inputAnstDat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(inputTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(comboAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(inputLosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(comboOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bAndra)
                    .addComponent(bTillbaka))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTillbakaActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_bTillbakaActionPerformed

    private void bAndraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAndraActionPerformed
        try {
            String agentNamn = comboValjAgent.getSelectedItem().toString();
            String agentID = idb.fetchSingle("SELECT Agent_ID FROM agent WHERE Namn = '" + agentNamn + "'");

            String nyttNamn = inputNamn.getText();
            String nyttTel = inputTel.getText();
            String nyttAnstDat = inputAnstDat.getText();
            String nyttLosen = new String(inputLosen.getPassword());

            if (comboValjAgent.getSelectedIndex() > 0) {
                if (nyttNamn != null && !nyttNamn.isEmpty()) {
                    String updateraNamn = "UPDATE agent SET Namn = '" + nyttNamn + "' WHERE Agent_ID = " + agentID;
                    idb.update(updateraNamn);
                }
                if (nyttTel != null && !nyttTel.isEmpty()) {
                    String updateraTele = "UPDATE agent SET Telefon = '" + nyttTel + "' WHERE Agent_ID = " + agentID;
                    idb.update(updateraTele);
                }
                if (nyttAnstDat != null && !nyttAnstDat.isEmpty()) {
                    String updateraDatum = "UPDATE agent SET Anstallningsdatum = '" + nyttAnstDat + "' WHERE Agent_ID = " + agentID;
                    idb.update(updateraDatum);
                }
                if (nyttLosen != null && !nyttLosen.isEmpty()) {
                    String updateraLosen = "UPDATE agent SET Losenord = '" + nyttLosen + "' WHERE Agent_ID = " + agentID;
                    idb.update(updateraLosen);
                }
                if (comboAdmin.getSelectedIndex() > 0) {
                    String arAdmin = comboAdmin.getSelectedItem().toString();;
                    String updateraAdmin = "UPDATE agent SET Administrator = '" + arAdmin + "' WHERE Agent_ID = " + agentID;
                    idb.update(updateraAdmin);
                }
                if (comboOmrade.getSelectedIndex() > 0) {
                    String nyttOmrade = comboOmrade.getSelectedItem().toString();
                    String omradesID = idb.fetchSingle("SELECT Omrades_ID FROM omrade WHERE Benamning = '" + nyttOmrade + "'");
                    String updateraOmrade = "UPDATE agent SET Omrade = " + omradesID + " WHERE Agent_ID = " + agentID;
                    idb.update(updateraOmrade);
                }

                agentUppdaterad();
                this.setVisible(false);

            } else {
                JOptionPane.showMessageDialog(null, "Välj agent.");
            }

        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Kunde inte lägga till agent :(");
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_bAndraActionPerformed

    private void bInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInfoActionPerformed
        jTextArea1.setText("");

        ArrayList<HashMap<String, String>> valdAgent;

        try {
            String namn = comboValjAgent.getSelectedItem().toString();
            String fraga = "SELECT * FROM agent WHERE NAMN = '" + namn + "'";
            valdAgent = idb.fetchRows(fraga);
            String omradeNamn = idb.fetchSingle("SELECT Benamning FROM omrade WHERE Omrades_ID IN"
                    + "(SELECT Omrade FROM Agent WHERE Namn = '" + namn + "')");

            for (HashMap<String, String> agent : valdAgent) {
                jTextArea1.append("ID:\t" + agent.get("Agent_ID") + "\n");
                jTextArea1.append("Namn:\t" + agent.get("Namn") + "\n");
                jTextArea1.append("Tel. nr.:\t" + agent.get("Telefon") + "\n");
                jTextArea1.append("Anst. dat.:\t" + agent.get("Anstallningsdatum") + "\n");
                jTextArea1.append("Admin J/N:\t" + agent.get("Administrator") + "\n");
                jTextArea1.append("Område:\t" + omradeNamn);
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Kunde inte hämta information om agent.\n"
                    + e.getMessage());
        }
    }//GEN-LAST:event_bInfoActionPerformed

    private void valjAgent() {
        String fraga = "SELECT Namn FROM agent";
        ArrayList<String> allaAgenter;
        try {

            allaAgenter = idb.fetchColumn(fraga);

            for (String agentNamn : allaAgenter) {
                comboValjAgent.addItem(agentNamn);
            }

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Kunde inte hämta agenter! (Databasfel)");
            System.out.println("Internt felmeddelande" + e.getMessage());
        }
    }

    private void valjOmrade() {
        String fraga = "SELECT Benamning FROM omrade";
        ArrayList<String> allaOmraden;
        try {

            allaOmraden = idb.fetchColumn(fraga);

            for (String omrade : allaOmraden) {
                comboOmrade.addItem(omrade);
            }

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Kunde inte hämta områden! (Databasfel)");
            System.out.println("Internt felmeddelande" + e.getMessage());
        }
    }

    public void agentUppdaterad() {
        JOptionPane.showMessageDialog(null, "En agent har uppdaterats!");
        this.setVisible(false);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAndra;
    private javax.swing.JButton bInfo;
    private javax.swing.JButton bTillbaka;
    private javax.swing.JComboBox<String> comboAdmin;
    private javax.swing.JComboBox<String> comboOmrade;
    private javax.swing.JComboBox<String> comboValjAgent;
    private javax.swing.JTextField inputAnstDat;
    private javax.swing.JPasswordField inputLosen;
    private javax.swing.JTextField inputNamn;
    private javax.swing.JTextField inputTel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
