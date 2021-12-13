package manipulacaoExcecoes;

public class LimiteOrientadorException extends RuntimeException{
    public LimiteOrientadorException(String nome) {
        super("O limite de orientador foi excedido a partir do orientador: " + nome);
    }
}
