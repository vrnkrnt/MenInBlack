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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        loggaUtbtn = new javax.swing.JButton();
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
        visaOmradesChefBtn = new javax.swing.JMenuItem();
        sokAlienbtn = new javax.swing.JMenuItem();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Min information");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        loggaUtbtn.setText("Logga ut");
        loggaUtbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loggaUtbtnActionPerformed(evt);
            }
        });

        jMenu2.setText("Registrera ▽");

        alienBtn.setText("- alien");
        alienBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alienBtnActionPerformed(evt);
            }
        });
        jMenu2.add(alienBtn);

        utrustningBtn.setText("- utrustning");
        utrustningBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utrustningBtnActionPerformed(evt);
            }
        });
        jMenu2.add(utrustningBtn);

        regNyAgentBtn.setText("- agent");
        regNyAgentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regNyAgentBtnActionPerformed(evt);
            }
        });
        jMenu2.add(regNyAgentBtn);

        regNyAdminBtn.setText("- admin");
        regNyAdminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regNyAdminBtnActionPerformed(evt);
            }
        });
        jMenu2.add(regNyAdminBtn);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Visa ▽");

        minUtrustningBtn.setText("- min utrustning");
        minUtrustningBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minUtrustningBtnActionPerformed(evt);
            }
        });
        jMenu1.add(minUtrustningBtn);

        visaTopp3AgenterBtn.setText("- topp 3 agenter");
        visaTopp3AgenterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visaTopp3AgenterBtnActionPerformed(evt);
            }
        });
        jMenu1.add(visaTopp3AgenterBtn);

        samStatBtn.setText("- sammanfattande statistik");
        jMenu1.add(samStatBtn);

        printRapportBtn.setText("- skriv ut statistikrapport");
        jMenu1.add(printRapportBtn);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("Sök ▽");

        visaOmradesChefBtn.setText("- områdeschef");
        visaOmradesChefBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visaOmradesChefBtnActionPerformed(evt);
            }
        });
        jMenu4.add(visaOmradesChefBtn);

        sokAlienbtn.setText("- alien");
        sokAlienbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sokAlienbtnActionPerformed(evt);
            }
        });
        jMenu4.add(sokAlienbtn);

        jMenuBar1.add(jMenu4);

        jMenu3.setText("Lista alien efter ▽");

        omradeBtn.setText("- plats");
        omradeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                omradeBtnActionPerformed(evt);
            }
        });
        jMenu3.add(omradeBtn);

        rasBtn.setText("- ras");
        rasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rasBtnActionPerformed(evt);
            }
        });
        jMenu3.add(rasBtn);

        periodBtn.setText("- tidsperiod");
        periodBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                periodBtnActionPerformed(evt);
            }
        });
        jMenu3.add(periodBtn);

        jMenuBar1.add(jMenu3);

        jMenu6.setText("Ta bort ▽");

        taBortAlienBtn.setText("- alien");
        taBortAlienBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taBortAlienBtnActionPerformed(evt);
            }
        });
        jMenu6.add(taBortAlienBtn);

        taBortAgentBtn.setText("- agent");
        taBortAgentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taBortAgentBtnActionPerformed(evt);
            }
        });
        jMenu6.add(taBortAgentBtn);

        taBortUtrBtn.setText("- utrustning");
        taBortUtrBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taBortUtrBtnActionPerformed(evt);
            }
        });
        jMenu6.add(taBortUtrBtn);

        jMenuBar1.add(jMenu6);

        jMenu7.setText("Ändra ▽");

        andraAgentBtn.setText("- agent");
        andraAgentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                andraAgentBtnActionPerformed(evt);
            }
        });
        jMenu7.add(andraAgentBtn);

        andraAlienBtn.setText("- alien");
        andraAlienBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                andraAlienBtnActionPerformed(evt);
            }
        });
        jMenu7.add(andraAlienBtn);

        andraOmradeChefBtn.setText("- områdeschef");
        andraOmradeChefBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                andraOmradeChefBtnActionPerformed(evt);
            }
        });
        jMenu7.add(andraOmradeChefBtn);

        andraKontorChefBtn.setText("- kontorschef");
        andraKontorChefBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                andraKontorChefBtnActionPerformed(evt);
            }
        });
        jMenu7.add(andraKontorChefBtn);

        jMenuBar1.add(jMenu7);

        jMenu5.setText("Inställningar ▽");

        changePassBtn.setText("- ändra lösenord");
        changePassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePassBtnActionPerformed(evt);
            }
        });
        jMenu5.add(changePassBtn);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loggaUtbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(loggaUtbtn)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void omradeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_omradeBtnActionPerformed
        new ListaAliensEfterPlats(idb).setVisible(true);
    }//GEN-LAST:event_omradeBtnActionPerformed

    private void alienBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alienBtnActionPerformed
        new RegAlienWin(idb).setVisible(true);
    }//GEN-LAST:event_alienBtnActionPerformed

    private void utrustningBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utrustningBtnActionPerformed
        new RegUtrustning(idb).setVisible(true);
    }//GEN-LAST:event_utrustningBtnActionPerformed

    private void rasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rasBtnActionPerformed
        new ListaAliensEfterRas(idb).setVisible(true);
    }//GEN-LAST:event_rasBtnActionPerformed

    private void periodBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_periodBtnActionPerformed
        new ListaAliensEfterDatum(idb).setVisible(true);
    }//GEN-LAST:event_periodBtnActionPerformed

    private void visaOmradesChefBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visaOmradesChefBtnActionPerformed
        new SokOmradesChef(idb).setVisible(true);
    }//GEN-LAST:event_visaOmradesChefBtnActionPerformed

    private void sokAlienbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sokAlienbtnActionPerformed
        new SokAlien(idb).setVisible(true);
    }//GEN-LAST:event_sokAlienbtnActionPerformed
    private void minUtrustningBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minUtrustningBtnActionPerformed
        new ListaEnAgentsUtrustning(idb, id).setVisible(true);
    }//GEN-LAST:event_minUtrustningBtnActionPerformed

    private void visaTopp3AgenterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visaTopp3AgenterBtnActionPerformed
        new SeTopplistaAgenter(idb).setVisible(true);
    }//GEN-LAST:event_visaTopp3AgenterBtnActionPerformed

    private void taBortAlienBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taBortAlienBtnActionPerformed
        new RaderaAlien(idb).setVisible(true);
    }//GEN-LAST:event_taBortAlienBtnActionPerformed

    private void taBortAgentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taBortAgentBtnActionPerformed
        new RaderaAgent(idb).setVisible(true);
    }//GEN-LAST:event_taBortAgentBtnActionPerformed

    private void regNyAdminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regNyAdminBtnActionPerformed
        new RegAgentWin(idb).setVisible(true);
    }//GEN-LAST:event_regNyAdminBtnActionPerformed

    private void andraKontorChefBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_andraKontorChefBtnActionPerformed
        new AndraKontorschef(idb).setVisible(true);
    }//GEN-LAST:event_andraKontorChefBtnActionPerformed

    private void andraOmradeChefBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_andraOmradeChefBtnActionPerformed
        new AndraOmradeschef(idb).setVisible(true);
    }//GEN-LAST:event_andraOmradeChefBtnActionPerformed

    private void taBortUtrBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taBortUtrBtnActionPerformed
        new RaderaUtrustning(idb).setVisible(true);
    }//GEN-LAST:event_taBortUtrBtnActionPerformed

    private void regNyAgentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regNyAgentBtnActionPerformed
        new RegAgentWin(idb).setVisible(true);
    }//GEN-LAST:event_regNyAgentBtnActionPerformed

    private void loggaUtbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loggaUtbtnActionPerformed
        new LogInWin(idb).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_loggaUtbtnActionPerformed

    private void changePassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePassBtnActionPerformed
        new AndraLosenAgent(idb, id).setVisible(true);
    }//GEN-LAST:event_changePassBtnActionPerformed

    private void andraAgentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_andraAgentBtnActionPerformed
        new AndraAgent(idb).setVisible(true);
    }//GEN-LAST:event_andraAgentBtnActionPerformed

    private void andraAlienBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_andraAlienBtnActionPerformed
        new AndraAlien(idb).setVisible(true);
    }//GEN-LAST:event_andraAlienBtnActionPerformed

    private void visaMinInformation() {

        ArrayList<HashMap<String, String>> valdAgent;

        try {
            String fraga = "SELECT * FROM agent WHERE Agent_ID = " + id;
            valdAgent = idb.fetchRows(fraga);
            String omradeNamn = idb.fetchSingle("SELECT Benamning FROM omrade WHERE Omrades_ID IN "
                    + "(SELECT Omrade FROM Agent WHERE Agent_ID = " + id + ");");
            for (HashMap<String, String> agent : valdAgent) {
                jTextArea1.append("ID:\t" + agent.get("Agent_ID") + "\n");
                jTextArea1.append("Namn:\t" + agent.get("Namn") + "\n");
                jTextArea1.append("Tel. nr.:\t" + agent.get("Telefon") + "\n");
                jTextArea1.append("Anst. dat.:\t" + agent.get("Anstallningsdatum") + "\n");
                jTextArea1.append("Admin J/N:\t" + agent.get("Administrator") + "\n");
                jTextArea1.append("Område:\t" + omradeNamn);
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel. "
                    + e.getMessage());
        }
    }

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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton loggaUtbtn;
    private javax.swing.JMenuItem minUtrustningBtn;
    private javax.swing.JMenuItem omradeBtn;
    private javax.swing.JMenuItem periodBtn;
    private javax.swing.JMenuItem printRapportBtn;
    private javax.swing.JMenuItem rasBtn;
    private javax.swing.JMenuItem regNyAdminBtn;
    private javax.swing.JMenuItem regNyAgentBtn;
    private javax.swing.JMenuItem samStatBtn;
    private javax.swing.JMenuItem sokAlienbtn;
    private javax.swing.JMenuItem taBortAgentBtn;
    private javax.swing.JMenuItem taBortAlienBtn;
    private javax.swing.JMenuItem taBortUtrBtn;
    private javax.swing.JMenuItem utrustningBtn;
    private javax.swing.JMenuItem visaOmradesChefBtn;
    private javax.swing.JMenuItem visaTopp3AgenterBtn;
    // End of variables declaration//GEN-END:variables
}
