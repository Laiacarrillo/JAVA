/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lvce.sesion03.CicloFo;

/**
 *
 * @author yorle
 */
public class CicloForEjemplo01 {
    public static void main(String[] args) {
        //Imprimir los primeros 10 numeros pares
        for (int p=1; p <= 10; p ++){
            int par = 2 * (p-1);
            System.out.print(par + ", ");
        }
        System.out.println("");
        
        for(int p=0; p<=18; p+=2)
            System.out.print(p + ", ");
        System.out.println("");
    }
    
}
