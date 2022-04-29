//Ex 1

package ex3.ativ1;

public class Agenda {
    private Contato[] contatos = new Contato[100];
    private int qtdContatos = -1;
    
    public String getNome(int i) {
        return this.contatos[i].getNome();
    }
    
    public int getTel(int i) {
        return this.contatos[i].getTel();
    }
    
    public int getIdade(int i) {
        return this.contatos[i].getIdade();
    }
    
    public String getEnd(int i) {
        return this.contatos[i].getEnd();
    }
    
    public int getQtdContatos() {
        return this.qtdContatos;
    }
    
    public void setQtdContatos() {
        this.qtdContatos++;
    }
    
    public void addContato(String nome, String end, int idade, int tel) {
        Contato contato = new Contato(nome, end, idade, tel);
        this.contatos[this.qtdContatos] = contato;
    }
}
