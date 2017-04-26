package crackeador.de.senhas;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Combinacoes {
    
    static int quantidade;
    
    //<editor-fold defaultstate="collapsed" desc="Crackeador de Senhas"> 
    public String crackeadorAutomatico(int tamanho, char[]biblioteca, String password) {
        String senha = "";
        char pedacoSenha[] = new char[biblioteca.length];//vetor que armazena todos os carácteres
        char positionSenha[] = new char[tamanho];//posição do caráctere da combinação
        
        for (int i = 0; i < biblioteca.length; i++) {
            pedacoSenha[i] = biblioteca[i];//atribui os valores possiveis de caracterres ao vetor
        }
        
        int aux = biblioteca.length;
        boolean completo = false;
        for (int i = 0; i < biblioteca.length; i++) {
            for (int j = tamanho -1; j >= 0; j--) {//posição do caractér da combinação
                if (j == 0) {
                    completo = true;
                }
                for (int k = 0; k < aux; k++) {//k = variação dos carácteres por casa
                    positionSenha[j] = pedacoSenha[k];//cada caracter da senha troca de valor 10 vezes
                    
                    if (completo) {//Se o vetor de combinação estiver completo, faz o if1111111
                        //JUNTA TODAS AS LETRAS E TRANSFORMA EM UMA COMBINAÇÃO
                        for (int l = 0; l < tamanho; l++) {
                            senha += positionSenha[l];
                        }
                        //VERIFICA SE O GERADOR DE COMBINAÇÕES CONSEGUIU CRACKEAR A SENHA
                        System.out.println(senha); 
                        quantidade++;
                        if (senha.equals(password)) {
                            return senha;
                        } 
                    }   
                    senha = "";
                }      
            }
            aux--;
        }       
        return "";
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Crackeador de Senhas 2"> 
    public String crackeadorAutomatico2(int tamanho, char[]biblioteca, String password) {
        quantidade = 0;
        List<String> tentativas = new ArrayList<>();
        geradorDeCombinacoes(tentativas, biblioteca, tamanho, "");//GERA SENHAS DO TAMANHO DESEJADO
        for (String palavra : tentativas) {
            System.out.println(palavra);
            quantidade++;
            if (palavra.equals(password)) {
                return palavra;
            }
        }               
        return "";
    }
    //</editor-fold> //USADO PARA CRACKEAR SENHAS
    
    //<editor-fold defaultstate="collapsed" desc="Gerador Base Tentativas"> 
    public String geradorBaseTentativas(int tamanho, char[]biblioteca, String password) {
        try {
            quantidade = 0;
            List<String> tentativas = new ArrayList<>();
            geradorDeCombinacoes(tentativas, biblioteca, tamanho, "");//GERA COMBINAÇÕES DO TAMANHO DESEJADO
            String arquivo = EscolherArquivo.caminho();
            BufferedWriter saida;
            saida = new BufferedWriter(new FileWriter(arquivo, true));
            saida.write("\r\n");
            saida.write("BIBLIOTECA - TENTATIVAS DE CRACKEAMENTO");
            saida.write("\r\n");
            saida.write("___________________________________________");
            saida.write("\r\n");
            saida.write("\r\n");
            for (String palavra : tentativas) {
                quantidade++;
                saida.write(palavra);
                saida.write("\r\n");
                if (palavra.equals(password)) {
                    saida.write("\r\n");
                    saida.write("Quantidade de Tentativas: " + quantidade);
                    saida.flush();
                    saida.close();
                    return palavra;
                }
            }
            saida.write("\r\n");
            saida.write("Quantidade de Tentativas: " + quantidade);
            saida.flush();
            saida.close();
            return "";
        } catch (IOException ex) {
            Logger.getLogger(Combinacoes.class.getName()).log(Level.SEVERE, null, ex);
            return "";
        }
    }
    //</editor-fold> //USADO PARA SALVAR TENTATIVAS
    
    //<editor-fold defaultstate="collapsed" desc="Gerador de Combinações"> 
    public static void geradorDeCombinacoes(List<String> tentativas, char[]biblioteca, int tamanho, String combinacaoCrackeada) { 
        String aux = combinacaoCrackeada;//aux recebe vazio
        for (int i = 0; i < biblioteca.length; i++) { 
            aux += biblioteca[i]; 
            if (aux.length() == tamanho) { //faça isso, quando a combinação crackeada estiver pronta
                tentativas.add(aux); 
                aux = combinacaoCrackeada; 
            } else { //senão continua o processo de formação da combinação crackeada
                geradorDeCombinacoes(tentativas, biblioteca, tamanho, aux); 
                aux = combinacaoCrackeada; 
            } 
        } 
    }
    //</editor-fold>
    
    
    //<editor-fold defaultstate="collapsed" desc="Biblioteca de Números"> 
    public String bibliotecaNumeros (int tamanho, String password) {
        char biblioteca[] = {'0','1','2','3','4','5','6','7','8','9'};
        String senha = crackeadorAutomatico2(tamanho, biblioteca, password);
        return senha;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Biblioteca de Letras Minúsculas"> 
    public String bibliotecaMinuscula (int tamanho, String password) {
        char biblioteca[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r'
                ,'s','t','u','v','w','x','y','z'};
        String senha = crackeadorAutomatico2(tamanho, biblioteca, password);
        return senha;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Biblioteca de Letras Maiúsculas"> 
    public String bibliotecaMaiucula (int tamanho, String password) {
        char biblioteca[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R'
                ,'S','T','U','V','W','X','Y','Z'};
        String senha = crackeadorAutomatico2(tamanho, biblioteca, password);
        return senha;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Biblioteca de Carácteres Especiais"> 
    public String bibliotecaCaracteresEspeciais (int tamanho, String password) {
        char biblioteca[] = {'!','@','#','$','%','¨','&','*','(',')','_','-','+','=','´','`','{','}'
                ,'[',']','^','~','|','/','?',',','.','<','>',':',';','°','º','ª','²','¹','²','³','£'
                ,'¢','¬','§','"', ' '};//falta ' aspas simples e \ contra o barra
        String senha = crackeadorAutomatico2(tamanho, biblioteca, password);
        return senha;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Biblioteca Manual"> 
    public String bibliotecaManual (int tamanho, char[] biblioteca, String password) {       
        String senha = crackeadorAutomatico2(tamanho, biblioteca, password);
        return senha;
    }
    //</editor-fold>
    
    
    //<editor-fold defaultstate="collapsed" desc="Salva Biblioteca de Números"> 
    public String salvaBibliotecaNumeros (int tamanho, String password) {
        char biblioteca[] = {'0','1','2','3','4','5','6','7','8','9'};
        String senha = geradorBaseTentativas(tamanho, biblioteca, password);
        return senha;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Salva Biblioteca de Letras Minúsculas"> 
    public String salvaBibliotecaMinuscula (int tamanho, String password) {
        char biblioteca[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r'
                ,'s','t','u','v','w','x','y','z'};
        String senha = geradorBaseTentativas(tamanho, biblioteca, password);
        return senha;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Salva Biblioteca de Letras Maiúsculas"> 
    public String salvaBibliotecaMaiucula (int tamanho, String password) {
        char biblioteca[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R'
                ,'S','T','U','V','W','X','Y','Z'};
        String senha = geradorBaseTentativas(tamanho, biblioteca, password);
        return senha;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Salva Biblioteca de Carácteres Especiais"> 
    public String salvaBibliotecaCaracteresEspeciais (int tamanho, String password) {
        char biblioteca[] = {'!','@','#','$','%','¨','&','*','(',')','_','-','+','=','´','`','{','}'
                ,'[',']','^','~','|','/','?',',','.','<','>',':',';','°','º','ª','²','¹','²','³','£'
                ,'¢','¬','§','"'};//falta ' aspas simples e \ contra o barra
        String senha = geradorBaseTentativas(tamanho, biblioteca, password);
        return senha;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Salva Biblioteca Manual"> 
    public String salvaBibliotecaManual (int tamanho, char[] biblioteca, String password) {
        String senha = geradorBaseTentativas(tamanho, biblioteca, password);
        return senha;
    }
    //</editor-fold>
        
}
