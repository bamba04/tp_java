package isi.sn.entities;

public class Employe extends Personne {
    private Service service;

    public Employe() {
    }

    public Employe(int id, String nomP, String prenomP, String emailP, String passwordP, String etatP, Service service) {
        super(id, nomP, prenomP, emailP, passwordP, etatP);
        this.service = service;
    }


    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
}
