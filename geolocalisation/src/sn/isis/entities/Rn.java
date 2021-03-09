package sn.isis.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rn {

    private int id;
    private String nom;
    private double latitude;
    private double longitude;
    private List<Zone> zones = new ArrayList<Zone>();


    public Rn() {
    }

    public Rn(int id,List<Zone> zones , String nom, double latitude, double longitude) {

        this.id = id;
        this.zones = zones;
        this.nom = nom;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public List<Zone> getZones() {
        return zones;
    }

    public void setZones(List<Zone> zones) {
        this.zones = zones;
    }
}
