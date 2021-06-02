package MenInBlack;

import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfDB;
import oru.inf.InfException;

/*
 * @author Emil Lager
 * @author Josefin Olsson
 * @author Karin Mäki-Kala
 * @author Veronika Ranta
 */
public class Start {

    private static InfDB idb;

    public static void main(String[] args) throws InfException {
        try {
            idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
            new LogIn(idb).setVisible(true);
        } catch (InfException ex) {
            Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
