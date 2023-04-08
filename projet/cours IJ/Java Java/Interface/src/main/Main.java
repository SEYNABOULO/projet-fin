package main;

import sn.ucab.controllers.EmployeImpl;
import sn.ucab.controllers.IEmploye;
import sn.ucab.controllers.INewEmploye;
import sn.ucab.controllers.NewEmployeImpl;
import sn.ucab.entities.Cadre;
import sn.ucab.entities.Employe;
import sn.ucab.entities.Ouvrier;

public class Main {
    public static void main(String[] args) {
        /**Cadre cadre = new Cadre("AZ13", "Goudiaby", "Mouhamad", "cadre", "MBAO","Toyota");

       IEmploye iEmploye = new EmployeImpl();


       iEmploye.calculSaliareAnnuel(cadre);
       iEmploye.nombreJoursConges(cadre);
       iEmploye.nombrePermission(cadre);*/

        INewEmploye iNewEmploye = new NewEmployeImpl();

        Employe employe = iNewEmploye.saisie();
        iNewEmploye.affichage(employe);





    }
}
