<<<<<<< HEAD

=======
>>>>>>> df51d7d0dd4084211623ba23c317496c59be69f7
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    

    public static void main(String[] args) throws InfException
    {
        try 
        {
            idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
            new LogInWin(idb).setVisible(true);     
        }
        
        catch (InfException ex)
        {
            Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    } 
    
<<<<<<< HEAD
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
=======
}
>>>>>>> df51d7d0dd4084211623ba23c317496c59be69f7
