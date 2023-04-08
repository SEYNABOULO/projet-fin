public class Employe {
    private String matricle;
    private String nom;
    private String prenom;
    private String fonction;

    public Employe() {

    }

    public Employe(String matricle, String nom, String prenom, String fonction) {
        this.matricle = matricle;
        this.nom = nom;
        this.prenom = prenom;
        this.fonction = fonction;
    }

    public String getMatricle() {
        return matricle;
    }

    public void setMatricle(String matricle) {
        this.matricle = matricle;
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
}

