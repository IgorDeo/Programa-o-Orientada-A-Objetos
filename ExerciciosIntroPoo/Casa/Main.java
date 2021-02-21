package ExerciciosIntroPoo.Casa;

public class Main {
    public static void main(String[] args){
        Porta porta1 = new Porta();
        Porta porta2 = new Porta();
        Porta porta3 = new Porta();
        
        
        
        Casa minhaCasa = new Casa();

        minhaCasa.addPorta(porta1);
        minhaCasa.addPorta(porta2);
        minhaCasa.addPorta(porta3);

        minhaCasa.setCor("AzulBebe");
        minhaCasa.quantasPortasEstaoAbertas();

        minhaCasa.abrirTodasAsPortas();
        minhaCasa.quantasPortasEstaoAbertas();

        minhaCasa.abrirUmaPorta(2);
        minhaCasa.quantasPortasEstaoAbertas();

        minhaCasa.fecharTodasAsPortas();
        minhaCasa.quantasPortasEstaoAbertas();

    }
}
