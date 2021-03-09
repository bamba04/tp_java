package sn.isi.traitement;

import sn.isi.entities.Zone;
import sn.isi.traitement.IZone;

import java.util.Scanner;

public class ZoneImp implements IZone {
    @Override
    public Zone saisieZone() {
        Scanner s = new Scanner(System.in);
        Zone z = new Zone();
        System.out.println("Entrer l'id de la zone");
        z.setId(Integer.parseInt(s.nextLine()));
        System.out.println("Entrer le nom de la zone");
        z.setNomZ(s.nextLine());
        System.out.println("Entrer la latitude de la zone");
        z.setLatitude(Double.parseDouble(s.nextLine()));
        System.out.println("Entrer la longitude de la zone");
        z.setLongitude(Double.parseDouble(s.nextLine()));

        return z;
    }

    @Override
    public void affichageZone(Zone zone) {
        System.out.println("ID zone : "+zone.getId());
        System.out.println("NOM zone : "+zone.getNomZ());
        System.out.println("LATITUDE zone : "+zone.getLatitude());
        System.out.println("LONGITUDE zone : "+zone.getLongitude());
    }
}