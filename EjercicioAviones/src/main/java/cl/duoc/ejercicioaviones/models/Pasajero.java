/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.ejercicioaviones.models;

import cl.duoc.ejercicioaviones.utils.Validacion;
import java.time.LocalDate;

/**
 *
 * @author Cetecom
 */
public class Pasajero {
    private int id;
    private String nombre;
    private LocalDate fechaNacimiento;
    private long telefono;
    private String email;
    private boolean vetado;

    public Pasajero() {
        this.id = 0;
        this.nombre = "";
        this.fechaNacimiento = LocalDate.now();
        this.telefono = 0;
        this.email = "";
        this.vetado = false;
    }
    
    public Pasajero(int id, String nombre, LocalDate fechaNacimiento, long telefono, String email, boolean vetado) {
        this.id = id;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.email = email;
        this.vetado = vetado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        boolean validacion = Validacion.valTelefono(telefono);
        
        if(validacion){
            this.telefono = telefono;
        }else{
            System.out.println("Número de telefono debe tener 9 digitos");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isVetado() {
        return vetado;
    }

    public void setVetado(boolean vetado) {
        this.vetado = vetado;
    }
    
    @Override
    public String toString(){
        return "nombre del pasajero:"+nombre+"\nFecha de nacimiento:"+fechaNacimiento+"\nTelefono:"+telefono
                +"\nCorreo:"+email+"\nVetado:"+vetado+"\n-----------------------------------------";
    }
}
