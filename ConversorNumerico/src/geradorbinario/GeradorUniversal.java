package geradorbinario;
import java.util.Scanner;
public class GeradorUniversal {
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int base = 16;//número ternário
        System.out.print("Digite um número: ");
        int numero = in.nextInt();
        conversorUniversal(numero, base);
    }
    
    public static void conversorUniversal(int numero, int base) {
        int expoente = 0;
        int auxNumero = numero;
        do {
            expoente++;
        } while (Math.pow(base, expoente) < numero+1);  
        expoente--;
        String numeroConversao = "";
        String aux;
        for (int i = expoente; i > -1; i--) {
            int numerico = (int) Math.pow(base, i);
            if (numerico <= numero && numerico != 1) {//ternario != 1, porque o i tem que ser diferente de ZERO
                for (int j = base -1; j > -1; j--) {
                    if (numerico *j <= numero) {
                        aux = Hexadecimal(j);
                        numeroConversao += aux;
                        numero -= numerico *j;
                        j = -1;//FUNCIONA COMO SE FOSSE UM BREAK
                    }
                }
            } else {
                if (numero < base && i == 0) {//garante que o número corresponde ao resto
                    aux = Hexadecimal(numero);
                    numeroConversao += aux;
                } else {
                    numeroConversao += '0';
                }
            } 
        }
        System.out.println(auxNumero + " na Base " + base + ": " + numeroConversao);
    }
    
    public static String Hexadecimal (int numero) {
        switch (numero) {
            case 10:
                return "A";
            case 11:
                return "B";
            case 12:
                return "C";
            case 13:
                return "D";
            case 14: 
                return "E";
            case 15:
                return "F";
            default:
                return ""+numero;
        }
    } 
}
