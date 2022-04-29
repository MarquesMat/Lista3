package ex3.ativ2;

import java.util.Scanner;

public class Ex2 {
    public static void imprimirPessoa (Pessoa pessoa) {
        System.out.printf ("NOME: %s\n", pessoa.getNome());
        System.out.printf ("IDADE: %d\n\n", pessoa.getIdade());
    }
    
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Scanner teclado = new Scanner(System.in);
        int n;
        System.out.print("Insira o nome da pessoa: ");
        pessoa.setNome(teclado.next());
        System.out.print("Insira a idade inicial da pessoa: ");
        pessoa.setIdade(teclado.nextInt());
        System.out.println ("\nDADOS INICIAIS:");
        imprimirPessoa(pessoa);
        System.out.print("Insira o numero aniversarios esta pessoa ja fez: ");
        pessoa.setIdade(pessoa.getIdade()+teclado.nextInt());
        System.out.println ("\nDADOS ATUAIS:");
        imprimirPessoa(pessoa);
    }
}
