/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package cl.duoc.rentcar;

import cl.duoc.rentcar.models.VehiculoCarga;
import cl.duoc.rentcar.models.VehiculoPasajero;
import cl.duoc.rentcar.service.VehiculoService;

/**
 *
 * @author Cetecom
 */
public class RentCar {

    public static void main(String[] args) {
        VehiculoCarga vc = new VehiculoCarga();
        
        vc.setId(1);
        vc.setPatente("YG12D4");
        vc.setPrecioArriendo(20000);
        vc.setCantDias(5);
        vc.setCapacidad(3);
        
        VehiculoPasajero vp = new VehiculoPasajero();
        
        vp.setId(2);
        vp.setPatente("HW14F5");
        vp.setPrecioArriendo(40000);
        vp.setCantDias(5);
        vp.setCantPasajeros(3);
        
        
        VehiculoService vserv = new VehiculoService();
        vserv.Guardar(vc);
        vserv.Guardar(vp);
        vserv.ImprimirVehiculo();
        vserv.BoletaCarga(vc.getPrecioArriendo());
        vserv.BoletaPasajero(vp.getPrecioArriendo());
        
    }
}
