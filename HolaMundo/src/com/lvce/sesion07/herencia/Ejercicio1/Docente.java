/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lvce.sesion07.herencia.Ejercicio1;

/**
 *
 * @author Laia 
 */
public class Docente extends Persona {
    private int idTrabajador;
    private double salario;
    private String departamento;

    public Docente(String nombre, int edad, String sexo, int idTrabajador, double salario, String departamento) {
        super(nombre, edad, sexo);
        this.idTrabajador = idTrabajador;
        this.salario = salario;
        this.departamento = departamento;
    }

    
    
    public void DatosDocente() {
        MostrarDatos();
        System.out.println("ID del Trabajador: " + idTrabajador);
        System.out.println("Salario: " + salario);
        System.out.println("Departamento: " + departamento);
    }
}
