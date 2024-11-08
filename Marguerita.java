public class Marguerita extends Pizza{
    Ingredientes massa = new Ingredientes("massa", 350);
    Ingredientes mussarela = new Ingredientes("mussarerla", 300);
    Ingredientes molho = new Ingredientes("molho", 200);
    Ingredientes tomate = new Ingredientes("tomate", 500);
    Ingredientes manjericao = new Ingredientes("manjericao", 10);



    public Marguerita(int numPedido, int numPizza){
        super(numPedido, numPizza);
        adiciona_ingredientes(numPizza);
    }

    private void adiciona_ingredientes(int numPizza){
        ingredientes.add(manjericao);
        ingredientes.add(massa);
        ingredientes.add(tomate);
        ingredientes.add(mussarela);
        ingredientes.add(molho);
    }

}
