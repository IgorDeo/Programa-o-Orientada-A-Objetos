package ExerciciosConstrutores.Questao4;


public class Data {
    private int dia;
    private int mesInteiro;
    private int ano;
    private String mesString;
    private int diasCompletos;
    private String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio",
                                    "Junho", "Julho", "Agosto", "Setembro", "Outubro",
                                    "Novembro", "Dezembro"};
    private int tipoDeData;
    
    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mesInteiro = mes;
        this.ano = ano;
        this.mesString = this.meses[mesInteiro - 1];
        if(mesInteiro == 1){
            this.diasCompletos = this.dia;
        }else{
            this.diasCompletos = ((this.mesInteiro - 1) * 30) + this.dia;
        }
    }

    public Data(String mes, int dia, int ano){
        this.mesString = mes;
        this.dia = dia;
        this.ano = ano;
        for(int i = 0; i < 12; i++){
            if(this.meses[i] == mes){
                this.mesInteiro = i + 1;
            }
        }
        this.diasCompletos = (this.mesInteiro * 30) + this.dia;
    }

    public Data(int diasCompletos, int ano){
        this.ano = ano;
        this.diasCompletos = diasCompletos;
        this.mesInteiro = diasCompletos / 30;
        this.dia = diasCompletos -  (this.mesInteiro * 30);
        this.mesString = meses[mesInteiro - 1];
    }

    void imprimeData(){
        
        System.out.printf("A data é %d/%d/%d\n", dia, mesInteiro, ano);
        System.out.printf("-------------------\n");
        
        System.out.printf("A data é %s %d, %d\n", mesString, dia, ano);
        System.out.printf("-------------------\n");
        
        System.out.printf("A data é %d de %d\n", diasCompletos, ano);
        System.out.printf("-------------------\n");
        System.out.println("");
        

    }
}
