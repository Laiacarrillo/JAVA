/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lvce.sesion06.accesibilidad;

/**
 *
 * @author yorle
 */
public class Complejo {

    private double real;
    private double img;
    private final String i;

    public Complejo() {
        real = 0.0;
        img = 0.0;
        i = "i";
    }

    public Complejo(double real, double img) {
        this.real = real;
        this.img = img;
        i = (this.img != 0) ? "i" : "";
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImg() {
        return img;
    }

    public void setImg(double img) {
        this.img = img;
    }

    public Complejo sumar(Complejo c1) {
        return new Complejo(this.real + c1.getReal(), this.img + c1.getImg());
    }

    public Complejo restar(Complejo c1) {
        return new Complejo(this.real + c1.getReal(), this.img + c1.getImg());
    }

    public String imprimir() {
        /*String strReal = (real != 0) ? String.valueOf(real) : "";
        String strImg = (img != 0) ? 
                            (img != 1) ? String.valueOf(img) + "i" : "i"
                            : "";
         */

        String strReal = (real != 0) ? String.valueOf(real) : "";

        String strImg = "";
        return "(" + strReal + " + " + strImg + ")";
    }
}

class PruebaComplejo {

    public static void main(String[] args) {
        Complejo c1 = new Complejo(3, 2);
        Complejo c2 = new Complejo(4, 1);

        System.out.println(c1.imprimir() + " + "
                + c2.imprimir() + " = "
                + c1.sumar(c2).imprimir());

        c1.setReal(2);
        c1.setImg(-2);
        c2.setReal(2);
        c2.setImg(3);
        System.out.println(c1.imprimir() + " + "
                + c2.imprimir() + " = "
                + c1.restar(c2).imprimir());
    }
}
