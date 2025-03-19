/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguinded.utils;

/**
 *
 * @author LENOVO
 */
public class DataChecker {
    public static boolean isValidAge(int age) {
        return age > 0 && age < 120;
    }

    public static boolean isValidDiagnosis(String diagnosis) {
        return diagnosis != null && !diagnosis.trim().isEmpty();
    }

    public static boolean isValidAppointmentId(String appointmentId) {
        return appointmentId != null && appointmentId.matches("APT-\\d{3}");
    }
}