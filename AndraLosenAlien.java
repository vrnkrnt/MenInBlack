package MenInBlack;

import javax.swing.JOptionPane;
import oru.inf.InfDB;

/*
 * @author Emil Lager
 * @author Josefin Olsson
 * @author Karin Mäki-Kala
 * @author Veronika Ranta
 */
public class AndraLosenAlien extends javax.swing.JFrame {

    private static InfDB idb;
    private static String id;

    public AndraLosenAlien(InfDB idb, String id) {
        initComponents();
        this.idb = idb;
        this.id = id;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        buttonAndra = new javax.swing.JButton();
        buttonTillbaka = new javax.swing.JButton();
        TextNewPass = new javax.swing.JPasswordField();
        TextUpprepa = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Nytt lösenord:");

        jLabel3.setText("Upprepa nytt lösenord:");

        buttonAndra.setText("Ändra lösenord");
        buttonAndra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAndraActionPerformed(evt);
            }
        });

        buttonTillbaka.setText("Tillbaka");
        buttonTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTillbakaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TextUpprepa, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                    .addComponent(TextNewPass))
                .addContainerGap(139, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonAndra, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonTillbaka)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TextNewPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(TextUpprepa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAndra)
                    .addComponent(buttonTillbaka))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAndraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAndraActionPerformed

        String newPass = TextNewPass.getText();
        String kontrollPass = TextUpprepa.getText();

        if (Validering.maxSexPass(TextNewPass)
                && Validering.textFaltHarVarde(TextNewPass)) {
            try {
                if (newPass.equals(kontrollPass)) {

                    idb.update("update Alien set Losenord = '" + newPass + "' where Alien_ID = " + id);
                    JOptionPane.showMessageDialog(null, "Lösenordet ändrat!");
                    this.setVisible(false);
                } else {
                    throw new Exception();
                }

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Lösenorden matchar inte");
            }
        }
    }//GEN-LAST:event_buttonAndraActionPerformed

    private void buttonTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTillbakaActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_buttonTillbakaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField TextNewPass;
    private javax.swing.JPasswordField TextUpprepa;
    private javax.swing.JButton buttonAndra;
    private javax.swing.JButton buttonTillbaka;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
