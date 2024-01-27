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
public class AnimalTigre extends Animal{
    private String origen;
    private int codigoGatuno;

    public AnimalTigre() {
        super();
        this.origen = "";
        this.codigoGatuno = 0;
    }

    public AnimalTigre(String origen, int codigoGatuno, int chip, String nombre, LocalDate edad, String tipoClima, String descripcion) {
        super(chip, nombre, edad, tipoClima, descripcion);
        this.origen = origen;
        this.codigoGatuno = codigoGatuno;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public int getCodigoGatuno() {
        return codigoGatuno;
    }

    public void setCodigoGatuno(int codigoGatuno) {
        this.codigoGatuno = codigoGatuno;
    }

    @Override
    public String toString() {
        return "AnimalTigre{" + "origen=" + origen + ", codigoGatuno=" + codigoGatuno + '}';
    }
    
    
}
