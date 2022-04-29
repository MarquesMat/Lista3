package ex3.ativ7;

public class Ex7 {
    public static void recibo (Pedido pedido) {
        int i;
        System.out.println ("RESUMO DO PEDIDO: ");
        for (i=0; i<pedido.getQtd_itens(); i++) {
            System.out.printf ("Item %d: %s\n%d x %.2f\n",(i+1),pedido.getItens(i).getProduto().getNome(),pedido.getItens(i).getQtd(),pedido.getItens(i).getProduto().getPreco());
            pedido.setTotal(pedido.getItens(i).getQtd()*pedido.getItens(i).getProduto().getPreco());
        }
        System.out.printf ("VALOR TOTAL: %.2f\n", pedido.getTotal());
        System.out.printf ("FORMA DE PAGAMENTO: %s", pedido.getPagamento());
    }
    
    public static void main (String[] args) {
        //Criando produtos:
        Produto refri = new Produto("Coca-cola", 5.50, 80);
        Produto carne = new Produto("Alcatra", 49.90, 21);
        Produto alcool = new Produto("Vinho", 25.90, 32);
        
        //Criando itens:
        Item item1 = new Item(refri, 3);
        Item item2 = new Item(carne, 1);
        Item item3 = new Item(alcool, 2);
        
        //Criando pedido:
        Pedido pedido = new Pedido();
        pedido.setPedido(item1);
        pedido.setPedido(item2);
        pedido.setPedido(item3);
        pedido.setPagamento("Cartao");
        
        //Imprimindo pedido:
        recibo (pedido);
    }
}
