package sn.isi.traitement;

import sn.isi.entities.Ecole;
import sn.isi.entities.Specialite;

import java.util.Map;

public interface IEcole {
    public Map<Specialite, Ecole> saisie();
    public void affichageEcoles(Map<Specialite,Ecole>maps);
    public void affichageSpecialites(Map<Specialite,Ecole>maps);

}
