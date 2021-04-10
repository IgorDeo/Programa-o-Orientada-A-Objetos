package Exercicio3;

public class DadoInvalidoException extends Exception{
    @Override
    public String getMessage(){
        return "Dado passado como parametro não é valido";
    }
}
