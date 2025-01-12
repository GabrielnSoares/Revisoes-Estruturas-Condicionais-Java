package dev.gab.kickstart.aula12.exercicios;

import java.util.Scanner;

public class condicionaisSimples {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("""
                    ****** SISTEMA DE GORJETAS ******
                    VOCÊ GOSTARIA DE FORNECER GORGETAS?\s""");
        String resposta = sc.nextLine();

        boolean condicao = resposta.equalsIgnoreCase("SIM");

        if(condicao) {
            System.out.println("QUAL O VALOR DA GORJETA?");
            double gorjeta = sc.nextDouble();
            System.out.printf("GORJETA DE R$ %,.2f REALIZADA COM SUCESSO%n", gorjeta);
        } else {
            System.out.println("AGRADECEMOS A VISITA, ATÉ A PRÓXIMA!");
        }
    }
}
