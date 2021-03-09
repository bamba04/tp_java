package sn.isi.dao;

import sn.isi.entities.Produit;
import sn.isi.entities.User;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProduitImpl implements IProduit {
    DB db = new DB();
    Scanner s = new Scanner(System.in);
    @Override
    public int add(Produit p) throws Exception {
            //ouverture de la connexion
            db.open();
            System.out.println("Entrer ref produit");
            p.setRef(s.nextLine());
            System.out.println("Entrer le nom du produit");
            p.setNom(s.nextLine());
            System.out.println("Entrer l'id du user");
            p.getUser().setId(Integer.parseInt(s.nextLine()));
            //requete prepare de l'insertion
            String sql = "INSERT INTO produit VALUES ( ?, ?, ?)";
            // initialisation de la requete
            db.init(sql);
            db.getPstm().setString(1, p.getRef());
            db.getPstm().setString(2, p.getNom());
            db.getPstm().setInt(3, p.getUser().getId());
            //execution de la requete Insert
            int ok = db.executeUpdate();
            return ok;
        }


    @Override
    public int delete(String id) throws Exception {
        Produit p = null;
        db.open();
        String sql = "DELETE FROM produit WHERE ref = ?";
        db.init(sql);
        db.getPstm().setString(1,id);
        int ok = db.executeUpdate();
        return ok;
    }

    @Override
    public int update(Produit p) throws Exception {
        db.open();
        System.out.println("Entrer la ref du produit");
        p.setRef(s.nextLine());
        System.out.println("Entrer le nom du produit");
        p.setNom(s.nextLine());

        String sql = "UPDATE produit SET nom = ? WHERE ref = ?";
        db.init(sql);
        db.getPstm().setString(1,p.getNom());
        db.getPstm().setString(2,p.getRef());

        int ok = db.executeUpdate();
        return ok;
    }

    @Override
    public Produit getProduit(String id) throws Exception {
        Produit  p = null;
        db.open();
        String sql = "SELECT * FROM produit, user WHERE u.id = p.idU and p.ref = ?";
        db.init(sql);
        ResultSet rset = db.executeSelect();
        db.getPstm().setString(1,id);
        if(rset.next()){
            p = new Produit();
            p.setRef(rset.getString(1));
            p.setNom(rset.getString(2));
            p.getUser().setId(rset.getInt(3));
        }
        return p;

    }

    @Override
    public List<Produit> liste() throws Exception {
        List<Produit> lProduits = new ArrayList<Produit>();
        db.open();
        String sql = "SELECT * FROM produit as p,user as u WHERE p.idU = u.id ";
        db.init(sql);
        ResultSet rset = db.executeSelect();
        while(rset.next()){
            Produit p = new Produit();
            User u = new User();
            p.setRef(rset.getString(1));
            p.setNom(rset.getString(2));
            u.setId(rset.getInt(3));
           // p.setUser(new UserImpl().getUser(rset.getInt(3)));
            p.setUser(u);
            lProduits.add(p);
        }
        return lProduits;
    }
}
