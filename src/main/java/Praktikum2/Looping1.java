/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Praktikum2;

/**
 *
 * @author arsenio
 */
public class Looping1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 1; i <= 10; i++){
            if (i==3)continue;
            System.out.println("Bilangan " + i);
            if(i==7)break;
        }
    }
    
}
