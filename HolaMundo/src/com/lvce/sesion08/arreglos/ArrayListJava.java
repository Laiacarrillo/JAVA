/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lvce.sesion08.arreglos;

import java.util.ArrayList;

/**
 *
 * @author yorle
 */
public class ArrayListJava {
    public static void main(String[] args) {
        ArrayList<String> arrlst = new ArrayList<> ();
        arrlst.add("Colombia");
        arrlst.add("Venezuela");
        arrlst.add(1,"Ecuador");
        
        System.out.println(arrlst);  
        System.out.println(arrlst.get(2));  
        
        // recorrer por elementos
        for (String elem : arrlst){
            System.out.print(elem + ", ");
        }
        System.out.println("");
        
        // recorrer por posiciones
        for (int i = 0; i< arrlst.size(); i ++){
            System.out.print(arrlst.get(i) + "-");
            System.out.println("");
        }
        
        //contains, si existe un elemento
        System.out.println(arrlst.contains("Argentina"));
        
        //buscar y devolver la posicion
        System.out.println(arrlst.indexOf("Venezuela"));
        
        // remueve un elemento
        System.out.println(arrlst.remove("Venezuela"));
        
        //Defino y creo una clase generica que contiene un ArrayList
        ClaseGenerica <ArrayList> cg = new ClaseGenerica<>();
        
        //Agrego el arraylist a la clase generica
        cg.add(arrlst);
        
        //Obtengo un valor de la clase generica
        System.out.println(cg.get().getLast());
    }
}
