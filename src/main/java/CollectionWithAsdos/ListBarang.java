/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CollectionWithAsdos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author apriansyah
 */
public class ListBarang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> barang = new ArrayList<>();
        
        barang.add("Sapu");
        barang.add("Pel");
        barang.add("Gayung");
        barang.add("Ember");
        
        System.out.println("===DATA BARANG===");
        for (int i = 0; i < barang.size(); i++) {
            System.out.println(i + "-" + barang.get(i));
        }
        
        barang.set(2,"Kulkas");
        
        barang.remove("Gayung");
        
        barang.add("Kipas Angin");
        
        System.out.println("===DATA SETELAH UPDTAE===");
        for (String item : barang) {
            System.out.println("- " + item);
        }
    }
}