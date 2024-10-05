import java.util.Scanner;

public class AnalizadorTexto {
    public static void main(String[] args) {
        System.out.println("ingrese el numero");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        int[] frecuencia = new int[26];
        int totalnumeros = 0;
        for (int i = 0; i < numero.long(); i++) {
            int c = numero;
            if (c >= '1' && c <= '9') {
                frecuencia[c - '1']++;
                totalnumeros++;
                }
        }
        System.out.println("Total de numeros: " + totalnumeros);;         
    } 
    
    }
 
