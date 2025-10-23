package Inheritance;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author apriansyah
 */
public class TestAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cat c1 = new Cat("Budi", 3, "Abu-abu");
        Cow w1 = new Cow ("Brono", 6, "Brahma");
        
        System.out.println(c1);        
        System.out.println(w1);
        
        c1.makeSound();
        w1.makeSound();
        
        Animal[] hewan = {c1,w1};
            System.out.println("\n==== Daftar Hewan ====");
            for (Animal a : hewan){
            System.out.println(a.getName()+"adalah " + a.getClass().getSimpleName());
            }
    }
    
}
