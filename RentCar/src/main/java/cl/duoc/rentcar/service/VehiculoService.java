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
    
    @Override
    public int BoletaCarga(int valor){
        System.out.println("------------------------");
        System.out.println("Detalle de compra");
        int result = valor * IVA / descuentoCarga;
        int resultIva = valor * IVA;
        System.out.println("Valor sin iva:"+valor);
        System.out.println("Valor con iva:"+resultIva);
        System.out.println("Descuento vahiculo de carga:"+descuentoCarga+"%");
        System.out.println("Total:"+result);
        System.out.println("------------------------");
        return valor;
    }
    
    @Override
    public int BoletaPasajero(int valor2){
        System.out.println("------------------------");
        System.out.println("Detalle de compra");
        int result = valor2 * IVA / descuentoPasajero;
        int resultIva = valor2 * IVA;
        System.out.println("Valor sin iva:"+valor2);
        System.out.println("Valor con iva:"+resultIva);
        System.out.println("Descuento vahiculo de carga:"+descuentoPasajero+"%");
        System.out.println("Total:"+result);
        System.out.println("------------------------");
        return valor2;
    }
}
