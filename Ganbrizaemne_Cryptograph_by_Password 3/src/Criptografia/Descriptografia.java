
package Criptografia;
import java.util.Scanner;

public class Descriptografia {
    
    private static final Conversor mensagem = new Conversor();
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        
        System.out.println("***************************************");
        System.out.println("**** ALGORITMO DE DESCRIPTOGRAFIA *****");
        System.out.println("***************************************");
        System.out.println("");
        
        System.out.print("Digite a chave de Segurança: ");
        String chave = in.nextLine();
        int tamanho = chave.length();
        char[] senha = new char[tamanho];
        for (int i = 0; i < tamanho; i++) {
            senha[i] = chave.charAt(i);
            mensagem.valor(senha, i);
        }
        
        System.out.print("Digite o código: ");
        String codigo = in.nextLine();
        
        int aux = 0;
        int tamanhoTexto = codigo.length();
        char[] letra = new char[tamanhoTexto]; 
        
        for (int i = 0; i < tamanhoTexto; i++) {
            if (aux < tamanho) {
                letra[i] = mensagem.letraDescriptografada(senha, aux, codigo, i);
                aux++;
            } else {
                aux = 0;
                letra[i] = mensagem.letraDescriptografada(senha, aux, codigo, i);
                aux++;
            }
        }
        
        codigo = "";
        for (int i = 0; i < tamanhoTexto; i++) {
            codigo = codigo + letra[i];
        }
        
        for (int i = tamanho -1; i >= 0; i--) {
            codigo = mensagem.descriptografiaSecreta(senha[i], codigo);
        }
        
        System.out.println("Mensagem: " + codigo);
        
    }    
}
