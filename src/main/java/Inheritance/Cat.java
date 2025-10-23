package Inheritance;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author apriansyah
 */
public class Cat extends Animal {
    private String color;
    
    public Cat(String name, int age, String color){
        super(name, age);
        this.color = color;
    }
    
    @Override
    public void makeSound(){
        System.out.println(getName()+" says : Miaaaau!");
    }
    
    @Override
    public String toString(){
        return "Cat{" + super.toString() + " ,color=" + '\''+')';
    }
    
}
