public class Forno extends Equipamento {

    public Forno(String nome) {
        super(nome);
    }

    public void assar(Pedido nPedido, int index) {
        for (int i = 0; i < nPedido.pizzas.size(); i = i + 1) {
            if (i <= index) {
                if (nPedido.pizzas.get(i).status == 0) {
                    System.out.println("A pizza: " + nPedido.pizzas.get(i) + "do pedido " + nPedido.getId() + " Está assada");
                    nPedido.pizzas.get(i).attStatus(1);

                } else if (nPedido.pizzas.get(i).status == -1) {
                    System.out.println("A pizza precisa ser montada primeiro!");

                } else if (nPedido.pizzas.get(i).status == 1) {
                    System.out.println("A pizza ja foi assada!");

                } else if (nPedido.pizzas.get(i).status == 2) {
                    System.out.println("A pizza já foi entregue!");
                }

            } else {
                System.out.println("Não há essa quantidade de pizzas no " + nPedido.getId());
            }
        }
        
    }
    
}
