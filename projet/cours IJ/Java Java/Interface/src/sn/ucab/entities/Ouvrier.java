package sn.ucab.entities;

public class Ouvrier extends Employe{
    private String tenue;

    public Ouvrier() {
        super();
    }

    public Ouvrier(String matricule, String nom, String prenom,String fonction, String adresse, String tenue) {
        super(matricule, nom, prenom,fonction, adresse);
        this.tenue = tenue;
    }

    public String getTenue() {
        return tenue;
    }

    public void setTenue(String tenue) {
        this.tenue = tenue;
    }
}
