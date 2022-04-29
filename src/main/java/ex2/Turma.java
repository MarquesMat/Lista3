package ex2;

public class Turma {
    private int totalAlunos, sala;
    private String horario;
    private double[] medias[];
    Aluno[] alunos = new Aluno[80];
    
    public double[] getMedia(int i) {
        return this.medias[i];
    }
    
    public String getHorario() {
        return this.horario;
    }
}
