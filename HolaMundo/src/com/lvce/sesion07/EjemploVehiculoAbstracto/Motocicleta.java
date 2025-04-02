/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lvce.sesion07.EjemploVehiculoAbstracto;

import com.lvce.sesion07.EjemploVehiculo.*;
import com.lvce.sesion07.EjemploVehiculo.Automovil;

/**
 *
 * @author yorle
 */
public class Motocicleta extends Vehiculo {
    private int numAsientos = 1;

    public Motocicleta(int precioDia, String marcaModelo, int numLLantas, int numAsientos) {
        super(precioDia, marcaModelo, numLLantas);
        this.numAsientos = numAsientos;
        System.out.println("Se ha credo una Motocicleta");
    }
    
    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Asientos: " + numAsientos);
    }
    @Override
    public void pruebaMotor() {
        super.encenderMotor();
        super.apagarMotor();
        super.funciona();
        System.out.println("Prueba moto\n");
    }
}
