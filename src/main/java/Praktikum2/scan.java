/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Praktikum2;
import java.util.Scanner;

/**
 *
 * @author arsenio
 */
public class scan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nama : ");
        String nama = sc.nextLine(); // untuk scan lagi
        
        System.out.print("Usia : ");
        int umur = sc.nextInt(); // untuk scan bilangan
        
        System.out.println("Nama Santri : " + nama + ", usia : " + umur + " tahun");
    }

}
