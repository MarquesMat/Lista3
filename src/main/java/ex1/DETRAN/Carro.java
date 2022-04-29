package ex1.DETRAN;

public class Carro {
    private String dono, placa;
    private int multas, ptsCarteira;
    private boolean regularizado = true;
    
    public Carro(String dono, String placa, int multas, int ptsCarteira, boolean regularizado) {
        this.dono = dono;
        this.placa = placa;
        this.multas = multas;
        this.ptsCarteira = ptsCarteira;
        this.regularizado = regularizado;
    }
    
    public int ipva() {
        return 6000;
    }
}