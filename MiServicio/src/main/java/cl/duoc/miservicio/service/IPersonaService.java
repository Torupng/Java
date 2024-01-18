/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cl.duoc.miservicio.service;

import cl.duoc.miservicio.models.Persona;

/**
 *
 * @author Cetecom
 */
public interface IPersonaService {
    //Esconde el codigo de la clase Service en una ventana sin codigo por seguridad
    //final = constante
    public void Guardar(Persona p);
    public void Borrar(int i);
    public void ImprimirLista();
}
