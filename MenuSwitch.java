package com.pratica;
public class MenuSwitch {
    public static void main(String[] args) {
        int opcao = 2;

        switch (opcao) {
            case 1:
                System.out.println("Ação: Cadastrar");
                break;
            case 2:
                System.out.println("Ação: Consultar");
                break;
            case 3:
                System.out.println("Ação: Atualizar");
                break;
            case 4:
                System.out.println("Ação: Excluir");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}
