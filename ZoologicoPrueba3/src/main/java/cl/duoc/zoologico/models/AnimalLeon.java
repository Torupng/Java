/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.zoologico.models;

import java.time.LocalDate;

/**
 *
 * @author mangl
 */
public class AnimalLeon extends Animal{
    private LocalDate dentista;

    public AnimalLeon() {
        super();
        this.dentista = LocalDate.now();
    }

    public AnimalLeon(LocalDate dentista, int chip, String nombre, int edad, String tipoAnimal,String tipoClima, String descripcion) {
        super(chip, nombre, edad, tipoAnimal,tipoClima, descripcion);
        this.dentista = dentista;
    }

    public LocalDate getDentista() {
        return dentista;
    }

    public void setDentista(int dia, int mes, int anio) {
        this.dentista = LocalDate.of(anio, mes, dia);
    }

    @Override
    public String toString() {
        return "AnimalLeon{" + "dentista=" + dentista + '}';
    }
    
    
    
}
