package main;

import isi.sn.entities.Employe;
import isi.sn.service.EmployeImp;
import isi.sn.service.IEmploye;

public class Main {
    public static void main(String[] args) {
        IEmploye ie = new EmployeImp();
        Employe emp =ie.saisie();
        ie.affichage(emp);
    }
}
