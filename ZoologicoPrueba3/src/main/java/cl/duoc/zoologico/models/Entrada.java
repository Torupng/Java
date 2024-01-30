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
public class Entrada {
    private int codigo = 1000;//ID
    private Visitante visita;
    private LocalDate fecha;
    private String tipo;
    private String colacion;

    public Entrada() {
        this.codigo = codigo+1;
        this.visita = new Visitante();
        this.fecha = LocalDate.now();
        this.tipo = "";
        this.colacion = "";
    }
    
    public Entrada(int codigo, Visitante visita, LocalDate fecha, String tipo, String colacion) {
        this.codigo = codigo;
        this.visita = visita;
        this.fecha = fecha;
        this.tipo = tipo;
        this.colacion = colacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public Visitante getVisita() {
        return visita;
    }

    public void setVisita(String visita) {
        visita = this.visita.getRut();
    }

    public LocalDate getFecha() {
        return fecha;
    }
    
    public void setFecha(int anio, int mes, int dia){
        this.fecha = LocalDate.of(anio, mes, dia);
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getColacion() {
        return colacion;
    }

    public void setColacion(String colacion) {
        this.colacion = colacion;
    }
    
    @Override
    public String toString(){
        String mensaje = "\n------------------------------------"+"\nCorrelativo de entrada:"+codigo+"\nVisitante:"+visita
                +"\nFecha:"+fecha+"\nTipo de entrada:"+tipo+"\nIncluye colacion:"+colacion+"\n------------------------------------";
        
        return mensaje;
    }
}
