/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lvce.sesion07.EjemploVehiculo;

/**
 *
 * @author yorle
 */
public class Autobus extends Vehiculo{
    private int numAsientos = 41;
    private int numPuertas;
    private int numVentanillas;
    

    public Autobus(int precioDia, String MarcaModelo, int numLlantas, int numAsientos,
            int numPuertas, int numVentanillas) {
        super(precioDia, MarcaModelo, numLlantas);
        this.numAsientos = numAsientos;
        this.numPuertas = numPuertas;
        this.numVentanillas = numVentanillas;
        System.out.println("Se ha creado un bus");
    }
    
    @Override
     public void mostrar (){
      super.mostrar();
        System.out.println("Asientos: " + numAsientos);
        System.out.println("Puertas: " + numPuertas);
        System.out.println("Ventanillas: " + numVentanillas);
    }
    public void pruebaMotor(){
        super.encenderMotor();
        super.apagarMotor();
        super.funciona();
        System.out.println("Prueba bus\n");
    }
    
}
