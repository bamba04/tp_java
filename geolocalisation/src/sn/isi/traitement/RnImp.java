package sn.isi.traitement;

import sn.isi.entities.Rn;
import sn.isi.entities.Zone;

import java.util.ArrayList;
import java.util.Scanner;

public class RnImp implements IRn{

    @Override
    public Rn saisieRn() {
        Scanner s = new Scanner(System.in);
        String r = null;
        Rn rn = new Rn();
        System.out.println("Entrer l'id de la route nationale");
        rn.setIdR(Integer.parseInt(s.nextLine()));
        System.out.println("Entrer la latitude de la route nationale");
        rn.setLatitudeR(Double.parseDouble(s.nextLine()));
        System.out.println("Entrer la longitude de la route nationale");
        rn.setLongitudeR(Double.parseDouble(s.nextLine()));
        ArrayList<Zone>lZones = new ArrayList<Zone>();
        System.out.println("--------Ajout d'une ZOne-----------");
        do {
            Zone zone = new Zone();
            IZone iz = new ZoneImp();
          //rn.getZones().add(new ZoneImp().saisieZone());
            zone = iz.saisieZone();
           lZones.add(zone);
            System.out.println("voulez-vous ajouter une autre zone? o/n");
            r = s.nextLine();
        }while(r.equalsIgnoreCase("o"));
        rn.setZones(lZones);
        return rn;
    }

    @Override
    public void affichageRn(Rn rn) {
        System.out.println("--------------affichage d'une route Nationale---------------");
        System.out.println("ID route nationale : "+rn.getIdR());
        System.out.println("LATITUDE d'une route nationale : "+rn.getLatitudeR());
        System.out.println("LONGITUDE d'une nationale : "+rn.getLongitudeR());
        int i=0;
        for (Zone zone: rn.getZones())
        {
            i++;
            System.out.println("-------------Zone"+i+"----------");
            new ZoneImp().affichageZone(zone);
        }
    }
}
