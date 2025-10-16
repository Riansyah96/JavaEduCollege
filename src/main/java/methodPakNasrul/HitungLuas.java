/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodPakNasrul;

/**
 *
 * @author arsenio
 */
public class HitungLuas {

    public static float hitungLuasPersegiPanjang(int panjang, int lebar) {
        int luas;
        luas = panjang * lebar;
        return luas;
    }

    public static float hitungLuasLingkaran(int jari2) {
        float luas;
        luas = (float) 22 / 7 * jari2 * jari2;
        return luas;
    }

    public static float hitungLuasSegiTiga(int alas, int tinggi) {
        float luas;
        luas = 1f / 2 * alas * tinggi;
        return luas;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int p, l, jari, alas, tinggi;
        p = 10;
        l = 5;
        jari = 14;
        alas = 12;
        tinggi = 20;
        int luas1 = (int) hitungLuasPersegiPanjang(p, l);
        float luas2 = hitungLuasLingkaran(jari);
        float luas3 = hitungLuasSegiTiga(alas, tinggi);
        System.out.println("Luas persegi panjang dgn panjang " + p
                + " dan lebar " + l + " = " + luas1);
        System.out.println("Luas lingkaran dgn jari2 " + jari
                + " = " + luas2);
        System.out.println("Luas segitiga dgn alas " + alas
                + " dan tinggi " + tinggi + " = " + luas2);

    }

}
