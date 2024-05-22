package edu.desafiocontrolefluxo.app;

import java.util.Locale;
import java.util.Scanner;

import edu.desafiocontrolefluxo.exceptions.ParametrosInvalidosException;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int primeiroValor, segundoValor;

        System.out.println("Digite o primeiro parâmetro:");
        primeiroValor = scanner.nextInt();
        
        System.out.println("Digite o segundo parâmetro:");
        segundoValor = scanner.nextInt();

        try {
            contar(primeiroValor, segundoValor);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        } finally {
            scanner.close();
        }
    }

    static void contar (int primeiroValor, int segundoValor) throws ParametrosInvalidosException {
        if (primeiroValor > segundoValor) throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");

        int contagem = segundoValor - primeiroValor;

        for (int i = 1; i <= contagem; i++) {
            System.out.println(String.format("Imprimindo o número %d", i));
        }
    } 
}
