package sn.isi.entities;

import java.util.ArrayList;

public class Rn {
    private int idR;

    public int getIdR() {
        return idR;
    }

    public void setIdR(int idR) {
        this.idR = idR;
    }

    public Double getLatitudeR() {
        return latitudeR;
    }

    public void setLatitudeR(Double latitudeR) {
        this.latitudeR = latitudeR;
    }

    public Double getLongitudeR() {
        return longitudeR;
    }

    public void setLongitudeR(Double longitudeR) {
        this.longitudeR = longitudeR;
    }

    public ArrayList<Zone> getZones() {
        return zones;
    }

    public void setZones(ArrayList<Zone> zones) {
        this.zones = zones;
    }

    private Double latitudeR;
    private Double longitudeR;
    private ArrayList<Zone>zones ;
}
