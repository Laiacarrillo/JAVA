/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lvce.sesion07.herencia.Ejercicio1;

/**
 *
 * @author Laia
 */
public class Persona {
    protected String nombre;
    protected int edad;
    protected String sexo;

    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public void MostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Sexo: " + sexo);
    }
    
}
