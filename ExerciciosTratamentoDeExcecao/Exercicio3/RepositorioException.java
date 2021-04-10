package Exercicio3;

public class RepositorioException extends ArrayIndexOutOfBoundsException{
    @Override
    public String getMessage(){
        return "Não é possivel cadastrar mais clientes";
    }
}
