/*
 * TP0 Exercice 1 - Affichage d'un message
 * DETROUSSEL Gauthier
 * Novembre 2026
 */
package exo1;

import java.util.Scanner;

/**
 *
 * @author gauthyeh
 */
public class Exo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bonjour");

        String prenom;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Bonjour, quel est votre prenom ?");
        prenom = sc.nextLine();

        System.out.println("Bonjour, " + prenom + " !");
        System.out.println("Au revoir, " + prenom + " !");
    }

}
