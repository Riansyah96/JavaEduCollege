/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodPakNasrul;

/**
 *
 * @author arsenio
 */
public class PencetakArray {

    /**
     * @param args the command line arguments
     */
    public static void cetak(int[] ar1) {
        System.out.println("Cetak array integer " 
                + ar1.length + " elemen");
        //cetak
        for (int bil : ar1) {
            System.out.println(bil + " ");
        }
    }

    public static void cetak(String[] ar2) { // Parameter diganti dari args ke ar2
        System.out.println("Cetak array String " 
                + ar2.length + " elemen");
        //cetak
        for (String a : ar2) {
            System.out.println(a + " ");
        }
    } // Kurung kurawal penutup method ditambahkan

    public static void main(String[] args) {
        // TODO code application logic here
        //definisikan data array
        int[] array1 = {7, 3, 5, 2, 1, 6, 8};
        //panggil fungsi yg sudah dibuat
        cetak(array1);
        //overloading method
        String[] array2
                = {"fawwaz", "inaya", "hisyam", "kamila", "salman"};
        cetak(array2);
    }
}
