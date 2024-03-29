/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.miservicio.service;

import cl.duoc.miservicio.models.Persona;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cetecom
 */
public class PersonaService {
    //Para guardar, imprimir, eliminar, etc.
    List<Persona> lista;
    
    public PersonaService(){
        this.lista = new ArrayList();
    }
    
    public void Guardar(Persona p){
        this.lista.add(p);
    }
    
    public void Borrar(Persona p){
        this.lista.remove(p);
    }
    /*
    public void Borrar(int i){
        this.lista.remove(i);
    }
    por posición del objeto
    */
    
    public void Editar(Persona p, int i){
        this.lista.add(i,p);
    }
    
    public void ImprimirLista(){
        System.out.println("----------------");
        System.out.println("Listado");
        /*System.out.println(lista);*/
        for (Persona p : this.lista){
            System.out.println(p);
        }
        System.out.println("----------------");
    }
}
