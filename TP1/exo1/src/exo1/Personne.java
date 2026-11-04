package exo1;

import java.time.LocalDate;

/**
 *
 * @author gauthyeh
 */
public class Personne {
    private String nom;
    private String prenom;
    private int anNaissance;
    
    //Constructeur naturel
    public Personne(String nom, String prenom,int anNaissance){
        this.nom = nom;
        this.prenom = prenom;
        this.anNaissance = anNaissance;
    }
    
    //Constructeur partiel
    public Personne(String prenom, int anNaissance){
        this.nom = "Inconnu";
        this.prenom = prenom;
        this.anNaissance = anNaissance;
    }
    
    //Constructeur par défaut
    public Personne() {
        this("Potter", "Harry", 1980);
    }
    
    //Getters
    public String GetNom(){
        return nom;
    }
    
    public String GetPrenom(){
        return prenom;
    }
    
    public int GetAnNaissance(){
        return anNaissance;
    }
    
    //Setters
    public void SetNom(String nom){
        this.nom = nom;
    }
    
    public void SetPrenom(String prenom){
        this.prenom = prenom;
    }
    
    public void SetAnNaissance(int anNaissance){
        this.anNaissance = anNaissance;
    }
    
    //
    //Exercice 2
    //
    
    //Méthode : Calculer l'âge
    public int CalculerAge(){
        int annee = LocalDate.now().getYear();
        int age = annee-anNaissance;
        return age;
    }
    
    //Méthode : Afficher les infos
    public void AfficherInfos(){
        System.out.println("Nom : "+nom);
        System.out.println("Prénom : "+prenom);
        System.out.println("Age : "+CalculerAge()+"\n");
    }
    
    public void Mange(String aliment){  
        System.out.println(nom + " mange un ou une " + aliment);
    }
    
}
