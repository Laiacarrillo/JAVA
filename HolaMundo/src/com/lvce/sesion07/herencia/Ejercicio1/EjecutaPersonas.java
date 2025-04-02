/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lvce.sesion07.herencia.Ejercicio1;

/**
 *
 * @author Laia
 */
public class EjecutaPersonas {
    public static void main(String[] args) {
        // Estudiante
        Estudiante estudiante1 = new Estudiante("Carlos", 20, "Masculino", 12345, 8.5, "Ingeniería");
        Estudiante estudiante2 = new Estudiante("Ana", 22, "Femenino", 67890, 9.0, "Medicina");
        Estudiante estudiante3 = new Estudiante("Luis", 21, "Masculino", 11223, 7.8, "Arquitectura");
        
        // Docente
        Docente docente1 = new Docente("María", 40, "Femenino", 1001, 25000, "Matemáticas");
        Docente docente2 = new Docente("José", 45, "Masculino", 1002, 27000, "Física");
        Docente docente3 = new Docente("Elena", 38, "Femenino", 1003, 26000, "Química");
        
        // Mostrar datos
        System.out.println("=== ESTUDIANTES: === \n");
        estudiante1.DatosDeAlumno();
        System.out.println("\n -------------------");
        estudiante2.DatosDeAlumno();
        System.out.println("\n -------------------");
        estudiante3.DatosDeAlumno();
        System.out.println("\n -------------------");
        System.out.println("=== DOCENTES: === \n");
        docente1.DatosDocente();
        System.out.println("\n -------------------");
        docente2.DatosDocente();
        System.out.println("\n -------------------");
        docente3.DatosDocente();
        System.out.println("\n -------------------");
        
    }
}
