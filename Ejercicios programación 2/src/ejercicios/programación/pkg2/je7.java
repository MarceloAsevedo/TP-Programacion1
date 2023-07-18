
package ejercicios.programación.pkg2;
import java.util.Scanner;
public class je7 {
   public static void main(String[] args) {
       System.out.println("Escriba una operación par hacer"); 
       Scanner scanner = new Scanner(System.in);
        String cadena = scanner.nextLine();
        int total = 0;
        int nro = 0;
        char signo = '+';
        
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (caracter >= '0' && caracter <= '9') {
                nro = caracter - '0'; //Si no pongo el -'0' me da cualquier cosa el resultado, preguntar a profe, me hizo renegar como 1hora jaja
            } else if (caracter == '+' || caracter == '-') {
                if (signo == '+') {
                    total = nro + total;
                } else {
                    total= total - nro;
                }
               
            } else if (caracter == '=') {
                 if (signo == '+') {
                    total = nro + total;
                } else {
                    total= total - nro;
                }
                System.out.println("El resultado es "+total);
                break;
            }
        }
        
    }
}