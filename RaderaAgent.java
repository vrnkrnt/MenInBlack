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
public class RaderaAgent extends javax.swing.JFrame {

    private static InfDB idb;

    /**
     * Creates new form RaderaAgent
     */
    public RaderaAgent(InfDB idb) {
        initComponents();
        this.idb = idb;
        valjAgent();
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
        bInfo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        visaAgentInfo = new javax.swing.JTextArea();
        bRadera = new javax.swing.JButton();
        bTillbaka = new javax.swing.JButton();
        comboValjAgent = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Radera agent");

        jLabel2.setText("Välj agent:");

        bInfo.setText("Visa info om agent");
        bInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bInfoActionPerformed(evt);
            }
        });

        visaAgentInfo.setColumns(20);
        visaAgentInfo.setRows(5);
        jScrollPane1.setViewportView(visaAgentInfo);

        bRadera.setText("Radera agent");
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

        comboValjAgent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj agent" }));

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
                        .addComponent(bTillbaka, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(95, 95, 95))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboValjAgent, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboValjAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bInfo)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bRadera)
                    .addComponent(bTillbaka))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bRaderaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRaderaActionPerformed
        try {
            String agentNamn = comboValjAgent.getSelectedItem().toString();
            String agentID = idb.fetchSingle("SELECT Agent_ID FROM agent WHERE Namn = '" + agentNamn + "'");
            String raderaFaltAgent = "DELETE FROM FALTAGENT WHERE AGENT_ID = " + agentID;
            String raderaFordon = "DELETE FROM INNEHAR_FORDON WHERE AGENT_ID = " + agentID;
            String raderaUtr = "DELETE FROM INNEHAR_FORDON WHERE AGENT_ID = " + agentID;
            String raderaKontor = "DELETE FROM KONTORSCHEF WHERE AGENT_ID = " + agentID;
            String raderaOmradeschef = "DELETE FROM OMRADESCHEF WHERE AGENT_ID = " + agentID;
            idb.delete(raderaFaltAgent);
            idb.delete(raderaFordon);
            idb.delete(raderaUtr);
            idb.delete(raderaKontor);
            idb.delete(raderaOmradeschef);
            String fraga = "DELETE FROM agent WHERE Agent_ID = " + agentID + ";";
            idb.delete(fraga);
            JOptionPane.showMessageDialog(null, "Agenten har raderats.");
            this.setVisible(false);
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel. "
                    + e.getMessage());
        }
    }//GEN-LAST:event_bRaderaActionPerformed

    private void bTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTillbakaActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_bTillbakaActionPerformed

    private void bInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInfoActionPerformed
        visaAgentInfo.setText("");

        ArrayList<HashMap<String, String>> soktAgent;

        try {
            String agentNamn = comboValjAgent.getSelectedItem().toString();
            String agentID = idb.fetchSingle("SELECT Agent_ID FROM agent WHERE Namn = '" + agentNamn + "'");
            String fraga = "SELECT * FROM agent WHERE Agent_ID = " + agentID;
            soktAgent = idb.fetchRows(fraga);
            String omradeNamn = idb.fetchSingle("SELECT Benamning FROM omrade WHERE Omrades_ID IN "
                    + "(SELECT Omrade FROM Agent WHERE Agent_ID = " + agentID + ");");

            for (HashMap<String, String> agent : soktAgent) {
                visaAgentInfo.append("ID: \t" + agent.get("Agent_ID") + "\n");
                visaAgentInfo.append("Namn: \t" + agent.get("Namn") + "\n");
                visaAgentInfo.append("Telnr: \t" + agent.get("Telefon") + "\n");
                visaAgentInfo.append("Anst. datum: \t" + agent.get("Anstallningsdatum") + "\n");
                visaAgentInfo.append("Admin J/N: \t" + agent.get("Administrator") + "\n");
                visaAgentInfo.append("Område: \t" + omradeNamn + "\n");
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel. "
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
            java.util.logging.Logger.getLogger(RaderaAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RaderaAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RaderaAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RaderaAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RaderaAgent(idb).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bInfo;
    private javax.swing.JButton bRadera;
    private javax.swing.JButton bTillbaka;
    private javax.swing.JComboBox<String> comboValjAgent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea visaAgentInfo;
    // End of variables declaration//GEN-END:variables
}
