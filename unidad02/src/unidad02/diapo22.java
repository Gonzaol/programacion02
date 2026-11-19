package unidad02;

import java.util.Scanner;

public class diapo22 {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un número: ");
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println("¿Hoy vamos a ver una peli, Señor Gonzalo?");
        }
    }
}