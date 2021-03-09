package main;

import sn.isi.dao.*;
import sn.isi.entities.Produit;
import sn.isi.entities.User;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        DB db = new DB();
        db.open();
        IUser iu = new UserImpl();
        IProduit ip = new ProduitImpl();
        User u = new User();
        Produit p = new Produit();
        //iu.add(u);
        //iu.delete(3);
        //iu.update(u);
        //  ip.add(p);
        ip.update(p);
        // ip.delete("1");
        /*List<User> l = iu.liste();

        for (User us : l){
            System.out.println("ID : "+us.getId());
            System.out.println("PRENOM : "+us.getPrenom());
            System.out.println("NOM : "+us.getNom());
            System.out.println("MAIL : "+us.getMail());
            System.out.println("PASSWORD : "+us.getPassword());
        }*/
      /*  List<Produit> l = ip.liste();

        for (Produit pdt : l) {
            System.out.println("ID : " + pdt.getRef());
            System.out.println("PRENOM : " + pdt.getNom());
            System.out.println("NOM : " + pdt.getUser().getId());
        }*/
    }
}
