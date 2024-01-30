/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.zoologico.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mangl
 */
public class Ambiente {
    Animal an = new Animal();
    private int chip;
    private String sector;
    private String nombreJaula;
    private String descripcion;
    private LocalDate mantencion;
    private final int ecosistema;

    public Ambiente() {
        this.chip = 0;
        this.sector = "";
        this.nombreJaula = "";
        this.descripcion = "";
        this.mantencion = LocalDate.now();
        this.ecosistema = 1;
    }
    
    public Ambiente(int chip, String sector, String nombreJaula, String descripcion, LocalDate mantencion, int ecosistema) {
        this.chip = chip;
        this.sector = sector;
        this.nombreJaula = nombreJaula;
        this.descripcion = descripcion;
        this.mantencion = mantencion;
        this.ecosistema = ecosistema;
    }

    public int getChip() {
        return chip = an.getChip();
    }

    public void setChip(int chip) {
        this.chip = chip;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getNombreJaula() {
        return nombreJaula;
    }

    public void setNombreJaula(String nombreJaula) {
        this.nombreJaula = nombreJaula;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getMantencion() {
        return mantencion;
    }

    public void setMantencion(int anio, int mes, int dia) {
        this.mantencion = LocalDate.of(anio, mes, dia);
    }

    public int getEcosistema() {
        return ecosistema;
    }

    public void setEcosistema(int ecosistema) {
        switch(ecosistema){
            case 1:
                String mensaje = "Arido";
                break;
            case 2:
                String message = "Selva tropical";//tigre - orangutan
                break;
            case 3:
                String mensaje1 = "Pastizal";
                break;
            case 4:
                String message1 = "Bosque";
                break;
            case 5:
                String mensaje2 = "Sabana";//leon
                break;
            case 6:
                String message2 = "Matorral";
                break;
            case 7:
                String mensaje3 = "Tundra";
                break;
        }
    }

    @Override
    public String toString() {
        return "\nAmbiente" + "\nChip:" + chip+ "\nSector=" + sector + "\nNombreJaula=" + nombreJaula +
                "\nDescripcion=" + descripcion + "\nMantencion=" + mantencion + "\nEcosistema=" + ecosistema + "------------------------";
    }

    
    
    
}
