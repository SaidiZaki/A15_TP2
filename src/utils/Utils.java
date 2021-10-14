/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import control.Main;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

/**
 *
 * @author mac
 */
public class Utils {
    
    
    public static String recupererResponse(URIBuilder builder) {
        String response = "";
        HttpClient client = HttpClientBuilder.create().build();
        HttpUriRequest request;
        try {
            request = new HttpGet(builder.build());
            HttpResponse execute = client.execute(request);
            response = EntityUtils.toString(execute.getEntity());
        } catch (URISyntaxException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return response;
    }
    
    
    public static URIBuilder setHostScheme () {
        
        URIBuilder builder = new URIBuilder();
        builder.setScheme("http");
        builder.setHost("localhost:8080");
        
        return builder;
    }

    
}
