/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.zoologico.service;

import cl.duoc.zoologico.models.Ambiente;
import cl.duoc.zoologico.models.Animal;
import cl.duoc.zoologico.models.Entrada;
import cl.duoc.zoologico.models.Visitante;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mangl
 */
public class ZoologicoService implements IZoologicoService{
    
    List<Animal> listaAn;
    List<Ambiente> listaAmb;
    List<Visitante> listaVisita;
    List<Entrada> listaEntrada;
    
    public void ZoologicoService(){
        listaAn = new ArrayList();
        listaAmb = new ArrayList();
        listaVisita = new ArrayList();
        listaEntrada = new ArrayList();
    }

    @Override
    public void guardarAnimales(Animal animal) {
        this.listaAn.add(animal);
    }

    @Override
    public void guardarAmbiente(Ambiente ambiente) {
        this.listaAmb.add(ambiente);
    }

    @Override
    public void guardarVisitantes(Visitante visita) {
        this.listaVisita.add(visita);
    }

    @Override
    public void guardarEntradas(Entrada entrada) {
        this.listaEntrada.add(entrada);
    }
    
}
