package ex4;

public class Data {
    private int dia, mesInt, ano, diasAno;
    private String mesStr;
    
    public Data (int dd, int mm, int aaaa) {
        this.dia = dd;
        this.mesInt = mm;
        this.ano = aaaa;
    }
    
    public Data (int dd, String mm, int aaaa) {
        this.dia = dd;
        this.mesStr = mm;
        this.ano = aaaa;
    }
    
    public Data (int diasAno, int aaaa) {
        this.diasAno = diasAno;
        this.ano = aaaa;
    }
    
    public int getDia() {
        return this.dia;
    }
    
    public int getMesInt() {
        return this.mesInt;
    }
    
    public int getAno() {
        return this.ano;
    }
    
    public int getDiasAno() {
        return this.diasAno;
    }
    
    public String getMesStr() {
        return this.mesStr;
    }
}
