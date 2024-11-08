import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ControleEstoque {

    private static List<Ingredientes> vIngredientes = new ArrayList<>();

    public ControleEstoque() {

    }

    public void addIngrediente(Ingredientes ing) {
        boolean h = true;

        for (int i = 0; i < vIngredientes.size(); i = i + 1) {

            if(vIngredientes.get(i).getNome().equals(ing.getNome())) {
                vIngredientes.get(i).setQtd(vIngredientes.get(i).getQtd() + ing.getQtd());
                h = false;
                break;
            }

        }

        if (h == true) {
            Ingredientes ingrediente = new Ingredientes(ing.getNome(), ing.getQtd());
            vIngredientes.add(ingrediente);
        }

    }


    public List<Ingredientes> getIngredientes() {
        return vIngredientes;
    }


    // Método para mostrar o estoque
    public void mostrarEstoque() {
        for (Ingredientes ingrediente : vIngredientes) {  // Fazendo casting para Object[]
            // Imprimindo nome e quantidade
            System.out.println("Ingrediente: " + ingrediente.getNome() + ", Quantidade: " + ingrediente.getQtd());
        }
    }

    public int usarIngrediente(Ingredientes novo) {

        int flag = 0;
        boolean t = true;
        for (int i = 0; i < vIngredientes.size(); i = i + 1) {
            if (vIngredientes.get(i).getNome().equals(novo.getNome())) {
                if (vIngredientes.get(i).getQtd() >= novo.getQtd()) {
                    
                    vIngredientes.get(i).setQtd(vIngredientes.get(i).getQtd() - novo.getQtd());
                    flag = 0;
                } else {
                    System.out.println("Ingrediente " + vIngredientes.get(i).getNome() + " com " + vIngredientes.get(i).getQtd() + " no estoque. Não foi possível terminar a ação");
                    flag = 1;
                }

                t = true;
                break;

            } else {
                t = false;
            }
        }

        if(t == false) {
            flag = 2;
        }

        return flag;
    }

    // Método para salvar o estoque em um arquivo CSV
    public void salvarEstoque(String filePath) {

        // Criando writer de arquivo
        try (FileWriter writer = new FileWriter(filePath)) {

            // Para cada item da ArrayList
            for (Ingredientes ingrediente : vIngredientes) {

                // escrever linha no arquivo
                String linha = ingrediente.getNome() + "," + ingrediente.getQtd() + "\n";
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
                Ingredientes ingrediente = new Ingredientes(nome, quantidade);
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

