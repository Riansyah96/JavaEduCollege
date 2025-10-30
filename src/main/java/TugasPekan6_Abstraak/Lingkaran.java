/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPekan6_Abstraak;

/**
 *
 * @author apriansyah
 */
public class Lingkaran extends Bentuk2D {

    double jari2;
    public static final double PHI = 3.14;

    // Constructor
    public Lingkaran(double jari2) {
        this.jari2 = jari2;
    }

    // Implementasi method abstract luasBidang
    @Override
    public double luasBidang() {
        return PHI * this.jari2 * this.jari2;
    }

    // Implementasi method abstract kellingBidang
    @Override
    public double kellingBidang() {
        return 2.0 * PHI * this.jari2;
    }

    // Override method toString untuk representasi yang lebih baik
    @Override
    public String toString() {
        return namaBentuk() + " jari-jari " + this.jari2;
    }
}
