package manipulacaoExcecoes;

public class LimiteEstudantesException extends RuntimeException{
    public LimiteEstudantesException(int mat){
        super("O limite de estudantes foi excedido a partir da matrícula: " + mat);
    }
}
