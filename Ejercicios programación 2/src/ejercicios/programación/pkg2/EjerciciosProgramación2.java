/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios.programación.pkg2;

/**
 *
 * @author Usuario
 */
import java.util.Random; //para poder cargar numeros aleatorios al arreglo
public class EjerciciosProgramación2 {

    public static void main(String[] args) {
        
        int[] numeros = new int[5];
        Random rand = new Random();
        
        for (int i=1; i<numeros.length; i++){
            numeros[i] = rand.nextInt(100);}
       

       
        int minimo = numeros[0];
        int maximo = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }

        System.out.println("El número mínimo es: " + minimo);
        System.out.println("El número máximo es: " + maximo);
    }

}

