/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lvce.sesion03.CicloFo;

/**
 *
 * @author yorle
 */
public class CicloForEjemplo02 {
    public static void main(String[] args) {
        //Imprimir los impares que hay desde el 30 hasta el 0
        for (int i=29; i >= 0; i-=2){
            System.out.print(i + ", ");
            
            if (i <= 10 ) break;
        }
        System.out.println("");
    }
    
}
