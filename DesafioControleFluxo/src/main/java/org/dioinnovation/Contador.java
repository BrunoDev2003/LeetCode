package org.dioinnovation;

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) throws ParametrosInvalidosException {
        Scanner terminal = new Scanner(System.in);

        int parametroUm = terminal.nextInt();
        int parametroDois = terminal.nextInt();

        try {
            contador(parametroUm, parametroDois);

        } catch (Exception e) {
            throw new ParametrosInvalidosException(e.getMessage());
        }
    }

    static void contador(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("Erro, o segundo parametro deve ser maior que o primeiro: ");
        }
        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println("i = " + i);
        }
    }
}
