package Exercicio3;

public class Main {
    public static void main(String[] args){
        CadastroCliente cadastro = new CadastroCliente();
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        Cliente cliente3 = new Cliente();
        Cliente cliente4 = new Cliente();
        Cliente cliente5 = new Cliente();
        Cliente cliente6 = new Cliente();
        Cliente cliente7 = new Cliente();
        Cliente cliente8 = new Cliente();
        Cliente cliente9 = new Cliente();
        Cliente cliente10 = new Cliente();
        Cliente cliente11 = new Cliente();

        try {
            cliente1.setCpf("11111111111");
            cliente2.setCpf("11111111112");
            cliente3.setCpf("11111111113");
            cliente4.setCpf("11111111114");
            cliente5.setCpf("11111111115");
            cliente6.setCpf("11111111116");
            cliente7.setCpf("11111111117");
            cliente8.setCpf("11111111118");
            cliente9.setCpf("11111111119");
            cliente10.setCpf("11111111110");
            cliente11.setCpf("11111111211");
        }
        catch (DadoInvalidoException e){
            System.out.println(e.getMessage());
        }


        try {
            cadastro.inserir(cliente1);
            cadastro.inserir(cliente2);
            cadastro.inserir(cliente2);
            cadastro.inserir(cliente4);
            cadastro.inserir(cliente5);
            cadastro.inserir(cliente6);
            cadastro.inserir(cliente7);
            cadastro.inserir(cliente8);
            cadastro.inserir(cliente9);
            cadastro.inserir(cliente10);
            cadastro.inserir(cliente11);


        } catch (RepositorioException e) {
            System.out.println(e.getMessage());
        } catch (ClienteJaExistenteException e) {
            System.out.println(e.getMessage());
        }

        try{
            cadastro.buscar(cliente3);
        }
        catch (ClienteInexistenteException e) {
            System.out.println(e.getMessage());
        }


    }
}
