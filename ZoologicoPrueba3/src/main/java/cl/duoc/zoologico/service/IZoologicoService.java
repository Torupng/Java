/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cl.duoc.zoologico.service;

import cl.duoc.zoologico.models.Ambiente;
import cl.duoc.zoologico.models.Animal;
import cl.duoc.zoologico.models.Entrada;
import cl.duoc.zoologico.models.Visitante;

/**
 *
 * @author mangl
 */
public interface IZoologicoService {
    //C
    public void guardarAnimales(Animal animal);
    public void guardarAmbiente(Ambiente ambiente);
    public void guardarVisitantes(Visitante visita);
    public void guardarEntradas(Entrada entrada);
    
    //R
    public Animal MostrarListaAnimal();
    public Ambiente MostrarListaAmbiente(int posicion);
    public Visitante MostrarListaVisisita(int posicion);
    public Entrada MostrarListaEntrada(int posicion);
    
    //U
    public void EditarAnimal(Animal a, int i);
    public void EditarAmbiente(Ambiente a, int i);
    public void EditarVisita(Visitante v, int i);
    public void EditarEntrada(Entrada e, int i);

    //D
    public void EliminarAnimales(int i);
    public void EliminarAmbiente(int i);
    public void EliminarVisitante(int i);
    public void EliminarEntrada(int i);
}
