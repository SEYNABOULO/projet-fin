package sn.ucab.entities;

public class Cadre extends Employe {
    private  String vehicule;

    public Cadre() {
        super();
    }

    public Cadre(String matricule, String nom, String prenom,String fonction, String adresse, String vehicule) {
        super(matricule, nom, prenom,fonction, adresse);
        this.vehicule = vehicule;
    }

    public String getVehicule() {
        return vehicule;
    }

    public void setVehicule(String vehicule) {
        this.vehicule = vehicule;
    }
}
