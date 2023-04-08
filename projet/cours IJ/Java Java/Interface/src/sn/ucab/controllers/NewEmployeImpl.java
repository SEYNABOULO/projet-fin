package sn.ucab.controllers;

import sn.ucab.entities.Cadre;
import sn.ucab.entities.Employe;
import sn.ucab.entities.Ouvrier;

import java.util.Scanner;

public class NewEmployeImpl implements INewEmploye {
    @Override
    public Employe saisie() {
        Employe employe = null;
        System.out.println("Tapez 1 pour Cadre ou 2 pour Ouvrier");
        Scanner scanner = new Scanner(System.in);

        int choix = Integer.parseInt(scanner.nextLine());

        switch (choix){
            case 1 :
                employe = new Cadre();
                System.out.println("SAISIE CADRE");
                System.out.println("Donnez le matricule");
                employe.setMatricule(scanner.nextLine());
                System.out.println("Donnez le nom");
                employe.setNom(scanner.nextLine());
                System.out.println("Donnez le prénom");
                employe.setPrenom(scanner.nextLine());
                System.out.println("Donnez la fonction");
                employe.setFonction(scanner.nextLine());
                System.out.println("Donnez le type de vehicule ");
                ((Cadre) employe).setVehicule(scanner.nextLine());
                System.out.println("Donnez l'adresse");
                employe.setAdresse(scanner.nextLine());
                break;
            case 2:
                employe = new Ouvrier();
                System.out.println("SAISIE OUVRIER");
                System.out.println("Donnez le matricule");
                employe.setMatricule(scanner.nextLine());
                System.out.println("Donnez le nom");
                employe.setNom(scanner.nextLine());
                System.out.println("Donnez le prénom");
                employe.setPrenom(scanner.nextLine());
                System.out.println("Donnez la fonction");
                employe.setFonction(scanner.nextLine());
                System.out.println("Donnez le type de tenue ");
                ((Ouvrier) employe).setTenue(scanner.nextLine());
                System.out.println("Donnez l'adresse");
                employe.setAdresse(scanner.nextLine());
                break;
            default:
                System.out.println("Choix incorrect ! \nVeuillez saisir 1 ou 2");

        }

        return employe;
    }

    @Override
    public void affichage(Employe employe) {
        if (employe instanceof Cadre) {
            System.out.println("*******CADRE********");
            System.out.println("Matricule : " + employe.getMatricule() +
                    "\nNom : " + employe.getNom() +
                    "\nPrénom : " + employe.getPrenom() +
                    "\nFonction : " + employe.getFonction() +
                    "\nVehicule : " + ((Cadre) employe).getVehicule() +
                    "Adresse : " + employe.getAdresse());
        } else if (employe instanceof Ouvrier) {
            System.out.println("*******OUVRIER********");
            System.out.println("Matricule : " + employe.getMatricule() +
                    "\nNom : " + employe.getNom() +
                    "\nPrénom : " + employe.getPrenom() +
                    "\nFonction : " + employe.getFonction() +
                    "\nTenue : " + ((Ouvrier) employe).getTenue() +
                    "Adresse : " + employe.getAdresse());

        }else
            System.out.println("Employé inexistant !");
    }
}
