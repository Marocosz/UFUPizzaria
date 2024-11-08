import java.util.ArrayList;
import java.util.List;

public class Pedido {
    
    private static int contadorId = 0;
    private int id;
    public int[] nPizzas;
    public List<Pizza> pizzas = new ArrayList<>();
    

    public Pedido (int... nPizzas) {
        contadorId++;
        this.id = contadorId;
        this.nPizzas = nPizzas;
        this.criandoPizzas();
        
    }
    

    public int[] getPizzas() {
        return nPizzas;
    }
    

    public int getQuantidade() {
        return nPizzas.length;
    }
    

    public int getId() {
        return id;
    }
    

    public void pizzasPedidas() {
        for(int i =0; i < nPizzas.length; i = i + 1){
            switch (nPizzas[i]) {
                case 1 -> System.out.println("1 Pizza Frango com Catupiry");
                case 2 -> System.out.println("1 Pizza 4 queijos");
                case 3 -> System.out.println("1 Pizza Marguerita");
                default -> System.out.println("Pedido não processado");
            }
        }
        
        System.out.println("Pizzas totais: " + this.getQuantidade());
        System.out.println("========================================");
    } 


    public void criandoPizzas() {

        for(int i =0; i < nPizzas.length; i = i + 1){
            

            switch (nPizzas[i]) {
                case 1:
                    Pizza pizza = new FrangoCatupiry(this.getId(), nPizzas[i]);
                    pizzas.add(pizza);
                case 2:
                    Pizza pizza2 = new QuatroQueijos(this.getId(), nPizzas[i]);
                    pizzas.add(pizza2);
                case 3:
                    Pizza pizza3 = new Marguerita(this.getId(), nPizzas[i]);
                    pizzas.add(pizza3);
            }
        }

    }

    public void printPizzasPedido() {
        for (int i = 0; i < pizzas.size(); i = i + 1) {
            this.pizzas.get(i).exibirPizza();

        }
    }




}
