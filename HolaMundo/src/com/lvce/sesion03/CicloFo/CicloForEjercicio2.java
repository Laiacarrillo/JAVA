/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lvce.sesion03.CicloFo;

/**
 *
 * @author yorle
 */
import java.util.Scanner;

public class CicloForEjercicio2 {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        int aprobadas = 0, reprobadas = 0, totalCalificaciones = 0;
        double suma = 0;

        System.out.println("Voy a contar las calificaciones aprobadas.");
        System.out.println("Teclea las calificaciones (termina con -1)");

        while (true) {
            int calificacion = scr.nextInt();
            if (calificacion == -1) {
                break;
            }
            suma += calificacion;
            totalCalificaciones++;

            if (calificacion >= 6) {
                aprobadas++;
            } else {
                reprobadas++;
            }
        }

        scr.close();

        if (totalCalificaciones > 0) {
            double promedio = suma / totalCalificaciones;
            System.out.println("Obtuviste " + aprobadas + " calificacion(es) aprobatoria(s) y "
                    + reprobadas + " calificacion(es) reprobatoria(s).");
            System.out.printf("Tu promedio fue: %.2f%n", promedio);
        } else {
            System.out.println("No ingresaste calificaciones.");
        }
    }
}
