// A classe FrangoCatupiry é um tipo específico de Pizza.
// Ela herda as propriedades e métodos da classe base Pizza.
public class FrangoCatupiry extends Pizza {

    // Ingredientes específicos da pizza FrangoCatupiry
    Ingredientes frango = new Ingredientes("Frango Desfiado", 500);
    Ingredientes catupiry = new Ingredientes("Queijo Catupiry", 200);
    Ingredientes milho = new Ingredientes("Milho Verde", 500);  // Ingrediente não usado nesta versão

    // Construtor da classe FrangoCatupiry, que aceita o número do pedido e o número da pizza como parâmetros.
    public FrangoCatupiry(int numPedido, int numPizza) {
        // Chama o construtor da classe base Pizza para inicializar o pedido e o número da pizza.
        super(numPedido, numPizza);
        
        // Adiciona os ingredientes principais da pizza FrangoCatupiry ao pedido.
        adiciona_ingrediente(frango);
        adiciona_ingrediente(catupiry);
        
        // Nota: o ingrediente "milho" é definido, mas não é adicionado ao pedido neste código.
    }
}
