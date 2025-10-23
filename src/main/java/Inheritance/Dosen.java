package Inheritance;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import Inheritance.Person;

/**
 *
 * @author apriansyah
 */
public class Dosen extends Person {
    //member1 var

    private String nidn;
    private String gelar;
//member2 konstruktor

    public Dosen() {
        super();
    }
//member3 method

    public String getNidn() {
        return nidn;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    public String getGelar() {
        return gelar;
    }

    public void setGelar(String gelar) {
        this.gelar = gelar;
    }

    @Override
    public String toString() {
        return "Dosen{" + super.toString()
                + "nidn=" + nidn
                + ", gelar=" + gelar + '}';
    }
}
