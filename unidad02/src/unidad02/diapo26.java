package unidad02;

import java.util.Scanner;

public class diapo26 {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        
        do {
            System.out.print("Introduce un número (entre 1 y 10): ");
            n = sc.nextInt();
        } while (n < 1 || n > 10);
        
        System.out.println("Tabla del " + n);
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " X " + i + " = " + (n * i));
        }
    }
}