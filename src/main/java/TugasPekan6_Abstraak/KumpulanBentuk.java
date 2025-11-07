/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasPekan6_Abstraak;

/**
 *
 * @author apriansyah
 */
public class KumpulanBentuk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Membuat objek-objek bentuk 2D
        Bentuk2D b1 = new Lingkaran(8);
        Bentuk2D b2 = new Lingkaran(5);
        Bentuk2D b3 = new PersegiPanjang(10, 5);
        Bentuk2D b4 = new BujurSangkar(7);
        Bentuk2D b5 = new SegiTiga(6, 8); // segitiga dengan alas 6, tinggi 8
        
        // Menyimpan semua objek dalam array
        Bentuk2D[] ar_bentuk = {b1, b2, b3, b4, b5};
        
        System.out.println("=== DATA BENTUK 2 DIMENSI ===");
        
        // Menampilkan informasi semua bentuk menggunakan foreach loop
        for(Bentuk2D b2d : ar_bentuk) {
            System.out.println("--------------------------------");
            System.out.println(b2d);
            System.out.println("Luas: " + b2d.luasBidang());
            System.out.println("Keliling: " + b2d.kellingBidang());
        }
        
        System.out.println("--------------------------------");
        System.out.println("Total bentuk: " + ar_bentuk.length);
        
        // Demonstrasi polimorfisme tambahan
        System.out.println("\n=== DEMO POLIMORFISME ===");
        tampilkanInfoDetail(b1);
        tampilkanInfoDetail(b3);
        tampilkanInfoDetail(b5);
    }
    
    // Method untuk menunjukkan konsep polimorfisme
    public static void tampilkanInfoDetail(Bentuk2D bentuk) {
        System.out.println("Jenis: " + bentuk.namaBentuk());
        System.out.println("Luas: " + bentuk.luasBidang());
        System.out.println("Keliling: " + bentuk.kellingBidang());
        System.out.println("---");
    }
    
}
