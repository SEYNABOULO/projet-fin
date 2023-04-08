package sn.ucab.controllers;

import sn.ucab.entities.Employe;

public class EmployeImpl implements IEmploye {
    @Override
    public int calculSaliareAnnuel(Employe employe) {
        int sa = 0;
        if (employe.getFonction() == "ouvrier"){
            sa = 100000*12;
            System.out.println("Ouvrier, son salaire est = "+sa);
        }else if (employe.getFonction() == "cadre") {
            sa = 300000 * 12;
            System.out.println("Cadre, son salaire est = " + sa);
        }else
            System.out.println("Employé inexistant !");
        return sa;
    }

    @Override
    public int nombreJoursConges(Employe employe) {
        int njc = 0;
        if (employe.getFonction() == "ouvrier"){
            njc = 10;
            System.out.println("Ouvrier, il a : "+njc +" de jours de congés");
        }else if (employe.getFonction() == "cadre") {
            njc = 30;
            System.out.println("Cadre, il a : "+njc +" de jours de congés");
        }else
            System.out.println("Employé inexistant !");
        return njc;
    }

    @Override
    public int nombrePermission(Employe employe) {
        int njp = 0;
        if (employe.getFonction() == "ouvrier"){
            njp = 3;
            System.out.println("Ouvrier, il a : "+njp +" de jours de permission");
        }else if (employe.getFonction() == "cadre") {
            njp = 5;
            System.out.println("Cadre, il a : "+njp +" de jours de permission");
        }else
            System.out.println("Employé inexistant !");
        return njp;
    }
}
