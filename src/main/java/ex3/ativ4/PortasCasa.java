//Ex 4

package ex3.ativ4;

public class PortasCasa {
    private String local;
    private int estado; //0 -> porta fechada ; 1 -> porta aberta
    
    public PortasCasa() {
        this.estado = 0;
    }
    
    public String getLocal() {
        return this.local;
    }
    
    public int getEstado() {
        return this.estado;
    }
    
    public void setLocal(String local) {
        this.local = local;
    }
    
    public void setEstado(int estado) {
        this.estado = estado;
    }
}