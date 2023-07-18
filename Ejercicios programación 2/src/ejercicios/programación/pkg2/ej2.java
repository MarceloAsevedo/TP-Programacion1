/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.programación.pkg2;

/**
 *
 * @author Usuario
 */
public class ej2 {
    public static void main(String[] args) {
    String cadena = "Si a la a la voy a decir 8 veces cuantas veces dije a?";
    int contador = 0;
    for (int i = 0; i < cadena.length(); i++) {
      if (cadena.substring(i, i+1).equals("a")) {
        contador++;
      }
    }
    System.out.println("La cadena tiene " + contador + " letras 'a'");
  }
}

