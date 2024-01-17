/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.aplicacionesredes.models;

/**
 *
 * @author mangl
 */
public class Twitter extends RedSocial{
    private int id;
    private String historia;
    private boolean estado;

    public Twitter() {
        super();
        this.id = 0;
        this.historia = "";
        this.estado = false;
    }

    public Twitter(int id, String historia, boolean estado, String usuario, String password) {
        super(usuario, password);
        this.id = id;
        this.historia = historia;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Twitter{" + "id=" + id + ", historia=" + historia + ", estado=" + estado + '}';
    }
    
    
}
