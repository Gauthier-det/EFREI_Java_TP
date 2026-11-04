package gestionMagasin;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gauthyeh
 */
public class Panier {

    private List<Produit> produits = new ArrayList<>();

    public List<Produit> getProduits() {
        return produits;
    }

    public void ajouterProduit(Produit produit) {
        produits.add(produit);
        System.out.println(produit.getNom() + " ajouté au panier.");
    }

    public void supprimerProduit(Produit produit) {
        if (produits.remove(produit)) {
            System.out.println(produit.getNom() + " retiré du panier.");
        } else {
            System.out.println("Ce produit n'est pas dans le panier.");
        }
    }

    public void afficherPanier() {
        if (produits.isEmpty()) {
            System.out.println("Le panier est vide.");
            return;
        }
        System.out.println("--- Contenu du panier ---");
        for (Produit produit : produits) {
            produit.afficherDetails();
        }
        System.out.println("Total : " + calculerTotal() + "€");
    }

    public double calculerTotal() {
        double total = 0;
        for (Produit produit : produits) {
            total += produit.getPrix() * produit.getQuantite();
        }
        return total;
    }
}
