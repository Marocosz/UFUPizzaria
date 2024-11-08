public class Funcionario {
    
    public String nome;
    public int id;
    private String cpf;
    private String descricao;
    

    public Funcionario(String nome, int id, String cpf, String descriçao) throws IdPizzaioloInvalidaException, IdAjudanteInvalidaException{
        this.nome = nome;

        // If para determinar que a ID de pizzaiolo está como queremos
         
        if(this instanceof Pizzaiolo) {
            if(id - 100 > 100) {
                throw new IdPizzaioloInvalidaException("ID de Pizzaiolo inválida. A ID deve começar com '1'.");
            } else {
                this.id = id;
            }
        }

        // If para determinar que a ID de ajudante está como queremos
        
        if(this instanceof Ajudante) {
            if(id - 100 < 100) {
                throw new IdAjudanteInvalidaException("ID de Ajudante inválido. A ID deve começar com '2'.");
            } else {
                this.id = id;
            }
        }
        this.cpf = cpf;
        this.descricao = descriçao;
    }
    

    public void entregarPizza(Pedido nPedido, int index) {
        for (int i = 0; i < nPedido.pizzas.size(); i = i + 1) {
            if (i == index) {
                if (nPedido.pizzas.get(i).status == 1) {
                    System.out.println("A pizza: " + nPedido.pizzas.get(i) + "do pedido: " + nPedido.getId() + "Está entregue");
                    nPedido.pizzas.get(i).attStatus(2);

                } else if (nPedido.pizzas.get(i).status == -1) {
                    System.out.println("A pizza precisa ser montada primeiro!");

                } else if (nPedido.pizzas.get(i).status == 0) {
                    System.out.println("A pizza precisa ser assada primeiro!");

                } else if (nPedido.pizzas.get(i).status == 2) {
                    System.out.println("A pizza já foi entregue!");
                }

            } else {
                System.out.println("Não há essa quantidade de pizzas no " + nPedido.getId());
            }
        }
        

        // If para determinar se a classe for ajudante, ganhará pontuação em seu XP
        if(this instanceof Ajudante) {
            ((Ajudante) this).xp += ((Ajudante) this).gerenciarXp(10);
        }
    
    }


    public String mostrarDescriçao(){
        return this.descricao;
    }


    public void mostrarCpf(){
        System.out.println("O CPF de: " + this.nome + "é: " + this.cpf);
    }

}