/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPekan6_Abstraak;

/**
 *
 * @author apriansyah
 */
public abstract class Bentuk2D {

    // Method konkret yang mengembalikan nama class
    public String namaBentuk() {
        return getClass().getSimpleName();
    }

    // Method abstract untuk menghitung luas bidang
    public abstract double luasBidang();

    // Method abstract untuk menghitung keliling bidang
    public abstract double kellingBidang();

    // Method toString untuk representasi string objek
    @Override
    public String toString() {
        return namaBentuk();
    }
}
