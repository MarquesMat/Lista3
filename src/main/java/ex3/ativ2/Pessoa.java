//Ex 2

package ex3.ativ2;

public class Pessoa {
    private String nome;
    private int idade;
    
    public Pessoa (String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public Pessoa () {
    //Objeto vazio
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public int getIdade() {
        return this.idade;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
