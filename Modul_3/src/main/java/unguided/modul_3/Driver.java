/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unguided.modul_3;

/**
 *
 * @author LENOVO
 */
public class Driver {
    private String name;

    //Constructor buat inisialisasi nama driver
    public Driver(String name) {
        this.name = name;
    }

    //Method buat simulasi mengendarai mobil
    public void driverCar(Car car, int distance) {
        System.out.println(name + " is driving the car for " + distance + " km");
        car.startCar();
        car.shiftGear(1); //pindah ke gear 1
        car.shiftGear(2); //pindah ke gear 2
        System.out.println("Driving " + distance + " km");
        car.stopCar();
    }

    public void parkCar(Car car) {
        System.out.println(name + " is parking the car");
        car.stopCar();
    }
    
}
