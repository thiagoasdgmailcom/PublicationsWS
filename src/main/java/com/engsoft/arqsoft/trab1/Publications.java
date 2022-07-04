package com.engsoft.arqsoft.trab1;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author thiago.diniz
 */
public class Publications {
    
    private List<Author> pAuthorList;
    private List<Publication> pPublicationList;
    
    public void setAuthorList(int sID, String sCPF, String sName) {
        
        Author tAuthor = new Author(sID, sCPF, sName);
        
        pAuthorList.add(tAuthor);
    }
    
    public void addAuthorList(String sCPF, String sName, int[] sPubIDs) {
        
        int tAuthorID = pAuthorList.size();
        
        this.setAuthorList(tAuthorID, sCPF, sName);
    }
    
    public void setPublicationList(int sID, String sTitle, int sPageStart, int sPageEnd, int sPublishYear, int[] sAuthors) {
        
        Author tAuthors[] = new Author[sAuthors.length];
        
        for(int tIX = 0; tIX < sAuthors.length; tIX++) {
            tAuthors[tIX] = pAuthorList.get(sAuthors[tIX]);
        }
        
        Publication tPublication = new Publication(sID, sTitle, sPageStart, sPageEnd, sPublishYear, tAuthors);
        
        pPublicationList.add(tPublication);
    }
    
    public void addPublicationList(String sTitle, int sPageStart, int sPageEnd, int sPublishYear, int[] sAuthors) {
        
        int tPublicationID = pPublicationList.size();
        
        this.setPublicationList(tPublicationID, sTitle, sPageStart, sPageEnd, sPublishYear, sAuthors);
    }
    
    public Publication[] getPublications(String sTitle) {
        
        Publication tPublications[] = new Publication[pPublicationList.size()];
        
        for(int tIX = 0; tIX < pPublicationList.size(); tIX++) {
            tPublications[tIX] = pPublicationList.get(tIX);
        }
        
        return tPublications;
    }
    
    public String getPublicationListString(String sTitle) {
            
        String teste = "";
        
        for(int tIX = 0; tIX < pPublicationList.size(); tIX++) {
            
            Publication tPublication = pPublicationList.get(tIX);
            
            String tTitle = tPublication.getTitle();
            
            if(tTitle.indexOf(sTitle) > -1){
            
                Author tAuthors[] = new Author[tPublication.getAuthorsCount()];
                    
                tAuthors = tPublication.getAuthors();
                
                teste = teste + "\n";
                
                for(int tIXAut = 0; tIXAut < tAuthors.length; tIXAut++) {
                    teste = teste + tAuthors[tIXAut].getName() + ", ";
                }
                
                teste = teste + ". " + tTitle + "";
                teste = teste + "" + "(" + String.valueOf(tPublication.getPublishYear()) + ")";
                teste = teste + ", pp. " + String.valueOf(tPublication.getPageStart()) + "-" + String.valueOf(tPublication.getPageEnd()) + ".";
                
                teste = teste + "\n";
            }
            
        }
        
        return teste;
    }
    
    public Publications() {
        
        pAuthorList = new ArrayList<Author>();
        pPublicationList = new ArrayList<Publication>();
        
        this.setAuthorList(0, "13246578989", "Diniz, T. A. S.");
        this.setAuthorList(1, "13246578989", "da Silva, A. F.");
        this.setAuthorList(2, "23246578989", "Azevedo, L. G.");
        this.setAuthorList(3, "33246578989", "Ohta, R. L.");
        this.setAuthorList(4, "43246578989", "Binotto, A. P. D.");
        this.setAuthorList(5, "53246578989", "dos Santos, M. N.");
        this.setAuthorList(6, "63246578989", "Segura, V. C. V. B.");
        this.setAuthorList(7, "73246578989", "Gandour, F. L.");
        this.setAuthorList(8, "83246578989", "da Silva Jose, H. S. A.");
        this.setAuthorList(9, "93246578989", "Cappelli, C.");
        this.setAuthorList(10, "10246578989", "Santoro, F. M.");
        this.setAuthorList(11, "11246578989", "De Bayser, M.");
        this.setAuthorList(12, "12246578989", "Cerqueira, R.");
        this.setAuthorList(13, "13246578989", "dos Santos, J. S.");
        this.setAuthorList(14, "14246578989", "Soares, E. F.");
        this.setAuthorList(15, "15246578989", "Thiago, R. M.");
        this.setAuthorList(16, "16246578989", "da Silva, V. T.");
        
        int[] tAuthorPub1 = {1, 2, 3, 4, 5, 6, 7};
        int[] tAuthorPub2 = {8, 9, 10, 2};
        int[] tAuthorPub3 = {11, 2, 12};
        int[] tAuthorPub4 = {13, 2, 14, 15, 16};
        
        this.setPublicationList(0, "A cloud-based architecture for the internet of things targeting industrial engine remote monitoring.", 1, 6, 2015, tAuthorPub1);
        this.setPublicationList(1, "Implementation of aspect-oriented business process models with web services.", 1, 24, 2020, tAuthorPub2);
        this.setPublicationList(2, "Researchops: The case for devops in scientific applications.", 1398, 1404, 2015, tAuthorPub3);
        this.setPublicationList(3, "Analysis of tools for rest contract specification in swagger/openapi.", 201, 208, 2020, tAuthorPub4);

    }
    
}
