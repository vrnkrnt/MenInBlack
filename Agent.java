/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MenInBlack;

import java.util.Date;

class Agent{

 private int agentID;
    private String namn;
    private String telefon;
    private Date datum;
    private String losenord;
    private String omrade;
 
    public Agent(int agentID, String omrade, String telefon, String namn, 
            String telefonnummer, Date datum, String losenord){
    this.agentID = agentID;
    this.omrade = omrade;
    this.namn = namn;
    this.telefon = telefon;
    this.datum = datum;
    this.losenord = losenord;
    }
    
    public int getId(){
        return agentID;
    }
       
    public String getZon(){
        return omrade;
    }
    
    
    public String getNamn(){
        return namn;
    }
    
    public String getTelefon(){
    return telefon;
    }
    
    public Date getDatum(){
        return datum;
    }
    
    public String getLosenord(){
        return losenord;
    }
}


