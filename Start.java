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

/**
 *
 * @author Emillager
 */
public class Start {
    
    private static InfDB idb;
    

    public static void main(String[] args) throws InfException
    {
        try 
        {
            idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
            new AgentWin(idb).setVisible(true);
            String agentNamn = "Agent Z";
            String agentID = idb.fetchSingle("select agent_id from agent where namn = '" + agentNamn + "'");
            System.out.println(agentID);
           
        }
        
        
        
        catch (InfException ex)
        {
            Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String fraga = "Select namn from agent where Agent_ID = 1";
        String svar = idb.fetchSingle(fraga);
        System.out.println(svar);
    
    } 
    
}
