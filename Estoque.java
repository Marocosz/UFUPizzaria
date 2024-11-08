import java.io.*;
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

    // Método para salvar o estoque em um arquivo CSV
    public void salvarEstoque(String filePath) {

        // Criando writer de arquivo
        try (FileWriter writer = new FileWriter(filePath)) {

            // Para cada item da ArrayList
            for (Object[] ingrediente : vIngredientes) {

                // escrever linha no arquivo
                String linha = ingrediente[0] + "," + ingrediente[1] + "\n";
                writer.write(linha);
            }

            // println verificando condição
            System.out.println("Estoque salvo em arquivo CSV com sucesso!");

        // Lançando erro IOExcpiton (Relacionado a operações de arquivos)
        } catch (IOException e) {
            System.out.println("Erro ao salvar o estoque: " + e.getMessage());
        }
    }


    // Método para carregar o estoque de um arquivo CSV
    public void carregarEstoque(String filePath) {
        
        // Limpar a lista antes de carregar novos dados
        vIngredientes.clear(); 

        // Criando reader de arquivo
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String linha;

            // Enquanto existir linha
            while ((linha = reader.readLine()) != null) {

                // Fazendo separação dos dados
                String[] dados = linha.split(",");
                String nome = dados[0];
                int quantidade = Integer.parseInt(dados[1]); // Convertendo string para int

                // Alocando os dados na ArrayList
                Object[] ingrediente = new Object[2];
                ingrediente[0] = nome;
                ingrediente[1] = quantidade;
                vIngredientes.add(ingrediente);
            }

            // println verificando condição
            System.out.println("Estoque carregado do arquivo CSV com sucesso!");

        // Lançando possíveis erros
        } catch (IOException e) {
            System.out.println("Erro ao carregar o estoque: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Erro de formato nos dados do CSV: " + e.getMessage());
        }
    }
    

    
}

