
package ejercicios.programación.pkg2;
import java.util.Scanner;
public class ej8 {
     public static void main(String[] args) {
         System.out.println("Multiplicar matrices hasta 3x3"); 
        
int filasA, columA, filasB, columB;
do {
  Scanner scanner = new Scanner(System.in);
  System.out.println("Cantidad de filas de la matriz A"); 
  filasA = scanner.nextInt();
  System.out.println("Cantidad de columnas de la matriz A"); 
  columA = scanner.nextInt();
  System.out.println("Cantidad de filas de la matriz B"); 
  filasB = scanner.nextInt();
  System.out.println("Cantidad de columnas de la matriz B"); 
  columB = scanner.nextInt();
  
  if (columA != filasB) {
    System.out.println("Las matrices no se pueden multiplicar, probá de nuevo.");
  }
  else if (filasA > 3 || columA > 3 || filasB > 3 || columB > 3) {
    System.out.println("Las dimensiones de las matrices no pueden ser mayores a 3, probá de nuevo.");
  }
} while (columA != filasB || filasA > 3 || columA > 3 || filasB > 3 || columB > 3);
    
     int[][] matrizA = new int[filasA][columA];
     int[][] matrizB = new int[filasB][columB];
     Scanner scanner = new Scanner(System.in);
     System.out.println("Rellene la matriz A"); 
     for (int i = 0; i < filasA; i++) {
  for (int j = 0; j < columA; j++) {
    System.out.print("Ingrese el valor de la posición [" + (i+1) + "][" + (j+1) + "]: ");
    matrizA[i][j] = scanner.nextInt();
  }
}
     System.out.println("Rellene la matriz B"); 
         for (int i = 0; i < filasB; i++) {
  for (int j = 0; j < columB; j++) {
    System.out.print("Ingrese el valor de la posición [" + (i+1) + "][" + (j+1) + "]: ");
    matrizB[i][j] = scanner.nextInt();
  }
}
               int[][] matrizResultado = new int[filasA][columB];
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columB; j++) {
                int suma = 0;
                for (int k = 0; k < columA; k++) {
                    suma += matrizA[i][k] * matrizB[k][j];
                }
                matrizResultado[i][j] = suma;
            }}
         System.out.println("El resultado de la multiplicación de las matrices es:");
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columB; j++) {
                System.out.print( matrizResultado[i][j] + " ");
            }
            System.out.println();
     
        }}
     }