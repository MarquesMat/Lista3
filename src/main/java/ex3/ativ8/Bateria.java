//Ex 8

package ex3.ativ8;

public class Bateria {
    private int capacidadeCarga, atualCarga;
    
    public Bateria (int capacidadeCarga, int atualCarga) {
        this.capacidadeCarga = capacidadeCarga;
        this.atualCarga = atualCarga;
    }
    
    public int getCapacidadeCarga () {
        return this.capacidadeCarga;
    }
    
    public int getAtualCarga () {
        return this.atualCarga;
    }
    
    public void setCapacidadeCarga (int carga) {
        this.capacidadeCarga = carga;
    }
    
    public void setAtualCarga (int carga) {
        this.atualCarga = carga;
    }
}
