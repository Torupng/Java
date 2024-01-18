/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.rentcar.models;

/**
 *
 * @author Cetecom
 */
public abstract class Vehiculo {
    private int id;
    private int precioArriendo;
    private int cantDias;
    private String patente;

    public Vehiculo() {
        this.id = 0;
        this.precioArriendo = 0;
        this.cantDias = 0;
        this.patente = "";
    }

    public Vehiculo(int id, int precioArriendo, int cantDias, String patente) {
        this.id = id;
        this.precioArriendo = precioArriendo;
        this.cantDias = cantDias;
        this.patente = patente;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrecioArriendo() {
        return precioArriendo;
    }

    public void setPrecioArriendo(int precioArriendo) {
        this.precioArriendo = precioArriendo;
    }

    public int getCantDias() {
        return cantDias;
    }

    public void setCantDias(int cantDias) {
        this.cantDias = cantDias;
    }
    
    public String getPatente(){
        return this.patente;
    }
    
    public void setPatente(String patente){
        this.patente = patente;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "id=" + id + ", precioArriendo=" + precioArriendo + ", cantDias=" + cantDias + '}';
    }
    
    
}
