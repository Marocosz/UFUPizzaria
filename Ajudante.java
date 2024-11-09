// Classe que representa um ajudante de cozinha, herda as características básicas de um Funcionario.
public class Ajudante extends Funcionario {

    // Atributo que armazena a experiência do ajudante.
    public int xp;

    // Construtor que inicializa um Ajudante com nome, id, cpf, e uma descrição.
    // Lança uma exceção se o ID do ajudante não estiver no intervalo válido (entre 200 e 299).
    public Ajudante(String nome, int id, String cpf, String descricao) throws IdAjudanteInvalidaException {
        super(nome, id, cpf, descricao);
        if (id < 200 || id >= 300) {
            throw new IdAjudanteInvalidaException("ID de Ajudante inválido. A ID deve estar entre 200 e 299.");
        }
    }

    // Método para simular a ação de lavar louça realizada pelo ajudante.
    // Adiciona 5 pontos de experiência ao ajudante ao completar a tarefa.
    public void lavarLouca() {
        System.out.println(this.nome + " lavou a louça");
        this.xp += this.gerenciarXp(5);
    }

    // Método para simular a ação de limpar a cozinha realizada pelo ajudante.
    // Adiciona 5 pontos de experiência ao ajudante ao completar a tarefa.
    public void limparCozinha() {
        System.out.println(this.nome + " lavou a cozinha");
        this.xp += this.gerenciarXp(5);
    }

    // Método para simular a ação de organizar os ingredientes realizada pelo ajudante.
    // Adiciona 5 pontos de experiência ao ajudante ao completar a tarefa.
    public void organizarIngredientes() {
        System.out.println(this.nome + " organizou os ingredientes");
        this.xp += this.gerenciarXp(5);
    }

    // Método que gerencia os pontos de experiência adicionados ao ajudante.
    // Se o ajudante tiver mais de 300 pontos de experiência, exibe uma mensagem indicando que ele pode ser promovido a pizzaiolo.
    // Caso contrário, retorna a pontuação para ser adicionada à experiência.
    public int gerenciarXp(int pontuacao) {
        if (this.xp > 300) {
            System.out.println(this.nome + " pode ser Pizzaiolo agora!!");
        } else {
            return pontuacao;
        }
        return 0; // Retorna 0 caso a mensagem de promoção tenha sido exibida.
    }

    // Método que exibe a quantidade de experiência acumulada pelo ajudante.
    public void mostrarXp() {
        System.out.println("O xp de " + this.nome + " é: " + this.xp);
    }

}
