/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package cl.duoc.zoologico;

import cl.duoc.zoologico.models.Animal;
import cl.duoc.zoologico.models.Entrada;
import cl.duoc.zoologico.models.Visitante;
import cl.duoc.zoologico.utils.TipoAnimal;
import cl.duoc.zoologico.utils.TipoEntrada;

/**
 *
 * @author Cetecom
 */
public class Zoologico {

    public static void main(String[] args) {
        Visitante visita = new Visitante();
        Entrada nueva = new Entrada();
        Animal animal = new Animal();
        
        visita.setNombre("Carlos");
        visita.setApellido("Aravena");
        visita.setRut("13564112-k");
        visita.setFechaNacimiento(1997, 5, 22);
        visita.setAnimalFavorito(true);
        
        nueva.setFecha(2023, 2, 11);
        nueva.setTipoEntrada(TipoEntrada.normal);
        nueva.setValor(20000);
        
        animal.setNombre("Luna");
        animal.setEdad(2013, 5, 24);
        animal.setTipo(TipoAnimal.pinguino);
        animal.setTipoClima("Frio");
        
        
        
        System.out.println(visita);
        System.out.println(nueva);
        System.out.println(animal);
    }
}
