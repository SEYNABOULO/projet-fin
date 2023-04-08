package main;

import sn.ucab.controllers.EmployeImpl;
import sn.ucab.controllers.IEmploye;
import sn.ucab.entities.Cadre;
import sn.ucab.entities.Employe;
import sn.ucab.entities.Ouvrier;

public class Main {
    public static void main(String[] args) {
       // Cadre cadre = new Cadre("AZ13", "Goudiaby", "Mouhamad", "ouvrier", "MBAO","rouge");
        Ouvrier ouvrier = new Ouvrier("AZ13", "Goudiaby", "Mouhamad", "ouvrier", "MBAO","rouge");
        IEmploye iEmploye = new EmployeImpl();

        iEmploye.calculSaliareAnnuel(ouvrier);
        iEmploye.nombreJoursConges(ouvrier);
        iEmploye.nombrePermission(ouvrier);

    }
}
