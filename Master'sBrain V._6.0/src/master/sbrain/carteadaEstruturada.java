
package master.sbrain;
import java.text.DecimalFormat;

public class carteadaEstruturada {
    
    private Node Inicio;
    private Node Fim;
    private int Quantidade;
    
    //<editor-fold defaultstate="collapsed" desc="carteadaEstruturada"> 
    public carteadaEstruturada() {
        this.Inicio = this.Fim = null;
        this.Quantidade = 0;
    }
    //</editor-fold> 
    
    //<editor-fold defaultstate="collapsed" desc="cadastro"> 
    public void cadastro(int cartas, int posicao) {
        if (Quantidade == 0) {
            this.Inicio = this.Fim = new Node(cartas, posicao);
        } else {
            Node aux = this.Fim;
            this.Fim = new Node(cartas, posicao);
            aux.setProximo(this.Fim);
            this.Fim.setAnterior(aux);
        }
        Quantidade++;
    }
    //</editor-fold> 
    
    //<editor-fold defaultstate="collapsed" desc="maioresCartas"> 
    public Node maioresCartas() {
        Node aux = Inicio;
        int maior = aux.getCarta();
        for (int i = 1; i < Quantidade; i++) {
            if (maior < aux.getProximo().getCarta()) {
                maior = aux.getProximo().getCarta();    
            }
            aux = aux.getProximo();
        }
        aux = Fim;
        for (int i = Quantidade -1; i >= 0; i--) {//condição para seleção de cartas distantes
            if (aux.getCarta()== maior) {
                remove(i);
                return aux;
            } else {
                aux = aux.getAnterior();
            }  
        }    
        return aux;
    }
    //</editor-fold> 
    
    //<editor-fold defaultstate="collapsed" desc="remove"> 
    public Node remove(int index) {
        if ((index >= Quantidade) || (index < 0)) {
            return null;
        } else {
            Node aux = Inicio;
            Node retorno;
            if (index == 0) {
                retorno = Inicio;
                Inicio = Inicio.getProximo();
                if (Quantidade == 1) {
                    Inicio = Fim = null;
                } else { 
                    Inicio.setAnterior(null);
                }
            } else {
                for (int i = 1; i < index; i++) {
                    aux = aux.getProximo();
                }
                retorno = aux.getProximo();
                aux.setProximo(aux.getProximo().getProximo());
                if (aux.getProximo() == null) {
                    Fim = aux;
                } else {
                    aux.getProximo().setAnterior(aux);
                }
            }
            Quantidade--;
            return retorno;
        }
    }
    //</editor-fold> 
    
    //<editor-fold defaultstate="collapsed" desc="remove TUDO"> 
    public void removeAll() {
        Inicio = Fim = null;
        Quantidade = 0;
    }
    //</editor-fold> 
    
