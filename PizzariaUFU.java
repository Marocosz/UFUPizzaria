import java.util.List;

public class PizzariaUFU {

    public static void main(String[] args) {
    
        Funcionario pizzaiolo1 = null;
        Funcionario ajudante1 = null;

        try {
            pizzaiolo1 = new Pizzaiolo("Carlos", 150, "123.456.789-10", "Pizzaiolo experiente");
            System.out.println("Pizzaiolo criado com sucesso!");
        } catch (IdPizzaioloInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            ajudante1 = new Ajudante("João", 250, "987.654.321-00", "Ajudante recém contratado");
            System.out.println("Ajudante criado com sucesso!");
        } catch (IdAjudanteInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        Fogao fogao1 = new Fogao("Fogão lado esquerdo da entrada");

        Forno forno1 = new Forno("Forno do lado esquerda da geladeira");
        Forno forno2 = new Forno("Forno do lado direito da entrada");


        Pedido p1 = new Pedido(2,2,2 );
        Pedido p2 = new Pedido(1, 3);
        Pedido p3 = new Pedido(1);

        ControleEstoque estoque1211 = new ControleEstoque();

        estoque1211.carregarEstoque("Estoque_08_11");
        //estoque1211.mostrarEstoque();

        fogao1.ligar();
        forno1.ligar();
        forno2.ligar();

        forno1.assar(p3, 1);

        List<Pizza> pizzas_p3 = p3.getPizzasArray();
        pizzas_p3.get(1).mostraStatus();

        forno2.assar(p1, 3);

        List<Pizza> pizzas_p1 = p1.getPizzasArray();
        pizzas_p1.get(3).mostraStatus();

        // PROBLEMA EM CRIAR FUNCIONARIOS DEVIDO TRY E CATCH QUE É DEVIDO AOS ERROS EXCEPTION
        // pizzaiolo1.

        pizzaiolo1.mostrarCpf();
        ajudante1.mostrarCpf();


        /*  Criando estoque para teste
        
        Estoque estoque0811 = new Estoque();

        estoque0811.addIngrediente("Frango Desfiado", 1000);
        estoque0811.addIngrediente("Queijo Mussarela", 1000);
        estoque0811.addIngrediente("Queijo Cheddar", 1000);
        estoque0811.addIngrediente("Queijo Catupiry", 1000);
        estoque0811.addIngrediente("Queijo Parmesão", 1000);
        estoque0811.addIngrediente("Molho Tomate", 1000);
        estoque0811.addIngrediente("Tomate", 1000);
        estoque0811.addIngrediente("Milho Verde", 1000);
        estoque0811.addIngrediente("Manjericão", 1000);
        estoque0811.addIngrediente("Massa", 50);

        estoque0811.mostrarEstoque();

        estoque0811.salvarEstoque("Estoque_08_11");
        */

    }

}



