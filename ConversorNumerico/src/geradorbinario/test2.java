
package geradorbinario;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class test2 {
    public static void main (String[] args) throws Exception {
       BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        System.out.print("Digite um número Binário: ");
        int numero = Integer.parseInt(reader.readLine(), 2);
        System.out.print("Número: " + numero);
        System.out.println();
        
        //OUTRO JEITO DE CONVERTER BINÁRIO PARA DECIMAL
        int binario = 0b1000;//8 em binario
        System.out.print("Converte Binário: "+binario);
        System.out.println();
    }
}
