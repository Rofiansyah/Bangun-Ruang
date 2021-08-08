package com.notyourwizzz.bangunruang;

public class PrismaSegitiga implements BangunRuang{

    PrismaSegitiga(){
    }
    @Override
    public double volume(int s1, int s2, int s3) {
        return (s1 * s2 / 2 * s3);
    }
    @Override
    public double luasPermukaan(int s1, int s2, int s3) {
        double k = (s1 + s2 + Math.sqrt((s1 * s1) + (s2 * s2)));
        double l = (0.5 * s1 * s2);
        return ((2 * l) + (k * s3));
    }
    @Override
    public double luasSelimut(int s1, int s2, int s3) {
        return 0;
    }
}
