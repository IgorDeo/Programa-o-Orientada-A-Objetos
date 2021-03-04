package ExerciciosConstrutores.Questao3.Agenda;

public class Agenda {
    Contato[] contatos = new Contato[20];
    int quantidadeContatos = 0;

    void addContato(Contato contato){
        contatos[quantidadeContatos] = contato;
        quantidadeContatos++;
    }

    void imprimirTodosOsContatos(){
        for(int i=0; i < contatos.length; i++){
            if (contatos[i] != null){
                System.out.printf("%d - %s \n",(i+1),contatos[i].getNome());
            }           
        }
        System.out.printf("Existe(m) %d contato(s) cadastrado(s) nessa agenda \n \n", quantidadeContatos);
    }

    void imprimirContato(String nome){
        for(int i=0; i < quantidadeContatos; i++){
            if(contatos[i].getNome() == nome){
                System.out.printf("O número do(a) %s é %s\n \n", nome, contatos[i].getNumero());
            }
        }
    }

    void deletarContato(String nome){
        for(int i=0; i < contatos.length; i++){
            if (contatos[i] == null || contatos[i].getNome() == nome){
                contatos[i] = null;                   
            }                      
        }
            System.out.printf("O contato de %s foi excluido com sucesso \n \n", nome);
            quantidadeContatos--;
    }
}
