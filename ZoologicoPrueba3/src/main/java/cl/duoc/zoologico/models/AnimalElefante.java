/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.zoologico.models;

/**
 *
 * @author mangl
 */
public class AnimalElefante extends Animal{
    private int tonelaje;

    public AnimalElefante() {
        super();
        this.tonelaje = 0;
    }
    
    public AnimalElefante(int tonelaje, int chip, String nombre, int edad, String tipoAnimal,String tipoClima, String descripcion) {
        super(chip, nombre, edad, tipoAnimal,tipoClima, descripcion);
        this.tonelaje = tonelaje;
    }

    public int getTonelaje() {
        return tonelaje;
    }

    public void setTonelaje(int tonelaje) {
        this.tonelaje = tonelaje;
    }

    @Override
    public String toString() {
        return "AnimalElefante{" + "tonelaje=" + tonelaje + '}';
    }
    
    
}
