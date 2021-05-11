/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MenInBlack;

import java.util.Date;

/**
<<<<<<< HEAD
 *
 * @author kmaki
 */
=======
 * @author Emil Lager
 * @author Josefin Olsson
 * @author Karin Mäki-Kala
 * @author Veronika Ranta
 */ 

>>>>>>> a843171f61508af6c6f24fb12bfa1e039c2f960f
class Alien {
    private int id, plats, ansvarigAgent;
    private String namn;
    private String telefonnummer;
    private Date datum;
    private String losenord;
 
    public Alien(int id, int plats, int ansvarigAgent, String namn, 
            String telefonnummer, Date datum, String losenord){
    this.id = id;
    this.plats = plats;
    this.ansvarigAgent = ansvarigAgent;
    this.namn = namn;
    this.telefonnummer = telefonnummer;
    this.datum = datum;
    this.losenord = losenord;
    }
    
    public int getId(){
        return id;
    }
       
    public int getPlats(){
        return plats;
    }
    
    public int getAnsvarigAgent(){
        return ansvarigAgent;
    }
    
    public String getNamn(){
        return namn;
    }
    
    public String getTelefonnummer(){
    return telefonnummer;
    }
    
    public Date getDatum(){
        return datum;
    }
    
    public String getLosenord(){
        return losenord;
    }
}



