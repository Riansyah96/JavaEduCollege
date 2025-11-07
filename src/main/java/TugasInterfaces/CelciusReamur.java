/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasInterfaces;

/**
 *
 * @author apriansyah
 */
public class CelciusReamur implements KonverterSatuan {
    String asal, tujuan;

    public CelciusReamur() {
        this.asal = "Celcius";
        this.tujuan = "Reamur";
    }

    public String satuanInput() {
        return this.asal;
    }

    public String satuanOutput() {
        return this.tujuan;
    }

    public float konversi(float in) {
        return 4f / 5 * in;
    }
}
