package ex2;

public class Aluno {
    private String nome, historico;
    private int matricula, semestre;
    private double[] medias[];
    private double CR;
    Disciplina[] disciplinas = new Disciplina[6];
    
    public String getHistorico() {
        return this.historico;
    }
    
    public double getCR() {
        return this.CR;
    }
}
