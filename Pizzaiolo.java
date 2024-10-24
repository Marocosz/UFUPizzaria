public class Pizzaiolo extends Funcionario {

    public Pizzaiolo(String nome, int id, String cpf, String descricao) throws IdPizzaioloInvalidaException, IdAjudanteInvalidaException {
        super(nome, id, cpf, descricao);       

    }

    public void prepararMassa(Pedido pedido) {
        System.out.println(this.nome + " preparou a(s) massa(s) do pedido: " + pedido.getId());
    }

    public void montarPizza(Pedido pedido) {
        System.out.println(this.nome + " montou a(s) pizzas(s) do pedido: " + pedido.getId());
    }
    
}
