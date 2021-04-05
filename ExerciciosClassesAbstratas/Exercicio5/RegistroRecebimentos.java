package Exercicio5;

import java.util.ArrayList;

public class RegistroRecebimentos {
    public static void main(String [] args){
        ArrayList<Recebivel> registros = new ArrayList<>();

        ItemVenda placaMae = new ItemVenda("Placa Mãe", 1, 1200);
        ItemVenda memoriaRam = new ItemVenda("Memória RAM 8GB", 4, 550);
        ItemVenda ssd = new ItemVenda("SSD NVME 2TB", 2, 1500);
        ItemVenda tela = new ItemVenda("Tela iPhone 11", 1, 1600);

        Servico conserto = new Servico("Conserto desktop", 12, 15);
        Servico upgrade = new Servico("Upgrade de memória e armazenamento", 15, 20);
        Servico troca = new Servico("Troca de tela de iPhone", 10, 25);

        registros.add(placaMae);
        registros.add(memoriaRam);
        registros.add(ssd);
        registros.add(conserto);
        registros.add(upgrade);
        registros.add(tela);
        registros.add(troca);


        for(Recebivel registrado : registros){
            System.out.println(registrado.toString());
        }
    }
}