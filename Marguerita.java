public class Marguerita extends Pizza{

    Ingredientes massa = new Ingredientes("Massa", 200);
    Ingredientes molhoTomate = new Ingredientes("Molho Tomate", 200);
    Ingredientes mussarela = new Ingredientes("Queijo Mussarela", 200);
    Ingredientes manjericao = new Ingredientes("Manjericão", 200);
    Ingredientes tomate = new Ingredientes("Tomate", 200);

    public Marguerita(int numPedido, int numPizza){
        super(numPedido, numPizza);
        adiciona_ingrediente(molhoTomate);
        adiciona_ingrediente(massa);
        adiciona_ingrediente(mussarela);
        adiciona_ingrediente(tomate);
        adiciona_ingrediente(manjericao);
    }


    
        
    

}
