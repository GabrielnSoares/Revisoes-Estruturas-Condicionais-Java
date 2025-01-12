package dev.gab.kickstart.aula15.exercicios;

import java.util.Scanner;

public class operadorOr {

    public static void main(String[] args) {

        System.out.println("""
                ###### ANTES DE VOCÊ ASSISTIR ######
                QUAL A SUA IDADE?\s""");
        Scanner sc = new Scanner(System.in);
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.println("VOCÊ TEM PERIMSSAO DOS SEUS PAIS?");
        String permissao = sc.nextLine();


        if (idade >= 18 || permissao.equalsIgnoreCase("SIM")) {
            System.out.println("ACESSO LIBERADO!");
        } else {
            System.out.println("ACESSO NEGADO!");
        }

    }
}
