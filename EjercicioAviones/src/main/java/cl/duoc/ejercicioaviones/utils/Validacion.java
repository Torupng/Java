/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.ejercicioaviones.utils;

/**
 *
 * @author Cetecom
 */
public class Validacion {
    public static boolean valMail(String dato){
        return(Integer.parseInt(dato) > 0);
    }
    
    public static boolean valTelefono(long numero){
        return(numero <= 9);
    }
    
    public static boolean valRun(String run){
        return(Integer.parseInt(run) <= 10);
    }
}
