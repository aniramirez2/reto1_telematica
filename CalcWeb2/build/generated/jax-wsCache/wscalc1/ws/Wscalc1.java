
package ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "wscalc1", targetNamespace = "http://ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Wscalc1 {


    /**
     * 
     * @param b
     * @param a
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sumar", targetNamespace = "http://ws/", className = "ws.Sumar")
    @ResponseWrapper(localName = "sumarResponse", targetNamespace = "http://ws/", className = "ws.SumarResponse")
    @Action(input = "http://ws/wscalc1/sumarRequest", output = "http://ws/wscalc1/sumarResponse")
    public int sumar(
        @WebParam(name = "a", targetNamespace = "")
        int a,
        @WebParam(name = "b", targetNamespace = "")
        int b);

    /**
     * 
     * @param b
     * @param a
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "multiplicar", targetNamespace = "http://ws/", className = "ws.Multiplicar")
    @ResponseWrapper(localName = "multiplicarResponse", targetNamespace = "http://ws/", className = "ws.MultiplicarResponse")
    @Action(input = "http://ws/wscalc1/multiplicarRequest", output = "http://ws/wscalc1/multiplicarResponse")
    public int multiplicar(
        @WebParam(name = "a", targetNamespace = "")
        int a,
        @WebParam(name = "b", targetNamespace = "")
        int b);

}
