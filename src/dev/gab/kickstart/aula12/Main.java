package dev.gab.kickstart.aula12;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a idade: ");

        int idade = sc.nextInt();

        boolean condicao = idade >= 18;

        if(condicao) {
            System.out.println("Acesso permitido");
        } else {
            System.out.println("Acesso negado");

        }

    }
}