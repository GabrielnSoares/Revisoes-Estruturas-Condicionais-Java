package dev.gab.kickstart.aula12.exercicios;

import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {

        System.out.println("""
                # CALCULADORA #
                DIGITE O VALOR DE X:\s""");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        sc.nextLine();

        System.out.println("DIGITE O VALOR DE Y: ");
        double y = sc.nextDouble();
        sc.nextLine();

        System.out.println("""
                QUAL OPERAÇÃO VOCÊ DESEJA REALIZA?
                AS OPÇÕES SÃO: +, -, *, /, ^, %""");
        String escolha = sc.nextLine();

        double resultado;

        switch (escolha) {
            case "+" -> {
                resultado = x + y;
                System.out.println(x + " + " + y + " = " + resultado);
            }
            case "-" -> {
                resultado = x - y;
                System.out.println(x + " - " + y + " = " + resultado);
            }
            case "*" -> {
                resultado = x * y;
                System.out.println(x + " * " + y + " = " + resultado);
            }
            case "/" -> {
                resultado = x / y;
                System.out.println(x + " / " + y + " = " + resultado);
            }
            case "^" -> {
                resultado = Math.pow(x, y);
                System.out.println(x + " ^ " + y + " = " + resultado);
            }
            case "%" -> {
                resultado = (x * 100) / y;
                System.out.println(x + " % " + y + " = " + resultado);
            }
            default -> System.out.println("CONDIÇÃO INVÁLIDA! ");
        }
    }
}
