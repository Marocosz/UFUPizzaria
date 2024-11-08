/**
 * A classe Fogao representa um tipo específico de equipamento utilizado para cozinhar e fritar alimentos.
 * 
 * <p>
 * Esta classe herda da classe Equipamento e adiciona métodos para cozinhar e fritar, 
 * utilizando ingredientes e interagindo com o estoque e o funcionário responsável.
 * </p>
 */
public class Fogao extends Equipamento {

    /**
     * Construtor da classe Fogao.
     * 
     * @param nome O nome do fogão.
     */
    public Fogao(String nome) {
        super(nome);
    }

    /**
     * Cozinha um ingrediente específico, utilizando o fogão.
     * 
     * <p>
     * Este método permite a um funcionário cozinhar um ingrediente, interagindo com o controle de estoque
     * para deduzir a quantidade utilizada com base na capacidade do fogão.
     * </p>
     * 
     * @param ingrediente O ingrediente a ser cozinhado.
     * @param ator O funcionário responsável pela operação.
     * @param estoque O controle de estoque para deduzir o ingrediente utilizado.
     */
    public void cozinhar(String ingrediente, Funcionario ator, ControleEstoque estoque) {
        // Interage com o controle de estoque para deduzir o ingrediente.
        // estoque.usarIngrediente(ingrediente, capacidade);
    }}

    
