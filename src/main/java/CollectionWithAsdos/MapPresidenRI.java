/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CollectionWithAsdos;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author apriansyah
 */
public class MapPresidenRI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Map<String, String> presiden = new TreeMap<>();
        
        //1. Input Data Presiden
        presiden.put("1-SKR","Soekarno");
        presiden.put("2-SHR","Soeharto");
        presiden.put("3-BJH","Baharuddin Jusuf Habibi");
        presiden.put("4-ABD","Abdurrahman Wahid");
        presiden.put("5-MGW","Megawati Soekarnopoetri");
        presiden.put("6-SBY","Susilo Bambang Yudhoyono");
        presiden.put("7-JKW","Joko Widodo");
        presiden.put("8-PBW","Prabowo Subianto");

        //2. Mengambil Data Tertentu
        System.out.println("Presiden Republik Indonesia ke-3"+ presiden.get("3-BJH"));
    
        //3.Menampilkan Kode Seluruh Data
        System.out.println("\nKode Presiden Republik Indonesia : " + presiden.keySet());
    
        //4.Menampilkan Nama Seluruh Data
        System.out.println("\nNama-nama Presiden Republik Indonesia : ");
        for (String nama : presiden.keySet()){
            String n = presiden.get(nama);
            System.out.println(n);
        }
    }    
}
