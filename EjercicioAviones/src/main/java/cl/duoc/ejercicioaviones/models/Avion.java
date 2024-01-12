/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.ejercicioaviones.models;

import cl.duoc.ejercicioaviones.utils.TipoAvion;
import cl.duoc.ejercicioaviones.utils.Validacion;
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
    private LocalDate fechaUltimoVuelo;
    private TipoAvion tipo;
    
    
    private int tonelaje;
    private boolean ultraSonico;
    private String datosExtra;

    public Avion() {
        this.id = id++;
        this.nombre = "------";
        this.horasVuelos = LocalTime.of(0, 0);
        this.listo = false;
        this.datosExtra = "-----------";
        this.fechaUltimoVuelo = LocalDate.now();
        this.tonelaje = 0;
        this.ultraSonico = false;
    }
    
    
    public Avion(int id, String nombre, LocalTime horasVuelos, boolean listo, String datosExtra, LocalDate fechaUltimoVuelo, int tonelaje, boolean ultraSonico) {
        this.id = id++;
        this.nombre = nombre;
        this.horasVuelos = horasVuelos;
        this.listo = listo;
        this.datosExtra = datosExtra;
        this.fechaUltimoVuelo = fechaUltimoVuelo;
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
    
    public void setFechaUltimoVuelo(int anio, int mes, int dia) {
        boolean fechas = Validacion.valFecha(fechaUltimoVuelo);
        
        if(fechas){
            this.fechaUltimoVuelo = LocalDate.of(dia, mes, anio);
        }else{
            System.out.println("Ocurrio un error al ingresar la fecha");
        }
    }

    public int getTonelaje() {
        return tonelaje;
    }

    public void setTonelaje(int tonelaje) {
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
        String mensaje = "Nombre del avión:"+nombre+"\nTotal de horas en vuelo:"+horasVuelos+"\nListo para volar:"+listo
                +"\nDatos extra:"+fechaUltimoVuelo;
        
        if(this.tipo == TipoAvion.avion){
            mensaje += "\nDatos extra:"+datosExtra;
        }else if(this.tipo == TipoAvion.avioneta){
            mensaje += "\nUltra Sonico:"+ultraSonico;
        }else if(this.tipo == TipoAvion.carguero){
            mensaje += "\nTonelaje:"+tonelaje;
        }
        
        mensaje += "\n-----------------------------------------";
        
        return mensaje;
    }
}
