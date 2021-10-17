
package utils;

import org.apache.http.client.utils.URIBuilder;

public class ClientUtils {
    
    public static String getClients(){
        
        URIBuilder builder = Utils.setHostScheme();
        builder.setPath("/A15-TP-Partie-1/galerieArt/clients/allClients");
        
        String response = Utils.recupererResponse(builder);
        return response;
    }
    
    public static String getClientDetails(String idClient){
        
        URIBuilder builder = Utils.setHostScheme();
        String path="/A15-TP-Partie-1/galerieArt/clients/singleClient&"+idClient;
        builder.setPath(path);
        
        String response = Utils.recupererResponse(builder);
        return response;
        
    }
    
}
