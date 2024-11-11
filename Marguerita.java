// Classe Marguerita representa uma pizza específica do tipo Marguerita, que herda da classe Pizza
public class Marguerita extends Pizza {

    // Ingredientes específicos da pizza Marguerita
    Ingredientes massa = new Ingredientes("Massa", 200);            // Massa com quantidade de 200g
    Ingredientes molhoTomate = new Ingredientes("Molho Tomate", 200); // Molho de tomate com quantidade de 200g
    Ingredientes mussarela = new Ingredientes("Queijo Mussarela", 200); // Queijo mussarela com quantidade de 200g
    Ingredientes manjericao = new Ingredientes("Manjericão", 200);      // Manjericão com quantidade de 200g
    Ingredientes tomate = new Ingredientes("Tomate", 200);           // Tomate com quantidade de 200g

    // Construtor que recebe o número do pedido e o número da pizza como parâmetros
    public Marguerita(int numPedido, int numPizza) {
        super(numPedido, numPizza); // Chama o construtor da classe base Pizza
        
        // Adiciona os ingredientes específicos da pizza Marguerita ao objeto Pizza
        adiciona_ingrediente(molhoTomate);
        adiciona_ingrediente(massa);
        adiciona_ingrediente(mussarela);
        adiciona_ingrediente(tomate);
        adiciona_ingrediente(manjericao);
    }
}

        
    


