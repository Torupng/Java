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

    @Override
    public void EditarAnimal(Animal a, int i) {
        this.listaAn.add(i,a);
    }

    @Override
    public void EditarAmbiente(Ambiente a, int i) {
        this.listaAmb.add(i,a);
    }

    @Override
    public void EditarVisita(Visitante v, int i) {
        this.listaVisita.add(i,v);
    }

    @Override
    public void EditarEntrada(Entrada e, int i) {
        this.listaEntrada.add(i,e);
    }

    @Override
    public void EliminarAnimales(int i) {
        this.listaAn.remove(i);
    }

    @Override
    public void EliminarAmbiente(int i) {
        this.listaAmb.remove(i);
    }

    @Override
    public void EliminarVisitante(int i) {
        this.listaVisita.remove(i);
    }

    @Override
    public void EliminarEntrada(int i) {
        this.listaEntrada.remove(i);
    }

    @Override
    public void MostrarListaAnimal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void MostrarListaAmbiente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void MostrarListaVsisita() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void MostrarListaEntrada() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
