/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.zoologico.models;

import cl.duoc.zoologico.utils.Validacion;
import cl.duoc.zoologico.utils.TipoEntrada;
import cl.duoc.zoologico.utils.Validacion;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Cetecom
 */
public class Entrada {
    private int correlativo = 1;//ID
    private Visitante visita;
    private TipoEntrada tipoEntrada;
    private LocalDate fecha;
    private double valor;
    private boolean colacion;

    public Entrada() {
        this.correlativo = correlativo+1;
        this.visita = new Visitante();
        this.tipoEntrada = TipoEntrada.sinEntrada;
        this.fecha = LocalDate.now();
        this.valor = 0;
        this.colacion = false;
    }
    
    public Entrada(int correlativo, Visitante visita, TipoEntrada tipoEntrada, LocalDate fecha, double valor, boolean colacion) {
        this.correlativo = correlativo;
        this.visita = visita;
        this.tipoEntrada = tipoEntrada;
        this.fecha = fecha;
        this.valor = valor;
        this.colacion = colacion;
    }

    public int getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(int correlativo) {
        if(Validacion.numEntrada(correlativo)){
            this.correlativo = correlativo;
        }else{
            System.out.println("Error con el correlativo");
        }
    }

    public Visitante getVisita() {
        return visita;
    }

    public void setVisita(Visitante visita) {
        this.visita = visita;
    }

    public TipoEntrada getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(TipoEntrada tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(int anio, int mes, int dia) {
        LocalDate fecha = LocalDate.of(anio, mes, dia);
        
        if(Validacion.ValFechaEntrada(fecha)){
            this.fecha = fecha;
        }else{
            System.out.println("Fecha ingreada es menor a la fecha de hoy");
        }
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if(Validacion.valPrecio(valor)){
            this.valor = valor;
        }else{
            System.out.println("El valor es menor a 10.000");
        }
    }

    public boolean isColacion() {
        return colacion;
    }

    public void setColacion(boolean colacion) {
        this.colacion = colacion;
    }
    
    @Override
    public String toString(){
        String mensaje = "Correlativo de entrada:"+correlativo+"\nVisitante:"+visita
                +"\nTipo de entrada:"+tipoEntrada+"\nFecha:"+fecha+"\nIncluye colacion"+colacion
                +"\nValor:"+valor;
        
        return mensaje;
    }
}
