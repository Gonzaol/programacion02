package unidad02;

import java.util.Scanner;

public class act2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce una cadena: ");
        String texto = sc.nextLine();

        String entrada1;
        do {
            System.out.print("Introduce el carácter a sustituir: ");
            entrada1 = sc.nextLine();
        } while (entrada1.length() != 1);
        char c1 = entrada1.charAt(0);
        
		
		
	}

}
