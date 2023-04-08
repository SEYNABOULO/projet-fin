package sn.ucab.controllers;

import sn.ucab.entities.Employe;

public interface IEmploye {

    public int calculSaliareAnnuel(Employe employe);
    public int nombreJoursConges(Employe employe);
    public int nombrePermission(Employe employe);

}
