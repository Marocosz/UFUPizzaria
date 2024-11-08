public class QuatroQueijos extends Pizza{
    Estoque massa = new Estoque("massa", 350);
    Estoque mussarela = new Estoque("mussarerla", 300);
    Estoque molho = new Estoque("molho", 200);
    Estoque catupiry = new Estoque("catupiry", 500);
    Estoque parmesao = new Estoque("parmesao", 10);
    Estoque gorgonzola = new Estoque("gorgonzola", 10);

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