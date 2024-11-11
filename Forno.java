import java.util.List;

// Classe que representa um Forno, que é um tipo de Equipamento.
public class Forno extends Equipamento {

    // Construtor da classe Forno que chama o construtor da classe base Equipamento.
    public Forno(String nome) {
        super(nome);
    }

    // Método para assar um certo número de pizzas de um pedido.
    // Verifica o status de cada pizza antes de realizar a ação de assar.
    public void assar(Pedido pedido, int quantidade) {
        // Obtém a lista de pizzas do pedido.
        List<Pizza> pizzas = pedido.getPizzasArray();

        Pizza pizza = null;  // Declaração de uma variável para armazenar a pizza atual.

        // Percorre a lista de pizzas para assar o número solicitado de pizzas ou até acabar a lista.
        for (int i = 0; i < quantidade && i < pizzas.size(); i++) {
            pizza = pizzas.get(i);  // Seleciona a pizza atual.

            // Verifica o status da pizza antes de assar.
            if (pizza.getStatus() == 0) {
                // Caso a pizza esteja montada (status 0), assa a pizza.
                System.out.println("A pizza " + pizza.exibirTipo() + " do pedido " + pedido.getId() + " está assada");
                pizza.attStatus(1);  // Atualiza o status da pizza para "assada" (status 1).
            } else if (pizza.getStatus() == -1) {
                // Caso a pizza não esteja montada (status -1), exibe uma mensagem de aviso.
                System.out.println("A pizza precisa ser montada primeiro!");
            } else if (pizza.getStatus() == 1) {
                // Caso a pizza já esteja assada (status 1), exibe uma mensagem informativa.
                System.out.println("A pizza já foi assada!");
            } else if (pizza.getStatus() == 2) {
                // Caso a pizza já tenha sido entregue (status 2), exibe uma mensagem informativa.
                System.out.println("A pizza já foi entregue!");
            }
        }
    }
}


