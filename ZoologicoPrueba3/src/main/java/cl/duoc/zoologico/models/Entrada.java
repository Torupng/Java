/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.zoologico.models;

import cl.duoc.zoologico.utils.Validacion;
import java.time.LocalDate;

/**
 *
 * @author Cetecom
 */
public class Entrada {
    private int codigo = 1000;//ID
    private Visitante visita;
    private LocalDate fecha;
    private long tipo;
    private double valor;
    private boolean colacion;

    public Entrada() {
        this.codigo = codigo+1;
        this.visita = new Visitante();
        this.fecha = LocalDate.now();
        this.tipo = 1;
        this.valor = 0;
        this.colacion = false;
    }
    
    public Entrada(int codigo, Visitante visita, LocalDate fecha,int tipo, long valor, boolean colacion) {
        this.codigo = codigo;
        this.visita = visita;
        this.fecha = fecha;
        this.tipo = tipo;
        this.valor = valor;
        this.colacion = colacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public Visitante getVisita() {
        return visita;
    }

    public void setVisita(Visitante visita) {
        this.visita = visita;
    }

    public LocalDate getFecha() {
        return fecha;
    }
    
    public void setFecha(int anio, int mes, int dia){
        this.fecha = LocalDate.of(anio, mes, dia);
    }
    
    public long getTipo(){
        return this.tipo;
    }
    
    public void setTipo(int tipo){
        if(tipo == 1){
            String mensaje = "Premuim";
        }else if(tipo == 2){
            String mensaje = "Normal";
        }else{
            System.out.println("No se ah elegido el tipo de entrada");
        }
    }

    public double getValor() {
        return valor;
    }

    public void setValor(long valor) {
        this.valor = valor;
    }

    public boolean isColacion() {
        return colacion;
    }

    public void setColacion(boolean colacion) {
        this.colacion = colacion;
    }
    
    @Override
    public String toString(){
        String mensaje = "\n------------------------------------"+"\nCorrelativo de entrada:"+codigo+"\nVisitante:"+visita
                +"\nFecha:"+fecha+"\nTipo de entrada:"+tipo+"\nIncluye colacion:"+colacion
                +"\nValor:"+valor+"\n------------------------------------";
        
        return mensaje;
    }
}
