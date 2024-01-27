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
public class AnimalOrangutan extends Animal{
    private int meses;

    public AnimalOrangutan() {
        super();
        this.meses = 0;
    }
    
    public AnimalOrangutan(int meses, int chip, String nombre, LocalDate edad, String tipoClima, String descripcion) {
        super(chip, nombre, edad, tipoClima, descripcion);
        this.meses = meses;
    }

    public int getMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }

    @Override
    public String toString() {
        return "AnimalOrangutan{" + "meses=" + meses + '}';
    }
    
    
}
