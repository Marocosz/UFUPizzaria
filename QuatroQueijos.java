public class QuatroQueijos extends Pizza{
    Ingredientes massa = new Ingredientes("massa", 350);
    Ingredientes mussarela = new Ingredientes("mussarerla", 300);
    Ingredientes molho = new Ingredientes("molho", 200);
    Ingredientes catupiry = new Ingredientes("catupiry", 500);
    Ingredientes parmesao = new Ingredientes("parmesao", 10);
    Ingredientes gorgonzola = new Ingredientes("gorgonzola", 10);

    public QuatroQueijos(int numPedido, int numPizza){
        super(numPedido, numPizza);
        adiciona_ingredientes(numPizza);
    }

    private void adiciona_ingredientes(int numPizza){
        ingredientes.add(catupiry);
        ingredientes.add(massa);
        ingredientes.add(gorgonzola);
        ingredientes.add(mussarela);
        ingredientes.add(molho);
        ingredientes.add(parmesao);
    }
}