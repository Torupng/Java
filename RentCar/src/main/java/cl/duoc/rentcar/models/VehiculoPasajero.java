/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.rentcar.models;

/**
 *
 * @author Cetecom
 */
public class VehiculoPasajero extends Vehiculo{
    private int cantPasajeros;

    public VehiculoPasajero() {
        super();
        this.cantPasajeros = 0;
    }
    
    public VehiculoPasajero(int cantPasajeros, int id, int precioArriendo, int cantDias) {
        super(id, precioArriendo, cantDias);
        this.cantPasajeros = cantPasajeros;
    }

    public int getCantPasajeros() {
        return cantPasajeros;
    }

    public void setCantPasajeros(int cantPasajeros) {
        this.cantPasajeros = cantPasajeros;
    }

    @Override
    public String toString() {
        return "VehiculoPasajero{" + "cantPasajeros=" + cantPasajeros + '}';
    }
    
    
}
