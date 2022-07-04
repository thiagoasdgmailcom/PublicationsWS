/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.engsoft.arqsoft.trab1;

import java.util.ArrayList;
import java.util.List;

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
    
    private int[] pAuthoIDs;
    
    private Author[] pAuthors;
    
    public List<Author> pAuthorList;

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

    public Author[] getAuthors() {
        return this.pAuthors;
    }

    public int getAuthorsCount() {
        return this.pAuthors.length;
    }

    public List<Author> getAuthorsList() {
        return this.pAuthorList;
    }
    
    Publication(int sID, String sTitle, int sPageStart, int sPageEnd, int sPublishYear, Author[] sAuthors) {
        
        this.pAuthorList = new ArrayList<Author>();
        
        this.pID = sID;
        this.pTitle = sTitle;
        this.pPageStart = sPageStart;
        this.pPageEnd = sPageEnd;
        this.pPublishYear = sPublishYear;
        
        this.pAuthors = new Author[sAuthors.length];
        
        for(int tIX = 0; tIX < sAuthors.length; tIX++) {
            this.pAuthors[tIX] = sAuthors[tIX];
            this.pAuthorList.add(sAuthors[tIX]);
        }
    }
    
}
