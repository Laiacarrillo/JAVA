package com.lvce.sesion08.arreglos;

import java.util.Arrays;

public class MatricesJava {
    public static void imprimeMatriz(int[][] mat) {
        for(int f = 0; f < mat.length; f++) {
            for(int c = 0; c < mat[f].length; c++) {
                System.out.print( mat[f][c] + "\t");
            }
            System.out.println("");
        }
    } 
    
    public static void imprimeDiagPrincipal(int[][] mat) {
        for(int f = 0; f < mat.length; f++) {
            for(int c = 0; c < mat[f].length; c++) {
                if (f == c) {
                    System.out.print( mat[f][c] + "\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        int[][] matriz = {{1,2,3}, {4,5,6}, {7,8,9}};
        
        /*matriz[0][0] = 1;
        matriz[1][0] = 2;
        matriz[2][0] = 2;*/
        
        imprimeMatriz(matriz);
        
        System.out.println("");
        
        imprimeDiagPrincipal(matriz);
        
        System.out.println(Arrays.toString(matriz[0]));
        
        // Transpuesta de una matriz * EJERCICIO *
        
        //Sort
        String[] names = {"Oscar", "America", "Ana"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        
        Arrays.sort(names, (String o1, String o2) -> o1.length() - o2.length());
        System.out.println(Arrays.toString(names));
        
        int[][] matIdent = creaMatrizIdentidad(5, 10);
        imprimeMatriz(matIdent);

        
    }

    private static int[][] creaMatrizIdentidad(int f, int c) {
        int[][] matTemp = new int[f][c];
        
        for(int i=0; i<f; i++) {
            Arrays.fill(matTemp[i], 1);
        }
        
        return matTemp;
    }
}
