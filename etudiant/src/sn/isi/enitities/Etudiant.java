package sn.isi.enitities;

public class Etudiant {
    private String mat;
    private String prenom;
    private String nom;

    public Etudiant() {
    }

    public Etudiant(String mat, String prenom, String nom) {
        this.mat = mat;
        this.prenom = prenom;
        this.nom = nom;
    }

    public String getMat() {
        return mat;
    }

    public void setMat(String mat) {
        this.mat = mat;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
