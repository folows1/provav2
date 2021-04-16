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
                competidores.get(w).getVeiculo().acelerar(random.nextInt((20 - 5) + 1) + 5);
            }
        }
        l.close();
        int maior = competidores.get(0).getVeiculo().getVelocidadeAtual();
        int indice = 0;
        for (int z = 1; z < 5; z++) {
            if (maior < competidores.get(z).getVeiculo().getVelocidadeAtual()) {
                maior = competidores.get(z).getVeiculo().getVelocidadeAtual();
                indice = z;
            }
        }

        for (int x = 0; x < 5; x++) {
            System.out.println(competidores.get(x).getVeiculo().getVelocidadeAtual());
        }
        System.out.println("Competidor mais rápido: " + competidores.get(indice).getApelido());
        System.out.println("Velocidade: " + maior);

    }
}
