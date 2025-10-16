/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OPP;

/**
 *
 * @author apriansyah
 */
public class InfoGempa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //---------buat object dari Class Gempa-------
        Gempa g1 = new Gempa("Jepang", 7.8f);
        Gempa g2 = new Gempa("Philipina", 5.7f);
        Gempa g3 = new Gempa("Argentina", 3.6f);
        Gempa g4 = new Gempa("India", 2.0f);
//---------buat object dari Class Gempa-------
//---------pada halaman slide selanjutnya------
        System.out.println("---------Cetak Cara 1---------");
        g1.dampak();
        g2.dampak();
        g3.dampak();
        g4.dampak();

        System.out.println(
                "-------Cetak Cara 1--------");
        g1.dampak();

        g2.dampak();

        g3.dampak();

        g4.dampak();

        System.out.println(
                "-------Cetak Cara 2--------");
        Gempa ar_gempa[] = {g1, g2, g3, g4};
        
        for (Gempa gempa : ar_gempa) {
            gempa.dampak();
        }
    }
}