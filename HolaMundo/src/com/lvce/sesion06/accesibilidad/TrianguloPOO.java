/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lvce.sesion06.accesibilidad;

/**
 *
 * @author yorle
 */
import java.util.Scanner;
class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public boolean esTriangulo() {
        return (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1);
    }

    public String tipoDeTriangulo() {
        if (lado1 == lado2 && lado2 == lado3) {
            return "Equilátero";
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }
}

public class TrianguloPOO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer lado: ");
        double lado1 = sc.nextDouble();

        System.out.print("Ingrese el segundo lado: ");
        double lado2 = sc.nextDouble();

        System.out.print("Ingrese el tercer lado: ");
        double lado3 = sc.nextDouble();

        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);

        if (triangulo.esTriangulo()) {
            System.out.println("Es un triángulo válido de tipo: " + triangulo.tipoDeTriangulo());
        } else {
            System.out.println("No es un triángulo válido.");
        }

        sc.close();
    }
}
