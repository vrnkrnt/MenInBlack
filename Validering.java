package MenInBlack;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import oru.inf.InfDB;

/*
 * @author Emil Lager
 * @author Josefin Olsson
 * @author Karin Mäki-Kala
 * @author Veronika Ranta
 */
public class Validering {

    private static InfDB idb;

    public Validering(InfDB idb) {
        this.idb = idb;
    }

    //Denna metod är till för att kolla att ett lösenord är mer än 0 bokstäver och färre än 7
    public static boolean maxSexPass(JTextField passwordCheck) {
        boolean result = true;

        if (passwordCheck.getText().length() > 6 || passwordCheck.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lösenordet får innehålla max 6 bokstäver");
            result = false;
            passwordCheck.requestFocus();
        }
        return result;
    }

    public static boolean textFaltHarVarde(JTextField rutaAttKolla) {
        boolean resultat = true;

        if (rutaAttKolla.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Inmatningsrutan är tom.");
            resultat = false;
            rutaAttKolla.requestFocus();
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
}
