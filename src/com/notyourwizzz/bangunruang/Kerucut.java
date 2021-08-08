package com.notyourwizzz.bangunruang;

public class Kerucut implements BangunRuang{

    private double pi = 3.1415;
    Kerucut(){
    }
    @Override
    public double volume(int s1, int s2, int s3) {
        return 0;
    }
    @Override
    public double luasPermukaan(int s1, int s2, int s3) {
        return 0;
    }
    @Override
    public double luasSelimut(int s1, int s2, int s3) {
        return 0;
    }
    public double volume(int r, int t) { //metode overload
        return (pi * r * r * t / 3);
    }
    public double luasPermukaan(int r, int t) { //methode overload
        double s = Math.sqrt((r * r) + (t * t));
        return (pi * r * (r + s));
    }
    public double luasSelimut(int r, int t) { //methode overload
        double s = Math.sqrt((r *r) + (t * t));
        return (pi * r * s);
    }
}
