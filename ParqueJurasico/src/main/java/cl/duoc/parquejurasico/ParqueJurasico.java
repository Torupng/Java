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
        raptor.setVelocidadCorriendo(6);
        
        saurio.setNombre("Pepito");
        saurio.setPeriodo("Jurasico");
        saurio.setCantPatas(4);
        saurio.setCantColmillos(30);
        
        estego.setNombre("Ramòn");
        estego.setPeriodo("Jurasico");
        estego.setCantPatas(2);
        estego.setCantEspinas(40);
        
        
        System.out.println(saurio);
        System.out.println(raptor);
        System.out.println(estego);
    }
}
