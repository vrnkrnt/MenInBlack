package MenInBlack;


import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Emil Lager
 * @author Josefin Olsson
 * @author Karin Mäki-Kala
 * @author Veronika Ranta
 * 
 */

public class Validering {
    
    public static boolean textFaltHarVarde(JTextField rutaAttKolla)
    {
        boolean resultat = true;
        
        if(rutaAttKolla.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Inmatningsrutan är tom.");
            resultat = false;
            rutaAttKolla.requestFocus();
        }
        
        return resultat;
    }
    
    public static boolean isHeltal(JTextField rutaAttKolla)
    {
        boolean resultat = true;
        
        try
        {
            String inStrang = rutaAttKolla.getText();
            Integer.parseInt(inStrang);
            rutaAttKolla.requestFocus();
        }
        
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Var god ange ett heltal");
            resultat = false;
        }
        
        return resultat;
    }
    
}
