package br.com.bruno;

import java.util.Scanner;

import br.com.bruno.domain.Estoque;
import br.com.bruno.domain.Fornecedor;
import br.com.bruno.domain.Produto;

public class Main {
    public static void main(String[] args) {
        Boolean entradaValida = false;
        Fornecedor fornecedor = new Fornecedor(1, "333", "Bruno", "bruno@gmail.com", "51992200809", "Brinquedos");
        Estoque estoque = new Estoque(1, 10.0, "Brinquedos", 0.0);
        Produto produto = new Produto(1, "Nerf", 400.0, 2.2, fornecedor);

        while (!entradaValida) {
            Scanner scan = new Scanner(System.in);

            System.out.println(fornecedor);
            System.out.println("Selecione o Fornecedor:");
            Integer resposta = scan.nextInt();

            if (resposta == 1) {

                System.out.println(produto);
                System.out.println("Selecione o Produto:");
                Integer resposta2 = scan.nextInt();

                if (resposta2 == 1) {

                    System.out.println("Digite a Quantidade");
                    Integer qtd = scan.nextInt();
                    System.out.println(estoque);
                    System.out.println("Selecione o Estoque:");
                    Integer reposta3 = scan.nextInt();

                    if (reposta3 == 1) {

                        Double estoqueQtd = estoque.getQntdAtual();
                        if ((estoqueQtd + qtd) < 10) {
                            estoque.setQntdAtual(estoqueQtd + qtd);
                            System.out.println("Produto Armazenado.");
                            System.out.println(estoque);
                            entradaValida = true;

                        } else {
                            System.out.println("Limite de Estoque atingido.");
                        }

                    }
                } else {
                    System.out.println("Produto não encontrado");
                }
            } else {
                System.out.println("Fornecedor não encontrado");
            }
        }
    }
}