package MenInBlack;


import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
<<<<<<< HEAD
 * @author kmaki
 */
//Denna klass är till för att kolla att ett lösenord är mer än 0 bokstäver och färre än 7
public class Validering {

    public static boolean textvalue(JTextField checkvalue)
    {
        boolean resultat = true;

        if(checkvalue.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Rutan är tom!");
            resultat = false;
            checkvalue.requestFocus();
        }

        return resultat;
    }
    
    public static boolean maxSexPass (JTextField passwordCheck){
    boolean result = true;

    if (passwordCheck.getText().length() > 6 || passwordCheck.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Lösenordet får innehålla max 6 bokstäver");
            result = false;
            passwordCheck.requestFocus();
    }
    return result;
    }

    static boolean textvalue(JLabel nyttLosen) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

