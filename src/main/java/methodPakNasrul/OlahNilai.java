/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodPakNasrul;

/**
 *
 * @author arsenio
 */
public class OlahNilai {

    //------------fungsi uji kelulusan---------------
    public static String cekLulus(int nilai) {
        String ket = (nilai >= 56) ? "Lulus" : "Gagal";
        return ket;
    }
//------------fungsi uji grade------------------

    public static char cekGrade(int n) {
        char grade;
        if (n >= 0 && n < 40) {
            grade = 'E';
        } else if (n >= 40 && n < 56) {
            grade = 'D';
        } else if (n >= 56 && n < 80) {
            grade = 'C';
        } else if (n >= 80 && n < 90) {
            grade = 'B';
        } else if (n >= 90 && n <= 100) {
            grade = 'A';
        } else {
            grade = 'X';
        }
        return grade;
    }

    //------------fungsi uji predikat---------------
    public static String cekPredikat(char grade) {
        String predikat;
        switch (grade) {
            case 'A':
                predikat = "Excellent";
                break;
            case 'B':
                predikat = "Good";
                break;
            case 'C':
                predikat = "Average";
                break;
            case 'D':
                predikat = "Poor";
                break;
            case 'E':
                predikat = "Bad";
                break;
            default:
                predikat = "Undefined";
        }
        return predikat;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Object[][] data_nilai = {
            {"Fawwaz", 95.5f}, {"Inaya", 80.2f},
            {"Firda", 70.3f}, {"Bedu", 50.3f},};
        System.out.println("=========================================================");
        System.out.println("Nama\t\tNilai\tGrade\tPredikat\tKeterangan");
        System.out.println("=========================================================");
        for (int i = 0; i < data_nilai.length; i++) {
            String nama = (String) data_nilai[i][0];
            float nilai = (float) data_nilai[i][1];
// konversi float ke int untuk fungsi penilaian
            int nilaiInt = Math.round(nilai);
            char grade = cekGrade(nilaiInt);
            String predikat = cekPredikat(grade);
            String ket = cekLulus(nilaiInt);
            System.out.println(nama + "\t\t" + nilai + "\t" + grade + "\t"
                    + predikat + "\t\t" + ket);
        }
        System.out.println("=========================================================");
    }

}
