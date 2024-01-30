/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.zoologico.utils;

import cl.duoc.zoologico.models.Ambiente;
import cl.duoc.zoologico.models.Animal;
import cl.duoc.zoologico.models.Entrada;
import cl.duoc.zoologico.models.Visitante;
import cl.duoc.zoologico.service.IZoologicoService;
import cl.duoc.zoologico.service.ZoologicoService;

/**
 *
 * @author Cetecom
 */
public class Validacion {
    
    public void ValidacionDatosAnimal(Animal dato){
        if(dato == null){
            System.out.println("Se deben ingesar todos los datos");
        }else{
            IZoologicoService serv = new ZoologicoService();
            serv.guardarAnimales(dato);
        }
    }
    
    public void ValidacionDatosAmbiente(Ambiente dato){
        if(dato == null){
            System.out.println("Se deben ingesar todos los datos");
        }else{
            IZoologicoService serv = new ZoologicoService();
            serv.guardarAmbiente(dato);
        }
    }
    
    public void ValidacionDatosVisitante(Visitante dato){
        if(dato == null){
            System.out.println("Se deben ingesar todos los datos");
        }else{
            IZoologicoService serv = new ZoologicoService();
            serv.guardarVisitantes(dato);
        }
    }
    
    public void ValidacionDatosEntrada(Entrada dato){
        if(dato == null){
            System.out.println("Se deben ingesar todos los datos");
        }else{
            IZoologicoService serv = new ZoologicoService();
            serv.guardarEntradas(dato);
        }
    }

}
