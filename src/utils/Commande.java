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

public class Commande {

    public static String getCommande() {
        //http://localhost:8080/A15-TP-Partie-1/galerieArt/commande/allOrders
        URIBuilder builder = new URIBuilder();
        builder.setScheme("http");
        builder.setHost("localhost:8080");
        builder.setPath("/A15-TP-Partie-1/galerieArt/commande/allOrders");
        //System.out.println(builder);
        String response = recupererResponse(builder);
        return response;
    }
    
    public static String getCommandeClient() {
        //http://localhost:8080/A15-TP-Partie-1/galerieArt/commande/clientCommandes&20
        URIBuilder builder = new URIBuilder().setScheme("http");
        builder.setHost("localhost:8080");
        builder.setPath("/A15-TP-Partie-1/galerieArt/commande/clientCommandes&20");
        System.out.println(builder);
        String response = recupererResponse(builder);
        return response;
    }

    private static String recupererResponse(URIBuilder builder) {
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
    
    
    
}
