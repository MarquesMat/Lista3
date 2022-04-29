//Ex 8

package ex3.ativ8;

public class Celular {
    private Bateria bateria;
    
    public Celular (int a, int c) {
        this.bateria = new Bateria (a, c);
    }
    
    public Bateria getBateria() {
        return this.bateria;
    }
    
    public void setBateria (int n) {
        this.bateria.setAtualCarga(this.bateria.getAtualCarga()-n);
    }
}
