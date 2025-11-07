/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package InterfacesAsset;

/**
 *
 * @author apriansyah
 */
public class KumpulanAsset {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rumah r1 = new Rumah();
        Motor m1 = new Motor();
        Motor m2 = new Motor();
        r1.setLuas(120);
        r1.setTipe(45); 
        m1.setMerk("Honda");
        m1.setCc(110);
        m1.setTahun(2020);
        m1.setMerk("Yamaha");
        m1.setCc(150);
        m1.setTahun(2022);
        Assets assetku[] = {r1, m1, m2};
        double total = 0;
        for (Assets a : assetku) {
            System.out.println(a);
            total += a.nilaiAsset();
        }
        System.out.printf("Total Asset: Rp. %,.2f ", total);
    }

}
