/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception;

/**
 *
 * @author apriansyah
 */
public class Pembagian {
    public static int bagi(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) { // Perbaikan typo: AnithmeticException -> ArithmeticException
            System.out.println("Error: Tidak bisa membagi dengan nol."); // Perbaikan typo: no1 -> nol
            return 0; // nilai default
        }
    }
}
