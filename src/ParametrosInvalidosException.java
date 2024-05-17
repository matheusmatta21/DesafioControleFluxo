public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(){
        super("O segundo parâmetro precisa ser maior que o primeiro");
    }
}