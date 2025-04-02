/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lvce.sesion02;

/**
 *
 * @author yorle
 */
public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = b--;
        
        System.out.println("c: " + c);
        System.out.println("b: " + b);
        
        c = a * 2 + 50 % 10 + --b;
        System.out.println("c: " + c);
    }
}

