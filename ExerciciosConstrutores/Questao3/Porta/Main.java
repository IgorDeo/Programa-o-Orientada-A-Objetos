package ExerciciosConstrutores.Questao3.Porta;

public class Main {
    public static void main(String[] args){
        Porta porta = new Porta("Preto", 3.0, 1.75);

        porta.informacoesPorta();

        porta.setCor("Verde");
        porta.setAltura(2.10);
        porta.setLargura(1.50);

        porta.informacoesPorta();
        porta.estaAberta();

        porta.setCor("Vermelho");
        porta.setAltura(3.10);
        porta.setLargura(2.0);
        porta.abrirPorta();

        porta.estaAberta();
        porta.fecharPorta();

        porta.informacoesPorta();
        porta.estaAberta();  
    }

}
