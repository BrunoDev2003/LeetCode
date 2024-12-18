package org.dioinnovation;

public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String e) {
        super("Erro, o segundo parametro deve ser maior que o primeiro: " + e);
    }
}
