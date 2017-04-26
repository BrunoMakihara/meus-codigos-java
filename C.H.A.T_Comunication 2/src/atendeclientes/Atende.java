package atendeclientes;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Atende extends Thread{//USADO PELO SERVIDOR
    Socket cli;
    PrintStream out;
    
    public Atende(Socket s){
        cli = s;
    }

    @Override
    public void run(){
        Scanner in;
        String msg;
        try {
            in = new Scanner(cli.getInputStream());
            out = new PrintStream(cli.getOutputStream());
            do{
                msg = in.nextLine();
                //Enquanto ninguém digitar exit, as mensagens são enviadas normalmente
                if(!msg.equalsIgnoreCase("exit"))
                    for(Atende a:FrameServidor.atendimento){
                        a.enviar(msg);
                    }
                //NÃO CONSEGUE IDENTIFICAR OS DIFERENTES ENDEREÇOS IP QUE FORAM CADASTRADOS
                System.out.println("Recebido: "+msg+" de "+cli.getInetAddress().getHostAddress());
            }while(!msg.contains("exit"));
            //Confirma a Saído no chat apenas para o usuário que digitou exit
            out.println(cli.getInetAddress().getHostAddress() + " -> Conexão Encerrada!!!");
            cli.close();
            for(Atende a:FrameServidor.atendimento){
                if(a == this){
                    FrameServidor.atendimento.remove(a);
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("ErroThread:"+e.getMessage());
        }
    }
    
    private void enviar(String msg){
        out.println(msg);
    }
}
