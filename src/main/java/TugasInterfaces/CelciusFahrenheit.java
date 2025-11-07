/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasInterfaces;

/**
 *
 * @author apriansyah
 */
public class CelciusFahrenheit implements KonverterSatuan {

    String asal, tujuan;

    public CelciusFahrenheit() {
        this.asal = "Celcius";
        this.tujuan = "Fahrenheit";
    }

    public String satuanInput() {
        return this.asal;
    }

    public String satuanOutput() {
        return this.tujuan;
    }

    public float konversi(float in) {
        return 9f / 5 * in + 32;
    }

    public static void main(String ar[]) {
        KonverterSatuan kl = new CelciusFahrenheit();
        float temp = 100; // titik didih air, Celcius
        System.out.println("Titik didih air " + temp + " "
                + kl.satuanInput() + " setara dengan "
                + kl.konversi(temp)
                + " " + kl.satuanOutput());
    }
}
