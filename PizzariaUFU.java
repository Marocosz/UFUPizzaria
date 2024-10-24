public class PizzariaUFU {

    public static void main(String[] args) {
        
        /*
        Pedido p1 = new Pedido(1, 2, 2, 3);
        Pedido p2 = new Pedido(1, 2);
        Pedido p3 = new Pedido(2, 2, 3, 1, 1, 1);
        
        System.out.println(p1.getId());
        System.out.println(p2.getId());
        System.out.println(p3.getId());
        
        p1.pizzasPedidas();
        p2.pizzasPedidas();
        p3.pizzasPedidas();

        Equipamento eq1 = new Equipamento("Eq1");

        eq1.ligar();

        Ingredientes ing1 = new Ingredientes("Batata", 10);
        Ingredientes ing2 = new Ingredientes("Frango", 20);
        Ingredientes ing3 = new Ingredientes("Queijo Mussarela", 16);

        ing1.mostrarEstoque();
        Funcionario Marcos = new Funcionario("Marcos",001,"123.456.789-10","novato");

        Marcos.mostrarCpf();
        */

        Ajudante ajudante1 = new Ajudante("Marcelo Freitas", 112, "123.123.133-23", "Ajudante novato, chegou atrasdo dia 12/12");
    
        ajudante1.mostrarXp();
        ajudante1.entregarPizza();
        ajudante1.retirarPizzaForno();
        ajudante1.mostrarXp();
        ajudante1.lavarLouca();
        ajudante1.mostrarXp();
    }   

}
