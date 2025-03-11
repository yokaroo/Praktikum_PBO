/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package unguided.modul_3;

/**
 *
 * @author LENOVO
 */
public class Car {

    private final String model;
    private final Engine engine;
    private final Transmission transmission;

    //constructor buat inisialisasi model, engine, dan transmission
    public Car(String model, Engine engine, Transmission transmission) {
        this.model = model;
        this.engine = engine;
        this.transmission = transmission;
    }

    //method buat nyalain mobil
    public void startCar() {
        engine.start();
        System.out.println("Car model: " + model + " is ready to drive");
    }

    //method buat pindah gear
    public void shiftGear(int gear) {
        transmission.shiftGear(gear);
    }

    //method buat stop mobilnya
    public void stopCar() {
        engine.stop();
        System.out.println("Car model: " + model + " has stopped");
    }
}

