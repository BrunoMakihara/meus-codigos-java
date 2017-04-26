
package crackeador.de.senhas;
import java.util.Scanner;
public class CrackeadorDeSenhas {
    
    private static final Combinacoes crackeador = new Combinacoes();
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String password = "2016";
        String senha = "";
        
        System.out.println("1 - Senha de Números");
        System.out.println("2 - Senha de Letras Minúsculas");
        System.out.println("3 - Senha de Letras Maiúsculas");
        System.out.println("4 - Senha de Carácteres Especiais");
        System.out.println("5 - Senha de Carácteres Específicos");
        System.out.println("");
        System.out.print("Digite a opção desejada: ");
        int opcao = in.nextInt();
        System.out.print("Digite o tamanho da senha: ");
        int tamanho = in.nextInt();
        System.out.println("");
        switch (opcao) {
            case 1:
                senha = crackeador.bibliotecaNumeros(tamanho, password);
                break;
            case 2:
                senha = crackeador.bibliotecaMinuscula(tamanho, password);
                break;
            case 3:
                senha = crackeador.bibliotecaMaiucula(tamanho, password);
                break;
            case 4:
                senha = crackeador.bibliotecaCaracteresEspeciais(tamanho, password);
                break;
            case 5:
                System.out.print("Digite a quantidade de carácteres específicos: ");
                int quantidade = in.nextInt();
                char biblioteca[] = new char[quantidade];
                for (int i = 0; i < quantidade; i++) {
                    System.out.print("Digite o "+(i+1)+"º carácter: ");
                    biblioteca[i] = in.next().charAt(0);
                }
                senha = crackeador.bibliotecaManual(tamanho, biblioteca, password);
                break;
            default:
                break;
        }
        if (!senha.equals("")) {
            System.out.println("Senha desbloqueada com sucesso!!! A senha é " + senha);
        } else {
            System.out.println("Infelizmente não foi possível quebrar a senha!!!");
        }
        System.out.println("Quantidade de tentativas: " + Combinacoes.quantidade);
    }
}
