/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception;

/**
 *
 * @author apriansyah
 */
public class UmurValidator {
    public static void cekUmur(int umur) throws UmurTidakValidException {
        if (umur < 17) {
            throw new UmurTidakValidException("Umur minimal harus 17 tahun!");
        }
    }
}
