package sn.isi.traitement;

import sn.isi.entities.Ecole;
import sn.isi.entities.Specialite;

import java.util.*;

public class ecoleImpl implements IEcole{
    @Override
    public Map<Specialite, Ecole> saisie() {
        Scanner s = new Scanner(System.in);
        String r = null;
        Ecole e = null;
        Specialite specialite = null;
        Map<Specialite,Ecole> eMaps = new Hashtable<Specialite,Ecole>();
        do {
            e = new Ecole();
            specialite = new Specialite();
            System.out.println("Entrer l'id de l'ecole");
            e.setId(Integer.parseInt(s.nextLine()));
            System.out.println("Entrer le nom de l'ecole ");
            e.setNom(s.nextLine());
            System.out.println("entrer l'id de la specialite");
            specialite.setId(Integer.parseInt(s.nextLine()));
            System.out.println("entrer le nom de la specialite");
            specialite.setNom(s.nextLine());
            e.setSpecialite(specialite);
            eMaps.put(e.getSpecialite(),e);
            System.out.println("voulez-vous ajouter une nouvelle ecole o/n");
            r =  s.nextLine();
        }while (r.equalsIgnoreCase("o"));

        return eMaps;
    }

    @Override
    public void affichageEcoles(Map<Specialite, Ecole> maps) {
        Collection<Ecole> ecoles = maps.values();

        for (Ecole e: ecoles){
            System.out.println("ID ecole: "+e.getId());
            System.out.println("NOM ecole: "+e.getNom());
            System.out.println("ID Specialite : "+e.getSpecialite().getId());
            System.out.println("NOM Specialite : "+e.getSpecialite().getNom());
            System.out.println("-----------------------------------------------");
        }

    }

    @Override
    public void affichageSpecialites(Map<Specialite, Ecole> maps) {
        Set<Specialite> Specialites = maps.keySet();
        for (Specialite specialite : Specialites){
            System.out.println("ID Specialite : "+specialite.getId());
            System.out.println("NOM Specialite : "+specialite.getNom());
        }
    }
}
