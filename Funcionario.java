// Classe Funcionario representa um funcionário genérico na pizzaria
public class Funcionario {
    
    // Atributos públicos de identificação do funcionário
    public String nome;
    public int id;

    // Atributos privados para maior segurança, acessíveis apenas dentro da classe Funcionario
    private String cpf;
    private String descricao;
    
    // Construtor da classe Funcionario que inicializa os atributos com valores recebidos
    public Funcionario(String nome, int id, String cpf, String descricao) {
        this.nome = nome;
        this.id = id;
        this.cpf = cpf;
        this.descricao = descricao;
    }
    
    // Método para entregar pizzas de um pedido, verificando o status de cada pizza antes de entregá-la
    public void entregarPizza(Pedido nPedido, int index) {
        for (int i = 0; i < nPedido.pizzas.size(); i++) {  // Itera sobre as pizzas do pedido
            if (i <= index) {  // Verifica se a pizza está dentro do índice fornecido
                // Checa o status da pizza para decidir se pode ser entregue
                if (nPedido.pizzas.get(i).status == 1) {  // Status 1 significa "assada"
                    System.out.println("A pizza: " + nPedido.pizzas.get(i) + " do pedido: " + nPedido.getId() + " está entregue");
                    nPedido.pizzas.get(i).attStatus(2);  // Atualiza o status para 2 (entregue)

                } else if (nPedido.pizzas.get(i).status == -1) {
                    System.out.println("A pizza precisa ser montada primeiro!");

                } else if (nPedido.pizzas.get(i).status == 0) {
                    System.out.println("A pizza precisa ser assada primeiro!");

                } else if (nPedido.pizzas.get(i).status == 2) {
                    System.out.println("A pizza já foi entregue!");
                }

            } else {
                // Se o índice for maior que o número de pizzas, exibe uma mensagem de erro
                System.out.println("Não há essa quantidade de pizzas no " + nPedido.getId());
            }
        }
        
        // Se o funcionário for um ajudante, ele ganha XP ao realizar uma entrega
        if(this instanceof Ajudante) {
            ((Ajudante) this).xp += ((Ajudante) this).gerenciarXp(10);
        }
    }

    // Método para exibir a descrição do funcionário
    public String mostrarDescriçao() {
        return this.descricao;
    }

    // Método para exibir o CPF do funcionário
    public void mostrarCpf() {
        System.out.println("O CPF de " + this.nome + " é: " + this.cpf);
    }
}
