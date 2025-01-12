package dev.gab.kickstart.aula17.exercicios;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        System.out.println("***** TELA ESTAÇÃO DO ANO *****");
        System.out.println("QUAL MÊS NÓS ESTAMOS?");
        Scanner sc = new Scanner(System.in);
        int mes = sc.nextInt();
        sc.nextLine();

        switch (mes) {
            case 1, 2, 3:
                System.out.println("NÓS ESTAMOS NO VERÃO! APROVEITEM AS PRAIAS");
                break;
            case 4, 5, 6:
                System.out.println("NÓS ESTAMOS NO OUTONO! AS FOLHAS ESTÃO CAINDO");
                break;
            case 7, 8, 9:
                System.out.println("NÓS ESTAMOS NO INVERNO! PEGUEM OS SEUS CASACOS, O TEMPO VAI ESFRIAR!");
                break;
            case 10, 11, 12:
                System.out.println("NÓS ESTAMOS  NA PRIMAVERA! APRECIEM O FLORESCER!");
                break;
            default:
                System.out.println("ANO INVÁLIDO!");
        }

        System.out.println("PROGRAMA ENCERRADO!");
    }
}
