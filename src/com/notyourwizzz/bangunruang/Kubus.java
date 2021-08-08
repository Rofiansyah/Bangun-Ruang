package com.notyourwizzz.bangunruang;

public class Kubus implements BangunRuang{

    Kubus(){
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

    public double volume(int s) { //metode overload
        return (s * s * s);
    }
    public double luasPermukaan(int s) { //methode overload
        return (6 * s * s);
    }
}
