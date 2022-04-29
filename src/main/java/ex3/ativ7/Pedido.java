//Ex 7

package ex3.ativ7;

public class Pedido {
    private Item[] itens;
    private String pagamento;
    private int qtd_itens;
    private double total;
    
    public Pedido() {
        this.itens = new Item[5];
        this.qtd_itens = 0;
        this.total = 0.0;
    }
    
    public Item getItens(int i) {
        return this.itens[i];
    }
    
    public String getPagamento() {
        return this.pagamento;
    }
    
    public int getQtd_itens() {
        return this.qtd_itens;
    }
    
    public double getTotal() {
        return this.total;
    }
    
    public void setPedido (Item item) {
        this.itens[this.qtd_itens] = item;
        this.qtd_itens++;
    }
    
    public void setPagamento (String pag) {
        this.pagamento = pag;
    }
    
    public void setTotal (double n) {
        this.total += n;
    }
}
