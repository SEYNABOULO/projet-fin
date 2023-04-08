package sn.ucab.controllers;

import sn.ucab.entities.Employe;

public class EmployeImpl implements IEmploye {
    @Override
    public int calculSaliareAnnuel(Employe employe) {
        int sa =0;
        if (employe.getFonction() == "cadre") {
           sa = 300000*12;
            System.out.println(sa);
        }else if (employe.getFonction() == "ouvrier") {
           sa = 100000*12;
            System.out.println(sa);
        }else {
            System.out.println("employé inexistant");
        }
        return sa;

    }

    @Override
    public int nombreJoursConges(Employe employe) {
        return 0;
    }

    @Override
    public int nombrePermission(Employe employe) {
        return 0;
    }
}
