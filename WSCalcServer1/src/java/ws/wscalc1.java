/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import logic.Calculator1;

/**
 *
 * @author Andres
 */
@WebService(serviceName = "wscalc1")
public class wscalc1 {

    /**
     * This is a sample web service operation
     */
    
    Calculator1 Calc1 = new Calculator1();
    
    @WebMethod(operationName = "sumar")
    public int sumar(@WebParam(name = "a") int a,@WebParam(name = "b") int b) {
        return  Calc1.suma(a, b);
    }
    
      @WebMethod(operationName = "multiplicar")
    public int multiplicar(@WebParam(name = "a") int a,@WebParam(name = "b") int b) {
        return  Calc1.multiplicar(a, b);
    }
    
}
