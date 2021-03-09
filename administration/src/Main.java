import sn.isi.entities.User;
import sn.isi.service.IUser;
import sn.isi.service.ImpUser;

public class Main {
    public static void main(String[] args) {
        IUser u1 = new ImpUser();
        User u = u1.saisie();
        u1.affichage(u);
    }
}
