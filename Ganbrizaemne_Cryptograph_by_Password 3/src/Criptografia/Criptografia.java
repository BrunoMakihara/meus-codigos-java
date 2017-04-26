
package Criptografia;
import java.util.Scanner;

public class Criptografia {

    private static final Conversor codigo = new Conversor();
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        
        System.out.println("***************************************");
        System.out.println("****** ALGORITMO DE CRIPTOGRAFIA ******");
        System.out.println("***************************************");
        System.out.println("");
        
        System.out.print("Digite a chave de Segurança: ");
        String chave = in.nextLine();
        int tamanho = chave.length();
        char[] senha = new char[tamanho];
        for (int i = 0; i < tamanho; i++) {
            senha[i] = chave.charAt(i);
            codigo.valor(senha, i);
        }
        
        System.out.print("Digite a Mensagem: ");
        String mensagem = in.nextLine();

        for (int i = 0; i < tamanho; i++) {
            mensagem = codigo.criptografiaSecreta(senha[i], mensagem);
        }
        //*/
        int aux = 0;
        int tamanhoTexto = mensagem.length();
        char[] letra = new char[tamanhoTexto];   
        
        for (int i = 0; i < tamanhoTexto; i++) {
            if (aux < tamanho) {
                letra[i] = codigo.letraCriptografada(senha, aux, mensagem, i);
                aux++;
            } else {
                aux = 0;
                letra[i] = codigo.letraCriptografada(senha, aux, mensagem, i);
                aux++;
            }
        }
        
        mensagem = "";
        for (int i = 0; i < tamanhoTexto; i++) {
            mensagem = mensagem + letra[i];
        }//*/
        
        System.out.println("Código: " + mensagem);
           
    }   
}
