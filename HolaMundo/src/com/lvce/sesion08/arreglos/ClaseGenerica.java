/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lvce.sesion08.arreglos;

/**
 *
 * @author yorle
 */
public class ClaseGenerica<T> {
    
    private T dato;
    public void add (T dato){
        this.dato = dato;
    }
    public T get(){
        return dato;
    }
}
