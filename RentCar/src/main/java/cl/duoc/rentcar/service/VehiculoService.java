/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.rentcar.service;

import cl.duoc.rentcar.models.Vehiculo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cetecom
 */
public class VehiculoService implements IVehiculo{
    List<Vehiculo> lista;
    
    public void VehiculoService(){
        this.lista = new ArrayList();
    }
    
    public void Guardar(Vehiculo v){
        this.lista.add(v);
    }
    
    public void ImprimirVehiculo(){
        System.out.println("-------------------");
        System.out.println("Lista de Vehiculos");
        for(Vehiculo v : this.lista){
            System.out.println(v);
        }
        System.out.println("-------------------");
    }
    
    public void BoletaCarga(int valor){
        System.out.println("------------------------");
        System.out.println("Detalle de compra");
        int result = valor * IVA / descuentoCarga;
        System.out.println("Valor sin iva:"+valor);
        System.out.println("Valor con iva:");
    }
}
