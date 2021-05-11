/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MenInBlack;
import java.util.Date;

/**
 *
 * @author Emil Lager
 * @author Josefin Olsson
 * @author Karin Mäki-Kala
 * @author Veronika Ranta
 * 
 */

public class Fordon {
    private String Fordons_ID;
    private String Beskrivning;
    private Date RegistreringsDatum;
    private int ArsModell;
    
    public Fordon(String Fordons_ID, String Beskrivning, Date RegistreringsDatum, int ArsModell){
    this.Fordons_ID=Fordons_ID;
    this.Beskrivning=Beskrivning;
    this.RegistreringsDatum=RegistreringsDatum;
    this.ArsModell=ArsModell;
    }
            
    
}
