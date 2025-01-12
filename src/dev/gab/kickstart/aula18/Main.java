package dev.gab.kickstart.aula18;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // operador ternário: condicao logia ? verdadeiro : falso;

        System.out.println("Digite a quantidade de items que você comporu: ");
        Scanner sc = new Scanner(System.in);
        int qtdItens = sc.nextInt();
        sc.nextLine();

        String percentualDesconto = qtdItens > 100 ? "10%" : "5%";

        System.out.println("Você terá o desconto de: " + percentualDesconto);

    }
}
