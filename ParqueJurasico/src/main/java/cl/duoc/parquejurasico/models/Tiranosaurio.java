/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.parquejurasico.models;

/**
 *
 * @author Cetecom
 */
public class Tiranosaurio extends Dinosaurio{
    private int cantColmillos;

    public Tiranosaurio() {
        super();
        this.cantColmillos = 0;
    }

    public Tiranosaurio(int cantColmillos, int id, String nombre, String periodo, int cantPatas) {
        super(id, nombre, periodo, cantPatas);
        this.cantColmillos = cantColmillos;
    }

    public int getCantColmillos() {
        return cantColmillos;
    }

    public void setCantColmillos(int cantColmillos) {
        this.cantColmillos = cantColmillos;
    }
    
    @Override
    public String toString(){
        String mensaje = "Tiranosaurio"+super.toString()+"\nCantidad de colmillos:"+cantColmillos+"\n---------------------";
        return mensaje;
    }
            
}
