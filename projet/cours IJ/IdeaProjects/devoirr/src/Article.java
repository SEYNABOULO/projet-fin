import java.util.Scanner;

public class Article {
    public static void main(String[] args) {
        Scanner saisir =new Scanner(System.in);
        System.out.println("saisir votre lebelle");
        String lebelle =saisir.nextLine();
        System.out.println("saisir votre nom");
        String nom =saisir.nextLine();
        int prix =Integer.parseInt(saisir.nextLine());
        int quantite =Integer.parseInt(saisir.nextLine());
        System.out.println("libelle"+" "+"nom"+" "+"");
    }
}
