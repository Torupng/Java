/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.ejercicioaviones.utils;

import java.time.LocalDate;

/**
 *
 * @author Cetecom
 */
public class Validacion {
    public static boolean valMail(String dato){
        return(dato.length()  > 0);
    }
    
    public static boolean valTelefono(long telefono){
        return ((telefono+"").length() == 9);
    }
    
     public static boolean valRut(int rut, char dv) {
        boolean validacion = false;
        try {
            int m = 0, s = 1;
            for (; rut != 0; rut /= 10) {
                s = (s + rut % 10 * (9 - m++ % 6)) % 11;
            }
            if (dv == (char) (s != 0 ? s + 47 : 75)) {
                validacion = true;
            }

        } catch (java.lang.NumberFormatException e) {
        } catch (Exception e) {
        }
        return validacion;
    }
    
    public static boolean valFecha(LocalDate date){
        return date.isBefore(LocalDate.now());
    }
}
