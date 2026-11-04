package gestionMagasin;

import java.util.Scanner;

/**
 *
 * @author gauthyeh
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Création du magasin et de ses produits
        Magasin magasin = new Magasin();
        magasin.ajouterProduit(new Produit(1, "Clavier", 29.99, 10));
        magasin.ajouterProduit(new Produit(2, "Souris", 14.99, 20));
        magasin.ajouterProduit(new Produit(3, "Écran", 149.99, 5));
        magasin.ajouterProduit(new Produit(4, "Casque", 39.99, 8));

        // Création du client et de son panier
        Client client = new Client(1, "Dupont Jacques", "jacques.dupont@mail.com");
        Panier panier = new Panier();

        boolean continuer = true;
        while (continuer) {
            System.out.println("\n--- Menu Magasin ---");
            System.out.println("1. Afficher les produits disponibles");
            System.out.println("2. Ajouter un produit au panier");
            System.out.println("3. Afficher le panier");
            System.out.println("4. Passer la commande");
            System.out.println("5. Quitter");
            System.out.print("Choix : ");

            int choix;
            try {
                choix = sc.nextInt();

            } catch (Exception e) {
                System.out.println("Choix invalide : " + e);
                sc.nextLine();
                continue;
            }

            sc.nextLine();

            switch (choix) {
                case 1:
                    magasin.afficherProduitsDisponibles();
                    break;

                case 2:
                    System.out.print("Nom du produit à ajouter : ");
                    String nomProduit = sc.nextLine();
                    Produit produitTrouve = magasin.trouverProduitParNom(nomProduit);

                    if (produitTrouve == null) {
                        System.out.println("Produit introuvable.");
                        break;
                    }

                    System.out.print("Quantité souhaitée : ");
                    int quantiteDemandee;
                    try {
                        quantiteDemandee = sc.nextInt();
                    } catch (Exception e) {
                        System.out.println("Quantité invalide.");
                        sc.nextLine();
                        break;
                    }

                    if (quantiteDemandee <= 0 || quantiteDemandee > produitTrouve.getQuantite()) {
                        System.out.println("Quantité indisponible en stock.");
                        break;
                    }

                    Produit produitPourPanier = new Produit(
                            produitTrouve.getId(),
                            produitTrouve.getNom(),
                            produitTrouve.getPrix(),
                            quantiteDemandee
                    );
                    panier.ajouterProduit(produitPourPanier);
                    produitTrouve.setQuantite(produitTrouve.getQuantite() - quantiteDemandee);
                    break;

                case 3:
                    panier.afficherPanier();
                    break;

                case 4:
                    if (panier.getProduits().isEmpty()) {
                        System.out.println("Le panier est vide, impossible de passer la commande.");
                        break;
                    }
                    Commande commande = new Commande(client, panier);
                    commande.afficherDetailsCommande();
                    panier.getProduits().clear();
                    System.out.println("Commande validée, panier vidé.");
                    break;

                case 5:
                    continuer = false;
                    System.out.println("Au revoir !");
                    break;

                default:
                    System.out.println("Choix invalide.");
            }
        }

        sc.close();
    }
}
