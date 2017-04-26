
package autenticidadegenerator;
import java.util.Scanner;

public class AutenticidadeGenerator {
    
    private static final Criptografia codigo = new Criptografia();

    public static void main(String[] args) {
        //Declaração das variáveis utilizadas para gerar duas senhas
        Scanner in = new Scanner (System.in);
        String palavra;
        String chave;
        String codigo1;
        String codigo2;
        String senha1;
        String senha2;     
        
        System.out.print("Digite uma palavra: ");
        palavra = in.nextLine();        //cria uma senha com o mesmo tamaho da chave

        System.out.print("Digite uma chave de criptografia: ");
        chave = in.nextLine();
        
        int tamanho = chave.length();
        char[] senha = new char[tamanho];
        for (int i = 0; i < tamanho; i++) {
            senha[i] = chave.charAt(i);
            codigo.valor(senha, i);
        }
        
        //criptografa a palavra inteira em uma das 10 bibliotecas
        for (int i = 0; i < tamanho; i++) {
            palavra = codigo.criptografiaSecreta(senha[i], palavra);
        }

        //Criptografa cada letra da palavra com uma biblioteca diferente baseada no indice
        //correspondente da letra da chave
        int aux = 0;
        int tamanhoTexto = palavra.length();
        char[] letra = new char[tamanhoTexto];   
        
        for (int i = 0; i < tamanhoTexto; i++) {
            if (aux < tamanho) {
                letra[i] = codigo.letraCriptografada(senha, aux, palavra, i);
                aux++;
            } else {
                aux = 0;
                letra[i] = codigo.letraCriptografada(senha, aux, palavra, i);
                aux++;
            }
        }
        palavra = "";
        for (int i = 0; i < tamanhoTexto; i++) {
            palavra = palavra + letra[i];
        }
        //O código será criptografado duas vezes para gerar duas senhas uma de hoje e uma de ontém
        //System.out.println("Código: " + palavra);
        
        //gera um número de 0 a 41, com base na soma de dia + mes;
        //depois calcula o módulo de 10 para poder criptografar
        //esse número vai criptografar o código de acordo com o dia
        int numero = codigo.confirma();
        senha1 = codigo.criptografiaSecreta2(numero, palavra);
        senha2 = codigo.criptografiaSecreta2(numero +7, palavra);//7 significa que a senha vai ser a mesma daqui 7 dias
        
        //Mensagem que exibe as 2 senhas geradas de acordo com a palavra e o código combinado
        System.out.println("O código 1 é: " + senha1);
        System.out.println("O código 2 é: " + senha2);
        System.out.println();
        
        //----------------------------------------------------------------------
        //DICA: a senha de hoje e a de ontem tem a mesma quantidade de letras que a palavra
        //ATENÇÃO, nem sempre a senha de hoje, será amanhã a senha de ontém !!!
        //ÍNICIO DO SIMULADOR DE CHAT UM PERGUNTA A SENHA PARA O OUTRO
        do {
            System.out.print("Digite o código 1? ");
            codigo1 = in.nextLine();
        } while (!codigo1.equals(senha1));
        do {
            System.out.print("Digite o código 2? ");
            codigo2 = in.nextLine();
        } while (codigo2.length() != tamanhoTexto);
        System.out.println();
        
        //Informa se a pessoa é autêntica ou não
        if (senha1.equals(codigo1)&&senha2.equals(codigo2)) {
            System.out.println("COMUNICAÇÃO SEGURA!!!");
        } else {
            System.err.println("COMUNICAÇÃO INSEGURA!!!");
        } 
    }   
}
