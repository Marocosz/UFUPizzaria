public class FrangoCatupiry extends Pizza{
    Estoque massa = new Estoque("massa", 350);
    Estoque mussarela = new Estoque("mussarerla", 300);
    Estoque molho = new Estoque("molho", 200);
    Estoque frango = new Estoque("frango", 500);
    Estoque catupiry = new Estoque("catupiry", 10);



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

