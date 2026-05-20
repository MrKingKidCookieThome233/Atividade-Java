package com.pratica;
import java.util.Scanner;

public class Retangulo {
    double largura;
    double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularArea() {
        return largura * altura;
    }

    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }

    public static void main(String[] args) {
        Scanner Ret = new Scanner(System.in);

        System.out.print("Digite a largura: ");
        double largura = Ret.nextDouble();

        System.out.print("Digite a altura: ");
        double altura = Ret.nextDouble();

        Retangulo r = new Retangulo(largura, altura);

        System.out.println("Área: " + r.calcularArea());
        System.out.println("Perímetro: " + r.calcularPerimetro());

        Ret.close();
    }
}
