package dev.gab.kickstart.aula16.exercicios;

import java.util.Scanner;

public class operadorNot {

    public static void main(String[] args) {

        System.out.println("""
                # UNIVERSIDADE DE YALE #
                QUAL A SUA IDADE?\s""");
        Scanner sc = new Scanner(System.in);
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.println("QUAL A SUA ESCOLARIDADE? ");
        String escolaridade = sc.nextLine();

        if (idade <= 22 && !escolaridade.equalsIgnoreCase("ENSINO FUNDAMENTAL")) {
            System.out.println("INSCREVA-SE AGORA EM NOSSO CONCURSO");
        }
        System.out.println("SISITEMA ENCERRADO!");
    }
}
