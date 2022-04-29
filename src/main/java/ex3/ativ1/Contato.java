//Ex 1

package ex3.ativ1;

public class Contato {
    private String nome, end;
    private int idade, tel;
    
    public Contato (String nome, String end, int idade, int tel) {
        this.nome = nome;
        this.end = end;
        this.idade = idade;
        this.tel = tel;
    }
    
    public String getNome () {
        return this.nome;
    }
    
    public String getEnd () {
        return this.end;
    }
    
    public int getIdade () {
        return this.idade;
    }
    
    public int getTel () {
        return this.tel;
    }
}
