
package geradorbinario;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class test3 {
    
    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        System.out.print("Ente com o número decimal: ");
        int numero = Integer.parseInt(reader.readLine());
        StringBuffer buf = new StringBuffer();
        int base = 2;
        while (numero != 0) {
            int digit = numero %base; //1
            buf.append(digit); //1
            numero = numero/base; //11/2 = 5  
        }
        buf.reverse();
        System.out.println("Número Binário: " + buf);
        System.out.println();
    }
}
