package ExerciciosConstrutores.Questao4;

public class Main {
    public static void main(String[] args){
        Data data1 = new Data(3,03,2021);
        Data data2 = new Data(12,06,2001);
        Data data3 = new Data("Agosto", 8, 2017);
        Data data4 = new Data("Abril", 3, 2014);
        Data data5 = new Data(142, 2021);
        Data data6 = new Data(365, 1999);

        data1.imprimeData();
        data2.imprimeData();
        data3.imprimeData();
        data4.imprimeData();
        data5.imprimeData();
        data6.imprimeData();

    }
}
