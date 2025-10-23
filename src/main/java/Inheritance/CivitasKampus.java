/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Inheritance;

/**
 *
 * @author apriansyah
 */
public class CivitasKampus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//buat obj
        Dosen d1 = new Dosen();
        Dosen d2 = new Dosen();
        Mahasiswa m1 = new Mahasiswa();
        Mahasiswa m2 = new Mahasiswa();
//panggil fungsi2 di class Dosen & Mahasiswa
        d1.setNidn("1111");
        d1.setNama("Nasrul");
        d1.setGender('L');
        d1.setGelar("S.Kom, M.Kom");
        d2.setNidn("1112");
        d2.setNama("Tifany");
        d2.setGender('P');
        d2.setGelar("ST, MT");
        m1.setJurusan("TI");
        m1.setSemester(3);
        m1.setNama("Eko");
        m1.setGender('L');
        m2.setNama("Maya Malahayati");
        m2.setGender('P');
        m2.setJurusan("SI");
        m2.setSemester(6);
        Person ar[] = {d1, d2, m1, m2};
        for (Person a : ar) {
            System.out.println(a);
        }
    }

}
