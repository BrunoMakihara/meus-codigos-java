
package geradorbinario;
import java.util.Scanner;
public class GeradorBinario {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        System.out.print("Digite o número a ser transformado em binário: ");
        int numero = in.nextInt();
        String numeroBinario = "";
        int posicao = expoenteBinario(numero);
        
        System.out.print("Números Decimais: ");
        for (int i = posicao; i > -1; i--) {
            int binario = (int) Math.pow(2, i);//O número binário já assume um valor inicial
            if (binario <= numero) {
                numeroBinario += '1';
                System.out.print(binario+" ");
                numero -= binario;
            } else {
                numeroBinario += '0';
            }  
        }
        System.out.println();
        System.out.println("Número Binário: " + numeroBinario);
    }
    
    public static int expoenteBinario(int numero) {
        int base = 1;
        int qtdBase = -1;
        do {
            base *= 2;//VALOR DA CASA DE BITS -> EXEMPLO 8-4-2-1
            qtdBase++;//base máxima a ser elevada para acrescentar o valor 1
        } while (base <= numero);
        return qtdBase;//VALOR DO EXPOENTE -> EXEMPLO 3-2-1-0
    }
    
}
