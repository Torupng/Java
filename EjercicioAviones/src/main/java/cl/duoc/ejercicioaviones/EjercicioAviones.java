/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package cl.duoc.ejercicioaviones;

import cl.duoc.ejercicioaviones.models.Pasajero;

/**
 *
 * @author Cetecom
 */
public class EjercicioAviones {

    public static void main(String[] args) {
        
        Pasajero cliente = new Pasajero();
        
        cliente.setNombre("Manuel");
        cliente.setRut("21364818-9");
        cliente.setFechaNacimiento(2004, 7, 24);
        cliente.setTelefono(934567457);
        cliente.setEmail("manuelbastidas@gmail.com");
        cliente.setVetado(false);
        
        System.out.println(cliente);
    }
}
