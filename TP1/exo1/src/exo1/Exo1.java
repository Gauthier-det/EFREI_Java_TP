/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exo1;

/**
 *
 * @author gauthyeh
 */
public class Exo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ex 2 : Création d'une instance avec le constructeur naturel
        Personne personne1 = new Personne("Dupont", "Jean",2004);
        // Ex 2 : Création d'une instance avec le constructeur partiel
        Personne personne2 = new Personne("Dorian", 2004);
        // Ex 2 : Création d'une instance avec le constructeur par défaut
        Personne personne3 = new Personne();
        
        // Ex 2 : Utilisation des méthodes sur les instances
        personne1.Mange("pomme");
        personne1.CalculerAge();
        personne1.AfficherInfos();
        

        personne2.Mange("mangue");
        personne2.CalculerAge();
        personne2.AfficherInfos();

        personne3.Mange("tartine");
        personne3.CalculerAge();
        personne3.AfficherInfos();
    }
    
}
