package ex1.oficina;

public class Carro {
    private String dono;
    private boolean farol = true, pneu = true, freios = true, motor = true;
    //valores falsos indicam problemas nas peças
    
    public Carro(String dono, boolean farol, boolean pneu, boolean freios, boolean motor) {
        this.dono = dono;
        this.farol = farol;
        this.pneu = pneu;
        this.freios = freios;
        this.motor = motor;
    }
    
    public boolean perdaTotal () {
        return true;
    }
}
