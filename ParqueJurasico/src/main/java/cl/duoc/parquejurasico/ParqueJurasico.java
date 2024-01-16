/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package cl.duoc.parquejurasico;

import cl.duoc.parquejurasico.models.Estegosaurio;
import cl.duoc.parquejurasico.models.Tiranosaurio;
import cl.duoc.parquejurasico.models.Velociraptor;

/**
 *
 * @author Cetecom
 */
public class ParqueJurasico {

    public static void main(String[] args) {
        Velociraptor raptor = new Velociraptor();
        Tiranosaurio saurio = new Tiranosaurio();
        Estegosaurio estego = new Estegosaurio();
        
        raptor.setNombre("Carlos");
        raptor.setPeriodo("Jurasico");
        raptor.setCantPatas(4);
        raptor.setRugido(false);
        raptor.setVelocidadCorriendo(6);
        
        
        
        System.out.println(raptor);
    }
}
