/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package InterfacesMusik;

/**
 *
 * @author apriansyah
 */
public class SuaraMusik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Gitar m1 = new Gitar();
        Seruling m2 = new Seruling();
        Piano m3 = new Piano();
        Pianika m4 = new Pianika();
        m1.petik();
        m2.tiup();
        m3.tekan();
        m4.tiup();
        m4.tekan();
    }

}
