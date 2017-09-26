
package pokedex;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class teste_com_base_de_dados {
    
    public static void main(String[] args) throws UnsupportedEncodingException, FileNotFoundException {
        Scanner in = new Scanner (System.in);
        String[]dados = new String[14];

        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("dados_pokedex.txt"), "ISO-8859-1"));
        
        
        try (FileReader arq = new FileReader("dados_pokedex.txt")) {
            String linha = br.readLine(); // lê a primeira linha

            System.out.print("Digite o número do Pokemon: ");
            int numero = in.nextInt();
            numero--;
            int i = 0;
            while(i < numero) {
                linha = br.readLine();
                i++;
            }
            String pokemon = linha.replace("\"", "");   //remove o caractér " da string linha
            dados = pokemon.split(";");                 //quebra a string onde tem ; e transforma em vários elementos de um vetor
            
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
              e.getMessage());
        }
        
        
        System.out.println("");
        System.out.println("Pokémon: " + dados[0]);
        System.out.println("Hp: " + dados[3]);
        System.out.println("Ataque: " + dados[4]);
        System.out.println("Defesa: " + dados[5]);
        System.out.println("Ataque Especial: " + dados[6]);
        System.out.println("Defesa Especial: " + dados[7]);
        System.out.println("Rapidez: " + dados[8]);
        System.out.println("Total: " + dados[9]);
        System.out.println("Altura: " + dados[1]);
        System.out.println("Peso: " + dados[2]);
        System.out.println("Categoria: " + dados[10]);
        System.out.println("Habilidades: " + dados[11]);
        System.out.println("Sexo: " + dados[12]);
        System.out.println("Descrição: " + dados[13]);
        System.out.println("");
    }
    
}
