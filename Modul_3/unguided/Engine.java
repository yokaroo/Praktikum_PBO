/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unguided.modul_3;

/**
 *
 * @author LENOVO
 */
public class Engine {
     private String type;

    //constructor buat inisialisasi type engine
    public Engine(String type) {
        this.type = type;
    }

    //method buat nyalain engine
    public void start() {
        System.out.println("Engine has started. Type" + type);
    }

    //method buat stop engine
    public void stop() {
        System.out.println("Engine stopped.");
    }
    
}
