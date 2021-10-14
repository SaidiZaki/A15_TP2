package utils;

import org.apache.http.client.utils.URIBuilder;


public class Commande {

    public static String getCommande() {
        URIBuilder builder = Utils.setHostScheme();
        builder.setPath("/A15-TP-Partie-1/galerieArt/commande/allOrders");
        
        String response = Utils.recupererResponse(builder);
        return response;
    }
    
    public static String getCommandeClient() {
        URIBuilder builder = Utils.setHostScheme();
        builder.setPath("/A15-TP-Partie-1/galerieArt/commande/clientCommandes&20");
        
        String response = Utils.recupererResponse(builder);
        return response;
    }

    
    
    
    
}
