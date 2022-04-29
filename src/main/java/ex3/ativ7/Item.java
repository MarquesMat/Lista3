//Ex 7

package ex3.ativ7;

public class Item {
    Produto produto;
    private int qtd;
    
    public Item (Produto produto, int qtd) {
        this.produto = produto;
        this.qtd = qtd;
    }
    
    public Produto getProduto() {
        return this.produto;
    }
    
    public int getQtd() {
        return this.qtd;
    }
}
