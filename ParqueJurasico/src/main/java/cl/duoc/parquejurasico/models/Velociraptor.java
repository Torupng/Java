/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.parquejurasico.models;

/**
 *
 * @author Cetecom
 */
public class Velociraptor extends Dinosaurio{
    private int velocidadCorriendo;

    public Velociraptor() {
        super();
        this.velocidadCorriendo = 0;
    }
    
    public Velociraptor(int velocidadCorriendo, int id, String nombre, String periodo, int cantPatas, boolean rugido) {
        super(id, nombre, periodo, cantPatas, rugido);
        this.velocidadCorriendo = velocidadCorriendo;
    }

    public int getVelocidadCorriendo() {
        return velocidadCorriendo;
    }

    public void setVelocidadCorriendo(int velocidadCorriendo) {
        this.velocidadCorriendo = velocidadCorriendo;
    }
    
    @Override
    public String toString(){
        String mensaje = "Velociraptor"+super.toString()+"\nVelocidad al correr:"+velocidadCorriendo+"\n---------------------";
        return mensaje;
    }
}
