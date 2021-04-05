package Exercicio6;

import java.io.*;

public class DadosMensais {
    String caminhoArquivo;
    InputStream fis;
    Reader isr;
    BufferedReader br;
    FileWriter fw;
    BufferedWriter bw;

    public DadosMensais() throws IOException {
        this.caminhoArquivo = "C:\\Projects Folders\\VsCodeProjects\\UFF\\POO\\ExerciciosClassesAbstratas\\Exercicio6\\dados.txt";
        this.fis = new FileInputStream(this.caminhoArquivo);
        this.isr = new InputStreamReader(this.fis);
        this.br = new BufferedReader(this.isr);
        br.mark(1000);

        this.fw = new FileWriter(caminhoArquivo, true);
        this.bw = new BufferedWriter(this.fw);
    }

    public void representaDadosDia(int dia) throws IOException {
        String[] dadosDia = new String[4];
        for(int i = 0; i < 30; i++){
            String linha = br.readLine();
            dadosDia = linha.split(" ");
            if(Integer.parseInt(dadosDia[0]) == dia){
                System.out.printf("Dia: %s\nMínima: %s\nMáxima: %s\nIndice Pluviometrico: %s\n",
                        dadosDia[0], dadosDia[1], dadosDia[2], dadosDia[3]);
                System.out.println("\n");

                br.reset();
                return;
            }
        }

        System.out.println("Dia não registrado.");
        br.reset();
    }

    public void adicionaDadosDia(int dia, double minimo, double maximo, int indice) throws IOException {
        String linhaDados = String.valueOf(dia) + " " + String.valueOf(minimo) +  " " + String.valueOf(maximo) + " " + String.valueOf(indice);
        bw.newLine();
        bw.write(linhaDados);
        bw.close();
    }
}