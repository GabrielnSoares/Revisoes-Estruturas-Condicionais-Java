package dev.gab.kickstart.aula14.exercicios;

import java.util.Scanner;

public class sistemaLogin {
    public static void main(String[] args) {

        System.out.println("""
                ****** SISTEMA DE LOGIN - FBI ******
                DIGITE O USUÁRIO:\s""");
        Scanner sc = new Scanner(System.in);
        String user = sc.nextLine();

        System.out.println("DIGITE A SENHA: ");
        String senha = sc.nextLine();

        if ("admin".equalsIgnoreCase(user) && "Senha123".equals(senha)) {
            System.out.println("""
                    ACESSO CONCEDIDO!
                    LIBERANDO ARQUIVOS SECRETOS...""");
        } else {
            System.out.println("""
                    #### ALARME ####
                    AGENTES DO FBI A CAMINHO...""");
        }

    }
}
