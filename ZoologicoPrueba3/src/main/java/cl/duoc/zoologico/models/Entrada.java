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
    private int codigo = 1;//ID
    private Visitante visita;
    private LocalDate fecha;
    private int tipo;
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
    
    public Entrada(int codigo, Visitante visita, LocalDate fecha,int tipo, double valor, boolean colacion) {
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

    public void setCodigo(int codigo) {
        if(Validacion.numEntrada(codigo)){
            this.codigo = codigo;
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

    public LocalDate getFecha() {
        return fecha;
    }
    
    public void setFecha(int anio, int mes, int dia){
        LocalDate fecha = LocalDate.of(anio, mes, dia);
        if(Validacion.ValFechaEntrada(fecha)){
            this.fecha = fecha;
        }else{
            System.out.println("fecha erronea");
        }
    }
    
    public int getTipo(){
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
        String mensaje = "\n------------------------------------"+"\nCorrelativo de entrada:"+codigo+"\nVisitante:"+visita
                +"\nFecha:"+fecha+"\nTipo de entrada:"+tipo+"\nIncluye colacion:"+colacion
                +"\nValor:"+valor+"\n------------------------------------";
        
        return mensaje;
    }
}
