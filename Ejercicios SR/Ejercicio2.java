/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lvce.sesion02;

import javax.swing.JOptionPane;

public class Ejercicio2 {
    public static void main(String[] args) {
        long id = Long.parseLong(JOptionPane.showInputDialog("Digite su documento de identidad: "));
        String status = JOptionPane.showInputDialog("Ingrese su estado (A = Activo) o (S = Suspendido)").toUpperCase();
        int estrato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su estrato del 1 al 5: "));

        if (estrato < 1 || estrato > 5) {
            JOptionPane.showMessageDialog(null, 
                "Escoja un estrato del 1 al 5",
                "Error",
                JOptionPane.ERROR_MESSAGE);
            return; 
        }

        switch (status) {
            case "A":
                int tarifa = 0;
                switch (estrato) {
                    case 1: tarifa = 10000; break;
                    case 2: tarifa = 15000; break;
                    case 3: tarifa = 30000; break;
                    case 4: tarifa = 50000; break;
                    case 5: tarifa = 65000; break;
                }
                JOptionPane.showMessageDialog(null,
                        "ID: " + id + "\nEl valor a pagar es: $" + tarifa,
                        "Tarifa básica",
                        JOptionPane.INFORMATION_MESSAGE);
                break;

            case "S":
                JOptionPane.showMessageDialog(null, 
                    "Se encuentra suspendido, el valor a pagar es: $0",
                    "Tarifa básica",
                    JOptionPane.INFORMATION_MESSAGE);
                break;

            default:
                JOptionPane.showMessageDialog(null, 
                    "Estado no válido. Debe ingresar 'A' o 'S'.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}
