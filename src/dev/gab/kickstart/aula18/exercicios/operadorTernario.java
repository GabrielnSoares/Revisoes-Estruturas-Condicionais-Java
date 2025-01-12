package dev.gab.kickstart.aula18.exercicios;

import java.util.Scanner;

public class operadorTernario {

    public static void main(String[] args) {

        System.out.println("""
                ## BEM VINDO AO AMAZON GO #
                CLIENTE RETIROU O ITEM DA PRATELEIRA?\s""");
        Scanner sc = new Scanner(System.in);
        String itemRetirado = sc.nextLine();
        System.out.println(
                itemRetirado.equalsIgnoreCase("SIM")
                ? "ITEM ADICIONADO AO CARRINHO DE COMPRAS"
                : "SEU CARRINHO DE COMPRAS ESTÁ VAZIO"
        );
    }
}
