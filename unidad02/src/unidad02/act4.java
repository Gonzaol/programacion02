package unidad02;

import java.util.Scanner;

public class act4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Cantidad de de numeros a introducir");
		int cantidad = sc.nextInt();
		
		int mayores = 0;
		int menores = 0;
		int iguales = 0;
		
		for (int i = 1; i <= cantidad ; i++) {
			System.out.printf("Introduce el numero");
		int numero = sc.nextInt();
		
		if (numero > 0) {
			mayores++;
		} else if (numero < 0) {
			menores++;
		} else {
			iguales++;
		}
		}
		
		System.out.println("Mayores que 0:" + mayores);
		System.out.println("Menores que 0:" + menores);
		System.out.println("Iguales que 0:" + iguales);

	}

}
