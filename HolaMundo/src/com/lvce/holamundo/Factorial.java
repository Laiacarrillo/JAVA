/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lvce.holamundo;

import java.util.Scanner;

/**
 *
 * @author yorle
 */
public class Factorial {
    public long calculo(int num){
        long fact = 1;
        if (num == 0 || num == 1) return 1;
        for (int i=1; i <= num; i++){
            fact *= i; //fact = fact * i
        }
        return fact;
    }  


class PruebaFactorial{
    public static void main(String[] args) {
        Factorial fac = new Factorial();
        
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Ingrese un numero? ");
        int num = Integer.parseInt(scn.nextLine());
        
        System.out.println("El factorial de " + num + " es: " + fac.calculo(num));
        
        scn.close();
    }
}

