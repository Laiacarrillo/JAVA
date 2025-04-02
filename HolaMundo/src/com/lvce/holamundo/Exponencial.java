/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lvce.holamundo;

/**
 *
 * @author yorle
 */
public class Exponencial {
    public double calculo(int x){
        double sum = 0;
        Factorial fact = new Factorial();
        
        for(int k=0;k <= 10; k++) {
            sum += Math.pow(x, k) / (double)fact.calculo(k);
        }
        return sum;
    }
}

class PruebaFactorial{
    public static void main(String[] args) {
        Exponencial exp = new Exponencial();
        int x = 1;
        double result = exp.calculo(x);
        System.out.println("exp ("+ x +") = " + result);
        // exp(1) = 2,718281828459
        double expX = Math.exp(x);
        
        if (Math.abs(expX - result) <= 0.0001){
            System.out.println("Precision encontrada. " + Math.abs(expX - result));
    } else{
     System.out.println("Precision no encontrada. " + Math.abs(expX - result));
}
}
}
