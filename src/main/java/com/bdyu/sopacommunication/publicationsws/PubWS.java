/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package com.bdyu.sopacommunication.publicationsws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author thiago.diniz
 */
@WebService(serviceName = "PubWS")
public class PubWS {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {

        try { // Call Web Service Operation
            com.engsoft.arqsoft.trab1.Publications tPublications = new com.engsoft.arqsoft.trab1.Publications();
            
            return "Hello";
            //return "Hello " + tPublications.getPublicationList("testeTitulo") + " !";
            
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        
        return "Erro";
    }
}
