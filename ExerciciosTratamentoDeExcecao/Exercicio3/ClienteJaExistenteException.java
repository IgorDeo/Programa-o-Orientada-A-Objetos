package Exercicio3;

public class ClienteJaExistenteException extends Exception{
    @Override
    public String getMessage(){
        return "Já existe um cliente com esse CPF cadastrado";
    }
}
