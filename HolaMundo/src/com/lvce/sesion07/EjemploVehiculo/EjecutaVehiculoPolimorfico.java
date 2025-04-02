/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lvce.sesion07.EjemploVehiculo;

/**
 *
 * @author yorle
 */
public class EjecutaVehiculoPolimorfico {
    public static void main(String[] args) {
        // Automovil
        Vehiculo automovil = new Automovil(120, "Volvo 550", 4, 4, 4);
        // automovil.mostrar();
        // automovil.pruebaMotor();
        
        // Moto
        Vehiculo moto = new Motocicleta(120, "Italika", 2, 2);
        // moto.mostrar();
        // moto.pruebaMotor();
        
        // Autobus
        Vehiculo bus = new Autobus(250, "Mercedez", 6, 30, 2, 15);
        // bus.mostrar();
        // bus.pruebaMotor();
        
        Vehiculo[] v = {automovil, moto, bus};
        for(Vehiculo elem : v) {
            elem.mostrar();
            elem.pruebaMotor();
        }
    }
}
