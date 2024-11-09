// Classe IdAjudanteInvalidaException define uma exceção personalizada para IDs inválidos de Ajudantes
public class IdAjudanteInvalidaException extends Exception {

    // Construtor da exceção que recebe uma mensagem de erro como parâmetro
    public IdAjudanteInvalidaException(String mensagem) {
        // Passa a mensagem para a superclasse Exception, que trata da exibição da mensagem ao capturar o erro
        super(mensagem);
    }
}
