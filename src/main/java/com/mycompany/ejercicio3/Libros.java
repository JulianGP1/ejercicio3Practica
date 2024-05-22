
package com.mycompany.ejercicio3;

class Libros {
    String nombre;
    String valor;
    int tiempo;
    public Libros(String nombre, String valor,int tiempo) {
        this.nombre = nombre;
        this.valor = valor;
        this.tiempo=tiempo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getValor() {
        return valor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
}
