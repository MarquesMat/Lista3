package ex1.revendedora;

public class Carro {
    private String marca;
    private int ano, valor, km;
    private boolean unicoDono = false;
    
    public Carro(String marca, int ano, int valor, int km, boolean unicoDono) {
        this.marca = marca;
        this.ano = ano;
        this.valor = valor;
        this.km = km;
        this.unicoDono = unicoDono;
    }
    
    public boolean vendido() {
        return true;
    }
}
