/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.zoologico.models;


import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Cetecom
 */
public class Animal {
    private int numRegistro;
    private String nombre;
    private LocalDate edad;
    private String tipoClima;

    public Animal() {
        this.numRegistro = numRegistro+1;
        this.nombre = "";
        this.edad = LocalDate.now();
        this.tipoClima = "";
    }
    
    public Animal(int numRegistro, String nombre, LocalDate edad, String tipoClima) {
        this.numRegistro = numRegistro;
        this.nombre = nombre;
        this.edad = edad;
        this.tipoClima = tipoClima;
    }

    public int getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(int numRegistro) {
        this.numRegistro = numRegistro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public LocalDate getEdad() {
        return edad;
    }

    public void setEdad(int anio, int mes, int dia) {
        this.edad = LocalDate.of(anio, mes, dia);
    }

    public String getTipoClima() {
        return tipoClima;
    }

    public void setTipoClima(String tipoClima) {
        this.tipoClima = tipoClima;
    }
    
    @Override
    public String toString(){
        String mensaje = "Numero de resgistro:"+numRegistro+"\nNombre:"+nombre
                +"\nEdad:"+edad+"\nTipo de clima donde vive:"+tipoClima
                +"\n------------------------------------";
        
        return mensaje;
    }
}
