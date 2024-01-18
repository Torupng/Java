/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.rentcar.models;

/**
 *
 * @author Cetecom
 */
public class VehiculoCarga extends Vehiculo{
    private float capacidad;

    public VehiculoCarga() {
        super();
        this.capacidad = 0;
    }

    public VehiculoCarga(float capacidad, int id, int precioArriendo, int cantDias) {
        super(id, precioArriendo, cantDias);
        this.capacidad = capacidad;
    }
    
    public float getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(float capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Carga{" + "capacidad=" + capacidad + '}';
    }
    
    
}
