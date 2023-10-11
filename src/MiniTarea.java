//JERONIMO RIVERA Y GERALDINE FLOREZ

import java.util.Scanner;

public class MiniTarea {
    public static void main(String[] args){
    scanner input = new Scanner(System.in);
    System.out.print ("Ingresar el Primer Número: ");
    int numero1= input.nextlnt();

        System.out.print ("Ingresar el Segundo Número: ");
        int numero2= input.nextlnt();

        int suma = numero1 + numero2;
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es " + suma);

        int resta = numero1 - numero2;
        System.out.println("La resta de " + numero1 + " y " + numero2 + " es " + resta);

        int multiplicacion = numero1 * numero2;
        System.out.println("La multiplicación de " + numero1 + " y " + numero2 + " es " + multiplicacion);
        if (numero2 != 0) {
            double division = (double)numero1 / (double)numero2;
            System.out.println("La división de " + numero1 + " y " + numero2 + " es " + division);
        } else {
            System.out.println("No es posible dividir por cero.");
        }

        input.close();
    }
}
