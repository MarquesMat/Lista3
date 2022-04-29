//Ex 6

package ex3.ativ6;

public class Baralho {
    private Carta[] cartas;
    private boolean embaralhado;
    private int qtd;
    
    public Baralho() {
        this.cartas = new Carta[52];
        this.embaralhado = false;
        this.qtd = 0;
    }
    
    public Carta getCartas (int i) {
        return this.cartas[i];
    }
    
    public void setCartas (Carta carta) {
        this.cartas[this.qtd] = carta;
        this.qtd++;
    }
}