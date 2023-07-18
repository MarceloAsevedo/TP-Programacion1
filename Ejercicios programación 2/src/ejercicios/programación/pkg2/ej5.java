/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.programación.pkg2;

import java.util.Scanner;
public class ej5 {
      public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] arreglo1 = new int[5];
    int[] arreglo2 = new int[5];
    int[] suma = new int[5];

 
    System.out.println("Ingrese  primer arreglo:");
    for (int i = 0; i < 5; i++) {
      arreglo1[i] = scanner.nextInt();
    }

  
    System.out.println("Ingrese segundo arreglo:");
    for (int i = 0; i < 5; i++) {
      arreglo2[i] = scanner.nextInt();
    }

  
    for (int i = 0; i < 5; i++) {
      suma[i] = arreglo1[i] + arreglo2[i];
    }

    System.out.println("La suma de los dos arreglos es:");
    for (int i = 0; i < 5; i++) {
      System.out.print(suma[i] + " ");
    }
  }
}
