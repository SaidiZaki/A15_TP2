package control;

import utils.Categorie;
import utils.ClientUtils;
import utils.Commande;

public class Main {

    public static void main(String[] args) {
        
        //------- CommandeClient --------------\\
        String allOrder = Commande.getCommande();
        String commandesClient = Commande.getCommandeClient();
        System.out.println("_________________________________________________________");
        System.out.println( "Liste des Commandes: " + "\n "+allOrder + "\n" + "Liste de Commande du client 20: " + "\n"+commandesClient );
        System.out.println("_________________________________________________________");
        
        //------- Client --------------\\
        String allClients = ClientUtils.getClients();
        String client = ClientUtils.getClientDetails();
        System.out.println("*********************************************************");
        System.out.println( "Liste des Clients: " + "\n "+allClients + "\n" + "Details du client 60: " + "\n"+client );
        System.out.println("*********************************************************");
        
        //------ Categorie--------------\\
        String allCategorie = Categorie.getCategorie();
        String categorie = Categorie.getCategorieDetail();
        System.out.println("*********************************************************");
        System.out.println( "Liste des Categories: " + "\n "+allCategorie + "\n" + "Detail de la categirie 1006: " + "\n"+categorie );
        System.out.println("*********************************************************");
        
            
    }

}
