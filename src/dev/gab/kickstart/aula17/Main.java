package dev.gab.kickstart.aula17;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // switch

        System.out.println("Digite uma opção: ");
        System.out.println("1 - Conta Corrente");
        System.out.println("2 - Conta Poupança");
        System.out.println("Quer falar com o atendimento?  Digite qualquer coisa");

        Scanner sc = new Scanner(System.in);
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Menu Conta Corrente selecionado");
                break;
            case 2:
                System.out.println("Menu Conta Poupança selecionado");
                break;
            default:
                System.out.println("Falar com atendente selecionado");
                break;
        }

        System.out.println("Redirecionando o cliente...");

    }
}
