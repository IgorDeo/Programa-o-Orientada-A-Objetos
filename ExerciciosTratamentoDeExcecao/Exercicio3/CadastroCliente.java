package Exercicio3;

import java.util.ArrayList;

public class CadastroCliente {
    Cliente[] clientesCadastrados = new Cliente[10];
    int numClientes = 0;

    public void inserir(Cliente novoCliente) throws RepositorioException, ClienteJaExistenteException {
        if (this.numClientes == 10){
            throw new RepositorioException();
        }
        for (int i = 0; i < this.numClientes; i++) {
            if (clientesCadastrados[i].getCpf().equals(novoCliente.getCpf())) {
                throw new ClienteJaExistenteException();
            }
        }
        clientesCadastrados[numClientes] = novoCliente;
        this.numClientes++;


    }

    public void buscar(Cliente clienteBuscado) throws ClienteInexistenteException { //Retornar o indice do cliente procurado no array de cliente cadastrados
        for (int i = 0; i < this.numClientes; i++) {
            if (clienteBuscado == clientesCadastrados[i]){
                System.out.println("O cliente procurado ocupa a posição: "+ i);
                return;
            }
        }
        throw new ClienteInexistenteException();
    }

}


