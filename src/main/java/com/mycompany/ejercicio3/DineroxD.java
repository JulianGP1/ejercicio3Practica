
package com.mycompany.ejercicio3;

public class DineroxD {
    static double DineroxDia(int dayA,Libros[] libros,String nombre){
          int total=dayA;

        for (Libros libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(nombre)) {
                total=libro.getPrecioPorDia()*dayA;
                
            }
        }
        return total;
    };
}
