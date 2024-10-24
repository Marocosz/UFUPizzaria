public class Funcionario {
    
    public String nome;
    public int id;
    private String cpf;
    private String descricao;
    

    public Funcionario(String nome, int id, String cpf, String descriçao){
        this.nome = nome;

        // If para determinar que a ID de pizzaiolo está como queremos
        // ============================ Precisa verificar erro 
        if(this instanceof Pizzaiolo) {
            if(id - 100 > 100) {
                System.out.println("Digite uma id correta para Pizzaiolo (início '1')");
            } else {
                this.id = id;
            }
        }

        // If para determinar que a ID de ajudante está como queremos
        // ============================ Precisa verificar erro
        if(this instanceof Ajudante) {
            if(id - 100 < 100) {
                System.out.println("Digite uma id correta para Ajudante (início '2')");
            } else {
                this.id = id;
            }
        }
        this.cpf = cpf;
        this.descricao = descriçao;
    }

    public void retirarPizzaForno(){
        System.out.println(this.nome + " retirou do forno");

        // If para determinar se a classe for ajudante, ganhará pontuação em seu XP
        // ============================ Precisa verificar erro
        if(this instanceof Ajudante) {
            ((Ajudante) this).xp += ((Ajudante) this).gerenciarXp(10);
        }
    }

    public void entregarPizza(){
        System.out.println(this.nome + " realizou a entrega");

        // If para determinar se a classe for ajudante, ganhará pontuação em seu XP
        // ============================ Precisa verificar erro
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