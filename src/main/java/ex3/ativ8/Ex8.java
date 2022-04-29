package ex3.ativ8;

public class Ex8 {
    public static void imprimirCelular (Celular celular) {
        double nivel = (celular.getBateria().getAtualCarga()*100.0/celular.getBateria().getCapacidadeCarga());
        System.out.printf ("NIVEL DE BATERIA: %.0f%%", nivel);
    }
    
    public static void historico (int texto, int chamadas) {
        System.out.printf ("\n\nForam enviadas %d mensagens de texo\n", texto);
        System.out.printf ("O total de chamadas durou %d segundos\n\n", chamadas);
    }
    
    public static void main (String[] args) {
        int texto, chamadas;
        Celular celular = new Celular(3000, 3000);
        System.out.println ("ESTADO INICIAL DO CELULAR: ");
        imprimirCelular(celular);
        texto = 10;
        chamadas = 400;
        historico (texto, chamadas);
        celular.setBateria(texto);
        celular.setBateria(chamadas/5);
        System.out.println ("ESTADO ATUAL DO CELULAR: ");
        imprimirCelular(celular);
        texto = 100;
        chamadas = 600;
        historico (texto, chamadas);
        celular.setBateria(texto);
        celular.setBateria(chamadas/5);
        System.out.println ("ESTADO ATUAL DO CELULAR: ");
        imprimirCelular(celular);
        texto = 300;
        chamadas = 5000;
        historico (texto, chamadas);
        celular.setBateria(texto);
        celular.setBateria(chamadas/5);
        System.out.println ("ESTADO ATUAL DO CELULAR: ");
        imprimirCelular(celular);
    }
}
