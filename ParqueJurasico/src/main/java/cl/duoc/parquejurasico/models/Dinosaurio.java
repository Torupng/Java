/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.parquejurasico.models;

import cl.duoc.parquejurasico.utils.Validacion;

/**
 *
 * @author Cetecom
 */
public class Dinosaurio {
    private int id = 0;
    private String nombre;
    private String periodo;
    private int cantPatas;
    private boolean rugido;

    public Dinosaurio() {
        this.id = id+1;
        this.nombre = "";
        this.periodo = "";
        this.cantPatas = 0;
        this.rugido = false;
    }
    
    public Dinosaurio(int id, String nombre, String periodo, int cantPatas, boolean rugido) {
        this.id = id;
        this.nombre = nombre;
        this.periodo = periodo;
        this.cantPatas = cantPatas;
        this.rugido = rugido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public int getCantPatas() {
        return cantPatas;
    }

    public void setCantPatas(int cantPatas) {
        this.cantPatas = cantPatas;
    }
    
    public boolean getRugido(){
        return rugido;
    }
    
    public void setRugido(boolean rugido){
        Validacion val = new Validacion();
        this.rugido = val.rugir(rugido);
    }

    @Override
    public String toString(){
        String mensaje = "\nId:"+id+"\nNombre:"+nombre+"\nPeriodo:"+periodo+"\nCantidad de patas:"+cantPatas
                +"\nRuge?:";
                
                if(rugido == true){
                    mensaje += "Si ruge";
                }else{
                    mensaje += "No ruge";
                }
        return mensaje;
    }
    
}
