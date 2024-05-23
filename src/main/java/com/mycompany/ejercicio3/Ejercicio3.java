package com.mycompany.ejercicio3;

import static com.mycompany.ejercicio3.Extraernombres.extraerNombres;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        LocalDate fecha = LocalDate.now();
        String fechaS = fecha.toString();
        File archivo = new File("rentados.txt");
        Scanner scan = new Scanner(System.in);

        try {
            FileWriter writer = new FileWriter(archivo, true); // Modo de apertura: true para agregar al final del archivo

            Libros[] libros = {
                new Libros("la odisea", 2500),
                new Libros("100 años de soledad", 6500)
            };

            String[] nombres = extraerNombres(libros);

            boolean realizarOtraVenta = true;
            while (realizarOtraVenta) {
                // Mostrar los libros disponibles
                System.out.println("Libros disponibles:");
                for (String nombre : nombres) {
                    System.out.println("Nombre del libro: " + nombre);
                }

                // Solicitar el libro que desea alquilar
                System.out.println("¿Qué libro deseas alquilar?");
                String aBook = scan.nextLine();

                int dayA = 0;
                double total = 0;

                // Verificar si el libro seleccionado está disponible y calcular el total a pagar
                for (String nombre : nombres) {
                    if (aBook.equalsIgnoreCase(nombre)) {
                        System.out.println("¿Por cuántos días lo deseas alquilar?");
                        dayA = scan.nextInt();
                        total = DineroxD.DineroxDia(dayA, libros, aBook);
                        System.out.println("Tu total a pagar es: " + total);
                        scan.nextLine(); // Limpiar el buffer de entrada

                        // Escribir en el archivo
                        String totalS = Double.toString(total);
                        writer.write("NOMBRE DEL LIBRO--TOTALPAGO--FECHA");
                        writer.write("\n");
                        writer.write(nombre);
                        writer.write("-$");
                        writer.write(totalS);
                        writer.write("-");
                        writer.write(fechaS);
                        writer.write("\n");

                        break;
                    }
                }

                // Preguntar si desea realizar otra venta
                System.out.println("¿Deseas realizar otra venta? (si/no)");
                String respuesta = scan.nextLine();
                realizarOtraVenta = respuesta.equalsIgnoreCase("si");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Hubo un error en tu petición");
        }
    }
}
