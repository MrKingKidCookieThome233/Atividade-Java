package com.pratica;
public class Aluno {
    String nome;
    double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public boolean foiAprovado() {
        return nota >= 7;
    }

    public String obterConceito() {
        if (nota >= 9) {
            return "A";
        } else if (nota >= 7) {
            return "B";
        } else {
            return "C";
        }
    }

    public static void main(String[] args) {
        Aluno a = new Aluno("Maria", 8.5);

        System.out.println("Aluno: " + a.nome);
        System.out.println("Nota: " + a.nota);
        System.out.println("Conceito: " + a.obterConceito());
        System.out.println("Aprovado: " + a.foiAprovado());
    }
}
