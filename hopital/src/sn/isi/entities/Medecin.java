package sn.isi.entities;
//package sn.isi.entities.Services;

public abstract class Medecin extends Personne {
    protected Services service;

    public Medecin() {
    }

    public Medecin(Services service) {
        this.service = service;
    }

    public Medecin(int idPers, String nomPers, String prenomPers, Services service) {
        super(idPers, nomPers, prenomPers);
        this.service = service;
    }

    public Services getService() {
        return service;
    }

    public void setService(Services service) {
        this.service = service;
    }
}
