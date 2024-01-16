/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.parquejurasico.models;


/**
 *
 * @author Cetecom
 */
public class Dinosaurio {
    private int id = 0;
    private String nombre;
    private String periodo;
    private int cantPatas;

    public Dinosaurio() {
        this.id = id+1;
        this.nombre = "";
        this.periodo = "";
        this.cantPatas = 0;
    }
    
    public Dinosaurio(int id, String nombre, String periodo, int cantPatas) {
        this.id = id;
        this.nombre = nombre;
        this.periodo = periodo;
        this.cantPatas = cantPatas;
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
    
    

    @Override
    public String toString(){
        String mensaje = "\nId:"+id+"\nNombre:"+nombre+"\nPeriodo:"+periodo+"\nCantidad de patas:"+cantPatas;
        return mensaje;
    }
    
    
    public void Rugir(){
        
    }
    
}
