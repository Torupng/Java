/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package cl.duoc.practica;

/**
 *
 * @author Cetecom
 */
public class Practica {

    public static void main(String[] args) {
        /*
        Crear un proyecto maven con archivo main
        generar:
        -Un saludo a mi persona usando 2 variables, una para los nombres y la otra
        para los apellidos
        -Multiplicar 3 numeros, cada uno en una variable y presentar el resultado.
        -Concatenar en un texto 3 variables
        */
        
        String nombre = "Sofia ";
        String apellido = "Torres";
        int num1 = 4;
        int num2 = 5;
        int num3 = 7;
        
        int result = num1*num2*num3;
        
        
        System.out.println("El resultado de "+nombre+apellido+" en su multiplicacion fue de: "+result);
    }
}
