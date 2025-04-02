/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lvce.sesion02;

/**
 *
 * @author yorle
 */

public class Resistencia {
    public static void main(String[] args) {
        Resistencia res = new Resistencia();
        Scanner res = new Scanner(System.in);

        System.out.print("Ingrese el valor de la resistencia R1: ");
        double r1 = res.nextDouble();

        System.out.print("Ingrese el valor de la resistencia R2: ");
        double r2 = res.nextDouble();

        System.out.print("Ingrese el valor de la resistencia R3: ");
        double r3 = res.nextDouble();
        
        double requivalente = 1 / ((1 / r1) + (1 / r2) + (1 / r3));
        System.out.println("La resistencia equivalente es: " + requivalente + " ohmios");

        res.close();
    }
}
