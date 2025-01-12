package dev.gab.kickstart.aula15;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ||

        System.out.println("É FINAL DE SEMANA?");
        Scanner sc = new Scanner(System.in);
        boolean isFinalDeSemana = sc.nextBoolean();
        System.out.println("É FERIADO?");
        boolean isFeriado = sc.nextBoolean();

        if(isFinalDeSemana || isFeriado) {
            System.out.println("Dia de descanso!");
        } else {
            System.out.println("Dia de trabalho!");
        }
    }
}
