// Classe Ingredientes representa um ingrediente com nome e quantidade
public class Ingredientes {

    // Array para armazenar o nome e a quantidade do ingrediente
    private Object[] qtIngrediente = new Object[2];

    // Construtor que inicializa o ingrediente com um nome e quantidade específicos
    public Ingredientes(String nome, int qtd) {
        qtIngrediente[0] = nome; // Nome do ingrediente
        qtIngrediente[1] = qtd;  // Quantidade do ingrediente
    }
    
    // Método getter para obter o nome do ingrediente
    public String getNome() {
        return (String) qtIngrediente[0]; // Converte e retorna o nome como String
    }

    // Método setter para definir o nome do ingrediente
    public void setNome(String nome) {
        this.qtIngrediente[0] = nome;
    }

    // Método getter para obter a quantidade do ingrediente
    public int getQtd() {
        return (Integer) qtIngrediente[1]; // Converte e retorna a quantidade como Integer
    }

    // Método setter para definir a quantidade do ingrediente
    public void setQtd(int qtd) {
        this.qtIngrediente[1] = qtd;
    }
}

