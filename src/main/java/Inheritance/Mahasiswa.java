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
public class Mahasiswa extends Person {
    //member1 variabel

    private String jurusan;
    private int semester;
//member2 konstruktor

    public Mahasiswa() {
        super();
    }
//member3 method

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + super.toString()
                + "jurusan=" + jurusan
                + ", semester=" + semester + '}';
    }
}
