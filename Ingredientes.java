import java.util.ArrayList;
import java.util.List;

public class Ingredientes {

    private Object[] qtIngrediente;
    private static List<Object[]> vIngredientes = new ArrayList<>();

    public Ingredientes(String nome, int qt) {
        this.qtIngrediente = new Object[2];
        qtIngrediente[0] = nome;
        qtIngrediente[1] = qt;
        vIngredientes.add(qtIngrediente);

    }

    // Método para mostrar o estoque
    public void mostrarEstoque() {
        for (Object[] ingrediente : vIngredientes) {  // Fazendo casting para Object[]
            // Imprimindo nome e quantidade
            System.out.println("Ingrediente: " + ingrediente[0] + ", Quantidade: " + ingrediente[1]);
        }
    }
    
}
