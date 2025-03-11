/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unguided.modul_3;

/**
 *
 * @author LENOVO
 */
public class Transmission {
    private final String type;

    //constructor buat inisialisasi transmission type
    public Transmission(String type) {
        this.type = type;
    }

    //method buat pindah gear
    public void shiftGear(int gear) {
        System.out.println("Shifted to gear: " + gear + " (Transmission type: " + type + ")"); 
    }
    
}
