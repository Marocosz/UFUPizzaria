public class FrangoCatupiry extends Pizza{

    Ingredientes frango = new Ingredientes("Frango Desfiado", 500);
    Ingredientes catupiry = new Ingredientes("Queijo Catupiry", 200);
    Ingredientes milho = new Ingredientes("Milho Verde", 500);

    public FrangoCatupiry(int numPedido, int numPizza){
        super(numPedido, numPizza);
        adiciona_ingrediente(frango);
        adiciona_ingrediente(catupiry);
    }

}

