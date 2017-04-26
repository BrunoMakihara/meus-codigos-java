
package master.sbrain;

public class Node {

    private int carta;
    private Node Anterior;
    private Node Proximo;
    private int posicao;
    private double porcentagem;

    
    public Node(int carta, int posicao) {
        this.carta = carta;
        this.Anterior = null;
        this.Proximo = null;
        this.posicao = posicao;
        this.porcentagem = 0;
    }

    @Override
    public String toString() {
        return "probabilidade de vencer: " + null;
    }
    
    public int getCarta() {
        return carta;
    }

    public void setCarta(int carta) {
        this.carta = carta;
    }

    public Node getAnterior() {
        return Anterior;
    }

    public void setAnterior(Node Anterior) {
        this.Anterior = Anterior;
    }

    public Node getProximo() {
        return Proximo;
    }

    public void setProximo(Node Proximo) {
        this.Proximo = Proximo;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }
    
    public double getPorcentagem() {
        return porcentagem;
    }
    
    public void setPorcentagem(double porcentagem) {
        this.porcentagem = porcentagem;
    }
}
