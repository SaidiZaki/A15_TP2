package control;

import utils.Commande;

public class Main {

    public static void main(String[] args) {
        String allOrder = Commande.getCommande();
        
        String commandesClient = Commande.getCommandeClient();
        System.out.println("___________________________________________________________");
        System.out.println(allOrder);
        System.out.println("___________________________________________________________");
        System.out.println(commandesClient);
    }


}
