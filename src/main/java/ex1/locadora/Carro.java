package ex1.locadora;

public class Carro {
    private String marca;
    private int ano, valor;
    private boolean novo = true;

    public Carro(String marca, int ano, int valor, boolean novo) {
        this.marca = marca;
        this.ano = ano;
        this.valor = valor;
        this.novo = novo;
    }
    
    public int desconto () {
        return 200;
    }
}