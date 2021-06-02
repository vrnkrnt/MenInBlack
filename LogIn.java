package MenInBlack;

import oru.inf.InfDB;
import oru.inf.InfException;
import javax.swing.JOptionPane;

/*
 * @author Emil Lager
 * @author Josefin Olsson
 * @author Karin Mäki-Kala
 * @author Veronika Ranta
 */
public class LogIn extends javax.swing.JFrame {

    private static InfDB idb;

    public LogIn(InfDB idb) {
        initComponents();
        this.idb = idb;
        comboLogIn.removeAllItems();
        comboLogIn.addItem("Admin");
        comboLogIn.addItem("Agent");
        comboLogIn.addItem("Alien");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboLogIn = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inputID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        logInBtn = new javax.swing.JButton();
        inputPass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        comboLogIn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj" }));

        jLabel1.setText("Logga in som:");

        jLabel2.setText("ID:");

        jLabel3.setText("Lösenord:");

        logInBtn.setText("Logga in");
        logInBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInBtnActionPerformed(evt);
            }
        });

        inputPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(inputPass, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(inputID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)))
                .addContainerGap(186, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logInBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(inputID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(inputPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(logInBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logInBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInBtnActionPerformed

        String userID = inputID.getText();
        String pass = new String(inputPass.getPassword());
        String choice = comboLogIn.getSelectedItem().toString();
        String passQ = "";
        boolean correctPass = false;

        if (Validering.textFaltHarVarde(inputID) && Validering.isHeltal(inputID) && Validering.textFaltHarVarde(inputPass)) {

            switch (choice) {
                case "Admin":
                try {
                    passQ = ("SELECT LOSENORD FROM AGENT WHERE ADMINISTRATOR = 'J' AND AGENT_ID = '" + userID + "'");
                    String q = idb.fetchSingle(passQ);
                    if (q.equals(pass)) {
                        new AdminStart(idb, userID).setVisible(true);
                        this.setVisible(false);
                        correctPass = true;
                        break;
                    }

                    if (!correctPass) {
                        JOptionPane.showMessageDialog(null, "Fel! Kontrollera användar-ID och lösenord.");
                        break;
                    }
                } catch (InfException | NullPointerException e) {
                    JOptionPane.showMessageDialog(null, "Något gick fel! Kontrollera användar-ID och uppkoppling till databas.");
                    break;
                }

                case "Agent":
                try {
                    passQ = ("SELECT LOSENORD FROM AGENT WHERE AGENT_ID = '" + userID + "'");
                    String q = idb.fetchSingle(passQ);
                    if (q.equals(pass)) {
                        new AgentStart(idb, userID).setVisible(true);
                        this.setVisible(false);
                        correctPass = true;
                        break;
                    }

                    if (!correctPass) {
                        JOptionPane.showMessageDialog(null, "Fel! Kontrollera användar-ID och lösenord.");
                        break;
                    }
                } catch (InfException | NullPointerException e) {
                    JOptionPane.showMessageDialog(null, "Något gick fel! Kontrollera användar-ID och uppkoppling till databas.");
                    break;
                }

                case "Alien":
                try {
                    passQ = ("SELECT LOSENORD FROM ALIEN WHERE ALIEN_ID = '" + userID + "'");
                    String q = idb.fetchSingle(passQ);
                    if (q.equals(pass)) {
                        new AlienStart(idb, userID).setVisible(true);
                        this.setVisible(false);
                        correctPass = true;
                    }

                    if (!correctPass) {
                        JOptionPane.showMessageDialog(null, "Fel! Kontrollera användar-ID och lösenord.");
                        break;
                    }
                } catch (InfException | NullPointerException e) {
                    JOptionPane.showMessageDialog(null, "Något gick fel! Kontrollera användar-ID och uppkoppling till databas.");
                    break;
                }
            }
        }
    }//GEN-LAST:event_logInBtnActionPerformed

    private void inputPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPassActionPerformed
        //Metod för att kunna logga in med enter
        logInBtn.doClick();
    }//GEN-LAST:event_inputPassActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboLogIn;
    private javax.swing.JTextField inputID;
    private javax.swing.JPasswordField inputPass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton logInBtn;
    // End of variables declaration//GEN-END:variables
}
