//Ex 3

package ex3.ativ3;

public class Porta {
    private int estado; //0 -> porta fechada ; 1 -> porta aberta
    private String cor, dimensoes;
    
    public Porta(int estado, String cor, String dimensoes) {
        this.cor = cor;
        this.dimensoes = dimensoes;
        this.estado = estado;
    }
    
    public static void estaAberta(int x) {
        if (x == 0) System.out.print("\nA PORTA ESTA FECHADA");
        else System.out.print("\nA PORTA ESTA ABERTA");
    }
    
    public int getEstado() {
        return this.estado;
    }
    
    public String getCor() {
        return this.cor;
    }
    
    public String getDimensoes() {
        return this.dimensoes;
    }
    
    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public void setDimensoes(String dimensoes) {
        this.dimensoes = dimensoes;
    }
}
