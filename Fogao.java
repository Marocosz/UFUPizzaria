public class Fogao extends Equipamento {

    
    public Fogao(String nome) {
        super(nome);
    }
    

    public void cozinhar(String ingrediente, Funcionario ator, Estoque estoque) {
        estoque.usarIngrediente(ingrediente, capacidade);

        
    }


    public void fritar(Estoque estoque, Funcionario ator) {

        
    }
}
