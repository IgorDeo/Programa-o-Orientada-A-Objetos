package ExerciciosIntroPoo.Agenda;
public class Main {
    public static void main(String[] args){
        Contato igor = new Contato();
        igor.setNome("Igor Deo");
        igor.setNumero("21999093811");

        Contato jorge = new Contato();
        jorge.setNome("Jorge Luiz Alves");
        jorge.setNumero("21996983270");



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
