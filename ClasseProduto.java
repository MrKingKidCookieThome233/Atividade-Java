package com.pratica;
public class Produto {
    String nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double calcularValorTotalEstoque() {
        return preco * quantidade;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor total em estoque: " + calcularValorTotalEstoque());
    }

    public static void main(String[] args) {
        Produto p = new Produto("Notebook", 3500.00, 10);
        p.exibirInformacoes();
    }
}
