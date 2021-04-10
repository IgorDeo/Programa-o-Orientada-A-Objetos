package Exercicio1;

public class ExemploIllegalArgumentExeception {
    int porcentagem;
    public void setPorcentagem(int por) {
        if(por < 0 || por > 100)
            throw new IllegalArgumentException(Integer.toString(por));//Esse tipo de exceção ocorre quando há passagem de argumentos inválidos para a função(Ex: essa função levantará uma excessão caso o numero inserido esteja fora do intervalo[0,100])
        else
            porcentagem = por;
    }

    public static void main(String[] args) {

        try {
            ExemploIllegalArgumentExeception teste = new ExemploIllegalArgumentExeception();
            teste.setPorcentagem(101);
        }
        catch (IllegalArgumentException ex) {  //Esse tipo de exceção ocorre quando há passagem de argumentos inválidos para a função(Ex: há uma função com 2 argumentos e ocorre a passagem de 3 argumentos na chamada da função)
         System.out.println("Há argumentos inválidos sendo passados para a função");

        }

    }
}
