/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unguided.modul5;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Fat");
        cat.makeSound();
        cat.purr();

        Dog dog = new Dog("Jhon");
        dog.makeSound();
        dog.bark();
        dog.fetch();
    }
    
}
