/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unguided.modul5;

/**
 *
 * @author LENOVO
 */
// Subclass (Cat) yang mewarisi dari Animal
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(" miau miau");
    }

    public void purr() {
        System.out.println(name + " is purrs");
    }
}

