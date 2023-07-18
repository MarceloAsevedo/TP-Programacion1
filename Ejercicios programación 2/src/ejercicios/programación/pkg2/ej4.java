/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.programación.pkg2;
import java.util.Scanner; //para leer los numeros
public class ej4 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] nombres = new String[5];
    int[] edades = new int[5];
    double[] alturas = new double[5];

   
    for (int i = 0; i < 5; i++) {
      System.out.println("Ingrese los datos de la persona " + (i+1));
      System.out.print("Nombre: ");
      nombres[i] = scanner.nextLine();
      System.out.print("Edad: ");
      edades[i] = scanner.nextInt();
      System.out.print("Altura (en metros): ");
      alturas[i] = scanner.nextDouble();
      scanner.nextLine(); 
    }
   
    int masedad = edades[0];
    String nombremasedad = nombres[0];
    for (int i = 1; i < 5; i++) {
      if (edades[i] > masedad) {
        masedad = edades[i];
        nombremasedad = nombres[i];
      }
    }
    double masaltura = alturas[0];
    String nombremasaltura = nombres[0];
    for (int i = 1; i < 5; i++) {
      if (alturas[i] > masaltura) {
        masaltura = alturas[i];
        nombremasaltura = nombres[i];
      }
    }

    System.out.println("La persona de mayor edad es: " + nombremasedad);
    System.out.println("La persona de mayor altura es: " + nombremasaltura);
  }
}

