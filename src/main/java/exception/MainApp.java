/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exception;

/**
 *
 * @author apriansyah
 */
public class MainApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = InputanAngka.inputAngka("Masukkan angka pertama: ");
        int b = InputanAngka.inputAngka("Masukkan angka kedua: ");
        int hasil = Pembagian.bagi(a, b);
        System.out.println("Hasil pembagian: " + hasil); // Perbaikan typo: hasil -> Hasil

        int umur = InputanAngka.inputAngka("Masukkan umur: ");
        try {
            UmurValidator.cekUmur(umur);
            System.out.println("Umur valid!");
        } catch (UmurTidakValidException e) {
            System.out.println("Error Umur: " + e.getMessage());
        }
        System.out.println("Program selesai.");
    }
    
}