    //<editor-fold defaultstate="collapsed" desc="cartasMaisForte"> 
    public int cartasMaisForte(Node[]melhoresCartas, Node position) {
        //MÉTODO QUE RETORNA A QTD DE CARTAS MAIS FORTES QUE A SUA
        int rodada = 14 -position.getCarta();
        int[]vetor = new int[rodada];
        int poder = 14;
        for (int i = 0; i < rodada; i++) {
            vetor[i] = poder;
            poder--;
        }
        int quantidade = rodada;
        for (int i = 0; i < rodada; i++) {
            if (melhoresCartas[0].getCarta()== vetor[i] && melhoresCartas[0].getCarta()> 10) {
                quantidade--;
            } else if (melhoresCartas[1].getCarta()== vetor[i] && melhoresCartas[1].getCarta()> 10) {
                quantidade--;
            } else if (melhoresCartas[2].getCarta()== vetor[i] && melhoresCartas[2].getCarta()> 10) {
                quantidade--;
            }
        }
        return quantidade;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="matador"> 
    public int matador(Node[]melhoresCartas, Node position) {
        //MÉTODO QUE RETORNA A QUANTIDADE DE MANILHAS MAIS FORTES QUE A SUA CARTA
        int rodada = 14 -position.getCarta();//número de cartas mais fortes que a sua, nessa rodada
        int[]vetor = new int[rodada];
        int poder = 14;
        int manilha = 0;
        for (int i = 0; i < rodada; i++) {
            vetor[i] = poder;//preenche o vetor com as cartas mais fortes que a sua carta dessa rodada
            poder--;
            if (vetor[i] > 10) {
                manilha++;//conta a quantidade de manilhas que o adversário pode ter para cortar a sua carta
            }
        }
        poder = manilha;
        for (int i = 0; i < poder ; i++) {
            if (melhoresCartas[0].getCarta()== vetor[i]) {
                manilha--;
            } else if (melhoresCartas[1].getCarta()== vetor[i]) {
                manilha--;
            } else if (melhoresCartas[2].getCarta()== vetor[i]) {
                manilha--;
            }
        }
        return manilha;
    }
    //</editor-fold> 
    
    //<editor-fold defaultstate="collapsed" desc="cartasRepetidas"> 
    public int cartasRepetidas(Node[]melhoresCartas) {
        //MÉTODO QUE RETORNA A QUANTIDADE DE CARTAS MAIS FORTES A SER DESCONTADA, BASEANDO NAS MAIORES CARTAS
        //RETORNA A QTD DAS MAIORES CARTAS
        Node aux = Inicio;
        int qtd = 0;
        for (int j = 0; j < Quantidade; j++) {
            if (melhoresCartas[0].getCarta() == aux.getCarta()) {
                qtd++;  
            }
            aux = aux.getProximo();
        }
        aux = Inicio;
        for (int j = 0; j < Quantidade; j++) {
            if (melhoresCartas[1].getCarta() == aux.getCarta() && melhoresCartas[0].getCarta() != aux.getCarta()) {
                qtd++;  
            }
            aux = aux.getProximo();
        }
        aux = Inicio;
        for (int j = 0; j < Quantidade; j++) {
            if (melhoresCartas[2].getCarta() == aux.getCarta()&& melhoresCartas[0].getCarta() != aux.getCarta()
                    && melhoresCartas[1].getCarta() != aux.getCarta()) {
                qtd++;  
            }
            aux = aux.getProximo();
        }
        return qtd;
    }
    //</editor-fold> 
    
    //<editor-fold defaultstate="collapsed" desc="decrementoDePerda"> 
    public double decrementoDePerda(Node[]melhoresCartas, double porcentagem) {
        //MÉTODO QUE RETORNA A QUANTIDADE DE MANILHAS MAIS FORTES QUE A SUA CARTA
        int qtdRepetidas = cartasRepetidas(melhoresCartas);
        double decrementoPorcentagem  = (7.69 *qtdRepetidas)-(7.69 *3);//QTD_REPETIDA -CARTAS
        if (melhoresCartas[0].getCarta() < 14) { //SE NÃO TIVER ZAP FAZ O DECREMENTO
            porcentagem -= decrementoPorcentagem; 
        } else {
            porcentagem += 7.69 *3;//SE TIVER ZAP AUMENTA A PORCENTAGEM DESCONTADA NO DECREMENTOPORCENTAGEM
        }
        return porcentagem;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="firstSetup"> 
    public int[]firstSetup(Node[]melhoresCartas) {
        int vetor[] = new int[3];
        for (int i = 0; i < 3; i++) {
            vetor[i] = melhoresCartas[i].getPosicao();
        }
        return vetor;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="setPosition"> 
    public void setPosition(Node[]melhoresCartas, int[]vetor) {
        for (int i = 0; i < vetor.length; i++) {
            melhoresCartas[i].setPosicao(vetor[i]);
        }
    }
    //</editor-fold> 
    
    //<editor-fold defaultstate="collapsed" desc="probabilidadeDoTruco"> 
    public String probabilidadeDoTruco(Node[]melhoresCartas) {
          
        double porcentagem;//porcentagem total de chances de perder o jogo
        double probabilidadeGanhar;
        int zap = 0;//controlador de Zap
        int copas = 0;//controlador de copas
        int manilhaPequena = 0;//manilha pequena: Ouro, Espada e Copas
        int []cartas = new int[3];
        double codekey = 0.3611;
        
        porcentagemAjustada(melhoresCartas, 0);//coloca a porcentagem de não fazer a primeira rodada com a carta
        porcentagemAjustada(melhoresCartas, 1);//coloca a porcentagem de não fazer a primeira rodada com a carta
        porcentagemAjustada(melhoresCartas, 2);//coloca a porcentagem de não fazer a primeira rodada com a carta

        double aux = melhoresCartas[0].getPorcentagem();
        int maior = 0;
        int medio = 0; 
        int menor = 0;
        for (int i = 0; i < 3; i++) {
            if (aux >= melhoresCartas[i].getPorcentagem()) {//se aux >= deixa para o pé mesmo tendo uma carta mais fraca, pois as chances de fazer a segunda aumenta
                aux = melhoresCartas[i].getPorcentagem();//se aux > pega e joga a maior carta, mesmo estando longe
                maior = i;//acha o índice da carta que tem a maior probabilidade de fazer a primeira rodada
            }
            if (melhoresCartas[i].getCarta() == 14) {
                zap = 1;//detector de ZAP
            } 
            else if (melhoresCartas[i].getCarta() == 13) {
                copas = 1;//detector de Copas
            }
            if (melhoresCartas[i].getCarta() > 10 && melhoresCartas[i].getCarta() != 14) {//se não é zap, mas é manilha ...
                manilhaPequena++;//detecta quantas manilhas que não são zap
            }
        }
        cartas[0] = melhoresCartas[maior].getCarta();//PRIMEIRA CARTA A SER JOGADA, a carta que tem maior probabilidade de fazer a primeira 
        //REPOSICIONA E AJUSTA AS POSIÇÕES DE TODAS AS CARTAS DA 2º RODADA
        
        //guarda os valores das posições iniciais das cartas
        int[] posicaoAntiga = new int[3];
        for (int i = 0; i < 3; i++) {
            posicaoAntiga[i] = melhoresCartas[i].getPosicao();
        }
        System.out.println("ESTADO INICIAL");
        System.out.println("carta: "+melhoresCartas[0].getCarta()+"     posição: "+melhoresCartas[0].getPosicao());
        System.out.println("carta: "+melhoresCartas[1].getCarta()+"     posição: "+melhoresCartas[1].getPosicao());
        System.out.println("carta: "+melhoresCartas[2].getCarta()+"     posição: "+melhoresCartas[2].getPosicao());
        System.out.println("");
        reposicionamento(melhoresCartas, maior);//reposiciona a 2ºrodada, para que o cara que começou a 1ºrodada vire mão da 2º          
        aux = 1000;
        for (int i = 0; i < 3; i++) {
            if (maior != i) {
                if (aux >= porcentagemPerda(melhoresCartas, i, melhoresCartas[i].getPosicao())) {
                    aux = melhoresCartas[i].getPorcentagem();
                    medio = i;
                }   
            }
        }
        cartas[1] = melhoresCartas[medio].getCarta();
        for (int i = 0; i < 3; i++) {
            if (i != maior && i != medio) {
                menor = i;
            }
        }
        cartas[2] = melhoresCartas[menor].getCarta();
        
        //NA SEGUNDA RODADA JOGA A CARTA QUE ESTIVER MAIS PRÓXIMA DO PÉ
        if (melhoresCartas[menor].getPosicao() < melhoresCartas[medio].getPosicao()) {
            cartas[1] = melhoresCartas[menor].getCarta();
            cartas[2] = melhoresCartas[medio].getCarta();
        }
        
        //CÁLCULO DA PROBABILIDADE DE GANHAR        
        porcentagem = porcentagemPerda(melhoresCartas, 2, 3);// 2 é a menor carta
        porcentagem += porcentagemPerda(melhoresCartas, 1, 3);// 1 é a carta do meio
        porcentagem += porcentagemPerda(melhoresCartas, 0, 3);// 0 é a maior carta
        porcentagem /= 3; 
         
        //======================================================================        
        //REPOSICIONA AS CARTAS PARA O ESTADO INICIAL ANTES DO REPOSICIONAMENTO
        System.out.println("REPOSICIONAMENTO");
        System.out.println("carta: "+melhoresCartas[0].getCarta()+"     posição: "+melhoresCartas[0].getPosicao());
        System.out.println("carta: "+melhoresCartas[1].getCarta()+"     posição: "+melhoresCartas[1].getPosicao());
        System.out.println("carta: "+melhoresCartas[2].getCarta()+"     posição: "+melhoresCartas[2].getPosicao());
        System.out.println("");
        estadoInicial(melhoresCartas,posicaoAntiga);
        System.out.println("ESTADO INICIAL");
        System.out.println("carta: "+melhoresCartas[0].getCarta()+"     posição: "+melhoresCartas[0].getPosicao());
        System.out.println("carta: "+melhoresCartas[1].getCarta()+"     posição: "+melhoresCartas[1].getPosicao());
        System.out.println("carta: "+melhoresCartas[2].getCarta()+"     posição: "+melhoresCartas[2].getPosicao());
        System.out.println("");
        boolean tem3 = false;
        int posicao3 = 999;
        for (int i = 1; i < 3; i++) {
            if (melhoresCartas[1].getCarta() == 10 && melhoresCartas[0].getCarta() > 10) {//se tem apenas uma manilha e um ou mais 3
                if (melhoresCartas[i].getCarta() == 10) {//Se tem 3
                    tem3 = true;
                    posicao3 = i;//seleciona o 3 que esta mais próximo do pé  
                }
            }
        }
        if (tem3) {
            System.out.println("------------------------");
            System.out.println("carta: "+melhoresCartas[posicao3].getCarta()+"     posição: "+melhoresCartas[posicao3].getPosicao());
            System.out.println("------------------------");
            System.out.println("");
            if ((melhoresCartas[0].getPosicao() >= melhoresCartas[1].getPosicao() && melhoresCartas[1].getCarta() == 10) || (melhoresCartas[0].getPosicao() >= melhoresCartas[2].getPosicao() && melhoresCartas[2].getCarta() == 10)) {//se o 3 estiver mais perto do pé do que a manilha, ou se tiver manilha e 3 juntos ...
                //se o 3 estiver mais perto do pé ao em vez da manilha, jogar o 3
                //NOVO REPOSICIONAMENTO
                reposicionamento(melhoresCartas, posicao3);//reposiciona a 2ºrodada, para que o cara que jogou o 3 na 1ºrodada vire mão da 2º
                System.out.println("NOVO REPOSICIONAMENTO");
                System.out.println("carta: "+melhoresCartas[0].getCarta()+"     posição: "+melhoresCartas[0].getPosicao());
                System.out.println("carta: "+melhoresCartas[1].getCarta()+"     posição: "+melhoresCartas[1].getPosicao());
                System.out.println("carta: "+melhoresCartas[2].getCarta()+"     posição: "+melhoresCartas[2].getPosicao());
                System.out.println("");
                cartas[0] = melhoresCartas[1].getCarta();
                if (posicao3 == 1) {//joga a carta mais forte na segunda
                    cartas[1] = melhoresCartas[0].getCarta();//maior carta (manilha)
                    cartas[2] = melhoresCartas[2].getCarta();//menor carta (menor que 3)
                } else if (posicao3 == 2) {//se tem manilha e dois 3 (3 e 3)
                    //joga o 3 e deixa a manilha pro final
                    if (melhoresCartas[0].getPosicao() > melhoresCartas[2].getPosicao()) {
                        cartas[1] = melhoresCartas[2].getCarta();
                        cartas[2] = melhoresCartas[0].getCarta();
                    } else {
                        cartas[1] = melhoresCartas[0].getCarta();
                        cartas[2] = melhoresCartas[2].getCarta();
                    }
                }
                System.out.println("ORDEM DAS CARTAS");
                System.out.println("carta[0]: "+cartas[0]);
                System.out.println("carta[1]: "+cartas[1]);
                System.out.println("carta[2]: "+cartas[2]);
                System.out.println("");
            }
        }
        
        //======================================================================
                
        if (zap != 1) {//SE NÃO TEM ZAP
            
        } else {//SE TIVER O ZAP, JOGA O ZAP NA ÚLTIMA RODADA  
            cartas[0] = melhoresCartas[1].getCarta();//medio
            cartas[1] = melhoresCartas[2].getCarta();//menor
            cartas[2] = melhoresCartas[0].getCarta();//imprime o zap por último
            if (manilhaPequena > 0) {//SE TEM ZAP E MANILHA, DEIXA ELAS PARA O FINAL
                cartas[0] = melhoresCartas[2].getCarta();//menor
                cartas[1] = melhoresCartas[1].getCarta();//medio
            } 
        }
        //DECREMENTO NA PORCENTAGEM DE PERDER
        porcentagem  = decrementoDePerda(melhoresCartas, porcentagem);
        porcentagem = 300 -porcentagem;//TRANSFORMA A PORCENTAGEM DE PERDER EM PORCENTAGEM DE GANHAR
        probabilidadeGanhar = porcentagem * codekey;
        //SE TEM CASAL, JOGA O COPAS NA SEGUNDA
        if (zap == 1) {
            if (copas == 1 || manilhaPequena > 1) {
                probabilidadeGanhar = 100;
            }   
        }
        probabilidadeGanhar = (probabilidadeGanhar + 100)/2;
        if (probabilidadeGanhar < 0) {
            probabilidadeGanhar = 0;
        } else if (probabilidadeGanhar > 100) {
            probabilidadeGanhar = 100;
        }
        DecimalFormat fmt = new DecimalFormat("0.00");  
        String chance = fmt.format(probabilidadeGanhar);
        return display(cartas, 3) + "  ->  Prob. de Vencer: " + chance + "%";
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="porcentagem de Ajustada"> 
    public void porcentagemAjustada(Node[]melhoresCartas, int i) {
        int zap = 0;
        if (melhoresCartas[0].getCarta() == 14) {
            zap = 1;
        }
        int manilha = matador(melhoresCartas, melhoresCartas[i]);//quantidade de manilhas mais forte que a carta
        int rodada = cartasMaisForte(melhoresCartas, melhoresCartas[i]);//quantidade de cartas mais fortes que a carta
        int nomanilha = rodada - manilha;//quantidade de cartas mais forte que a carta, mas não são manilhas
        if (zap != 1) {//SE NÃO TEM ZAP
            if (melhoresCartas[i].getCarta() < 11) {//SE NÃO É MANILHA
                nomanilha++;//AUMENTA CHANCES DE EMPACHE
            }
        }
        //PORCENTAGEM DE PERDER A RODADA
        double perc;//chances de o adversário ter manilha na rodada
        if (melhoresCartas[i].getCarta() > 10) {
            perc = manilha *7.69 *melhoresCartas[i].getPosicao();//C-X-O -> O-C-X
        } else {
            perc = manilha *7.69 *3;//2-3-A -> 3-2-A
        }
        double prob = nomanilha *30.76 *melhoresCartas[i].getPosicao();//chances de o adversário matar sua carta sem usar manilha
        double porcentagem = perc + prob;//porcentagem de perder a rodada
        melhoresCartas[i].setPorcentagem(porcentagem);
        //System.out.println("Cartas "+melhoresCartas[i].getCarta()+ ":  "+porcentagem);
    }
    //</editor-fold> 
    
    //<editor-fold defaultstate="collapsed" desc="porcentagem de Perda"> 
    public double porcentagemPerda(Node[]melhoresCartas, int i, int vezes) {
        int zap = 0;
        if (melhoresCartas[0].getCarta() == 14) {
            zap = 1;
        }
        int manilha = matador(melhoresCartas, melhoresCartas[i]);//quantidade de manilhas mais forte que a carta
        int rodada = cartasMaisForte(melhoresCartas, melhoresCartas[i]);//quantidade de cartas mais fortes que a carta
        int nomanilha = rodada - manilha;//quantidade de cartas mais forte que a carta, mas não são manilhas
        if (zap != 1) {//SE NÃO TEM ZAP
            if (melhoresCartas[i].getCarta() < 11) {//SE NÃO É MANILHA
                nomanilha++;//AUMENTA CHANCES DE EMPACHE
            }
        }
        //PORCENTAGEM DE PERDER A RODADA
        double perc;//chances de o adversário ter manilha, na rodada
        if (melhoresCartas[i].getCarta() > 10) {//SE TEM MANILHA
            perc = manilha *7.69 *vezes;
        } else {
            perc = manilha *7.69 *3;//SE NÃO TEM MANILHA
        }
        double prob = nomanilha *30.76 *vezes;//chances de o adversário matar/empachar sua carta sem usar manilha
        double porcentagem = perc + prob;//porcentagem de perder a rodada
        //CONDIÇÃO PARA Z-O-3 -> 3-O-Z
        if (melhoresCartas[i].getCarta() < 11) {//SE NÃO FOR MANILHA
            porcentagem += 0.0001;//INCREMENTA UM VALOR MÍNIMO NAS CHANCES DE PERDER, CASO NÃO SEJA MANILHA
        }
        //altera a porcentagem da carta selecionada e retorna o valor para uma variável
        melhoresCartas[i].setPorcentagem(porcentagem);
        
        return porcentagem; 
    }
    //</editor-fold> 
    
    //<editor-fold defaultstate="collapsed" desc="reposicionamento"> 
    public void reposicionamento (Node[] melhoresCartas, int indiceMaior) {
        for (int i = 0; i < 3; i++) {
            if (i != indiceMaior) {//CONDIÇÃO DE REPOSICIONAMENTO APÓS 1º RODADA
                if (melhoresCartas[indiceMaior].getPosicao() == 2) {//SE A MAIOR CARTA ESTIVER NO MEIO
                    if (melhoresCartas[i].getPosicao() == 3) {
                        melhoresCartas[i].setPosicao(1);
                    } else if (melhoresCartas[i].getPosicao()== 2) {
                        melhoresCartas[i].setPosicao(3);
                    } else {
                        melhoresCartas[i].setPosicao(2);
                    }
                } else if (melhoresCartas[indiceMaior].getPosicao() == 1) {//SE A MAIOR CARTA ESTIVER NO PÉ
                    if (melhoresCartas[i].getPosicao() == 2) { //TESTE COM 3, 2, 1 RESPECTIVAMENTE
                        melhoresCartas[i].setPosicao(1);
                    } else if (melhoresCartas[i].getPosicao() == 3) {
                        melhoresCartas[i].setPosicao(2);
                    } else {
                        melhoresCartas[i].setPosicao(3);
                    }
                }
            }
        }
    }
    //</editor-fold> 
        
    //<editor-fold defaultstate="collapsed" desc="estadoInicial"> 
    public void estadoInicial (Node[] melhoresCartas, int[] posicaoAntiga) {
        for (int i = 0; i < 3; i++) {
            melhoresCartas[i].setPosicao(posicaoAntiga[i]);
        }
    }
    //</editor-fold> 
    
    //<editor-fold defaultstate="collapsed" desc="display"> 
    public String display(int[]cartas, int numero) {
        String inf = " ";
        char carta[] = new char[numero]; 
        for (int i = 0; i < numero; i++) {
            if (cartas[i] == 14 ) {
                carta[i] = 'Z';
            } else if (cartas[i] == 13 ) {
                carta[i] = 'C';
            } else if (cartas[i] == 12 ) {
                carta[i] = 'E';
            } else if (cartas[i] == 11 ) {
                carta[i] = 'O';
            } else if (cartas[i] == 10 ) {
                carta[i] = '3';
            } else if (cartas[i] == 9 ) {
                carta[i] = '2';
            } else if (cartas[i] == 8 ) {
                carta[i] = 'A';
            } else if (cartas[i] == 7 ) {
                carta[i] = 'K';
            } else if (cartas[i] == 6 ) {
                carta[i] = 'J';
            } else if (cartas[i] == 5 ) {
                carta[i] = 'Q';
            } else if (cartas[i] == 4 ) {
                carta[i] = '7';
            } else if (cartas[i] == 3 ) {
                carta[i] = '6';
            } else if (cartas[i] == 2 ) {
                carta[i] = '5';
            } else if (cartas[i] == 1 ) {
                carta[i] = '4';
            }
        }
        for (int i = 0; i < numero; i++) {
            if (i < numero -1) {
                inf += carta[i] + " - ";
            } else {
                inf += carta[i];
            } 
        }
        return inf;
    }
    //</editor-fold>
            
}