package com.mycompany.ejercicio3;

public class Libros {
    private String titulo;
    private int precioPorDia;

    public Libros(String titulo, int precioPorDia) {
        this.titulo = titulo;
        this.precioPorDia = precioPorDia;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getPrecioPorDia() {
        return precioPorDia;
    }

    public int calcularCosto(int dias) {
        return dias * precioPorDia;
    }
}
