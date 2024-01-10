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
    
    public static boolean valTelefono(long numero){
        return(numero <= 9);
    }
    
    public static boolean valRun(String run){
        return(run.length() <= 10);
    }
    
    public static boolean valFecha(LocalDate date){
        LocalDate fecha = LocalDate.now();
        return(date.isBefore(fecha));
    }
}
