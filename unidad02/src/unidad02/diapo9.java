package unidad02;

import java.util.Scanner;

public class diapo9 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int suma = 0;
	        int contador = 1;

	        System.out.println("Ingrese 10 números enteros:");

	        while (contador <= 10) {
	            System.out.print("Número: ");
	            suma += scanner.nextInt();
	            contador++;
	        }

	        double promedio = (suma * 1) / 10.0;

	        System.out.println("La suma de los valores es: " +  suma);
	        System.out.println("El promedio de los valores es: " + promedio);

	        scanner.close();
	    }
	}   