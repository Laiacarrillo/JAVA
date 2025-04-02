/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lvce.sesion04.cadenas;

/**
 *
 * @author yorle
 */
public class Cadenas {
    public static void main(String[] args) {
        String cad = "Grupo C4 :D";
        
        // Substring
        System.out.println(cad.substring(6,8));
        
        //IndexOf
        // Devuelve el indice de la primera ocurrencia de una subcadena
        System.out.println(cad.indexOf("C4"));
        
        //toLowerCase
        //Convierte a minuscula toda la cadena
        System.out.println(cad.toLowerCase());
        
        //toUpperCase 
        // Convierte a mayuscula
        System.out.println(cad.toUpperCase());
        
        //trim
        //Elimina los espacios al inicio y al final
        System.out.println("[" + "  Grupo C4 :D".trim()+ "]");
        
        //Equals
        System.out.println(cad.equals("GRUpo c4 :d"));
        
        //Ignora si es mayuscula o minuscula
        System.out.println(cad.equalsIgnoreCase("GRUpo c4 :d"));
         
        //Replace
        //Remplaza una subcadena por otra
        System.out.println(cad.replace("C4", "C3"));
        
        // Split
        // Divide la cadena en un array segun su patron
        for(String elem : cad.split(" "))
        System.out.println(elem + ", ");
        
        System.out.println("");
        
        //Contains
        //Devuelve true o false si cadena contiene a la subcadena
        System.out.println(cad.contains("C4")); //TRUE
        
        //starsWidth()
        // Verifica si la cadena empiexa por la subcadena
        System.out.println(cad.startsWith("Buenos")); // FALSE 
        
        //endWidth()
        // Verifica si esa cadena termina en la subcadena
        System.out.println(cad.endsWith("C3")); // FALSE
        
        //lastIndexOf()
        // Devuelve el indice de la ultima ocurrencia de una subcadena
        System.out.println((cad + ". Animo C4 que vamos para la tarde").lastIndexOf("C4"));
        
        //join
        // Une elementos en una cadena con delimitador
        System.out.println(String.join("-", cad.split(" ")));
        
        //matches
        // Comprueba si la cadena coincide con un expresion regular
        System.out.println(cad.matches(".*\\d+.*"));
        
        //isEmpty()
        //Verifica si esta vacio
        System.out.println(cad.isEmpty());
        System.out.println("  ".isEmpty());
        
        //isBlank()
        // Verifica si la cadena esta vacia o contiene solo espacios
        System.out.println(cad.isBlank());
        System.out.println("  ".isBlank());
        
        //compareTo
        // Compara dos cadenas de forma lexicografica
        System.out.println("Camila".compareTo("CAmila"));
        System.out.println("CAmila".compareTo("Camila"));
        System.out.println("CAmila".compareTo("CAmila"));
        
        //compareToIgnoreCase
        // Compara dos cadenas ignorando si es mayuscula o minuscula
        System.out.println("Camila".compareToIgnoreCase("Maria"));
        System.out.println("Maria".compareToIgnoreCase("Camila"));
        System.out.println("CAmila".compareToIgnoreCase("camila"));
    }
    
}
