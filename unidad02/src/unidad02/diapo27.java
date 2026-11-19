package unidad02;

public class diapo27 {
	
    public static void main(String[] args) {
        int suma = 0;
        for (int i = 0; i<=20; i++){
            int impar = 2*i -1;
            suma += impar;

        }
        System.out.println("La suma de los 10 imapares: " + suma);
    }
}