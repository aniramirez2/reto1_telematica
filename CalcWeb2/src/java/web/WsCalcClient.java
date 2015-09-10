/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package web;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import ws.Wscalc1;
import ws.Wscalc1_Service;
import ws.Wscalc2;
import ws.Wscalc2_Service;

/**
 *
 * @author Andres
 */
public class WsCalcClient {
    //proxy para conectarnos 
    //con el objeto remoto
    
    String urlcalc1 = "http://localhost:8080/WSCalcServer1/wscalc1";
    String urlcalc2 = "http://localhost:8080/WSCalcServer2/wscalc2";
    
    Wscalc1 calc1 =null;
    Wscalc2 calc2 =null;
    
  
    Wscalc1_Service calcserv= null;
    Wscalc2_Service calcserv= null;

    public WsCalcClient(){
        try {
            calcserv = new Wscalc1_Service(new URL(urlcalc1));
            calcserv = new Wscalc2_Service(new URL(urlcalc2));
            
            
            } catch (MalformedURLException ex) {
            Logger.getLogger(WsCalcClient.class.getName()).log(Level.SEVERE, null, ex);
        }
              
    }
}
    

