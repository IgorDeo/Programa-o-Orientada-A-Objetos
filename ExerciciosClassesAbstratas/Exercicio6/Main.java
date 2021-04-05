package Exercicio6;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, IOException {
        DadosMensais dados = new DadosMensais();

        dados.representaDadosDia(1);
        dados.representaDadosDia(2);

        dados.adicionaDadosDia(6, 35.7, 48.9, 2);

        dados.representaDadosDia(6);
    }
}
