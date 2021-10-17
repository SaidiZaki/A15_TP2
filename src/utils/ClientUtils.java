
package utils;

import org.apache.http.client.utils.URIBuilder;

public class ClientUtils {
    
    public static String getClients(){
        
        URIBuilder builder = Utils.setHostScheme();
        builder.setPath("/A15-TP-Partie-1/galerieArt/clients/allClients");
        
        String response = Utils.recupererResponse(builder);
        return response;
    }
    
    public static String getClientDetails(){
        
        URIBuilder builder = Utils.setHostScheme();
        builder.setPath("/A15-TP-Partie-1/galerieArt/clients/singleClient&60");
        
        String response = Utils.recupererResponse(builder);
        return response;
        
    }
    
}
