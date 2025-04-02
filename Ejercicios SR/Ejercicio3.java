/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lvce.sesion02;

import javax.swing.JOptionPane;

/**
 *
 * @author Laia Carrillo
 */
public class Ejercicio3 {
    public static void main(String[] args) {

        double numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un número real: "));
        char caracter = JOptionPane.showInputDialog("Ingrese un carácter (n, u, m, K, M, G): ").charAt(0);

        double factor;
        
        switch (caracter) {
            case 'n':
                factor = 0.000000001;
                break;
            case 'u':
                factor = 0.000001;
                break;
            case 'm':
                factor = 0.001;
                break;
            case 'K':
                factor = 1000.0;
                break;
            case 'M':
                factor = 1000000.0;
                break;
            case 'G':
                factor = 1000000000.0;
                break;
            default:
                factor = Double.NaN;
        }

        double resultado = numero * factor;

        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
    }
}
