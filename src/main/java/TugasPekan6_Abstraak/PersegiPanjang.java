/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPekan6_Abstraak;

/**
 *
 * @author apriansyah
 */
public class PersegiPanjang extends Bentuk2D {

    private double panjang;
    private double lebar;
    
    // Constructor
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    // Implementasi method abstract luasBidang
    @Override
    public double luasBidang() {
        return panjang * lebar;
    }
    
    // Implementasi method abstract kellingBidang
    @Override
    public double kellingBidang() {
        return 2 * (panjang + lebar);
    }
    
    // Override method toString
    @Override
    public String toString() {
        return namaBentuk() + " panjang " + panjang + " lebar " + lebar;
    }
    
    // Getter dan Setter (opsional)
    public double getPanjang() {
        return panjang;
    }
    
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }
    
    public double getLebar() {
        return lebar;
    }
    
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
}
