package sn.isi.entities;

public class Services {
    private int id ;
    private String nomService;

    public Services() {
    }

    public Services(int id, String nomService) {
        this.id = id;
        this.nomService = nomService;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomService() {
        return nomService;
    }

    public void setNomService(String nomService) {
        this.nomService = nomService;
    }
}
