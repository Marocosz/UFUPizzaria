import java.util.ArrayList;
import java.util.List;

public class Pizza {

    public int pNumPedido;
    public int pNumPizza;
    public List<Estoque> ingredientes = new ArrayList<>();

    int status = 0;

    public Pizza (int numPedido, int numPizza) {
        pNumPedido = numPedido;
        pNumPizza = numPizza;
    }


    public void exibirPizza() {
        System.out.println("Essa é uma pizza do tipo " + pNumPizza + " Do pedido " + pNumPedido);

    }

    
    public void adiciona_ingrediente(Estoque novo){
        ingredientes.add(novo);
    }

    public void mostraStatus() {
        
    }


    public void attStatus(int valor) {
        if (this.status == 0 & valor == 1) {
            this.status = valor;
        } else if (this.status == 1 & valor == 2) {
            this.status = valor;
        } else {
            System.out.println("Não foi possível mudar o status da pizza");
        }
        
    }
    
}
