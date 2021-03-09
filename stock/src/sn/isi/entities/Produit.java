package sn.isi.entities;

public class Produit {
    private String ref;
    private String nom;
    private User user = new User();

    public Produit() {
    }

    public Produit(String ref, String nom, User user) {
        this.ref = ref;
        this.nom = nom;
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
