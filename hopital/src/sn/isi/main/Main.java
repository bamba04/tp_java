package sn.isi.main;


import sn.isi.entities.Medecin;
import sn.isi.entities.Personne;
import sn.isi.traitement.IMedecin;
import sn.isi.traitement.ImpMedecin;

public class Main {
    public static void main(String[] args) {
        IMedecin m1 = new ImpMedecin();
        Medecin m = m1.saisi();
        m1.affichage(m);
    }
}
