/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasInterfaces;

/**
 *
 * @author apriansyah
 */
import java.util.Scanner;

public class ProgramKonversi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int jumlahkonverter = 4, n = 0;
        KonverterSatuan konverters[] = new KonverterSatuan[jumlahkonverter];
        konverters[n++] = new CelciusFahrenheit();
        konverters[n++] = new FahrenheitCelcius();
        konverters[n++] = new CelciusReamur();
        konverters[n++] = new ReamurCelcius();

        Scanner sc = new Scanner(System.in);

        System.out.println("Assalamu'alaikum, Aku adalah Konverter Besaran Suhu ...");

        while (true) {
            System.out.println("Silakan pilih nomor konverter:");
            for (int i = 0; i < konverters.length; i++) {
                System.out.println((i + 1) + ". " + konverters[i].satuanInput() + " ke " + konverters[i].satuanOutput());
            }

            System.out.print("\nKonverter pilihan anda (0 untuk QUIT) : ");
            int pilihan = sc.nextInt();

            if (pilihan == 0) {
                System.out.println("Terima kasih telah menggunakan program konverter suhu!");
                break;
            } else if (pilihan < 1 || pilihan > konverters.length) {
                System.out.println("Pilihan tidak valid! Silakan pilih antara 1-" + konverters.length + " atau 0 untuk keluar.\n");
                continue;
            }

            KonverterSatuan konverter = konverters[pilihan - 1];
            System.out.println(">> anda pilih " + konverter.satuanInput() + " ke " + konverter.satuanOutput());

            System.out.print("Masukan besaran suhu (" + konverter.satuanInput() + ") : ");
            float suhu = sc.nextFloat();

            float hasil = konverter.konversi(suhu);
            System.out.println(">> " + suhu + " " + konverter.satuanInput()
                    + " setara dengan " + hasil + " " + konverter.satuanOutput() + "\n");
        }

        sc.close();
    }

}
