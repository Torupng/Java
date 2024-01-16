/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.parquejurasico.models;

/**
 *
 * @author Cetecom
 */
public class Estegosaurio extends Dinosaurio{
    private int cantEspinas;

    public Estegosaurio() {
        super();
        this.cantEspinas = 0;
    }
    
    public Estegosaurio(int cantEspinas, int id, String nombre, String periodo, int cantPatas) {
        super(id, nombre, periodo, cantPatas);
        this.cantEspinas = cantEspinas;
    }

    public int getCantEspinas() {
        return cantEspinas;
    }

    public void setCantEspinas(int cantEspinas) {
        this.cantEspinas = cantEspinas;
    }
    
    @Override
    public String toString(){
        String mensaje = "Estegosaurio"+super.toString()+"\nCantidad de espinas:"+cantEspinas+"\n---------------------";
        return mensaje;
    }
}
