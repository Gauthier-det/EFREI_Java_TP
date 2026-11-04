package gestionMagasin;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gauthyeh
 */
public class Commande {

    private static int prochainId = 1;

    private int idCommande;
    private Client client;
    private List<Produit> produitsCommandes;
    private double total;

    public Commande(Client client, Panier panier) {
        this.idCommande = prochainId++;
        this.client = client;
        this.produitsCommandes = new ArrayList<>(panier.getProduits());
        this.total = panier.calculerTotal();
    }

    public int getIdCommande() {
        return idCommande;
    }

    public Client getClient() {
        return client;
    }

    public List<Produit> getProduitsCommandes() {
        return produitsCommandes;
    }

    public double getTotal() {
        return total;
    }

    public void afficherDetailsCommande() {
        System.out.println("----");
        System.out.println("Commande  numéro " + idCommande);
        System.out.println("Client : " + client.getNom() + " (" + client.getEmail() + ")");
        System.out.println("Produits commandés :");
        for (Produit produit : produitsCommandes) {
            produit.afficherDetails();
        }
        System.out.println("Total : " + total + "€");
        System.out.println("----");
    }
}
