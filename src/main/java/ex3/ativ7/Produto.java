//Ex 7

package ex3.ativ7;

public class Produto {
    private String nome;
    private double preco;
    private int qtd_estoque;
    
    public Produto (String nome, double preco, int qtd) {
        this.nome = nome;
        this.preco = preco;
        this.qtd_estoque = qtd;
    }
    
    public Produto () {
        //Produto vazio
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public double getPreco() {
        return this.preco;
    }
    
    public int getQtd_estoque() {
        return this.qtd_estoque;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public void setQtd_estoque(int qtd) {
        this.qtd_estoque = qtd;
    }
}
