
package tecladovitual.pkg;
import java.awt.event.KeyEvent;

public class TecladoVitual {

    public static void main(String args[]){
        
        int numeroAsc = KeyEvent.VK_U;
        char character = (char) numeroAsc;
        System.out.println(character);
        
    }
    
}