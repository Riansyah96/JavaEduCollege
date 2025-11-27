/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ExceptionAsdos;

/**
 *
 * @author apriansyah
 */
public class PraktikFinally {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] vendors = {"intel","AMD","ARM","Citrix"};
        try {
            System.out.println(vendors[4]);
        } catch (Exception e) {
        System.out.println("Terjadi kesalahan dengan sebab"+ e.getMessage());}
        finally {
            System.out.println("Eksekusi Finally Berhasil");
        }
    }
    
}
