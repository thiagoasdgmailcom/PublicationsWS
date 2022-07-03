/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.engsoft.arqsoft.trab1;

/**
 *
 * @author thiago.diniz
 */
public class Author {
    
    private int pID;
    private String pCPF;
    private String pName;
    
    private int[] pPublications;

    public int getID() {
        return this.pID;
    }

    public void setID(int sID) {
        this.pID = sID;
    }

    public String getCPF() {
        return this.pCPF;
    }

    public void setCPF(String sCPF) {
        this.pCPF = sCPF;
    }

    public String getName() {
        return this.pName;
    }

    public void setName(String sName) {
        this.pName = sName;
    }

    public void addPublication(int sPublicationID) {
        
        int tCountPublication;
        
        tCountPublication = this.pPublications.length;
        
        this.pPublications[tCountPublication] = sPublicationID;
    }
    
    public Author(int sID, String sCPF, String sName) {
        this.pID = sID;
        this.pCPF = sCPF;
        this.pName = sName;
    }
    
}
