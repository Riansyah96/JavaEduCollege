/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfacesMusik;

/**
 *
 * @author apriansyah
 */
public class Pianika implements MusikTiup, MusikTekan {

    @Override
    public void tiup() {
        System.out.println("Tiup Pianika pfufffffff...");
    }

    @Override
    public void tekan() {
        System.out.println("Suara Pianika net...not...net");
    }
}
