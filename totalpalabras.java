import java.util.Scanner;
public class totalpalabras {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Ingrese un texto para analizar:");
       String texto = scanner.nextLine().toLowerCase();
       int[] frecuencia = new int[26];
      int totalPalabras=0;
       for (int i = 0; i < texto.length(); i++) {
        char c = texto.charAt(i);
        if (c >= 'a' && c <= 'z') {
            frecuencia[c - 'a']++;
        } else if (c == ' ' && i > 0 && texto.charAt(i - 1) != ' ') {
            totalPalabras++;
        }
    }
    totalPalabras++; 
    System.out.println("Total de palabras: " + totalPalabras);

    }
}       