package ex3.ativ4;

import java.util.Scanner;

public class Ex4 {
    public static void quantasPortasEstaoAbertas (int p1, int p2, int p3) {
        System.out.printf("\n\nHa %d portas abertas na casa.", (p1+p2+p3));
    }
    
    public static void localPortas (PortasCasa porta, int i) {
        Scanner teclado = new Scanner(System.in);
        System.out.printf ("\nDigite o local da porta %d: ", i);
        porta.setLocal(teclado.next());
    }
    
    public static void estadoPortas (PortasCasa porta) {
        Scanner teclado = new Scanner(System.in);
        System.out.printf ("\nSelecione ABRIR(1) ou FECHAR(0) a porta de %s: ", porta.getLocal());
        porta.setEstado(teclado.nextInt());
    }
    
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        Casa casa = new Casa();
        PortasCasa porta1 = new PortasCasa(), porta2 = new PortasCasa(), porta3 = new PortasCasa();
        System.out.print("\nEscolha a cor da casa: ");
        casa.setCor(teclado.next());
        localPortas(porta1, 1);
        localPortas(porta2, 2);
        localPortas(porta3, 3);
        estadoPortas(porta1);
        estadoPortas(porta2);
        estadoPortas(porta3);
        quantasPortasEstaoAbertas(porta1.getEstado(), porta2.getEstado(), porta3.getEstado());
    }
}
