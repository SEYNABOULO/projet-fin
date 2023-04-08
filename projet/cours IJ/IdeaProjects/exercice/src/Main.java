import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Universite ucad =new Universite();
        System.out.println("saisir d'un universite");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Donner le nom");
        ucad.setNom(scanner.nextLine());
        System.out.println("Donner d'un adrsse");
        ucad.setAdress(scanner.nextLine());
        System.out.println("Donner le date de creation");
        ucad.setDatecreation(scanner.nextInt());
        System.out.println("Donner le nombre de filiere");
        ucad.setNombrefiliere(scanner.nextInt());
        System.out.println("Donner le nombreetudiant");
        ucad.setNombreetudiant(scanner.nextInt());

        Universite ucab =new Universite();
        System.out.println("saisir d'un universite");
        System.out.println("Donner le nom");
        ucab.setNom(scanner.nextLine());
        System.out.println("Donner d'nu adresse");
        ucab.setAdress(scanner.nextLine());
        System.out.println("Donner le date de creation");
        ucab.setDatecreation(scanner.nextInt());
        System.out.println("Donner le nombre de filiere");
        ucab.setNombrefiliere(scanner.nextInt());
        System.out.println("Donner le nombreetudiant");
        ucab.setNombreetudiant(scanner.nextInt());


        System.out.println("nom:"+ucad.getNom()+
                "\nadresse:"+ucad.getAdress()+
                "\ndatecreation :"+ucad.getDatecreation()+""+
                "\nnombrefiliere:"+ucad.getNombrefiliere()+""+
                 "\nnombreetudiant:"+ucad.getNombreetudiant());


                  System.out.println("nom:"+ucab.getNom()+
                "\nadresse:"+ucab.getAdress()+""+
                "\ndatecreation  :"+ucad.getDatecreation()+""+
                          "\nnombrefiliere:"+ucad.getNombrefiliere()+""+
                          "\nnombreeutidiant:"+ucab.getNombreetudiant());

        if (ucad.getNombreetudiant() > ucab.getNombreetudiant()){
            System.out.println("ucad est plus grand nombre d'etudiant");

        }else  {
            System.out.println("ucab est plus grand nombre d'etudiant");
        }
    }
}
