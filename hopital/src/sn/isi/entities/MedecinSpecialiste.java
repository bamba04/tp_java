package sn.isi.entities;

public class MedecinSpecialiste extends Medecin {
    private String specialite;

    public MedecinSpecialiste() {
    }

    public MedecinSpecialiste(Services service, String specialite) {
        super(service);
        this.specialite = specialite;
    }

    public MedecinSpecialiste(int idPers, String nomPers, String prenomPers, Services service, String specialite) {
        super(idPers, nomPers, prenomPers, service);
        this.specialite = specialite;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
}