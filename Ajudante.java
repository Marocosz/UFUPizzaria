public class Ajudante extends Funcionario {

    public int xp;

    public Ajudante(String nome, int id, String cpf, String descricao) throws IdAjudanteInvalidaException {
        super(nome, id, cpf, descricao);
        if (id < 200 || id >= 300) {
            throw new IdAjudanteInvalidaException("ID de Ajudante inválido. A ID deve estar entre 200 e 299.");
        }
    }


    public void lavarLouca() {
        System.out.println(this.nome + " lavou a louça");
        this.xp += this.gerenciarXp(5);   

    }


    public void limparCozinha() {
        System.out.println(this.nome + " lavou a cozinha");
        this.xp += this.gerenciarXp(5);

    }
    

    public void organizarIngredientes() {
        System.out.println(this.nome + " organizou os ingredientes");
        this.xp += this.gerenciarXp(5);
    }


    public int gerenciarXp(int pontuacao) {
        if(this.xp > 300) {
            System.out.println(this.nome + " pode ser Pizzaiolo agora!!");
        } else {
            return pontuacao;
        }
        return 0;
    }

    
    public void mostrarXp() {
        System.out.println("O xp de "+ this.nome + " é: " + this.xp);
    }

}
