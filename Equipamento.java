/**
 * A classe Equipamento representa um equipamento com um nome, status de funcionamento
 * (ligado ou desligado) e uma capacidade predefinida.
 * 
 * <p>
 * A classe oferece métodos para ligar e desligar o equipamento, atualizando o status
 * e exibindo mensagens informativas.
 * </p>
 */
public class Equipamento {

    /**
     * Nome do equipamento.
     */
    public String nome;

    /**
     * Status de funcionamento do equipamento, indicando se está ligado (true) ou desligado (false).
     */
    public boolean Status;

    /**
     * Capacidade padrão do equipamento, definida como 6.
     */
    public int capacidade = 6;

    /**
     * Construtor da classe Equipamento.
     * 
     * @param nome O nome do equipamento.
     */
    public Equipamento(String nome) {
        this.nome = nome;
    }
    
    /**
     * Liga o equipamento, definindo o status como true e exibindo uma mensagem
     * de confirmação.
     */
    public void ligar() {
        this.Status = true;
        System.out.println(this.nome + " Está ligado");
    }

    /**
     * Desliga o equipamento, definindo o status como false e exibindo uma mensagem
     * de confirmação.
     */
    public void desligar() {
        this.Status = false;
        System.out.println(this.nome + " Está desligado");
    }
}

