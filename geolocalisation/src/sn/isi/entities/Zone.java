package sn.isi.entities;

public class Zone {
    private int id;
    private String nomZ;
    private Double latitude;
    private Double longitude;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomZ() {
        return nomZ;
    }

    public void setNomZ(String nomZ) {
        this.nomZ = nomZ;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
}