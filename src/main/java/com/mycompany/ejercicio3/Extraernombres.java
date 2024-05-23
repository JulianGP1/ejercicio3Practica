/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author crono
 */
public class Extraernombres {
      public static String[] extraerNombres(Libros[] libros) {
        String[] nombres = new String[libros.length];
        for (int i = 0; i < libros.length; i++) {
            nombres[i] = libros[i].getTitulo();
        }
        return nombres;
    }
      
}
