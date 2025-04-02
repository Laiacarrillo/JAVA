package com.lvce.sesion02;

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yorle
 */
public class DialogosIO {
    public static void main(String[] args) {
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un valor real: "));
        
        JOptionPane.showMessageDialog(null, 
                "El valor ingresado fue: "+ num1, 
                "Mensaje de salida",
                JOptionPane.INFORMATION_MESSAGE);
    }
            
}
