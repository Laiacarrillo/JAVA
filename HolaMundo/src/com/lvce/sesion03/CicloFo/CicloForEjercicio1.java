/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lvce.sesion03.CicloFo;

/**
 *
 * @author yorle
 */
  
import java.util.ArrayList;
import java.util.List;

public class CicloForEjercicio1 {
    public static List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                answer.add("FizzBuzz");
            } else if (i % 3 == 0) {
                answer.add("Fizz");
            } else if (i % 5 == 0) {
                answer.add("Buzz");
            } else {
                answer.add(String.valueOf(i));
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 15; 
        System.out.println(fizzBuzz(n));
    }
}
    
