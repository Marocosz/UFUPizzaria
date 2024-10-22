public class PizzariaUFU {

    public static void main(String[] args) {
        
        
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
        
    }
}
