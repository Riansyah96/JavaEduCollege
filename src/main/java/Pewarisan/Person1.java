/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pewarisan;

/**
 *
 * @author apriansyah
 */
public class Person1 {
    //member1 variabel

    private String nama;
    private char gender;
//member2 blank konstruktor

    public Person1() {
    }
//member3 method getter & setter

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person1{" + "nama=" + nama + ", gender="
                + gender + '}';
    }
}
