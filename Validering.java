/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenInBlack;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import oru.inf.InfDB;
import oru.inf.InfException;


/*
 * @author Emil Lager
 * @author Josefin Olsson
 * @author Karin Mäki-Kala
 * @author Veronika Ranta
 */
public class Validering {

    private static InfDB idb;
    
    public Validering(InfDB idb)
    {
        this.idb = idb;
    }
    

    public static boolean textvalue(JTextField checkvalue) {
        boolean resultat = true;

        if (checkvalue.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Rutan är tom!");
            resultat = false;
            checkvalue.requestFocus();
        }

        return resultat;
    }
    

    //Denna metod är till för att kolla att ett lösenord är mer än 0 bokstäver och färre än 7
    public static boolean maxSexPass(JTextField passwordCheck) {
        boolean result = true;

        if (passwordCheck.getText().length() > 6 || passwordCheck.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lösenordet får innehålla max 6 bokstäver");
            result = false;
            passwordCheck.requestFocus();
            System.out.print("sexpass");
        }
        return result;
    }

    public static boolean textFaltHarVarde(JTextField rutaAttKolla) {
        boolean resultat = true;

        if (rutaAttKolla.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Inmatningsrutan är tom.");
            resultat = false;
            rutaAttKolla.requestFocus();
            System.out.print("textharvarde");
        }

        return resultat;
    }

    public static boolean isHeltal(JTextField rutaAttKolla) {
        boolean resultat = true;

        try {
            String inStrang = rutaAttKolla.getText();
            Integer.parseInt(inStrang);
            rutaAttKolla.requestFocus();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Var god ange ett heltal");
            resultat = false;
        }

        return resultat;
    }

    /*public static boolean finnsAgentID(JTextField rutaAttKolla) {
        boolean idFinns = false;

        try {
            String inStrang = rutaAttKolla.getText();
            Integer.parseInt(inStrang);
            String fraga = "SELECT LENGTH(Agent_ID) AS Antal_Agenter FROM agent where Agent_ID = " + inStrang;
            if (fraga.length() > 0) { //Kolla hur man fixar detta! Går igenom även fast listan är tom
                idFinns = true;
                System.out.println("rätt");
            }
            
            else{
                rutaAttKolla.requestFocus();
                throw new Exception();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ID:t finns inte i databasen");
        }

        return idFinns;
    }*/
}
