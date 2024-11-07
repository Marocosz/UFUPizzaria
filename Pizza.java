public class Pizza {

    public int pNumPedido;
    public int pNumPizza;

    public Pizza (int numPedido, int numPizza) {
        pNumPedido = numPedido;
        pNumPizza = numPizza;

    }


    public void exibirPizza() {
        System.out.println("Essa é uma pizza do tipo " + pNumPizza + " Do pedido " + pNumPedido);

    }
    
}
