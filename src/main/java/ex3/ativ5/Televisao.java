//Ex 5

package ex3.ativ5;

public class Televisao {
    private boolean ligada, silencioso;
    private int volume, canal;
    
    public Televisao() {
        this.ligada = false;
        this.silencioso = false;
        this.volume = 5;
        this.canal = 20;
    }
    
    public boolean getLigada() {
        return this.ligada;
    }
    
    public boolean getSilencioso() {
        return this.silencioso;
    }
    
    public int getCanal() {
        return this.canal;
    }
    
    public int getVolume() {
        return this.volume;
    }
    
    public void setLigada (int l) {
        this.ligada = l != 0;
    }
    
    public void setSilencioso (int s) {
        this.silencioso = s != 0;
    }
    
    public void setVolume (int v) {
        if (this.volume < 10 && v == 1) this.volume++;
        else if (this.volume > 0 && v == 0) this.volume--;
    }
    
    public void setCanalEsp (int c) {
        if (c >= 0 && c <= 99) this.canal = c;
        else System.out.println("CANAL INVALIDO");
    }
    
    public void setCanalPro() {
        if (this.canal < 99) this.canal++;
        else System.out.println("CANAL INVALIDO");
    }
    
    public void setCanalAnt() {
        if (this.canal > 0) this.canal--;
        else System.out.println("CANAL INVALIDO");
    }
}
