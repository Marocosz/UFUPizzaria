public class Funcionario {
    
    private String nome;
    public int id;
    private int cpf;
    private String descriçao;
    

    public Funcionario(String nome, int id, int cpf, String descriçao){
        this.nome = nome;
        this.id = id;
        this.cpf = cpf;
        this.descriçao = descriçao;

    
}
    public void retirarPizzaForno(){
        System.out.println(this.nome + "retirou do forno");
    }

    public void entregarPizza(){
        System.out.println(this.nome + "realizou a entrega");


    }}