public class QuatroQueijos extends Pizza{
    Ingredientes catupiry = new Ingredientes("Queijo Catupiry", 200);
    Ingredientes mussarela = new Ingredientes("Queijo Mussarela", 200);
    Ingredientes cheddar = new Ingredientes("Queijo Cheddar", 200);
    Ingredientes parmesao = new Ingredientes("Queijo Parmesão", 200);
    Ingredientes molhoTomate = new Ingredientes("Molho Tomate", 200);
    Ingredientes massa = new Ingredientes("Massa", 200);
    public QuatroQueijos(int numPedido, int numPizza){
        super(numPedido, numPizza);
        adiciona_ingrediente(catupiry);
        adiciona_ingrediente(mussarela);
        adiciona_ingrediente(cheddar);
        adiciona_ingrediente(parmesao);
        adiciona_ingrediente(molhoTomate);
        adiciona_ingrediente(massa);
    }
    
}