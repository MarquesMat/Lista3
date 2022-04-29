package ex3.ativ3;

import java.util.Scanner;

public class Ex3 {
    public static void imprimirPorta(Porta porta) {
        System.out.print("\n\nDIMENSOES: "+porta.getDimensoes());
        System.out.print("\nCOR: "+porta.getCor());
        Porta.estaAberta(porta.getEstado());
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Porta porta = new Porta(0, "marrom", "1.0x2.1");
        imprimirPorta(porta); //porta antes das alterações
        System.out.print("\n\nSelecione ABRIR(1) OU FECHAR(0) a porta: ");
        porta.setEstado(teclado.nextInt());
        System.out.print("Selecione a nova cor: ");
        porta.setCor(teclado.next());
        System.out.print("Selecione as novas dimensoes: ");
        porta.setDimensoes(teclado.next());
        imprimirPorta(porta); //porta depois das alterações
    }
}
