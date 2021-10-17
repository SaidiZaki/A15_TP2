
package utils;

import org.apache.http.client.utils.URIBuilder;


public class Categorie {
    
     public static String getCategorie() {
        URIBuilder builder = Utils.setHostScheme();
        builder.setPath("/A15-TP-Partie-1/galerieArt/categorie/allCategorie");
        
        String response = Utils.recupererResponse(builder);
        return response;
     } 
     
     public static String getCategorieDetail() {
        URIBuilder builder = Utils.setHostScheme();
        builder.setPath("/A15-TP-Partie-1/galerieArt/categorie/singleCategorie&1006");
        
        String response = Utils.recupererResponse(builder);
        return response;
     } 
    
}
