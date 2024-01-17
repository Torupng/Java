/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.aplicacionesredes.models;

import java.time.LocalDate;

/**
 *
 * @author mangl
 */
public class Insta extends RedSocial{
    private int id;
    private String noticia;
    private LocalDate fecha;

    public Insta() {
        super();
        this.id = 0;
        this.noticia = "";
        this.fecha = LocalDate.now();
    }

    public Insta(int id, String noticia, LocalDate fecha, String usuario, String password) {
        super(usuario, password);
        this.id = id;
        this.noticia = noticia;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNoticia() {
        return noticia;
    }

    public void setNoticia(String noticia) {
        this.noticia = noticia;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Insta{" + "id=" + id + ", noticia=" + noticia + ", fecha=" + fecha + '}';
    }
    
    
}
