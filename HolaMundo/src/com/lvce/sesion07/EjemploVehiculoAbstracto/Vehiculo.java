/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lvce.sesion07.EjemploVehiculoAbstracto;

/**
 *
 * @author yorle
 */
public abstract class Vehiculo {
    protected int precioDia;
    protected String MarcaModelo;
    protected int numLlantas;

    public Vehiculo(int precioDia, String MarcaModelo, int numLlantas) {
        this.precioDia = precioDia;
        this.MarcaModelo = MarcaModelo;
        this.numLlantas = numLlantas;
    }
    
    public void mostrar (){
        System.out.println("Marca: " + MarcaModelo);
        System.out.println("Precio: " + precioDia);
        System.out.println("Numero de Llantas: " + numLlantas);
        
    }
    public void encenderMotor(){
        System.out.println("El motor se encendio");
    }
    public void apagarMotor(){
        System.out.println("El motor se apago");
    }
    public void funciona(){
        System.out.println("El motor de " + MarcaModelo + " funciona correctamente");
    }
    abstract void pruebaMotor ();
    
}
