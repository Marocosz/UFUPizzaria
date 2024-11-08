import java.util.ArrayList;
import java.util.List;

public class Pizza {

    public int pNumPedido;
    public int pNumPizza;
    public List<Ingredientes> ingredientes = new ArrayList<>();
    public ControleEstoque controller = new ControleEstoque(); 
    int status = 0;

    public Pizza (int numPedido, int numPizza) {
        pNumPedido = numPedido;
        pNumPizza = numPizza;
    }


    public void exibirPizza() {
        System.out.println("Essa é uma pizza do tipo " + pNumPizza + " Do pedido " + pNumPedido);

    }

    
    public void adiciona_ingrediente(Ingredientes novo){
        controller.carregarEstoque("Estoque_08_11");
        int disponivel = controller.usarIngrediente(novo);
        if (disponivel == 0){
            ingredientes.add(novo);
        }
        controller.salvarEstoque("Estoque_08_11");
    }

    public void mostraStatus() {
        if (status == 0){
            System.out.println("O status da pizza " + pNumPizza + " é: montada");
        }
        else if (status == 1){
            System.out.println("O status da pizza " + pNumPizza + " é: assada");
        }
        else if (status == 2){
            System.out.println("O status da pizza " + pNumPizza + " é: entregue");
        }
        
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
