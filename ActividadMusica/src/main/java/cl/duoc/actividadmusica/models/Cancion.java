/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.actividadmusica.models;

import java.time.LocalTime;

/**
 *
 * @author Cetecom
 */
public class Cancion {
    private String titulo;
    private String artista;
    private LocalTime duracion;
    private boolean favorita;
    private boolean descarga;

    public Cancion() {
        this.titulo = "Tomboy";
        this.artista = "(G)idle";
        this.duracion = LocalTime.of(0, 4, 14);
        this.favorita = false;
        this.descarga = false;
    }
    
    public Cancion(String titulo, String artista, LocalTime duracion, boolean favorita, boolean descarga) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
        this.favorita = favorita;
        this.descarga = descarga;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public LocalTime getDuracion() {
        return duracion;
    }

    public void setDuracion(LocalTime duracion) {
        this.duracion = duracion;
    }
    
    public void setDuracion(int minuto, int segundo) {
        this.duracion = LocalTime.of(0, minuto, segundo);
    }

    public boolean isFavorita() {
        return favorita;
    }

    public void setFavorita(boolean favorita) {
        this.favorita = favorita;
    }

    public boolean isDescarga() {
        return descarga;
    }

    public void setDescarga(boolean descarga) {
        this.descarga = descarga;
    }

    public void Adelantar(int segundo){
        this.duracion.plusSeconds(segundo);
    }
    
    public void Retroceder(int segundo){
        this.duracion.minusSeconds(segundo);
    }
    
    public String isLarga(){
        return (this.duracion.getMinute() >= 5 ? "Es larga" : "No es larga");//es un if pero de una sola linea
        //? --> si es igual o mayor a 5
        //: --> representa else
    }
    
    
    @Override
    public String toString(){
        String mensaje = titulo+"\n"+artista+"\n"+duracion+"\nfavorita:"+favorita+"\ndescargada:"+descarga+"\n------------------------------";
        return mensaje;
    }
    
    
}
