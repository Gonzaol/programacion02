package unidad02;

import java.util.Scanner;

public class act5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		int totalNum = 0;
		int sumaImp = 0;
		int contadorImp = 0;
		int mayorPar = 0;
		
		do {
			System.out.println("Introduzca un numero positivo (0 para acabar):");	
				numero = sc.nextInt();
			
			if (numero > 0) {
				totalNum++;
			
			if (numero % 2 != 0) {
				sumaImp = sumaImp + numero;
					contadorImp++;
			
			} else {
				if (numero > mayorPar) {
					mayorPar = numero;
			}  
			}
			}
			
			
		} while (numero != 0);
		
		System.out.print("Hay un total &d de numeros \n");
		
		if (contadorImp > 0);
		
	}

}
