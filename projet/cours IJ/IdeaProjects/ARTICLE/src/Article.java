public class Article {
    private String libele;
    private String non;
    private  int prix;
    private int qte;


    public Article() {
    }

    public Article(String libele, String non, int prix, int qte) {
        this.libele = libele;
        this.non = non;
        this.prix = prix;
        this.qte = qte;
    }

    public String getLibele() {
        return libele;
    }

    public void setLibele(String libele) {
        this.libele = libele;
    }

    public String getNon() {
        return non;
    }

    public void setNon(String non) {
        this.non = non;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }
}

