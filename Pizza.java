import java.util.ArrayList;
import java.util.List;

public class Pizza {

    // Número do pedido ao qual a pizza pertence
    public int pNumPedido;

    // Código numérico da pizza, utilizado para determinar o tipo de pizza
    public int pNumPizza;

    // Lista de ingredientes da pizza
    public List<Ingredientes> ingredientes = new ArrayList<>();

    // Instância da classe ControleEstoque, usada para gerenciar o estoque de ingredientes
    public ControleEstoque controller = new ControleEstoque(); 
    
    // Status atual da pizza (0 = montada, 1 = assada, 2 = entregue)
    int status = 0;

    // Tipo da pizza, definido com base em pNumPizza
    String tipo = null;

    /**
     * Construtor da classe Pizza.
     * Define o número do pedido e da pizza, e atribui o tipo da pizza com base em pNumPizza.
     * Caso pNumPizza não corresponda a um tipo catalogado, o tipo será definido como "Pizza não catalogada."
     */
    public Pizza (int numPedido, int numPizza) {
        pNumPedido = numPedido;
        pNumPizza = numPizza;
        
        // Atribui o tipo de pizza com base no número pNumPizza
        switch (pNumPizza) {
            case 1:
                tipo = "Frango com Catupiry";
                break;
            case 2:
                tipo = "Quatro Queijos";
                break;
            case 3:
                tipo = "Marguerita";
                break;
            default:
                tipo = "Pizza não catalogada.";
                break;
        }
    }

    /**
     * Exibe o tipo da pizza e o número do pedido ao qual ela pertence.
     */
    public void exibirPizza() {
        System.out.println("Essa é uma pizza do tipo " + tipo + " Do pedido " + pNumPedido);
    }

    /**
     * Retorna o tipo da pizza como uma string.
     */
    public String exibirTipo() {
        return tipo;
    }

    /**
     * Adiciona um ingrediente à lista de ingredientes da pizza.
     * 
     * @param novo Ingrediente a ser adicionado.
     * Primeiro verifica a disponibilidade do ingrediente no estoque, e caso esteja disponível, adiciona à lista.
     */
    public void adiciona_ingrediente(Ingredientes novo){
        // Carrega o estoque atual
        controller.carregarEstoque("Estoque_08_11");

        // Verifica disponibilidade do ingrediente
        int disponivel = controller.usarIngrediente(novo);
        
        // Adiciona o ingrediente à lista se estiver disponível
        if (disponivel == 0){
            ingredientes.add(novo);
        }

        // Atualiza o estoque após uso do ingrediente
        controller.salvarEstoque("Estoque_08_11");
    }

    /**
     * Exibe o status atual da pizza em texto legível.
     */
    public void mostraStatus() {
        // Verifica o status da pizza e exibe a mensagem apropriada
        if (status == 0){
            System.out.println("O status da pizza " + tipo + " do pedido " + pNumPedido +  " é: montada");
        }
        else if (status == 1){
            System.out.println("O status da pizza " + tipo + " do pedido " + pNumPedido +  " é: assada");
        }
        else if (status == 2){
            System.out.println("O status da pizza " + tipo + " do pedido " + pNumPedido +  " é: entregue");
        }
    }

    /**
     * Atualiza o status da pizza, permitindo apenas transições de status válidas.
     * 
     * @param valor Novo status desejado (1 para assada, 2 para entregue).
     * Valida a transição de status: somente muda para assada se o status atual for montada, 
     * e somente para entregue se o status atual for assada.
     */
    public void attStatus(int valor) {
        if (this.status == 0 & valor == 1) {
            this.status = valor;  // Transição válida: montada -> assada
        } else if (this.status == 1 & valor == 2) {
            this.status = valor;  // Transição válida: assada -> entregue
        } else {
            System.out.println("Não foi possível mudar o status da pizza");
        }
    }

    /**
     * Retorna o status atual da pizza.
     * 
     * @return status inteiro representando o estado da pizza.
     */
    public int getStatus() {
        return status;
    }
    
}

