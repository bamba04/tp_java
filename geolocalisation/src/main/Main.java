package main;

import sn.isi.entities.Rn;
import sn.isi.traitement.IRn;
import sn.isi.traitement.RnImp;

public class Main {
    public static void main(String[] args) {
        IRn ir = new RnImp();
        Rn rn = ir.saisieRn();
        ir.affichageRn(rn);
    }

}