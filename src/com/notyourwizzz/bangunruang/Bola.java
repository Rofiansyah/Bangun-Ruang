package com.notyourwizzz.bangunruang;

public class Bola implements BangunRuang{

    private double pi = 3.1415;
    Bola(){
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

    public double volume(int r) { //metode overload
        return (4 / 3 * pi * r * r * r);
    }
    public double luasPermukaan(int r) { //methode overload
        return (4 * pi * r * r);
    }
}
