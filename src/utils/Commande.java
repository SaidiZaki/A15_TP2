package utils;

import org.apache.http.client.utils.URIBuilder;


public class Commande {

    public static String getCommande() {
        URIBuilder builder = Utils.setHostScheme();
        builder.setPath("/A15-TP-Partie-1/galerieArt/commande/allOrders");
        
        String response = Utils.recupererResponse(builder);
        return response;
    }
    
    public static String getCommandeClient(String idClient) {
        URIBuilder builder = Utils.setHostScheme();
        String path ="/A15-TP-Partie-1/galerieArt/commande/clientCommandes&"+idClient;
        builder.setPath(path);
        
        String response = Utils.recupererResponse(builder);
        return response;
    }


    
}
