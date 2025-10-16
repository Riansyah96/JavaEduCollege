/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OPP;

/**
 *
 * @author apriansyah
 */
public class Transaksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // membuat object
        Bank n1 = new Bank("Budi", 111, 500000);
        Bank n2 = new Bank("Deden", 112, 700000);
        Bank n3 = new Bank("Siti", 113, 400000);
//panggil member class
        n1.menabung(300000);
        n2.menabung(100000);
        n2.menarik(200000);
        n3.menarik(200000);
        n1.mencetak();
        n2.mencetak();
        n3.mencetak();
    }

}
