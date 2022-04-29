package ex3.ativ5;

import java.util.Scanner;

public class Ex5 {
    public static void estado (Televisao tv) {
        if (tv.getLigada()) System.out.println ("A TV ESTA LIGADA");
        else System.out.println ("A TV ESTA DESLIGADA");
        System.out.println ("CANAL: "+tv.getCanal());
        System.out.println ("VOLUME: "+tv.getVolume());
        if (tv.getSilencioso()) System.out.println ("A TV ESTA SILENCIADA");
        else System.out.println ("A TV NAO ESTA SILENCIADA");
    }
    
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        Televisao tv = new Televisao();
        int n;
        System.out.println("ESTADO INICIAL DA TV:");
        estado (tv);
        System.out.print ("\nSelecione LIGAR(1) ou DESLIGAR(0) TV: ");
        tv.setLigada(teclado.nextInt());
        System.out.print ("Digite o canal especifico ou digite -1 para mudar manualmente: ");
        n = teclado.nextInt();
        if (n != -1) tv.setCanalEsp(n);
        else {
            System.out.print ("Selecione PROXIMO(1) ou ANTERIOR(0): ");
            n = teclado.nextInt();
            if (n != 0) tv.setCanalPro();
            else tv.setCanalAnt();
        }        
        System.out.print ("Selecione AUMENTAR(1) ou DIMINUIR(0) volume: ");
        n = teclado.nextInt();
        tv.setVolume(n);
        System.out.print ("Selecione SILENCIAR(1) ou DESSILENCIAR(0): ");
        n = teclado.nextInt();
        tv.setSilencioso(n);
        System.out.println("\nESTADO ATUAL DA TV:");
        estado (tv);
    }
}