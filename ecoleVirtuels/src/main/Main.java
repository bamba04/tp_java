package main;

import sn.isi.entities.Ecole;
import sn.isi.entities.Specialite;
import sn.isi.traitement.IEcole;
import sn.isi.traitement.ecoleImpl;

import java.util.Map;

public class Main {
    public static void main(String[] args) {

        IEcole ie = new ecoleImpl();
        Map<Specialite, Ecole> lEcoles = ie.saisie();
        //ie.affichageEcoles(lEcoles);
        //ie.affichageSpecialites(lEcoles);
    }
}
