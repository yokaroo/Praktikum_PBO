/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguinded.entities;

/**
 *
 * @author LENOVO
 */
public class Doctor {
    private String doctorId;
    private String name;
    private String specialization;

    public Doctor(String doctorId, String name, String specialization) {
        this.doctorId = doctorId;
        this.name = name;
        this.specialization = specialization;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return """
               Doctor Details:
                  ID: """ + doctorId + "\n" +
               "   Name: " + name + "\n" +
               "   Specialization: " + specialization + "\n";
    }
}
