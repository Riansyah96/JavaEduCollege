/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasInterfaces;

/**
 *
 * @author apriansyah
 */
public class FahrenheitCelcius implements KonverterSatuan {
    String asal, tujuan;

    public FahrenheitCelcius() {
        this.asal = "Fahrenheit";
        this.tujuan = "Celcius";
    }

    public String satuanInput() {
        return this.asal;
    }

    public String satuanOutput() {
        return this.tujuan;
    }

    public float konversi(float in) {
        return (in - 32) * 5f / 9;
    }
}
