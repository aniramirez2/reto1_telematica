/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import logic.Calculator2;

/**
 *
 * @author Andres
 */
@WebService(serviceName = "wscalc2")
public class wscalc2 {

    /**
     * This is a sample web service operation
     */
    Calculator2 Calc2 = new Calculator2();
    
    @WebMethod(operationName = "restar")
    public int restar(@WebParam(name = "a") int a,@WebParam(name = "b") int b) {
        return  Calc2.resta(a, b);
    }
    
      @WebMethod(operationName = "dividir")
    public int dividir(@WebParam(name = "a") int a,@WebParam(name = "b") int b) {
        return  Calc2.diviir(a, b);
    }
}
