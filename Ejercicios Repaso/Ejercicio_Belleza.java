package Ejercicios_Repaso;

import java.util.*;

public class Ejercicio_Belleza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Número de casos de prueba

        while (T-- > 0) {
            int n = sc.nextInt(); // Longitud de la lista
            int k = sc.nextInt(); // Número de intercambios permitidos

            int[] a = new int[n]; // Lista original
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            // Imprime la máxima belleza alcanzable con k intercambios
            System.out.println(calcularMaximaBelleza(a, k));
        }

        sc.close();
    }

    // Calcula la belleza de una lista según la definición del problema
    static int calcularBelleza(int[] a) {
        int belleza = 0;
        for (int i = 0; i < a.length; i++) {
            if ((i % 2) == 0) { // Índice impar (i+1)
                belleza += a[i];
            } else { // Índice par (i+1)
                belleza -= a[i];
            }
        }
        return belleza;
    }

    // Función que intenta maximizar la belleza haciendo hasta k intercambios
    static int calcularMaximaBelleza(int[] a, int k) {
        int n = a.length;

        // Separar en posiciones impares (índices pares) y pares (índices impares)
        List<Integer> impares = new ArrayList<>();
        List<Integer> pares = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                impares.add(a[i]);
            } else {
                pares.add(a[i]);
            }
        }

        // Ordenamos:
        // - impares de menor a mayor (queremos que tengan valores más altos)
        // - pares de mayor a menor (queremos que tengan valores más bajos)
        Collections.sort(impares);
        Collections.sort(pares, Collections.reverseOrder());

        // Hacemos los intercambios más favorables posibles (hasta k veces)
        int cambios = Math.min(k, Math.min(impares.size(), pares.size()));
        for (int i = 0; i < cambios; i++) {
            if (pares.get(i) > impares.get(i)) {
                // Intercambio virtual
                int temp = impares.get(i);
                impares.set(i, pares.get(i));
                pares.set(i, temp);
            } else {
                break; // Ya no mejora la belleza
            }
        }

        // Reconstruimos la nueva lista con los intercambios aplicados
        int[] nuevo = new int[n];
        int iImpar = 0, iPar = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                nuevo[i] = impares.get(iImpar++);
            } else {
                nuevo[i] = pares.get(iPar++);
            }
        }

        // Calculamos la belleza final
        return calcularBelleza(nuevo);
    }
}
