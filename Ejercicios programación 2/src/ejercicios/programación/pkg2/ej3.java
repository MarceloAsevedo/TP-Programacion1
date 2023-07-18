/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.programación.pkg2;

/**
 *
 * @author Usuario
 */
import java.util.Scanner; //para leer los numeros
public class ej3 {
    
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double[] arreglo = new double[10];
    double suma = 0;
    double promedio;
    for (int i = 0; i < arreglo.length; i++) {
      System.out.print("Ingrese número " + (i+1) + ": ");
      arreglo[i] = scanner.nextDouble();
      suma += arreglo[i];
    }
    promedio = suma / arreglo.length;
    System.out.println("El promedio de los números es: " + promedio);
  }
}

