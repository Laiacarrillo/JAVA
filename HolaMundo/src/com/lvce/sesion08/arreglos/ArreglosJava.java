/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lvce.sesion08.arreglos;

/**
 *
 * @author yorle
 */
public class ArreglosJava {
    public static void main(String[] args) {
        double [] notas = {70,80,20,100};
        
        double sum = 0.0;
        double prom = 0.0;
        double notaMax = notas [0];
        double notaMin = notas [0];
        
        //Recorrido por posicion
        /* for (int i = 0; i < notas.length; i ++){
            sum += notas[i];
            
            if (notas [i] > notaMax){
                notaMax = notas [i];
            }else if (notas [i] < notaMin){
                notaMin = notas[i];
            }
        }*/   
        for (double nota : notas){
            sum += nota;
            
            if (nota > notaMax){
                notaMax = nota;
            }else if (nota < notaMin){
                notaMin = nota;
            }
        }
        
        prom = sum / notas.length;
        System.out.println("Promedio: " + prom);
        System.out.println("Nota máxima: " + notaMax);
        System.out.println("Nota min: " + notaMin);
    }
    
}
