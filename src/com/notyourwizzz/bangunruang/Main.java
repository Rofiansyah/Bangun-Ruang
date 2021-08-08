package com.notyourwizzz.bangunruang;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static char pilihan;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int s1, s2, s3, s, r, t;

        Kubus okubus;
        Balok obalok;
        Bola obola;
        Tabung otabung;
        Kerucut okerucut;
        PrismaSegitiga oprisma;
//        LimasSegitiga olimastiga;
//        LimasSegiempat olimasempat;

        okubus = new Kubus();
        obalok = new Balok();
        obola = new Bola();
        otabung = new Tabung();
        okerucut = new Kerucut();
        oprisma = new PrismaSegitiga();
//        olimastiga = new Kubus();
//        olimasempat = new Kubus();

        mainMenu();
        switch (pilihan) {
            case '1': {
                System.out.println("\n===========");
                System.out.println("|| KUBUS ||");
                System.out.println("===========\n");
                System.out.print("Masukan sisi kubus: ");
                s = scanner.nextInt();
                System.out.println("\nVolume kubus: " + okubus.volume(s));
                System.out.println("Luas permukaan kubus: " + okubus.luasPermukaan(s));
                break;
            }
            case '2': {
                System.out.println("\n===========");
                System.out.println("|| BALOK ||");
                System.out.println("===========\n");
                System.out.print("Masukan panjang balok: ");
                s1 = scanner.nextInt();
                System.out.print("Masukan lebar balok: ");
                s2 = scanner.nextInt();
                System.out.print("Masukan tinggi balok: ");
                s3 = scanner.nextInt();
                System.out.println("\nVolume kubus: " + obalok.volume(s1,s2,s3));
                System.out.println("Luas permukaan kubus: " + obalok.luasPermukaan(s1,s2,s3));
                break;
            }
            case '3': {
                System.out.println("\n==========");
                System.out.println("|| BOLA ||");
                System.out.println("==========\n");
                System.out.print("Masukan jari-jari bola: ");
                r = scanner.nextInt();
                System.out.println("\nVolume bola: " + obola.volume(r));
                System.out.println("Luas permukaan bola: " + obola.luasPermukaan(r));
                break;
            }
            case '4': {
                System.out.println("\n============");
                System.out.println("|| Tabung ||");
                System.out.println("============\n");
                System.out.print("Masukan jari-jari tabung: ");
                r = scanner.nextInt();
                System.out.print("Masukan tinggi tabung: ");
                t = scanner.nextInt();
                System.out.println("\nVolume tabung: " + otabung.volume(r,t));
                System.out.println("Luas permukaan tabung: " + otabung.luasPermukaan(r, t));
                System.out.println("Luas selimut tabung: " + otabung.luasSelimut(r, t));
                break;
            }
            case '5': {
                System.out.println("\n=============");
                System.out.println("|| Kerucut ||");
                System.out.println("=============\n");
                System.out.print("Masukan jari-jari kerucut: ");
                r = scanner.nextInt();
                System.out.print("Masukan tinggi kerucut: ");
                t = scanner.nextInt();
                System.out.println("\nVolume kerucut: " + okerucut.volume(r,t));
                System.out.println("Luas permukaan kerucut: " + okerucut.luasPermukaan(r,t));
                System.out.println("Luas selimut kerucut: " + okerucut.luasSelimut(r,t));
                break;
            }
            case '6': {
                System.out.println("\n=====================");
                System.out.println("|| PRISMA SEGITIGA ||");
                System.out.println("=====================\n");
                System.out.print("Masukan alas segitiga: ");
                s1 = scanner.nextInt();
                System.out.print("Masukan tingi segitiga: ");
                s2 = scanner.nextInt();
                System.out.print("Masukan tinggi prisma: ");
                s3 = scanner.nextInt();
                System.out.println("\nVolume prisma segitiga: " + oprisma.volume(s1,s2,s3));
                System.out.println("Luas permukaan perisma segitiga: " + oprisma.luasPermukaan(s1,s2,s3));
                break;
            }
//            case '7': {
//                System.out.println("\n==========================");
//                System.out.println("|| PRISMA SEGITIGA SIKU ||");
//                System.out.println("==========================\n");
//                System.out.print("Masukan alas segitiga: ");
//                s1 = scanner.nextInt();
//                System.out.print("Masukan tingi segitiga: ");
//                s2 = scanner.nextInt();
//                System.out.print("Masukan tinggi prisma: ");
//                s3 = scanner.nextInt();
//                System.out.println("\nVolume prisma segitiga: " + oprisma.volume(s1,s2,s3));
//                System.out.println("Luas permukaan perisma segitiga: " + oprisma.luasPermukaan(s1,s2,s3));
//                break;
//            }
            default :{
                System.out.println("tidak ada pilihan");
                break;
            }
        }
    }
    private static void mainMenu() {
        System.out.println("============================================");
        System.out.println("|| VOLUME DAN LUAS PERMUKAAN BANGUN RUANG ||");
        System.out.println("============================================\n");
        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("3. Bola");
        System.out.println("4. Tabung");
        System.out.println("5. Kerucut");
        System.out.println("6. Prisma Segitiga Siku");
//        System.out.println("7. Limas Segitiga");
//        System.out.println("8. Limas Segiempat");
        System.out.print("\nMasukan Menu: ");
        pilihan = scanner.next().charAt(0);
    }
}
