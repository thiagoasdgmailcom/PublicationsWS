/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package com.bdyu.sopacommunication.publicationsws;

import com.engsoft.arqsoft.trab1.Publications;
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
     * Metodo para recuperar as informaçoes de publicaçao atraves de uma
     * pesquisa pela parte do titulo fornecida.
     * Retorna as publicações, com seus autores em forma de texto.
     */
    @WebMethod(operationName = "getPublicationsStringFromTitle")
    public String getPublicationsStringFromTitle(@WebParam(name = "sTitle") String sTitle) {

        try { // Call Web Service Operation
            com.engsoft.arqsoft.trab1.Publications tPublications = new com.engsoft.arqsoft.trab1.Publications();
            
            return tPublications.getPublicationListString(sTitle);
            //return "Hello " + tPublications.getPublicationList("testeTitulo") + " !";
            
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        
        }
        
        return "Erro";
    }

    /**
     * Metodo para recuperar as informaçoes de publicaçao atraves de uma
     * pesquisa pela parte do titulo fornecida.
     * Retorna um array com a classe instanciada da publicação.
     */
    @WebMethod(operationName = "getPublicationsFromTitle")
    public com.engsoft.arqsoft.trab1.Publication[] getPublicationsFromTitle(@WebParam(name = "sTitle") String sTitle) {

        try { // Call Web Service Operation
            com.engsoft.arqsoft.trab1.Publications tPublications = new com.engsoft.arqsoft.trab1.Publications();
            
            return tPublications.getPublications(sTitle);
            //return "Hello " + tPublications.getPublicationList("testeTitulo") + " !";
            
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        
        }
        
        return null;
    }

    /**
     * Metodo para recuperar a quantidade de publicações atraves de uma
     * pesquisa pela parte do titulo fornecida.
     * Retorna um inteiro com a quantidade de publicações encontradas.
     */
    @WebMethod(operationName = "getPublicationsCountFromTitle")
    public int getPublicationsCountFromTitle(@WebParam(name = "sTitle") String sTitle) {

        try { // Call Web Service Operation
            com.engsoft.arqsoft.trab1.Publications tPublications = new com.engsoft.arqsoft.trab1.Publications();
            
            tPublications.getPublications(sTitle);
            
            return tPublications.getPublicationsCount(sTitle);
            //return "Hello " + tPublications.getPublicationList("testeTitulo") + " !";
            
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        
        }
        
        return 0;
    }
}
