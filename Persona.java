/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.ejercicio1.models;

import java.time.LocalDate;

/**
 *
 * @author Cetecom
 */
public class Persona {
    //atributos
    private String nombre;
    private String rut;
    private String apellido;
    private int telefono;//largo max de int 9 digitos
    private String correo;
    private LocalDate fechaNacimiento;
    
    //acceso - estatico - tipo - nombre
    //public   estatic    int    miNumero
    //private --> se da la responsabilidad a la clase de los atributos
    //protected
    //int edad = 0; declaracion y inicialización
    
    //métodos
    //constructores
    public Persona() {
        this.nombre = "----";
        this.rut = "-----";
        this.apellido = "------";
        this.telefono = 0;
        this.correo = "------";
    }
    
    public Persona(String nombre, String rut, String apellido, int telefono, String correo, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.rut = rut;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    //accesadores --> permiten mostrar la información devolviendola uno por uno
    //acceso - estatico - tipo - nombre
    public String getNombre() {
        return nombre;
    }
    
    public String getRut() {
        return rut;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public int getTelefono() {
        return telefono;
    }
    
    public String getCorreo() {
        return correo;
    }
    
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    
    
    //mutadores --> ayudan a modificar la información
    //acceso - estatico - void - nombre

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }


    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    
}
