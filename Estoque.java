import java.util.ArrayList;
import java.util.List;

public class Estoque {

    private Object[] qtIngrediente;
    private static List<Object[]> vIngredientes = new ArrayList<>();

    public Estoque() {

    }

    public void addIngrediente(String nome, int qt) {
        boolean h = true;

        for (int i = 0; i < vIngredientes.size(); i = i + 1) {

            if(vIngredientes.get(i)[0].equals(nome)) {
                vIngredientes.get(i)[1] = (Integer) vIngredientes.get(i)[1] + qt;
                h = false;
                break;
            }

        }

        if (h == true) {
            this.qtIngrediente = new Object[2];
            qtIngrediente[0] = nome;
            qtIngrediente[1] = qt;
            vIngredientes.add(qtIngrediente);
        }

    }


    public List<Object[]> getEstoque() {
        return vIngredientes;
    }


    // Método para mostrar o estoque
    public void mostrarEstoque() {
        for (Object[] ingrediente : vIngredientes) {  // Fazendo casting para Object[]
            // Imprimindo nome e quantidade
            System.out.println("Ingrediente: " + ingrediente[0] + ", Quantidade: " + ingrediente[1]);
        }
    }

    public void usarIngrediente(String ingrediente, int quantidadeUsada) {

        boolean t = true;
        for (int i = 0; i < vIngredientes.size(); i = i + 1) {

            if (vIngredientes.get(i)[0] == ingrediente) {

                if ((Integer) vIngredientes.get(i)[1] >= quantidadeUsada) {
                    vIngredientes.get(i)[1] =  (Integer) vIngredientes.get(i)[1] - quantidadeUsada;

                } else {
                    System.out.println("Ingrediente " + vIngredientes.get(i)[0] + " com " + vIngredientes.get(i)[1] + " no estoque. Não foi possível terminar a ação");
                }

                t = true;
                break;

            } else {
                t = false;
            }
        }

        if(t == false) {
            System.out.println("Esse ingrediente não existe");
        }
    }

    
}

