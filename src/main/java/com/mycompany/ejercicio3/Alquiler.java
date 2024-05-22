package com.mycompany.ejercicio3;

public class Alquiler {
    // Método estático para alquilar un libro
    public static void alquilarLibro(Libros libro) {
        libro.alquilar(); // Llama al método alquilar() de la clase Libros
        System.out.println("El libro '" + libro.getNombre() + "' ha sido alquilado.");
    }

    // Método estático para devolver un libro
    public static void devolverLibro(Libros libro) {
        libro.devolver(); // Llama al método devolver() de la clase Libros
        long tiempoAlquiler = libro.obtenerTiempoAlquiler();
        System.out.println("El libro '" + libro.getNombre() + "' ha sido devuelto.");
        System.out.println("Tiempo de alquiler: " + tiempoAlquiler + " días.");
    }
}
