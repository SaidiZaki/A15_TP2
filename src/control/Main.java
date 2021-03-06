package control;

import utils.Artiste;
import utils.Categorie;
import utils.ClientUtils;
import utils.Commande;

public class Main {

    public static void main(String[] args) {

        //------- CommandeClient --------------\\
        String idClient = "20";
        String allOrder = Commande.getCommande();
        String commandesClient = Commande.getCommandeClient(idClient);
        System.out.println("_________________________________________________________");
        System.out.println("Liste des Commandes: " + "\n " + allOrder + "\n" + "Liste de Commande du client 20: " + "\n" + commandesClient);
        System.out.println("_________________________________________________________");

        //*******************ARTISTE**************************
        String idArtiste ="40";
        String allArtistes = Artiste.getAllArtistes();
        String artiste = Artiste.getArtisteByID(idArtiste);
        System.out.println("*********************************************************");
        System.out.println("Liste des Artistes: " + "\n " + allArtistes + "\n" + "Detail Artiste avec Id = 40: " + "\n" + artiste);
        System.out.println("*********************************************************");

        //------- Client --------------\\
        idClient= "60";
        String allClients = ClientUtils.getClients();
        String client = ClientUtils.getClientDetails(idClient);
        System.out.println("*********************************************************");
        System.out.println("Liste des Clients: " + "\n " + allClients + "\n" + "Details du client 60: " + "\n" + client);
        System.out.println("*********************************************************");

        //------ Categorie--------------\\
        String idCategorie="1006";
        String allCategorie = Categorie.getCategorie();
        String categorie = Categorie.getCategorieDetail(idCategorie);
        System.out.println("*********************************************************");
        System.out.println("Liste des Categories: " + "\n " + allCategorie + "\n" + "Detail de la categirie 1006: " + "\n" + categorie);
        System.out.println("*********************************************************");

    }

}
