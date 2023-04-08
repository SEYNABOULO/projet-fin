public class Universite {
    private String nom;
    private String adress;
    private int datecreation;
    private int nombrefiliere;
    private int nombreetudiant;

    public Universite() {
    }

    public Universite(String nom, String adress, int datecreation, int nombrefiliere, int nombreetudiant) {
        this.nom = nom;
        this.adress = adress;
        this.datecreation = datecreation;
        this.nombrefiliere = nombrefiliere;
        this.nombreetudiant = nombreetudiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getDatecreation() {
        return datecreation;
    }

    public void setDatecreation(int datecreation) {
        this.datecreation = datecreation;
    }

    public int getNombrefiliere() {
        return nombrefiliere;
    }

    public void setNombrefiliere(int nombrefiliere) {
        this.nombrefiliere = nombrefiliere;
    }

    public int getNombreetudiant() {
        return nombreetudiant;
    }

    public void setNombreetudiant(int nombreetudiant) {
        this.nombreetudiant = nombreetudiant;
    }
}
