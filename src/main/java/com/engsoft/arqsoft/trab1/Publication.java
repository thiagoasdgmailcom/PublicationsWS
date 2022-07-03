/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.engsoft.arqsoft.trab1;

/**
 *
 * @author thiago.diniz
 */
public class Publication {
    
    private int pID;
    private String pTitle;
    private int pPageStart;
    private int pPageEnd;
    private int pPublishYear;
    
    private int[] pAuthors;

    public int getID() {
        return this.pID;
    }

    public void setID(int sID) {
        this.pID = sID;
    }

    public String getTitle() {
        return this.pTitle;
    }

    public void setTitle(String sTitle) {
        this.pTitle = sTitle;
    }

    public int getPageStart() {
        return this.pPageStart;
    }

    public void setPageStart(int sPageStart) {
        this.pPageStart = sPageStart;
    }

    public int getPageEnd() {
        return this.pPageEnd;
    }

    public void setPageEnd(int sPageEnd) {
        this.pPageEnd = sPageEnd;
    }

    public int getPublishYear() {
        return this.pPublishYear;
    }

    public void setPublishYear(int sPublishYear) {
        this.pPublishYear = sPublishYear;
    }

    public void addAuthor(int sAuthorID) {
        
        int tCountAuthor;
        
        tCountAuthor = this.pAuthors.length;
        
        this.pAuthors[tCountAuthor] = sAuthorID;
    }
    
    Publication(int sID, String sTitle, int sPageStart, int sPageEnd, int sPublishYear) {
        
        this.pID = sID;
        this.pTitle = sTitle;
        this.pPageStart = sPageStart;
        this.pPageEnd = sPageEnd;
        this.pPublishYear = sPublishYear;
    }
    
}
