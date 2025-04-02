/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lvce.sesion07.EjemploVehiculoAbstracto;

/**
 *
 * @author yorle
 */
public class Automovil extends Vehiculo{
    private int numAsientos = 5;
    private int numPuertas = 1;

    public Automovil(int precioDia, String MarcaModelo, int numLlantas, int numAsientos,
            int numPuertas) {
        super(precioDia, MarcaModelo, numLlantas);
        this.numAsientos = numAsientos;
        this.numPuertas = numPuertas;
        System.out.println("Se ha creado un auto");
    }
    
    @Override
     public void mostrar (){
      super.mostrar();
        System.out.println("Asientos: " + numAsientos);
        System.out.println("Puertas: " + numPuertas);
    }
     @Override
    public void pruebaMotor(){
        super.encenderMotor();
        super.apagarMotor();
        super.funciona();
         System.out.println("Prueba Automovil\n");
    }
    
}
