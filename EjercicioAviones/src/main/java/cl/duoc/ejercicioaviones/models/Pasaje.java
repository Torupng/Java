/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.ejercicioaviones.models;

import cl.duoc.ejercicioaviones.utils.Validacion;
import java.time.LocalDate;

/**
 *
 * @author Cetecom
 */
public class Pasaje {
    private int id;
    private Pasajero pasajero;
    private LocalDate fecha;
    private String codigoVuelo;
    private String origen;
    private String destino;
    private String piloto;
    private Avion aeronave;

    public Pasaje() {
        this.id = 0;
        this.fecha = LocalDate.now();
        this.codigoVuelo = "";
        this.origen = "";
        this.destino = "";
        this.piloto = "";
    }
    
    public Pasaje(int id, Pasajero pasajero, LocalDate fecha, String codigoVuelo, String origen, String destino, String piloto, Avion aeronave) {
        this.id = id;
        this.pasajero = pasajero;
        this.fecha = fecha;
        this.codigoVuelo = codigoVuelo;
        this.origen = origen;
        this.destino = destino;
        this.piloto = piloto;
        this.aeronave = aeronave;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
    public void setFecha(int anio, int mes, int dia) {
        boolean fechas = Validacion.valFecha(fecha);
        
        if(fechas){
            this.fecha = LocalDate.of(dia, mes, anio);
        }else{
            System.out.println("Ocurrio un error al ingresar la fecha");
        }
    }

    public String getCodigoVuelo() {
        return codigoVuelo;
    }

    public void setCodigoVuelo(String codigoVuelo) {
        this.codigoVuelo = codigoVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getPiloto() {
        return piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    public Avion getAeronave() {
        return aeronave;
    }

    public void setAeronave(Avion aeronave) {
        this.aeronave = aeronave;
    }
    
    @Override
    public String toString(){
        return "Vuelo:"+codigoVuelo+"\nPasajero:"+pasajero+"\nFecha de vuelo:"+fecha+"\nOrigen:"+origen
                +"\nDestino:"+destino+"\nNombre del piloto:"+piloto+"\nAvión:"+aeronave+"\n-----------------------------------------";
    }
    
    
}
