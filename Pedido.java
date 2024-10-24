public class Pedido {
    
    private static int contadorId = 0;
    private int id;
    public int[] nPizzas;
    
    public Pedido (int... nPizzas) {
        contadorId++;
        this.id = contadorId;
        this.nPizzas = nPizzas;
        
    }
    
    public int[] getPizzas() {
        return nPizzas;
    }
    
    public int getQuantidade() {
        return nPizzas.length;
    }
    
    public int getId() {
        return id;
    }
    
    public void pizzasPedidas() {
        for(int i =0; i < nPizzas.length; i = i + 1){
            switch (nPizzas[i]) {
                case 1 -> System.out.println("1 Pizza Frango com Catupiry");
                case 2 -> System.out.println("1 Pizza 4 queijos");
                case 3 -> System.out.println("1 Pizza Marguerita");
                default -> System.out.println("Pedido não processado");
            }
        }
        
        System.out.println("Pizzas totais: " + this.getQuantidade());
        System.out.println("========================================");
    } 
    
}
