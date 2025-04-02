/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lvce.sesion02;

/**
 *
 * @author yorle
 */

public class ServicioAgua {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Ingrese el documento de identidad: ");
        String documento = scr.nextLine();

        System.out.print("Ingrese el estado del usuario (A = Activo, S = Suspendido): ");
        char estado = scr.next().charAt(0);

        System.out.print("Ingrese el estrato (1-5): ");
        int estrato = scr.nextInt();
        int tarifaBasica = 0;
        
            if (estado == 'A' || estado == 'a') {
            switch (estrato) {
                case 1:
                    tarifaBasica = 10000;
                    break;
                case 2:
                    tarifaBasica = 15000; 
                    break;
                case 3:
                    tarifaBasica = 30000;
                    break;
                case 4:
                    tarifaBasica = 50000;
                    break;
                case 5:
                    tarifaBasica = 65000;
                    break;
                default:
                    System.out.println("Estrato no válido.");
                    return; 
                    
        System.out.println("El valor a pagar por tarifa básica es: $" + tarifaBasica);
        scr.close();

    }
}
