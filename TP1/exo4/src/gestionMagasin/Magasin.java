package gestionMagasin;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gauthyeh
 */
public class Magasin {

    private final List<Produit> produits = new ArrayList<>();

    public void ajouterProduit(Produit produit) {
        produits.add(produit);
    }

    public void afficherProduitsDisponibles() {
        if (produits.isEmpty()) {
            System.out.println("Aucun produit disponible.");
            return;
        }
        System.out.println("--- Produits disponibles ---");
        for (Produit produit : produits) {
            produit.afficherDetails();
        }
    }

    public Produit trouverProduitParNom(String nom) {
        for (Produit produit : produits) {
            if (produit.getNom().equalsIgnoreCase(nom)) {
                return produit;
            }
        }
        return null;
    }
}
