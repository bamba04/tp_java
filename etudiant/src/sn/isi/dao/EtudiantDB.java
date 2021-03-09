package sn.isi.dao;

import sn.isi.enitities.Etudiant;

import java.util.Scanner;

public class EtudiantDB {
    public EtudiantDB() {
    }
    public void AffichageMessageE(){
        String message = "Etudiant cree";
        DB db = new DB();

        Etudiant e = new Etudiant();
        Scanner s = new Scanner(System.in);
        System.out.println("Entrer le matricule de l'etudiant");
        e.setMat(s.nextLine());
        System.out.println("Entrer le nom de l'etudiant");
        e.setNom(s.nextLine());
        System.out.println("Entrer le prenom de l'etudiant");
        e.setPrenom(s.nextLine());
        System.out.println(db.AffichageMessageDB());
        System.out.println(message);
        System.out.println("Matricule etudiant: "+e.getMat());
        System.out.println("Matricule etudiant: "+e.getPrenom());
        System.out.println("Matricule etudiant: "+e.getNom());
    }

    public static void main(String[] args) {
        EtudiantDB e = new EtudiantDB();
        e.AffichageMessageE();
    }
}
