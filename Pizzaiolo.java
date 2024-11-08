public class Pizzaiolo extends Funcionario {

    public Pizzaiolo(String nome, int id, String cpf, String descricao) throws IdPizzaioloInvalidaException {
        super(nome, id, cpf, descricao);
        if (id < 100 || id >= 200) {
            throw new IdPizzaioloInvalidaException("ID de Pizzaiolo inválido. A ID deve estar entre 100 e 199.");
        }
    }


    public void montarPizza(Pedido nPedido, int index) {
        for (int i = 0; i < nPedido.pizzas.size(); i = i + 1) {
            if (i == index) {
                if (nPedido.pizzas.get(i).status == -1) {
                    System.out.println("A pizza: " + nPedido.pizzas.get(i) + "do pedido: " + nPedido.getId() + "Está montada!");
                    nPedido.pizzas.get(i).attStatus(0);

                } else if (nPedido.pizzas.get(i).status == 0) {
                    System.out.println("A pizza já está montada!");

                } else if (nPedido.pizzas.get(i).status == 1) {
                    System.out.println("A pizza já foi assada!");

                } else if (nPedido.pizzas.get(i).status == 2) {
                    System.out.println("A pizza já foi entregue!");
                }

            } else {
                System.out.println("Não há essa quantidade de pizzas no " + nPedido.getId());
            }
        }
    }
    
}
