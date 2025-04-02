/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lvce.sesion06.accesibilidad;

/**
 *
 * @author yorle
 */
public class Dispositivo {
    private String marca;
    private double precio;
    String serie;

    public Dispositivo(String marca, double precio) {
        this.marca = marca;
        this.precio = precio;
        this.serie = "";
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String imprimir() {
        return "Dispositivo{" + "marca=" + marca + ", precio=" + precio + ", serie=" + serie + '}';
    }
    
    
    
    
}
