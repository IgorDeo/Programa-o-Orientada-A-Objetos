package Exercicio3;

public class ClienteInexistenteException extends Exception{
    @Override
    public String getMessage(){
        return "Esse cliente não está cadastrado";
    }
}
