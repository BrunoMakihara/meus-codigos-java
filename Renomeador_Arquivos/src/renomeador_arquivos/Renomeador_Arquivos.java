package renomeador_arquivos;

import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;

public class Renomeador_Arquivos {
    
    public static void main(String[] args) throws IOException {
        JFileChooser chooser = new JFileChooser();
        chooser.setMultiSelectionEnabled(true);
        boolean ok = true;              
        int result = chooser.showOpenDialog(null);
        if (result == JFileChooser.CANCEL_OPTION) {
            ok = false;
        }
        
        File[] files = chooser.getSelectedFiles();
        int qtdArquivos = files.length;
        System.out.println("Quantidade de arquivos selecionados: " + qtdArquivos);
        
        if (ok && qtdArquivos > 0) { //Se o(s) arquivo(s) for(em) selecionado(s)
            for (int i = 0; i < qtdArquivos; i++) {
                String path = files[i].getPath();
                File documento = new File(path);//seleciona o caminho do arquivo que será renomeado XXXXXXXXXXXXXXXXXXXXXXXXXX
                File x = documento.getParentFile();//x é o caminho do diretório do arquivo selecionado
                File novoNome = new File(x+"\\NOME NOVO ("+(i+1)+").txt");//novo nome que será atribuido ao arquivo selecionado XX
                documento.renameTo(novoNome);//renomeia o arquivo com o novo nome
            }
            System.out.println("Arquivos renomeados com Sucesso!");
        } else {
            System.out.println("Falha ao renomear os arquivos!");
        }	
        
    }
    
}
