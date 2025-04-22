package Ejercicios_Repaso;

import java.util.*;

public class Ejercicio_Magia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leer dimensiones del cuarto superior izquierdo
        int R = sc.nextInt();
        int C = sc.nextInt();
        sc.nextLine(); // Limpia el salto de linea

        // Leer el cuarto superior izquierdo
        char[][] topLeft = new char[R][C];
        for (int i = 0; i < R; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < C; j++) {
                topLeft[i][j] = line.charAt(j); // guarda cada caracter en la matriz topLeft
            }
        }

        // Leer la posición del error (1-indexed)
        int F = sc.nextInt() - 1;
        int K = sc.nextInt() - 1;

        // Crear la carta completa (2R x 2C)
        char[][] full = new char[2 * R][2 * C];

        // Construir topHalf (superior izquierda + reflejo horizontal)
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                full[i][j] = topLeft[i][j];                           // top-left
                full[i][2 * C - j - 1] = topLeft[i][j];              // top-right (reflejo horizontal)
            }
        }

        // Construir bottomHalf (reflejo vertical del topHalf)
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < 2 * C; j++) {
                full[2 * R - i - 1][j] = full[i][j];
            }
        }

        // Aplicar el error (invertir el carácter en F, K)
        full[F][K] = (full[F][K] == '#') ? '.' : '#';

        // Imprimir la carta completa
        for (int i = 0; i < 2 * R; i++) {
            for (int j = 0; j < 2 * C; j++) {
                System.out.print(full[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}
