// Classe IdPizzaioloInvalidaException define uma exceção personalizada para IDs inválidos de Pizzaiolos
public class IdPizzaioloInvalidaException extends Exception {

    // Construtor da exceção que recebe uma mensagem de erro como parâmetro
    public IdPizzaioloInvalidaException(String mensagem) {
        // Passa a mensagem para a superclasse Exception, que cuida da exibição da mensagem ao capturar o erro
        super(mensagem);
    }
}