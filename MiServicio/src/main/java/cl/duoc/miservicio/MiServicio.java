/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package cl.duoc.miservicio;

import cl.duoc.miservicio.models.Persona;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cetecom
 */
public class MiServicio {

    public static void main(String[] args) {
        Persona p = new Persona(1,"Carlos","Jimenez");
        Persona p2 = new Persona(1,"Sofia","Ruiz");
        
        List<Persona> pe = new ArrayList();
        pe.add(p);
        pe.add(p2);
        
        System.out.println(p);
        System.out.println(p2);
        
        System.out.println(pe);
    }
}
