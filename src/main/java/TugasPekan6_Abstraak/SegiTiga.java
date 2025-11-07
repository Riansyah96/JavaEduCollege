/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPekan6_Abstraak;

/**
 *
 * @author apriansyah
 */
public class SegiTiga extends Bentuk2D {

    private double alas;
    private double tinggi;
    private double sisi1;
    private double sisi2;
    private double sisi3;
    
    // Constructor untuk segitiga sembarang
    public SegiTiga(double alas, double tinggi, double sisi1, double sisi2, double sisi3) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }
    
    // Constructor untuk segitiga (jika hanya diketahui alas dan tinggi)
    public SegiTiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
        // Asumsi segitiga siku-siku untuk menghitung sisi miring
        this.sisi1 = alas;
        this.sisi2 = tinggi;
        this.sisi3 = Math.sqrt(alas * alas + tinggi * tinggi);
    }
    
    // Implementasi method abstract luasBidang
    @Override
    public double luasBidang() {
        return (alas * tinggi) / 2;
    }
    
    // Implementasi method abstract kellingBidang
    @Override
    public double kellingBidang() {
        return sisi1 + sisi2 + sisi3;
    }
    
    // Override method toString
    @Override
    public String toString() {
        return namaBentuk() + " alas " + alas + " tinggi " + tinggi;
    }
    
    // Getter dan Setter (opsional)
    public double getAlas() {
        return alas;
    }
    
    public void setAlas(double alas) {
        this.alas = alas;
    }
    
    public double getTinggi() {
        return tinggi;
    }
    
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
}
