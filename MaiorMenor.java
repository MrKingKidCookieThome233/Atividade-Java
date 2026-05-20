package com.pratica;
import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números deseja informar? ");
        int quantidade = scanner.nextInt();

        System.out.print("Digite o 1º número: ");
        int primeiro = scanner.nextInt();

        int maior = primeiro;
        int menor = primeiro;

        for (int i = 2; i <= quantidade; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();

            if (numero > maior) maior = numero;
            if (numero < menor) menor = numero;
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);

        scanner.close();
    }
}
