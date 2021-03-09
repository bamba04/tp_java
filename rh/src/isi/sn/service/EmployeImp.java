package isi.sn.service;

import isi.sn.entities.Employe;
import isi.sn.entities.Service;

import java.util.Scanner;
public  class EmployeImp implements IEmploye {

    @Override
    public Employe saisie() {
        Scanner scanner = new Scanner(System.in);

        Service service = new Service();
        System.out.println("saisir un service");
        service.setNomService(scanner.nextLine());
        System.out.println("entrer un identifient");
        service.setId(Integer.parseInt(scanner.nextLine()));
        Employe emp =new Employe();
        System.out.println("entrer l'id de l'employe");
        emp.setId(Integer.parseInt(scanner.nextLine()));
        System.out.println("designer le nom de l'employe");
        emp.setNomP(scanner.nextLine());
        System.out.println("entrer le prenom de l'employe");
        emp.setPrenomP(scanner.nextLine());
        System.out.println("entrer l'email de l'employe");
        emp.setEmailP(scanner.nextLine());
        System.out.println(" entrer le mot de passe de l'employe");
        emp.setPasswordP(scanner.nextLine());
        System.out.println("entrer l'etat de l'employe");
        emp.setEtatP(scanner.nextLine());
        System.out.println("entrer le service de l'employe");
        emp.setService (service);
        return emp;
    }

    public void affichage(Employe employe) {
        System.out.println("l'id de l'employe :" +employe.getId());
        System.out.println("le nom de l'employe est : " +employe.getNomP());
        System.out.println("le prenom de l'employe est : " +employe.getPrenomP());
        System.out.println("l'email de l'employe est : " +employe.getEmailP());
        System.out.println("le mot de passe de l'employe est : " +employe.getPasswordP());
        System.out.println("l'etat de l'employe est : " +employe.getEtatP());
        System.out.println("le service de l'employe est : " + employe.getService().getId());
        System.out.println("le service de l'employe est : " +employe.getService().getNomService());


    }
}
