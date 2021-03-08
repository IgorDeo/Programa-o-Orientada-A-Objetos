package ExerciciosConstrutores.Questao2;
import java.util.ArrayList;

public class Turma {
    private String horario;
    private String dias;
    private Professor professor;
    private Disciplina disciplina;
   
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    private ArrayList notasp1 = new ArrayList(); //cada indice de nota está atribuida ao indice de um aluno
    private ArrayList notasp2 = new ArrayList();

    public String getHorario(){
        return this.horario;
    }

    public float calcularMedia(Aluno aluno){}

    public registrarNota(Aluno aluno, String prova, float nota){}

}
