package isi.sn.service;

import isi.sn.entities.Consultant;

import java.util.Scanner;

public class ConsultantImp implements IConsultant{
    @Override
    public Consultant saisie() {
        Scanner scan = new Scanner(System.in);
        Consultant cons =new Consultant();
        System.out.println("entrer l'id du consultant");
        cons.setId(Integer.parseInt(scan.nextLine()));
        System.out.println("entrer le nom du consultant");
        cons.setNomP(scan.nextLine());
        System.out.println("entrer le prenom du consultant");
        cons.setPrenomP(scan.nextLine());
        System.out.println("entrer l' email du consultant");
        cons.setPasswordP(scan.nextLine());
        System.out.println("entrer l'etat du consultant");
        cons.setEtatP(scan.nextLine());
        System.out.println("entrer le nombre d'heures du consultant");
        cons.setNbHeure(Integer.parseInt(scan.nextLine()));
        System.out.println("entrer le taux d'horaire du consultant");
        cons.setTauxHoraire(Integer.parseInt(scan.nextLine()));
        return  cons;
    }

    public void affichage(Consultant consultant) {
        System.out.println("l'id du consultant est : " + consultant.getId());
        System.out.println("le nom du consultant set de : " +consultant.getNomP());
        System.out.println("le prenom du consultant set de : " +consultant.getPrenomP());
        System.out.println("l'email du consultant set de : " +consultant.getEmailP());
        System.out.println("l'etat du consultant set de : " +consultant.getEtatP());
        System.out.println("le nombre d'heure du consultant set de : " +consultant.getNbHeure());
        System.out.println("le taux des horaire du consultant set de : " +consultant.getTauxHoraire());
    }


}
