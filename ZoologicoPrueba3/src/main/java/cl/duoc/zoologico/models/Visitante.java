/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.zoologico.models;
import java.time.LocalDate;

/**
 *
 * @author Cetecom
 */
public class Visitante {
    private String rut;
    private long numeroCliente;
    private String nombreCompleto;
    private String direccion;
    private LocalDate fechaNacimiento;
    private final int estadoCivil;
    
    
    public Visitante() {
        this.rut = "";
        this.numeroCliente = 0;
        this.nombreCompleto = "";
        this.direccion = "";
        this.fechaNacimiento = LocalDate.now();
        this.estadoCivil = 1;
    }

    public Visitante(String rut, long numeroCliente, String nombreCompleto, String direccion, LocalDate fechaNacimiento,int estadoCivil) {
        this.rut = rut;
        this.numeroCliente = numeroCliente;
        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.estadoCivil = estadoCivil;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public long getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(long numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int jear, int mm, int dd) {
        this.fechaNacimiento = LocalDate.of(jear, mm, dd);
    }
    
    public int getEstadoCivil(){
        return this.estadoCivil;
    }
    
    public void setEstadoCivil(int estadoCivil){
        if(estadoCivil == 1){
            String mensaje = "Casado(a)";
        }else if(estadoCivil == 2){
            String mensaje = "Soltero(a)";
        }
    }
    
    @Override
    public String toString(){
        String mensaje = "Rut visitante:"+rut+"\nNumero de telefono:"+numeroCliente
                +"\nNombre completo:"+nombreCompleto+"\nDireccion:"+direccion
                +"\nEdad:"+fechaNacimiento+"\nEstado Civil:"+estadoCivil;
        
        return mensaje;
    }
}
