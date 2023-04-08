import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Article chemise =new Article();
        System.out.println("saisir d'un article");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Donner le libele");
        System.out.println("Donner le nom");
        chemise.setNon(scanner.nextLine());
        System.out.println("Donner le prix");
        chemise.setPrix(Integer.parseInt(scanner.nextLine()));
        System.out.println("Donner la quantite");
        chemise.setQte(Integer.parseInt(scanner.nextLine()));



        Article jeans =new Article();
        System.out.println("saisir d'un article");
        System.out.println("Donner le libele");
        jeans.setLibele(scanner.nextLine());
        System.out.println("Donner le nom");
        jeans.setNon(scanner.nextLine());
        System.out.println("Donner le prix");
        jeans.setPrix(Integer.parseInt(scanner.nextLine()));
        System.out.println("Donner la quantite");
        jeans.setQte(Integer.parseInt(scanner.nextLine()));


        System.out.println("libele:"+chemise.getLibele()+
                "\nNom:"+chemise.getNon()+
                "\nPrix :"+chemise.getPrix()+
                "\nQuantite:"+chemise.getQte());

        System.out.println("libele:"+jeans.getLibele()+
                "\nNom:"+jeans.getNon()+" "+
                "\nPrix  :"+jeans.getPrix()+" "+
                "\nQuantite:"+jeans.getQte());

          if (chemise.getPrix() > jeans.getPrix()){
              System.out.println("la chemise est plus cher que la jeans");

          }else  {
              System.out.println("le jeans est plus cher que la chemise");
          }
    }
}
