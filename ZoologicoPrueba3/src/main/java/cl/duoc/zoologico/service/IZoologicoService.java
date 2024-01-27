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
    
    public void guardarAnimales(Animal animal);
    public void guardarAmbiente(Ambiente ambiente);
    public void guardarVisitantes(Visitante visita);
    public void guardarEntradas(Entrada entrada);
}
