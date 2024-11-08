public class FrangoCatupiry extends Pizza{
    Ingredientes massa = new Ingredientes("massa", 350);
    Ingredientes mussarela = new Ingredientes("mussarerla", 300);
    Ingredientes molho = new Ingredientes("molho", 200);
    Ingredientes frango = new Ingredientes("frango", 500);
    Ingredientes catupiry = new Ingredientes("catupiry", 10);

    public FrangoCatupiry(int numPedido, int numPizza){
        super(numPedido, numPizza);
        adiciona_ingredientes(numPizza);
    }

    private void adiciona_ingredientes(int numPizza){
        ingredientes.add(frango);
        ingredientes.add(massa);
        ingredientes.add(catupiry);
        ingredientes.add(mussarela);
        ingredientes.add(molho);
    }
}

