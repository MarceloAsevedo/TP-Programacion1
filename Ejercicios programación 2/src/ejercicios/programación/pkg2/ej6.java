/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.programación.pkg2;


  import java.util.Scanner;

public class ej6 {
  


  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] pesos = new int[10];
    int suma = 0;

   
    System.out.println("Ingrese los pesos de los contenedores:");
    for (int i = 0; i < 10; i++) {
      pesos[i] = scanner.nextInt();
      suma += pesos[i];
    }

  
    double promedio = suma / 10.0;

  
    int porencima = 0;
    int pordebajo = 0;
    for (int i = 0; i < 10; i++) {
      if (pesos[i] > promedio) {
        porencima++;
      } else if (pesos[i] < promedio) {
        pordebajo++;
      }
    }

 
    System.out.println("El peso promedio de los contenedores es: " + promedio);
    System.out.println("Hay " + porencima + " contenedores por encima del promedio.");
    System.out.println("Hay " + pordebajo + " contenedores por debajo del promedio.");
  }

}
