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
public class Ejercicio4 {
    public static void main(String[] args) {
        int year = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un año"));
        
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            JOptionPane.showMessageDialog(null, "El año es bisiesto.");
        } else {
            
            JOptionPane.showMessageDialog(null, "El año no es bisiesto.");
            
        }
        
    }
}
