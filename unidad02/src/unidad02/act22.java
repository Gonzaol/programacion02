package unidad02;

import java.util.Scanner;

public class act22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca una cadena:");
        String cadena = sc.nextLine();
        String resultado = "";
        
        for (int i = 0; i < cadena.length(); i++) {
            String letra = cadena.charAt(i) + "";
            
            if (letra.equals(letra.toUpperCase())) {
                resultado = resultado + letra.toLowerCase();
            } else {
                resultado = resultado + letra.toUpperCase();
            }
        }
        
        System.out.println("Cadena convertida: " + resultado);
    }
}