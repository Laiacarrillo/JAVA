/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lvce.sesion06.accesibilidad;

/**
 *
 * @author yorle
 */
public class PruebaDispositivo {
    public static void main(String[] args) {
        Dispositivo d = new Dispositivo("Samsung", 200);
        System.out.println("Marca: " + d.getMarca());
        System.out.println("Precio: " + d.getPrecio());
        
        d.serie = "Galaxy";
        System.out.println("Serie: " + d.serie);
    }
    
}
