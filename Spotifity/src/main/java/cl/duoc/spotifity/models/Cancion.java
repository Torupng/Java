/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.spotifity.models;

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
        this.titulo = "";
        this.artista = "";
        this.duracion = LocalTime.now();
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

    @Override
    public String toString() {
        return "\nCancion:" + titulo + "\nartista:" + artista + "\nduracion:" + duracion + "\nfavorita:" + favorita + "\ndescarga:" + descarga + "\n------------------------";
    }
    
    
}
