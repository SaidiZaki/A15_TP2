/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import org.apache.http.client.utils.URIBuilder;

/**
 *
 * @author mac
 */
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
