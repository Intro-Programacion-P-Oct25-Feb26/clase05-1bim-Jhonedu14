/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo6;
import java.util.Scanner;
import java.util.Locale;


/**
 *
 * @author UTPL
 */
public class Ejemplo6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
       String nombre;
        String apellido;
        String usuario;
        String parroquia;
        int edad;
        int dia_pago;
        double total_descuento;
        double total_pagar;
        int mensualidad = 25;

        System.out.println("Ingrese el nombre por favor");
        nombre = entrada.nextLine();

        System.out.println("Ingrese el apellido por favor");
        apellido = entrada.nextLine();

        System.out.println("Ingrese el usuario por favor");
        usuario = entrada.nextLine();

        System.out.println("Ingrese la parroquia por favor");
        parroquia = entrada.nextLine();

        System.out.println("Ingrese la edad por favor");
        edad = entrada.nextInt();

        System.out.println("Ingrese el dia de pago");
        dia_pago = entrada.nextInt();

        if (dia_pago <= 10 && (parroquia.equals("El Valle") || parroquia.equals("El Sagrario")))
        {
            total_descuento = (mensualidad * 0.5);
            total_pagar= (mensualidad - total_descuento);
            
          System.out.printf
                  ("Nombre: %s\nApellido: %s\nUsuario: %s\nEdad: %d\nParroquia:"
                        + " %s\nDía de pago: %d\nMensualidad: $%d\nDescuento: "
                        + "$%.2f\nTotal a pagar: $%.2f\n",
                nombre, apellido, usuario, edad, parroquia, dia_pago 
                 , mensualidad , total_descuento , total_pagar);
            }
         else {System.out.printf(
                "Nombre: %s\nApellido: %s\nUsuario: %s\nEdad: %d\nParroquia:"
                        + " %s\nDía de pago: %d\nMensualidad: $%d\nDescuento: "
                        + "$%.2f\nTotal a pagar: $%.2f\n",
                nombre, apellido, usuario, edad, parroquia, dia_pago 
                 , mensualidad , mensualidad);
         }
         
        
                    
                    
             }
           
                
        
      

       
    }
    

