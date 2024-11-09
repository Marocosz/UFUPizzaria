import java.io.*;
import java.util.ArrayList;
import java.util.List;

// Classe que gerencia o estoque de ingredientes de uma pizzaria.
public class ControleEstoque {

    // Lista estática que armazena os ingredientes do estoque.
    private static List<Ingredientes> vIngredientes = new ArrayList<>();

    // Construtor padrão da classe ControleEstoque.
    public ControleEstoque() {}

    // Método para adicionar um ingrediente ao estoque.
    // Se o ingrediente já existe, aumenta a quantidade; caso contrário, adiciona o novo ingrediente.
    public void addIngrediente(Ingredientes ing) {
        boolean h = true;

        // Percorre a lista de ingredientes para verificar se o ingrediente já está presente.
        for (int i = 0; i < vIngredientes.size(); i++) {
            if (vIngredientes.get(i).getNome().equals(ing.getNome())) {
                // Se o ingrediente já existe, atualiza a quantidade.
                vIngredientes.get(i).setQtd(vIngredientes.get(i).getQtd() + ing.getQtd());
                h = false;
                break;
            }
        }

        // Se o ingrediente não existe, adiciona-o à lista.
        if (h) {
            Ingredientes ingrediente = new Ingredientes(ing.getNome(), ing.getQtd());
            vIngredientes.add(ingrediente);
        }
    }

    // Método que retorna a lista de ingredientes do estoque.
    public List<Ingredientes> getIngredientes() {
        return vIngredientes;
    }

    // Método que exibe todos os ingredientes e suas quantidades no estoque.
    public void mostrarEstoque() {
        for (Ingredientes ingrediente : vIngredientes) {
            System.out.println("Ingrediente: " + ingrediente.getNome() + ", Quantidade: " + ingrediente.getQtd());
        }
    }

    // Método para utilizar uma quantidade específica de um ingrediente.
    // Retorna 0 se a quantidade foi retirada com sucesso, 1 se a quantidade no estoque é insuficiente, e 2 se o ingrediente não existe.
    public int usarIngrediente(Ingredientes novo) {
        int flag = 0;
        boolean t = true;

        // Percorre o estoque para encontrar o ingrediente.
        for (int i = 0; i < vIngredientes.size(); i++) {
            if (vIngredientes.get(i).getNome().equals(novo.getNome())) {
                // Verifica se há quantidade suficiente no estoque.
                if (vIngredientes.get(i).getQtd() >= novo.getQtd()) {
                    vIngredientes.get(i).setQtd(vIngredientes.get(i).getQtd() - novo.getQtd());
                    flag = 0; // Quantidade retirada com sucesso.
                } else {
                    // Quantidade insuficiente no estoque.
                    System.out.println("Ingrediente " + vIngredientes.get(i).getNome() + " com " + vIngredientes.get(i).getQtd() + " no estoque. Não foi possível terminar a ação");
                    flag = 1;
                }
                t = true;
                break;
            } else {
                t = false;
            }
        }

        // Se o ingrediente não foi encontrado no estoque.
        if (!t) {
            flag = 2;
        }

        return flag;
    }

    // Método para salvar o estoque em um arquivo CSV.
    public void salvarEstoque(String filePath) {
        try (FileWriter writer = new FileWriter(filePath)) {
            // Escreve cada ingrediente e sua quantidade no arquivo.
            for (Ingredientes ingrediente : vIngredientes) {
                String linha = ingrediente.getNome() + "," + ingrediente.getQtd() + "\n";
                writer.write(linha);
            }
        } catch (IOException e) {
            // Captura exceções de IO relacionadas ao arquivo.
            System.out.println("Erro ao salvar o estoque: " + e.getMessage());
        }
    }

    // Método para carregar o estoque a partir de um arquivo CSV.
    public void carregarEstoque(String filePath) {
        // Limpa a lista de ingredientes antes de carregar os novos dados.
        vIngredientes.clear();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String linha;

            // Lê o arquivo linha por linha.
            while ((linha = reader.readLine()) != null) {
                // Divide cada linha em nome e quantidade do ingrediente.
                String[] dados = linha.split(",");
                String nome = dados[0];
                int quantidade = Integer.parseInt(dados[1]);

                // Adiciona o ingrediente à lista.
                Ingredientes ingrediente = new Ingredientes(nome, quantidade);
                vIngredientes.add(ingrediente);
            }
        } catch (IOException e) {
            System.out.println("Erro ao carregar o estoque: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Erro de formato nos dados do CSV: " + e.getMessage());
        }
    }
}
