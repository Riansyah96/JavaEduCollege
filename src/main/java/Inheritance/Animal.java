package Inheritance;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author apriansyah
 */
public class Animal {
    private String name;
    private int age;
    
    public Animal (String name, int age){
        this.name = name;
        this.age = age;
    }
    
    //Getter dan Setter
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
    //Method
    public void makeSound(){
        System.out.println(
        "Hewan ini mengeluarkan suara...");
    }
    
    @Override
    public String toString(){
        return "Animal{"+"name" + name + '\''+ " age =" + age  + '}';
    }
}
