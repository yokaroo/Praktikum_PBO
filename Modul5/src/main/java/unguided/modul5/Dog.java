/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unguided.modul5;

/**
 *
 * @author LENOVO
 */

// Subclass (Dog) yang mewarisi dari Animal
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(" awuwuwu");
    }

    public void bark() {
        System.out.println(name + " is barking");
    }

    public void fetch() {
        System.out.println(name + " fetches the ball");
    }
}

