/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ExceptionAsdos;

/**
 *
 * @author apriansyah
 */
public class PraktikExpensi1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            int a[] = new int [5];
            a[4] = 100;
            System.out.println("isi element array berhasil");
        }catch (Exception e){
            System.out.println("Terjadi pelanggaran memory");
            System.out.println("terjadi kesalahan dengan sebab" + e.getMessage());
        }
    }
    
}
