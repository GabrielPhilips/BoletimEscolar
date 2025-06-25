package org.example;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite o nome do aluno: ");
        String nome = sc.nextLine();

        double[] notas = new double[3];
        double soma = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }

        double media = soma / 3;
        String situacao;

        if (media >= 7) {
            situacao = "Aprovado";
        } else if (media >= 5) {
            situacao = "Recuperação";
        } else {
            situacao = "Reprovado";
        }

        System.out.println("Nome: " + nome);
        System.out.println("Notas: " + notas[0] + ", " + notas[1] + ", " + notas[2]);
        System.out.printf("Média: %.2f\n", media);
        System.out.println("Situação: " + situacao);

        sc.close();
    }
}
