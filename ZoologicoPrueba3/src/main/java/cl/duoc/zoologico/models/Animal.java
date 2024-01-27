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
public class Animal {
    private int chip;
    private String nombre;
    private LocalDate edad;
    private String tipoClima;
    private String descripcion;

    public Animal() {
        this.chip = chip+1;
        this.nombre = "";
        this.edad = LocalDate.now();
        this.tipoClima = "";
        this.descripcion = "";
    }
    
    public Animal(int chip, String nombre, LocalDate edad, String tipoClima, String descripcion) {
        this.chip = chip;
        this.nombre = nombre;
        this.edad = edad;
        this.tipoClima = tipoClima;
        this.descripcion = descripcion;
    }

    public int getChip() {
        return chip;
    }

    public void setChip(int chip) {
        this.chip = chip;
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
    
    public String getDescripcion(){
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    
    @Override
    public String toString(){
        String mensaje = "Numero de resgistro:"+chip+"\nNombre:"+nombre
                +"\nEdad:"+edad+"\nTipo de clima donde vive:"+tipoClima
                +"\nDescripcion breve:"+descripcion+"\n------------------------------------";
        
        return mensaje;
    }
}
