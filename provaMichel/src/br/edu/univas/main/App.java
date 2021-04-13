package br.edu.univas.main;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import br.edu.univas.vo.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner l = new Scanner(System.in);
        Random random = new Random();
        ArrayList<Competidor> competidores = new ArrayList<>();
        System.out.println("CADASTRO>");
        for (int i = 0; i < 5; i++) {
            Competidor c = new Competidor();
            System.out.println("Digite o apelido do competidor: ");
            String ap = l.nextLine();
            System.out.println("Digite 1 para Carro e 2 para Moto: ");
            int op = l.nextInt();
            l.nextLine();
            if (op == 1) {
                Carro carro = new Carro();
                c.setVeiculo(carro);
                c.setApelido(ap);
                competidores.add(c);
            } else if (op == 2) {
                Moto moto = new Moto();
                c.setVeiculo(moto);
                c.setApelido(ap);
                competidores.add(c);
            }
        }
        for (int j = 0; j < 10; j++) {
            for (int w = 0; w < 5; w++) {
                Competidor c = competidores.get(w);
                Veiculo v = c.getVeiculo();
                v.acelerar(random.nextInt((20 - 5) + 1) + 5);
            }
        }
        l.close();
        Competidor comp = competidores.get(0);
        Veiculo veic = comp.getVeiculo();
        int maior = veic.getVelocidadeAtual();
        int indice = 0;
        for (int z = 1; z < 5; z++) {
            Competidor c = competidores.get(z);
            Veiculo v = c.getVeiculo();
            if (maior < v.getVelocidadeAtual()) {
                maior = v.getVelocidadeAtual();
                indice = z;
            }
        }

        for (int x = 0; x < 5; x++) {
            Competidor c = competidores.get(x);
            Veiculo v = c.getVeiculo();
            System.out.println(v.getVelocidadeAtual());
        }
        Competidor campeao = competidores.get(indice);
        System.out.println("Competidor mais rápido: " + campeao.getApelido());
        System.out.println("Velocidade: " + maior);

    }
}
