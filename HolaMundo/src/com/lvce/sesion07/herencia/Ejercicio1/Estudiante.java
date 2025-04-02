/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lvce.sesion07.herencia.Ejercicio1;

/**
 *
 * @author Laia
 */
public class Estudiante extends Persona {
    private int matricula;
    private double promedio;
    private String licenciatura;

    public Estudiante(String nombre, int edad, String sexo, int matricula, double promedio, String licenciatura) {
        super(nombre, edad, sexo);
        this.matricula = matricula;
        this.promedio = promedio;
        this.licenciatura = licenciatura;
    }

    
    
    public void DatosDeAlumno() {
        MostrarDatos();
        System.out.println("Matrícula: " + matricula);
        System.out.println("Promedio: " + promedio);
        System.out.println("Licenciatura: " + licenciatura);
    }
}
