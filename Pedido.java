import java.util.ArrayList;
import java.util.List;

// Classe Pedido representa um pedido de pizzas com um identificador exclusivo e uma lista de pizzas
public class Pedido {
    
    private static int contadorId = 0;  // Contador estático para gerar IDs únicos para cada pedido
    private int id;                     // ID do pedido
    public int[] nPizzas;               // Array que armazena os tipos de pizzas solicitadas
    public List<Pizza> pizzas = new ArrayList<>();  // Lista que contém as pizzas associadas ao pedido
    

    // Construtor da classe Pedido que recebe um número variável de tipos de pizzas (int... nPizzas)
    public Pedido(int... nPizzas) {
        contadorId++;                   // Incrementa o contador para criar um novo ID
        this.id = contadorId;           // Atribui o ID ao pedido atual
        this.nPizzas = nPizzas;         // Armazena os tipos de pizzas solicitadas
        this.criandoPizzas();           // Chama o método para criar as pizzas com base nos tipos
    }
    

    // Retorna os tipos de pizzas solicitadas
    public int[] getPizzas() {
        return nPizzas;
    }

    // Retorna a lista de pizzas associadas ao pedido
    public List<Pizza> getPizzasArray(){
        return pizzas;
    }
    

    // Retorna a quantidade de tipos de pizzas solicitadas
    public int getQuantidade() {
        return nPizzas.length;
    }
    

    // Retorna o ID do pedido
    public int getId() {
        return id;
    }
    

    // Exibe os tipos de pizzas pedidas no pedido atual
    public void pizzasPedidas() {
        for(int i = 0; i < nPizzas.length; i = i + 1) {
            // Identifica cada tipo de pizza com base no valor em nPizzas[i]
            switch (nPizzas[i]) {
                case 1 -> System.out.println("1 Pizza Frango com Catupiry");
                case 2 -> System.out.println("1 Pizza 4 queijos");
                case 3 -> System.out.println("1 Pizza Marguerita");
                default -> System.out.println("Pedido não processado");
            }
        }
        
        // Exibe a quantidade total de pizzas
        System.out.println("Pizzas totais: " + this.getQuantidade());
        System.out.println("========================================");
    } 


    // Cria as pizzas com base nos tipos especificados em nPizzas e adiciona à lista pizzas
    public void criandoPizzas() {
        for(int i = 0; i < nPizzas.length; i = i + 1) {
            // Cria uma pizza específica com base no valor em nPizzas[i]
            switch (nPizzas[i]) {
                case 1:
                    Pizza pizza = new FrangoCatupiry(this.getId(), nPizzas[i]);
                    pizzas.add(pizza);
                    break;
                case 2:
                    Pizza pizza2 = new QuatroQueijos(this.getId(), nPizzas[i]);
                    pizzas.add(pizza2);
                    break;
                case 3:
                    Pizza pizza3 = new Marguerita(this.getId(), nPizzas[i]);
                    pizzas.add(pizza3);
                    break;
            }
        }
    }

    // Exibe as informações das pizzas no pedido atual
    public void printPizzasPedido() {
        for (int i = 0; i < pizzas.size(); i = i + 1) {
            this.pizzas.get(i).exibirPizza();  // Chama o método exibirPizza() para cada pizza na lista
        }
    }
}
