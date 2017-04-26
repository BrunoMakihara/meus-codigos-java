
package geradorbinario;
import java.util.Scanner;

public class test4 {
    
    public static void main (String[] args) throws Exception {
        Scanner in = new Scanner (System.in);
        int rest;
        System.out.print("Digite um número decimal: ");
        String numero = in.nextLine();
        int decimal = Integer.parseInt(numero);
        String hexa = "";
        
        while(decimal != 0) {
            rest = decimal %16;
            decimal = decimal/16;
            hexa += Hexadecimal(rest);
        }
        String aux = "";
        for (int i = hexa.length()-1; i > -1; i--) {
            aux += hexa.charAt(i);
        }
        System.out.print("Número Hexadecimal: " + aux);
        System.out.println("");
    }
    
    public static String Hexadecimal (int rest) {
        switch (rest) {
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
                return ""+rest;
        }
    }     
}
