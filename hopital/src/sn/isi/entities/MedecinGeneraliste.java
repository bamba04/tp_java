package sn.isi.entities;

import java.util.List;

public class MedecinGeneraliste extends Medecin {
    List<String> lSpecialite ;

    public List<String> getlSpecialite() {
        return lSpecialite;
    }

    public void setlSpecialite(List<String> lSpecialite) {
        this.lSpecialite = lSpecialite;
    }

    public MedecinGeneraliste() {
    }

    public MedecinGeneraliste(Services service) {
        super(service);
    }

    public MedecinGeneraliste(int idPers, String nomPers, String prenomPers, Services service) {
        super(idPers, nomPers, prenomPers, service);
    }
}
