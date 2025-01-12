package dev.gab.kickstart.aula16;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //! - NOT

        System.out.println("Quer receber e-mail?");
        Scanner sc = new Scanner(System.in);
        boolean querReceberEmail = sc.nextBoolean();
        sc.nextLine();

        System.out.println("E-mail com problema?");
        boolean emailEstaComProblema = sc.nextBoolean();

        if (querReceberEmail && !emailEstaComProblema) {
            System.out.println("Enviando e-mail...");
        }
        System.out.println("Sistema encerrado!");
        System.out.println(!querReceberEmail);
    }
}
