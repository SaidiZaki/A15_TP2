package utils;

import org.apache.http.client.utils.URIBuilder;

public class Artiste {

    public static String getAllArtistes() {
        URIBuilder builder = Utils.setHostScheme();
        builder.setPath("/A15-TP-Partie-1/galerieArt/artiste/allArtiste");
        String response = Utils.recupererResponse(builder);
        return response;
    }
    
     public static String getArtisteByID() {
        URIBuilder builder = Utils.setHostScheme();
        builder.setPath("/A15-TP-Partie-1/galerieArt/artiste/singleArtiste&40");
        String response = Utils.recupererResponse(builder);
        return response;
    }
}
