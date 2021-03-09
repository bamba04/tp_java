package sn.isi.dao;

import sn.isi.entities.Produit;
import sn.isi.entities.User;

import java.util.List;

public interface IProduit {
    public int add(Produit p) throws Exception;
    public int delete(String id)throws Exception;
    public int update(Produit p)throws Exception;
    public Produit getProduit(String id)throws Exception;
    public List<Produit> liste()throws Exception;
}
