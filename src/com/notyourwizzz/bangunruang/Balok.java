package com.notyourwizzz.bangunruang;

public class Balok implements BangunRuang{

    Balok(){
    }
    @Override
    public double volume(int s1, int s2, int s3) {
        return (s1 * s2 * s3);
    }
    @Override
    public double luasPermukaan(int s1, int s2, int s3) {
        return (2 * ((s1*s2)+(s1*s3)+(s2*s3)));
    }

    @Override
    public double luasSelimut(int s1, int s2, int s3) {
        return 0;
    }
}
