/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lvce.sesion07.EjemploVehiculo;

/**
 *
 * @author yorle
 */
public class EjecutaVehiculo {
    public static void main(String[] args) {
        // Automovil
        Automovil automovil = new Automovil(120, "Volvo 550", 4, 4, 4);
        automovil.mostrar();
        automovil.pruebaMotor();
         // Moto
        Motocicleta moto = new Motocicleta(120, "Italika", 2, 2);
        moto.mostrar();
        moto.pruebaMotor();
        
         // Autobus
        Autobus bus = new Autobus(250, "Mercedez", 6, 30, 2, 15);
        bus.mostrar();
        bus.pruebaMotor();
    }
            
    
}
