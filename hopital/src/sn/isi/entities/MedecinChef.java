package sn.isi.entities;

public class MedecinChef extends Medecin{
    private String bureau;

    public MedecinChef() {
    }

    public MedecinChef(Services service, String bureau) {
        super(service);
        this.bureau = bureau;
    }

    public MedecinChef(int idPers, String nomPers, String prenomPers, Services service, String bureau) {
        super(idPers, nomPers, prenomPers, service);
        this.bureau = bureau;
    }

    public String getBureau() {
        return bureau;
    }

    public void setBureau(String bureau) {
        this.bureau = bureau;
    }
}
