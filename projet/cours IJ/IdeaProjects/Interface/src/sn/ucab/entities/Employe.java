package sn.ucab.entities;

public class Employe {
    private String matricule, nom, prenom, fonction, adresse;

    public Employe() {
    }

    public Employe(String matricule, String nom, String prenom,String fonction, String adresse) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.fonction = fonction;
        this.adresse = adresse;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
