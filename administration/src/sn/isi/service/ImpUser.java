package sn.isi.service;

import sn.isi.entities.User;

import java.util.Scanner;

public class ImpUser implements IUser{
    @Override
    public User saisie() {
        User u = new User();
        Scanner s = new Scanner(System.in);
        System.out.println("entrer votre prenom");
        u.setPrenom(s.nextLine());
        System.out.println("entrer votre nom");
        u.setNom(s.nextLine());
        System.out.println("entrer votre id");
        u.setId(Integer.parseInt(s.nextLine()));
        System.out.println("entrer votre etat");
        u.setEtat(Integer.parseInt(s.nextLine()));
        System.out.println("entrer votre mail");
        u.setEmail(s.nextLine());
        System.out.println("entrer votre password");
        u.setPassword(s.nextLine());
        return u;
    }

    @Override
    public void affichage(User u) {
        System.out.println("prenom : "+u.getPrenom());
        System.out.println("nom :"+u.getNom());
        System.out.println("ID: "+u.getId());
        System.out.println("etat : "+u.getEtat());
        System.out.println("password : "+u.getPassword());
        System.out.println("email : "+u.getEmail());

    }
}
