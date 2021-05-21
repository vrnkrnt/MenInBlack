/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenInBlack;

import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Emillager
 */
public class AdminWin extends javax.swing.JFrame {
    private InfDB idb;
    private static String id;

    /**
     * Creates new form AgentWin
     */
    public AdminWin(InfDB idb, String id) {
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

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        alienBtn = new javax.swing.JMenuItem();
        utrustningBtn = new javax.swing.JMenuItem();
        regNyAgentBtn = new javax.swing.JMenuItem();
        regNyAdminBtn = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        minUtrustningBtn = new javax.swing.JMenuItem();
        visaTopp3AgenterBtn = new javax.swing.JMenuItem();
        samStatBtn = new javax.swing.JMenuItem();
        printRapportBtn = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        omradesChefBtn = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        omradeBtn = new javax.swing.JMenuItem();
        rasBtn = new javax.swing.JMenuItem();
        periodBtn = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        taBortAlienBtn = new javax.swing.JMenuItem();
        taBortAgentBtn = new javax.swing.JMenuItem();
        taBortUtrBtn = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        andraAgentBtn = new javax.swing.JMenuItem();
        andraAlienBtn = new javax.swing.JMenuItem();
        andraOmradeChefBtn = new javax.swing.JMenuItem();
        andraKontorChefBtn = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        changePassBtn = new javax.swing.JMenuItem();
        logOutBtn = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("admin");

        jMenu2.setText("Registrera...");

        alienBtn.setText("Alien");
        alienBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alienBtnActionPerformed(evt);
            }
        });
        jMenu2.add(alienBtn);

        utrustningBtn.setText("Ny utrustning");
        utrustningBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utrustningBtnActionPerformed(evt);
            }
        });
        jMenu2.add(utrustningBtn);

        regNyAgentBtn.setText("-Ny Agent");
        jMenu2.add(regNyAgentBtn);

        regNyAdminBtn.setText("-Ny admin");
        regNyAdminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regNyAdminBtnActionPerformed(evt);
            }
        });
        jMenu2.add(regNyAdminBtn);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Visa...");

        minUtrustningBtn.setText("-min utrustning");
        minUtrustningBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minUtrustningBtnActionPerformed(evt);
            }
        });
        jMenu1.add(minUtrustningBtn);

        visaTopp3AgenterBtn.setText("-topp 3 agenter");
        visaTopp3AgenterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visaTopp3AgenterBtnActionPerformed(evt);
            }
        });
        jMenu1.add(visaTopp3AgenterBtn);

        samStatBtn.setText("-sammanfattande statistik");
        jMenu1.add(samStatBtn);

        printRapportBtn.setText("-skriv ut statistikrapport");
        jMenu1.add(printRapportBtn);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("Sök...");

        omradesChefBtn.setText("-områdeschef");
        omradesChefBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                omradesChefBtnActionPerformed(evt);
            }
        });
        jMenu4.add(omradesChefBtn);

        jMenuItem1.setText("-alien");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuBar1.add(jMenu4);

        jMenu3.setText("Lista alien över ▽");

        omradeBtn.setText("- område ");
        omradeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                omradeBtnActionPerformed(evt);
            }
        });
        jMenu3.add(omradeBtn);

        rasBtn.setText("-ras");
        rasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rasBtnActionPerformed(evt);
            }
        });
        jMenu3.add(rasBtn);

        periodBtn.setText("-tidsperiod");
        periodBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                periodBtnActionPerformed(evt);
            }
        });
        jMenu3.add(periodBtn);

        jMenuBar1.add(jMenu3);

        jMenu6.setText("Ta bort");

        taBortAlienBtn.setText("-alien");
        taBortAlienBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taBortAlienBtnActionPerformed(evt);
            }
        });
        jMenu6.add(taBortAlienBtn);

        taBortAgentBtn.setText("-agent");
        taBortAgentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taBortAgentBtnActionPerformed(evt);
            }
        });
        jMenu6.add(taBortAgentBtn);

        taBortUtrBtn.setText("-utrustning");
        jMenu6.add(taBortUtrBtn);

        jMenuBar1.add(jMenu6);

        jMenu7.setText("Ändra");

        andraAgentBtn.setText("-agentinfo");
        jMenu7.add(andraAgentBtn);

        andraAlienBtn.setText("-alieninfo");
        jMenu7.add(andraAlienBtn);

        andraOmradeChefBtn.setText("-områdeschef");
        jMenu7.add(andraOmradeChefBtn);

        andraKontorChefBtn.setText("-kontorschef");
        andraKontorChefBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                andraKontorChefBtnActionPerformed(evt);
            }
        });
        jMenu7.add(andraKontorChefBtn);

        jMenuBar1.add(jMenu7);

        jMenu5.setText("Inställningar");

        changePassBtn.setText("-ändra lösenord");
        changePassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePassBtnActionPerformed(evt);
            }
        });
        jMenu5.add(changePassBtn);

        logOutBtn.setText("-logga ut");
        logOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutBtnActionPerformed(evt);
            }
        });
        jMenu5.add(logOutBtn);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(328, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(128, 128, 128))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void omradeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_omradeBtnActionPerformed

        new ListaAliensEfterOmrade(idb).setVisible(true);
    }//GEN-LAST:event_omradeBtnActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        new ListaAliensEfterDatum(idb).setVisible(true);
    }                                          

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void alienBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alienBtnActionPerformed
        // TODO add your handling code here:
        new RegAlienWin(idb).setVisible(true);
    }//GEN-LAST:event_alienBtnActionPerformed

    private void utrustningBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utrustningBtnActionPerformed
        // TODO add your handling code here:
        new RegUtrustningWin(idb).setVisible(true);
    }//GEN-LAST:event_utrustningBtnActionPerformed

    private void rasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rasBtnActionPerformed
        // TODO add your handling code here:
        new ListaAliensEfterRas(idb).setVisible(true);
    }//GEN-LAST:event_rasBtnActionPerformed

    private void periodBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_periodBtnActionPerformed
        // TODO add your handling code here:
        new ListaAliensEfterDatum(idb).setVisible(true);
        
    }//GEN-LAST:event_periodBtnActionPerformed

    private void omradesChefBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_omradesChefBtnActionPerformed
        // TODO add your handling code here:
        new SokOmradesChef(idb).setVisible(true);
    }//GEN-LAST:event_omradesChefBtnActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        new SokAlien(idb).setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void logOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutBtnActionPerformed
        // TODO add your handling code here:
        new LogInWin(idb).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logOutBtnActionPerformed

    private void changePassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePassBtnActionPerformed
        // TODO add your handling code here:
        new AndraLosenAgent(idb, id).setVisible(true);
    }//GEN-LAST:event_changePassBtnActionPerformed

    private void minUtrustningBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minUtrustningBtnActionPerformed
        // TODO add your handling code here:
        new ListaEnAgentsUtrustning(idb, id).setVisible(true);
    }//GEN-LAST:event_minUtrustningBtnActionPerformed

    private void visaTopp3AgenterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visaTopp3AgenterBtnActionPerformed
        // TODO add your handling code here:
        new SeTopplistaAgenter(idb).setVisible(true);
    }//GEN-LAST:event_visaTopp3AgenterBtnActionPerformed

    private void taBortAlienBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taBortAlienBtnActionPerformed
        // TODO add your handling code here:
        new RaderaAlien(idb).setVisible(true);
    }//GEN-LAST:event_taBortAlienBtnActionPerformed

    private void taBortAgentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taBortAgentBtnActionPerformed
        // TODO add your handling code here:
        new RaderaAgent(idb).setVisible(true);
    }//GEN-LAST:event_taBortAgentBtnActionPerformed

    private void regNyAdminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regNyAdminBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regNyAdminBtnActionPerformed

    private void andraKontorChefBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_andraKontorChefBtnActionPerformed
        // TODO add your handling code here:
        new AndraKontorschef(idb).setVisible(true);
    }//GEN-LAST:event_andraKontorChefBtnActionPerformed
//
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem alienBtn;
    private javax.swing.JMenuItem andraAgentBtn;
    private javax.swing.JMenuItem andraAlienBtn;
    private javax.swing.JMenuItem andraKontorChefBtn;
    private javax.swing.JMenuItem andraOmradeChefBtn;
    private javax.swing.JMenuItem changePassBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem logOutBtn;
    private javax.swing.JMenuItem minUtrustningBtn;
    private javax.swing.JMenuItem omradeBtn;
    private javax.swing.JMenuItem omradesChefBtn;
    private javax.swing.JMenuItem periodBtn;
    private javax.swing.JMenuItem printRapportBtn;
    private javax.swing.JMenuItem rasBtn;
    private javax.swing.JMenuItem regNyAdminBtn;
    private javax.swing.JMenuItem regNyAgentBtn;
    private javax.swing.JMenuItem samStatBtn;
    private javax.swing.JMenuItem taBortAgentBtn;
    private javax.swing.JMenuItem taBortAlienBtn;
    private javax.swing.JMenuItem taBortUtrBtn;
    private javax.swing.JMenuItem utrustningBtn;
    private javax.swing.JMenuItem visaTopp3AgenterBtn;
    // End of variables declaration//GEN-END:variables
}
