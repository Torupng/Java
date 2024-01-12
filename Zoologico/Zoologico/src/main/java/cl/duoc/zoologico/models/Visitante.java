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
    private String nombre;
    private String apellido;
    private boolean animalFavorito;
    private LocalDate fechaNacimiento;
    
    
    public Visitante() {
        this.rut = "";
        this.numeroCliente = 0;
        this.nombre = "";
        this.apellido = "";
        this.animalFavorito = false;
        this.fechaNacimiento = LocalDate.now();
    }

    public Visitante(String rut, long numeroCliente, String nombre, String apellido, boolean animalFavorito, LocalDate fechaNacimiento) {
        this.rut = rut;
        this.numeroCliente = numeroCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.animalFavorito = animalFavorito;
        this.fechaNacimiento = fechaNacimiento;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean getAnimalFavorito() {
        return animalFavorito;
    }

    public void setAnimalFavorito(boolean animalFavorito) {
        Animal nuevo = new Animal();
        
        if(animalFavorito = true){
            System.out.println(nuevo.getNombre());
            System.out.println(nuevo.getEdad());
        }
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int yyyy, int mm, int dd) {
        this.fechaNacimiento = LocalDate.of(yyyy, mm, dd);
    }
    
    @Override
    public String toString(){
        String mensaje = "Rut visitante:"+rut+"\nNumero de telefono:"+numeroCliente
                +"\nNombre:"+nombre+apellido+"\nAnimal favorito:"+animalFavorito
                +"\nEdad:"+fechaNacimiento;
        
        return mensaje;
    }
}
