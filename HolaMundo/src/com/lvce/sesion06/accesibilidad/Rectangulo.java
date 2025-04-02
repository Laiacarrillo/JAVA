/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lvce.sesion06.accesibilidad;

/**
 *
 * @author yorle
 */
public class Rectangulo {
    private double largo;
    private double ancho;

    public Rectangulo() {
        largo = 1;
        ancho = 1;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) throws Exception {
        if (largo >= 0 && largo <= 20 )
            this.largo = largo;
        else
            throw new Exception("El valor del largo no está en el rango [0, 20]");
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        if (ancho >= 0 && ancho <= 20 )
            this.ancho = ancho;
    }

    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }
    
    public double getPerimetro() {
        return largo + ancho;
    }
    
    public double getArea() {
        return largo * ancho;
    }
    
}

class pruebaRectangulo{
    public static void main(String[] args) {
        Rectangulo r = new Rectangulo(10, 30);
        System.out.println("El perimetro es: " + r.getPerimetro());
        r.setAncho(-2);
        System.out.println("El area es: " + r.getArea());
    }
}
