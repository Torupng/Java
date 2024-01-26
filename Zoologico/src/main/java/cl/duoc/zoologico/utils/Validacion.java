/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.zoologico.utils;

import java.time.LocalDate;

/**
 *
 * @author Cetecom
 */
public class Validacion {
    
    public static boolean ValFechaEntrada(LocalDate fecha){
        return(fecha.isAfter(LocalDate.now()));
    }
    
    public static boolean valPrecio(double precio){
        return(precio >= 10000);
    }
    
    public static boolean numEntrada(int numero){
        return(numero <= 90);
    }

}
