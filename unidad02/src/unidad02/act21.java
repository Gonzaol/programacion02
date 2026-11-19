package unidad02;

import java.util.Scanner;

public class act21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca un numero entero positivo:");
        long numero = sc.nextLong();
        
        int contador = 0;
        long suma = 0;
        
        while (numero > 0) {
            long digito = numero % 10;
            
            if (digito % 2 == 0) {
                contador++;
                suma = suma + digito;
            }
            
            numero = numero / 10;
        }
        
        System.out.println("Cantidad de digitos pares: " + contador);
        System.out.println("Suma de los digitos pares: " + suma);
    }
}