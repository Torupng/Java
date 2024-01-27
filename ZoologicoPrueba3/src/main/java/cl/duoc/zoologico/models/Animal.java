/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.zoologico.models;
/**
 *
 * @author Cetecom
 */
public class Animal {
    private int chip;
    private String nombre;
    private int edad;
    private String tipoAnimal;
    private String tipoClima;
    private String descripcion;

    public Animal() {
        this.chip = chip+1;
        this.nombre = "";
        this.edad = 0;
        this.tipoClima = "";
        this.descripcion = "";
        this.tipoAnimal = "";
    }
    
    public Animal(int chip, String nombre, int edad, String tipoAnimal,String tipoClima, String descripcion) {
        this.chip = chip;
        this.nombre = nombre;
        this.edad = edad;
        this.tipoClima = tipoClima;
        this.descripcion = descripcion;
        this.tipoAnimal = tipoAnimal;
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


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String getTipoAnimal(){
        return this.tipoAnimal;
    }
    
    public void setTipoAnimal(String tipoAnimal){
        this.tipoAnimal = tipoAnimal;
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
                +"\nEdad:"+edad+"\nTipo animal:"+tipoAnimal+"\nTipo de clima donde vive:"+tipoClima
                +"\nDescripcion breve:"+descripcion+"\n------------------------------------";
        
        return mensaje;
    }
}
