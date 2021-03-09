package sn.isi.dao;

import sn.isi.entities.Produit;
import sn.isi.entities.User;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class UserImpl implements IUser{
    DB db = new DB();
    Scanner s = new Scanner(System.in);
    @Override
    public int add(User u) throws Exception {
        //ouverture de la connexion
        db.open();
        System.out.println("Entrer le Prenom du user");
        u.setPrenom(s.nextLine());
        System.out.println("Entrer le nom du user");
        u.setNom(s.nextLine());
        System.out.println("Entrer le mail du user");
        u.setMail(s.nextLine());
        System.out.println("Entrer le password du user");
        u.setPassword(s.nextLine());
        //requete prepare de l'insertion
        String sql = "INSERT INTO user VALUES (null, ?, ?, ?, ?)";
        // initialisation de la requete
        db.init(sql);

        db.getPstm().setString(1,u.getPrenom());
        db.getPstm().setString(2,u.getNom());
        db.getPstm().setString(3,u.getMail());
        db.getPstm().setString(4,u.getPassword());
        //execution de la requete Insert
        int ok = db.executeUpdate();

        return ok;
    }



    @Override
    public int update(User u) throws Exception {
        db.open();
        System.out.println("Entrer l'id du user");
        u.setId(Integer.parseInt(s.nextLine()));
        System.out.println("Entrer le Prenom du user");
        u.setPrenom(s.nextLine());
        System.out.println("Entrer le nom du user");
        u.setNom(s.nextLine());
        System.out.println("Entrer le mail du user");
        u.setMail(s.nextLine());
        System.out.println("Entrer le password du user");
        u.setPassword(s.nextLine());

        String sql = "UPDATE user SET prenom = ?, nom = ?, mail = ?, password = ? WHERE id = ?";
        db.init(sql);
        db.getPstm().setString(1,u.getPrenom());
        db.getPstm().setString(2,u.getNom());
        db.getPstm().setString(3,u.getMail());
        db.getPstm().setString(4,u.getPassword());
        db.getPstm().setInt(5,u.getId());


        int ok = db.executeUpdate();
        return ok;
    }

    @Override
    public User getUser(int id) throws Exception {

        User  u = null;
        db.open();
        String sql = "SELECT * FROM user WHERE id = ?";
        db.init(sql);
        ResultSet rset = db.executeSelect();
        db.getPstm().setInt(1,id);
        if(rset.next()){
            u = new User();
            u.setId(rset.getInt(1));
            u.setPrenom(rset.getString(2));
            u.setNom(rset.getString(3));
            u.setMail(rset.getString(4));
            u.setPassword(rset.getString(5));

        }
        return u;

    }
    @Override
    public int delete(int id) throws Exception {
        User u = null;
        db.open();
        String sql = "DELETE FROM user WHERE id = ?";
        db.init(sql);
        db.getPstm().setInt(1,id);
        int ok = db.executeUpdate();


        return ok;
    }

    @Override
    public List<User> liste() throws Exception{
        List<User> lUsers = new ArrayList<User>();
        db.open();
        String sql = "SELECT * FROM user";
        db.init(sql);
        ResultSet rset = db.executeSelect();
        while(rset.next()){
            User u = new User();
            u.setId(rset.getInt(1));
            u.setPrenom(rset.getString(2));
            u.setNom(rset.getString(3));
            u.setMail(rset.getString(4));
            u.setPassword(rset.getString(5));
            lUsers.add(u);
        }
        return lUsers;
    }

}
