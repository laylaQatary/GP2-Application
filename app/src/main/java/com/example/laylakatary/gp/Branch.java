package com.example.laylakatary.gp;

/**
 * Created by Layla Katary on 13/03/2017.
 */
public class Branch {
    double latitude;
    double longitude;
    String name;
    int id;
    double dis;
   public Branch(){};

    public void setDis(double dis) {
        this.dis = dis;
    }

    public double getDis() {
        return dis;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
