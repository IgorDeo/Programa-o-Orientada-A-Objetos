package ExerciciosConstrutores.Questao4;
import java.util.ArrayList;

public class Data {
    private String dia;
    private String mes;
    private String ano;
    private String mesString;
    private String diaEMes;
    private int tipoDeData;
    
    public Data(int dia, int mes, int ano){
        this.dia = String.valueOf(dia);
        this.mes = String.valueOf(mes);
        this.ano = String.valueOf(ano);
        this.tipoDeData = 1;
    }

    public Data(String mes, int dia, int ano){
        this.dia = String.valueOf(dia);
        this.mes = mes;
        this.ano = String.valueOf(ano);
        this.tipoDeData = 2;
    }

    public Data(int diaEMes, int ano){
        this.diaEMes = String.valueOf(diaEMes);
        this.ano = String.valueOf(ano);

        this.tipoDeData = 3;
    }

    void imprimeData(){
        if (tipoDeData == 1){
            System.out.printf("A data é 0%s/0%s/%s\n", dia, mes, ano);
        }
        else if (tipoDeData == 2){
            System.out.printf("A data é %s %s, %s\n", mes, dia, ano);
        }
        else{
            System.out.printf("");
        }

    }
}
