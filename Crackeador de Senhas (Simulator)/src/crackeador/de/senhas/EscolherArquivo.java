
package crackeador.de.senhas;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class EscolherArquivo {//CLASSE PARA ESCOLHER UM ARQUIVO
    
    public static String caminho(){
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.CANCEL_OPTION) {
            return null;
        }
        File arquivo = fileChooser.getSelectedFile();
        if (arquivo == null || arquivo.getName().equals("")) {
            JOptionPane.showMessageDialog(null, "Nome de arquivo inválido ");
        } else {
            return arquivo.getPath();
        }
        return null;
    }          
}