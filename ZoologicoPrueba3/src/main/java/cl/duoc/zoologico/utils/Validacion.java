/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.zoologico.utils;

import cl.duoc.zoologico.models.Ambiente;
import cl.duoc.zoologico.models.Animal;
import cl.duoc.zoologico.models.Entrada;
import cl.duoc.zoologico.models.Visitante;
import cl.duoc.zoologico.service.IZoologicoService;
import cl.duoc.zoologico.service.ZoologicoService;
import java.time.LocalDate;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Cetecom
 */
public class Validacion {

    
    public static boolean isValidChileanRut(String rut) {
        Pattern pattern = Pattern.compile("^[0-9]+-[0-9Kk]$");
        Matcher matcher = pattern.matcher(rut);

        if (!matcher.matches()) {
            return false;
        }

        String[] rutParts = rut.split("-");
        String rutNumber = rutParts[0];
        String dv = rutParts[1];

        return calculateDV(rutNumber).equalsIgnoreCase(dv);
    }

    private static String calculateDV(String rut) {
        int suma = 0;
        int multiplicador = 2;

        for (int i = rut.length() - 1; i >= 0; i--) {
            suma += Integer.parseInt(String.valueOf(rut.charAt(i))) * multiplicador;
            multiplicador = multiplicador == 7 ? 2 : multiplicador + 1;
        }
        int dvInt = 11 - suma % 11;
        return dvInt == 11 ? "0" : dvInt == 10 ? "K" : String.valueOf(dvInt);
    }

    public static boolean isValidAge(int age) {
        return age >= 1 && age <= 120;
    }
    
    public static boolean validarChipUnico(int chip, List<Animal> listaAnimales) {
        for (Animal animal : listaAnimales) {
            if (animal.getChip() == chip) {
                return false; 
            }
        }
        return true; 
    }}
