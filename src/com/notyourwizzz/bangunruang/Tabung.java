package com.notyourwizzz.bangunruang;

public class Tabung implements BangunRuang{

    private double pi = 3.1415;
    Tabung(){
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
        return (pi * r * r * t);
    }
    public double luasPermukaan(int r, int t) { //methode overload
        return (2 * pi * r * (r + t));
    }
    public double luasSelimut(int r, int t) {
        return (2 * pi * r * t);
    }
}
