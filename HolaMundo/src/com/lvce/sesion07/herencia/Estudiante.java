/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lvce.sesion07.herencia;

/**
 *
 * @author yorle
 */
public class Estudiante extends Usuario {
    private String codigoEstudiante;

    public Estudiante(String codigoEstudiante, String nombre, String documento) {
        super(nombre, documento);
        this.codigoEstudiante = codigoEstudiante;
    }

    public String getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(String codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }
    
    @Override
    public String getNombre (){
        return super.nombre.toUpperCase();
    }
    
    
}
