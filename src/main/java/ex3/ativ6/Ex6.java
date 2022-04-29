package ex3.ativ6;

public class Ex6 {
    public static void imprimirBaralho (Baralho baralho) {
        int i;
        for (i=0; i<52; i++) {
            if (baralho.getCartas(i).getNumero() > 1 && baralho.getCartas(i).getNumero() < 11)
                    System.out.printf ("-> %d de %s\n", baralho.getCartas(i).getNumero(), baralho.getCartas(i).getNaipe());
            else {
                switch (baralho.getCartas(i).getNumero()) {
                    case 1 -> System.out.printf ("-> As de %s\n", baralho.getCartas(i).getNaipe());
                    case 11 -> System.out.printf ("-> Valete de %s\n", baralho.getCartas(i).getNaipe());
                    case 12 -> System.out.printf ("-> Dama de %s\n", baralho.getCartas(i).getNaipe());
                    case 13 -> System.out.printf ("-> Rei de %s\n", baralho.getCartas(i).getNaipe());
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Baralho baralho = new Baralho();
        int i, j;
        String[] naipes = new String[4];
        naipes[0] = "copas";
        naipes[1] = "espadas";
        naipes[2] = "ouros";
        naipes[3] = "paus";
        for (i=0; i<4; i++) {
            for (j=1; j<= 13; j++) {
                Carta carta = new Carta(j, naipes[i]);
                baralho.setCartas(carta);
            }
        }
        imprimirBaralho(baralho);
    }
}
