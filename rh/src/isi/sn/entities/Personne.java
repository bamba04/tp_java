package isi.sn.entities;

public class Personne {
    protected int id;
    protected String nomP;
    protected String prenomP;
    protected String emailP;
    protected String passwordP;
    protected String etatP;


    public Personne (){}


    public Personne (int id,String nomP,String prenomP ,String emailP ,String passwordP ,String etatP) {
        this.nomP = nomP;
        this.prenomP = prenomP;
        this.emailP = emailP;
        this.passwordP = passwordP;
        this.etatP = etatP;
    }
        //les getters et setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomP() {
        return nomP;
    }

    public void setNomP(String nomP) {
        this.nomP = nomP;
    }

    public String getPrenomP() {
        return prenomP;
    }

    public void setPrenomP(String prenomP) {
        this.prenomP = prenomP;
    }

    public String getEmailP() {
        return emailP;
    }

    public void setEmailP(String emailP) {
        this.emailP = emailP;
    }

    public String getPasswordP() {
        return passwordP;
    }

    public void setPasswordP(String passwordP) {
        this.passwordP = passwordP;
    }

    public String getEtatP() {
        return etatP;
    }

    public void setEtatP(String etatP) {
        this.etatP = etatP;
    }



    }

