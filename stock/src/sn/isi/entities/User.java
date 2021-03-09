package sn.isi.entities;

import java.io.Serializable;

public class User implements Serializable{
        private int id;
        private String nom;
        private String prenom;
        private String mail;
        private String password;

        public User() {

        }

        public User(int id, String nom, String prenom, String mail, String password) {
            this.id = id;
            this.nom = nom;
            this.prenom = prenom;
            this.mail = mail;
            this.password = password;
        }

        public int getId() {
            return id;
        }

        public int setId(int id) {
            this.id = id;
            return id;
        }

        public String getNom() {
            return nom;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public String getPrenom() {
            return prenom;
        }

        public void setPrenom(String prenom) {
            this.prenom = prenom;
        }

        public String getMail() {
            return mail;
        }

        public void setMail(String mail) {
            this.mail = mail;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

}
