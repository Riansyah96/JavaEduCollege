/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CollectionPakNasrul;

/**
 *
 * @author apriansyah
 */
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTelepon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Map<String, String> telp = new HashMap<String, String>();
        telp.put("Budi", "087871234");
        telp.put("Ani", "087874321");
        telp.put("Dewi", "087877777");
        System.out.println("No Telp Budi " + telp.get("Budi"));
//        for (String nama : telp.keySet()) 
//        {
//            String no = telp.get(key);
//            System.out.println("Siswa " + nama + " teleponnya " + no);
//        }
        for (String nama : telp.keySet()) {
            String no = telp.get(nama); // PERBAIKAN: ganti 'key' dengan 'nama'
            System.out.println("Siswa " + nama + " teleponnya " + no);
        }
    }

}
