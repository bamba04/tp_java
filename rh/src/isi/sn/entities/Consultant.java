package isi.sn.entities;

public class Consultant extends Personne{
    private int nbHeure;
    private double tauxHoraire;

    public Consultant(){};




    public Consultant(int id, String nomP, String prenomP, String emailP, String passwordP
            , String etatP, int nbHeure, double tauxHoraire) {
        super(id, nomP, prenomP, emailP, passwordP, etatP);
        this.nbHeure = nbHeure;
        this.tauxHoraire = tauxHoraire;
    }

    public int getNbHeure() {
        return nbHeure;
    }

    public void setNbHeure(int nbHeure) {
        this.nbHeure = nbHeure;
    }

    public double getTauxHoraire() {
        return tauxHoraire;
    }

    public void setTauxHoraire(double tauxHoraire) {
        this.tauxHoraire = tauxHoraire;
    }
}
