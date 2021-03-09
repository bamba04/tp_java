package sn.isi.traitement;

import sn.isi.entities.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ImpMedecin implements IMedecin{


    @Override
    public Medecin saisi() {
        Scanner s = new Scanner(System.in);
        Medecin m = null;
        int choix =0;
        String r = null;
        System.out.println("Etes-vous :");
        System.out.println("1 - MEDECIN CHEF");
        System.out.println("2 - MEDECIN GENERALISTE");
        System.out.println("3 - MEDECIN SPECIALISTE");
        System.out.println("Faites votre choix :");
        choix = Integer.parseInt(s.nextLine());

        if(choix == 1){
        m = new MedecinChef();
            System.out.println("entrer le nom bureau");
            //String b = s.nextLine();
            ((MedecinChef) m).setBureau(s.nextLine());
            Services service = new Services();
            service.setNomService("MEDECIN CHEF");
            m.setService(service);
        }
        if(choix == 2){
            m = new MedecinGeneraliste();
            Services service = new Services();
            service.setNomService("MEDECIN GENERALISTE");
            m.setService(service);
            List<String> lSpecialite = new ArrayList<>();;
            do{
                String specialite = null;
                System.out.println("Entrer un de vos specialte");
                specialite = s.nextLine();
                lSpecialite.add(specialite);
                System.out.println("voulez-vous entrer un autre specialite o/n");
                r = s.nextLine();
            }while(r.equalsIgnoreCase("o"));
            ((MedecinGeneraliste) m).setlSpecialite(lSpecialite);
        }
        if(choix == 3){
            m = new MedecinSpecialiste();
            Services service = new Services();
            service.setNomService("MEDECIN SPECIALISTE");
            m.setService(service);
            System.out.println("entrer votre specialite");
            ((MedecinSpecialiste)m).setSpecialite(s.nextLine());
        }
        System.out.println("entrer votre id");
        int id = Integer.parseInt(s.nextLine());
        m.setIdPers(id);
        System.out.println("entrer votre Prenom");
        m.setPrenomPers(s.nextLine());
        System.out.println("entrer votre Nom");
        m.setNomPers(s.nextLine());

        return m;
    }

    @Override
    public void affichage(Medecin medecin) {
        System.out.println("ID : "+medecin.getIdPers());
        System.out.println("PRENOM :"+medecin.getPrenomPers());
        System.out.println("NOM : "+medecin.getNomPers());
        if (medecin instanceof MedecinChef){
            System.out.println("NOM SERVICE :"+medecin.getService().getNomService());
            System.out.println("BUREAU :"+((MedecinChef) medecin).getBureau());
        }
        int i =0;
        if (medecin instanceof MedecinGeneraliste){
            System.out.println("NOM SERVICE :"+ medecin.getService().getNomService());
            for(String specialite : ((MedecinGeneraliste) medecin).getlSpecialite()){
                i++;
                System.out.println("specialite "+i+": "+specialite);

            }
        }
        if (medecin instanceof MedecinSpecialiste){
            System.out.println("NOM SERVICE :"+ medecin.getService().getNomService());
            System.out.println("SPECIALITE :"+((MedecinSpecialiste) medecin).getSpecialite());
        }

    }
}
