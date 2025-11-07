/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Abstractt;

/**
 *
 * @author apriansyah
 */
public class SuaraHewan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hewan tom = new Kucing();
        Hewan milo = new Anjing();
        Hewan shaun = new Kambing();
        Hewan suara[] = {tom, milo, shaun};
        for (Hewan s : suara) {
            s.bersuara();
        }
    }

}
