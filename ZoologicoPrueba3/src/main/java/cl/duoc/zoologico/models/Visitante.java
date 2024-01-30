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
    public String nombreCompleto;
    private String direccion;
    private int edad;
    private final int estadoCivil;
    private String correoElectronico;
    
    
    public Visitante() {
        this.rut = "";
        this.numeroCliente = 0;
        this.nombreCompleto = "";
        this.direccion = "";
        this.edad = 0;
        this.estadoCivil = 1;
        this.correoElectronico = "";
    }

    public Visitante(String rut, long numeroCliente, String nombreCompleto, String direccion, int edad,int estadoCivil, String correoElectronico) {
        this.rut = rut;
        this.numeroCliente = numeroCliente;
        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
        this.edad = edad;
        this.estadoCivil = estadoCivil;
        this.correoElectronico = correoElectronico;
    }

    public String getRut() {
        return this.rut;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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
    
    public String getCorreoElectronico(){
        return this.correoElectronico;
    }
    
    public void setCorreoElectronico(String correoElectronico){
        this.correoElectronico = correoElectronico;
    }
    
    @Override
    public String toString(){
        String mensaje = "Rut visitante:"+rut+"\nNumero de telefono:"+numeroCliente
                +"\nNombre completo:"+nombreCompleto+"\nDireccion:"+direccion
                +"\nEdad:"+edad+"\nEstado Civil:"+estadoCivil+"\nCorreo electronico:"+correoElectronico;
        
        return mensaje;
    }
}
