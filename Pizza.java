import java.util.ArrayList;
import java.util.List;

public class Pizza {

    public int pNumPedido;
    public int pNumPizza;
    public List<Ingredientes> ingredientes = new ArrayList<>();

    public Pizza (int numPedido, int numPizza) {
        pNumPedido = numPedido;
        pNumPizza = numPizza;
    }


    public void exibirPizza() {
        System.out.println("Essa é uma pizza do tipo " + pNumPizza + " Do pedido " + pNumPedido);

    }

    
    public void adiciona_ingrediente(Ingredientes novo){
        ingredientes.add(novo);
    }
    
}
