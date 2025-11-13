/*
El programa presenta mensaje de "acceso correcto para las placas de vehiculos de 
la provincia del Guayas y Pichincha 
LBA-0010
GBC-0010
GBZ-0101
 */
package ejemplo4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo7 {

    public static void main(String[] args) {
        // 
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.println("Ingrese la placa");
        String ciudad = entrada.nextLine();

        // G   0        
        // U   1
        // A   2 
        // Y   3
        // A   4
        // S   5
        String inicial = ciudad.substring(0, 1); // se obtiene 
        // el primer 
        // caracter de la cadena
        // Si el valor de ciudad es 
        // "Guayas" se obtiene "G"

       if ( inicial.equals("G") || inicial.equals("g")
                || inicial.equals("P")|| inicial.equals("p"))  {
            System.out.printf("%s\n", "acceso correcto");
        } else {
            System.out.printf("%s\n", "acceso incorrecto");
        }

    }
}
