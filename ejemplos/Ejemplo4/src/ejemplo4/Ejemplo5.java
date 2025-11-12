/*
 Realizar un programa en java que permita presentar un mensaje de: 
acceso correcto, si el valor ingresado para la variable ciudad tiene el valor 
diferente de Loja; caso contrario, presentar un mensaje de acceso incorrecto
 */
package ejemplo4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Expresiones lógicas con cadenas en Java
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.println("Ingrese la ciudad");
        String ciudad = entrada.nextLine(); // Quito

        //quiere decir que el signo de exclamacion es diferente se continua
        if (!ciudad.equals("Loja")) {
            System.out.printf("%s\n", "acceso correcto");
        } else {
            System.out.printf("%s\n", "acceso incorrecto");
        }

        int numero = 10;
        // si el numero es distinto o igual a 10 se pasa a la siguiente linea
        if (numero != 10) {
            System.out.println("correcto");
        }

    }

}
