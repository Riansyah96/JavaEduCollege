/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPekan6_Abstraak;

/**
 *
 * @author apriansyah
 */
public class BujurSangkar extends Bentuk2D {

    private double sisi;
    
    // Constructor
    public BujurSangkar(double sisi) {
        this.sisi = sisi;
    }
    
    // Implementasi method abstract luasBidang
    @Override
    public double luasBidang() {
        return sisi * sisi;
    }
    
    // Implementasi method abstract kellingBidang
    @Override
    public double kellingBidang() {
        return 4 * sisi;
    }
    
    // Override method toString
    @Override
    public String toString() {
        return namaBentuk() + " sisi " + sisi;
    }
    
    // Getter dan Setter (opsional)
    public double getSisi() {
        return sisi;
    }
    
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
}
