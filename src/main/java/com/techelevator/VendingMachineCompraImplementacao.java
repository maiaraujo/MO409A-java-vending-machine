package com.techelevator;

import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.java.annotation.AfterExecution;
import org.graphwalker.java.annotation.BeforeExecution;
import org.graphwalker.java.annotation.GraphWalker;

@GraphWalker(value = "random(vertex_coverage(100))", start = "menu_compra")
public class VendingMachineCompraImplementacao extends ExecutionContext implements menu_compra {

    @Override
    public void menu_principal() {
        System.out.println("Entrou no menu principal");
    }

    @Override
    public void e_escolhe_opcao2() {
        System.out.println("Escolheu a opção 2");
    }

    @Override
    public void menu_compra_inicio() {
        System.out.println("Entrou no menu de compra");
    }

    @Override
    public void e_escolhe_opcao3() {
        System.out.println("Escolheu a opção 3");
    }

    @Override
    public void finaliza_acao() {
        System.out.println("Finalizou ação");
    }

    @Override
    public void e_devolve_troco() {
        System.out.println("Devolvendo troco");
    }

    @Override
    public void espera_moeda() {
        System.out.println("Esperando moeda");
    }

    @Override
    public void e_insere_quantia() {
        System.out.println("Inseriu quantia");
    }

    @Override
    public void e_escolhe_opcao1() {
        System.out.println("Escolheu a opção 1");
    }

    @Override
    public void e_insere_codigo_incorreto() {
        System.out.println("Código inserido incorreto");
    }

    @Override
    public void e_insere_quantia_invalida() {
        System.out.println("Quantia inválida");
    }

    @Override
    public void e_insere_codigo() {
        System.out.println("Código inserido");
    }

    @Override
    public void verifica_disponibilidade() {
        System.out.println("Verificando disponibilidade");
    }

    @Override
    public void e_produto_disponivel() {
        System.out.println("Produto disponível");
    }

    @Override
    public void verifica_saldo() {
        System.out.println("Verificando saldo");
    }

    @Override
    public void e_verifica_saldo() {
        System.out.println("Saldo verificado");
    }

    @Override
    public void libera_produto() {
        System.out.println("Produto liberado");
    }

    @Override
    public void espera_produto() {
        System.out.println("Esperando produto");
    }

    @Override
    public void e_produto_indisponivel() {
        System.out.println("Produto indisponível");
    }

    @Override
    public void e_produtto_liberado() {
        System.out.println("Produto foi liberado (com erro de ortografia no método!)");
    }
}
