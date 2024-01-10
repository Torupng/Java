/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.ejercicioaviones.models;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Cetecom
 */
public class Avion {
    
    private static int id = 10;
    private String nombre;
    private LocalTime horasVuelos;
    private boolean listo;
    private String datosExtra;
    private LocalDate fechaUltimoVuelo;
    private String carguero;
    private UnidadMedida tonelaje;
    private boolean ultraSonico;

    public Avion() {
        this.id = id++;
        this.nombre = "------";
        this.horasVuelos = LocalTime.of(0, 0);
        this.listo = false;
        this.datosExtra = "-----------";
        this.fechaUltimoVuelo = LocalDate.now();
        this.carguero = "-------------";
        this.tonelaje = UnidadMedida.Tonelada;
        this.ultraSonico = false;
    }
    
    
    public Avion(int id, String nombre, LocalTime horasVuelos, boolean listo, String datosExtra, LocalDate fechaUltimoVuelo, String carguero, UnidadMedida tonelaje, boolean ultraSonico) {
        this.id = id++;
        this.nombre = nombre;
        this.horasVuelos = horasVuelos;
        this.listo = listo;
        this.datosExtra = datosExtra;
        this.fechaUltimoVuelo = fechaUltimoVuelo;
        this.carguero = carguero;
        this.tonelaje = tonelaje;
        this.ultraSonico = ultraSonico;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalTime getHorasVuelos() {
        return horasVuelos;
    }

    public void setHorasVuelos(LocalTime horasVuelos) {
        this.horasVuelos = horasVuelos;
    }

    public boolean isListo() {
        return listo;
    }

    public void setListo(boolean listo) {
        this.listo = listo;
    }

    public String getDatosExtra() {
        return datosExtra;
    }

    public void setDatosExtra(String datosExtra) {
        this.datosExtra = datosExtra;
    }

    public LocalDate getFechaUltimoVuelo() {
        return fechaUltimoVuelo;
    }

    public void setFechaUltimoVuelo(LocalDate fechaUltimoVuelo) {
        this.fechaUltimoVuelo = fechaUltimoVuelo;
    }

    public String getCarguero() {
        return carguero;
    }

    public void setCarguero(String carguero) {
        this.carguero = carguero;
    }

    public UnidadMedida getTonelaje() {
        return tonelaje;
    }

    public void setTonelaje(UnidadMedida tonelaje) {
        this.tonelaje = tonelaje;
    }

    public boolean isUltraSonico() {
        return ultraSonico;
    }

    public void setUltraSonico(boolean ultraSonico) {
        this.ultraSonico = ultraSonico;
    }
    
    @Override
    public String toString(){
        return "Nombre del avión:"+nombre+"\nTotal de horas en vuelo:"+horasVuelos+"\nListo para volar:"+listo
                +"\nDatos extra:"+datosExtra+"\nFecha del utimo vuelo:"+fechaUltimoVuelo+"\nCarguero:"+carguero
                +"\nTonelaje:"+tonelaje.toString()+"\nUltra Sonico:"+ultraSonico+"\n-----------------------------------------";
    }
}
