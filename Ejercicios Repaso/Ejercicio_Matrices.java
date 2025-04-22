package Ejercicios_Repaso;

import java.util.*;

// memoización es donde se guarda el resultado de cálculos que ya se hicieron para no volver a hacerlos de nuevo.

public class Ejercicio_Matrices {
    static int N; // Tamaño de la matriz
    static int[][] matriz; // Matriz que contiene los numeros
    static int[][] dp; // Matriz que guarda el camino más largo

    // 4 direcciones: arriba, abajo, izquierda, derecha
    static int[] dx = {-1, 1, 0, 0}; // dx es para moverse en filas: arriba (-1), abajo (+1)
    static int[] dy = {0, 0, -1, 1}; // dy es para moverse en columnas: izquierda (-1), derecha (+1)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        matriz = new int[N][N]; // para guardar los valores que nos dan
        dp = new int[N][N];  // guarda la mejor solución desde cada celda

        // leer matriz
        for (int i = 0; i < N; i++) // Se recorre por filas y columnas
            for (int j = 0; j < N; j++)
                matriz[i][j] = sc.nextInt();

        int mejorCamino = 0;

        // probar desde cada celda
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                mejorCamino = Math.max(mejorCamino, caminoDesde(i, j)); // Math.max() para quedarnos con el mayor camino posible

        // -1 porque queremos movimientos, no cantidad de valores
        System.out.println(mejorCamino - 1);
    }

    // DFS con memoización
    static int caminoDesde(int x, int y) {
        if (dp[x][y] != 0) return dp[x][y]; // ya lo calculamos

        dp[x][y] = 1; // empieza con 1, es decir, solo esta celda

        // mirar en las 4 direcciones
        for (int d = 0; d < 4; d++) {  //  Recorremos las 4 direcciones: norte, sur, este, oeste
            int nx = x + dx[d];
            int ny = y + dy[d];

            if (dentroDeLaMatriz(nx, ny) && matriz[nx][ny] > matriz[x][y]) {  // Se mueve si estamos dentro de los límites de la matriz
                dp[x][y] = Math.max(dp[x][y], 1 + caminoDesde(nx, ny)); // Se mueve si el valor al que nos queremos mover es estrictamente mayor que el actual
            }
        }

        return dp[x][y]; //  Devolvemos el mejor camino encontrado
    }

    static boolean dentroDeLaMatriz(int x, int y) {  //  Verifica que (x, y) esté dentro de los bordes válidos de la matriz
        return x >= 0 && y >= 0 && x < N && y < N;
    }
}

