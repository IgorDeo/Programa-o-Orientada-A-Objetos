package ExerciciosConstrutores.Questao3.Agenda;
public class Main {
    public static void main(String[] args){
        Contato igor = new Contato("Igor Deo", "21999093811");
        Contato jorge = new Contato("Jorge Luiz Alves", "21996983270");
  
        Agenda agenda = new Agenda();

        agenda.addContato(igor);
        agenda.imprimirTodosOsContatos();
        agenda.imprimirContato("Igor Deo");
        

        agenda.addContato(jorge);
        agenda.imprimirTodosOsContatos();
        agenda.imprimirContato("Jorge Luiz Alves");
        
        agenda.deletarContato("Igor Deo");
        agenda.deletarContato("Jorge Luiz Alves");

        agenda.imprimirTodosOsContatos();

    }
}
