/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.ejercicioaviones.models;

import cl.duoc.ejercicioaviones.utils.Validacion;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Cetecom
 */
public class Pasajero {
    private int id;
    private String nombre;
    private String rut;
    private LocalDate fechaNacimiento;
    private long telefono;
    private String email;
    private boolean vetado;

    public Pasajero() {
        this.id = 0;
        this.nombre = "";
        this.rut = "";
        this.fechaNacimiento = LocalDate.now();
        this.telefono = 0;
        this.email = "";
        this.vetado = false;
    }
    
    public Pasajero(int id, String nombre,String rut, LocalDate fechaNacimiento, long telefono, String email, boolean vetado) {
        this.id = id;
        this.nombre = nombre;
        this.rut = rut;
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

    public String getRut(){
        return rut;
    }
    
    public void setRut(String rut){
        boolean valrun = Validacion.valRun(rut);
        
        if(valrun){
            this.rut = rut;
        }else{
            System.out.println("El rut debe tener 9 digitos contando el guión");
        }
    }
    
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public void setFechaNacimiento(int anio, int mes, int dia) {
        boolean fechas = Validacion.valFecha(fechaNacimiento);
        
        if(fechas){
            this.fechaNacimiento = LocalDate.of(dia, mes, anio);
        }else{
            System.out.println("Ocurrio un error al ingresar la fecha");
        }
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
        boolean correo = Validacion.valMail(email);
        
        if(correo){
            this.email = email;
        }else{
            System.out.println("error al registrar email");
        }
    }

    public boolean isVetado() {
        return vetado;
    }

    public void setVetado(boolean vetado) {
        this.vetado = vetado;
    }
    
    @Override
    public String toString(){
        return "nombre del pasajero:"+nombre+"\nRut:"+rut+"\nFecha de nacimiento:"+fechaNacimiento+"\nTelefono:"+telefono
                +"\nCorreo:"+email+"\nVetado:"+vetado+"\n-----------------------------------------";
    }
}
