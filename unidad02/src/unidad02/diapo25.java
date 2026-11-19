package unidad02;

import java.util.Scanner;

public class diapo25 {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double suma = 0;
        
        System.out.println("Introduce 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            suma += sc.nextInt();
        }
        
        System.out.printf("Media: " + (suma / 10));
    }
}