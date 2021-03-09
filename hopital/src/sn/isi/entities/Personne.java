package sn.isi.entities;

public abstract class Personne {
    protected int idPers;
    protected String nomPers;
    protected String prenomPers;

    public Personne() {
    }

    //args


    public Personne(int idPers, String nomPers, String prenomPers) {
        this.idPers = idPers;
        this.nomPers = nomPers;
        this.prenomPers = prenomPers;
    }

    public int getIdPers() {
        return idPers;
    }

    public void setIdPers(int idPers) {
        this.idPers = idPers;
    }

    public String getNomPers() {
        return nomPers;
    }

    public void setNomPers(String nomPers) {
        this.nomPers = nomPers;
    }

    public String getPrenomPers() {
        return prenomPers;
    }

    public void setPrenomPers(String prenomPers) {
        this.prenomPers = prenomPers;
    }
}
