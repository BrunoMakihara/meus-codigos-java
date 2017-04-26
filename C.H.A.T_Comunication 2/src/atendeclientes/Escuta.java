package atendeclientes;
import java.net.Socket;
import java.util.Scanner;

public class Escuta extends Thread{//USADO PELO CLIENTE
    Socket sk;
    Scanner in;
    
    public Escuta(Socket s){
        sk = s;
        this.setDaemon(true);
    }
    
    @Override
    public void run(){
        String msg;
        try {
            in = new Scanner(sk.getInputStream());
            do{
                msg = in.nextLine();
                //Imprime O IP e a Mensagem que foi mandada para todos os clientes
                FrameCliente.txtSaida.append(msg+"\n");
            }while(true);
        } catch (Exception e) {
        }
    }
}
