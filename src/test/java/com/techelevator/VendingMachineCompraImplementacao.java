package com.techelevator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.java.annotation.GraphWalker;
import org.junit.Before;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

@GraphWalker(value = "random(vertex_coverage(100))", start = "menu_compra")
public class VendingMachineCompraImplementacao extends ExecutionContext implements menu_compra {
    public final static Path MODEL_PATH = Paths.get("src/main/resources/Vending-Machine_HFSM_semFim.json");

    @Override
    public void menu_principal() {
        System.out.println("menu_principal: Entrou no menu principal");
    }

    @Override
    public void e_escolhe_opcao2() {
        System.out.println("e_escolhe_opcao2: Escolhendo a opcao 2");
    }

    @Override
    public void menu_compra() {
        System.out.println("menu_compra: Entrou no menu de compra");
    }

    @Override
    public void e_escolhe_opcao3() {
        System.out.println("e_escolhe_opcao3: Escolhendo a opcao 3");
    }

    @Override
    public void finaliza_acao() {
        System.out.println("finaliza_acao: Finalizou acao");
    }

    @Override
    public void e_devolve_troco() {
        System.out.println("e_devolve_troco: Devolvendo troco");
    }

    @Override
    public void espera_moeda() {
        System.out.println("espera_moeda: Espera moeda");
    }

    @Override
    public void e_insere_quantia() {
        System.out.println("e_insere_quantia: Inserindo quantia valida");
    }
    @Override
    public void e_insere_quantia_invalida() {
        
        System.out.println("e_insere_quantia_invalida: Inserindo quantia invalida");
    }

    @Override
    public void e_escolhe_opcao1() {
        System.out.println("e_escolhe_opcao1: Escolhendo a opção 1");
    }

    @Override
    public void verifica_disponibilidade() {
        System.out.println("verifica_disponibilidade: Verifica disponibilidade");
    }

    @Override
    public void e_produto_disponivel() {
        System.out.println("e_produto_disponivel: Produto disponível");
    }

    @Override
    public void verifica_saldo() {
        System.out.println("verifica_saldo: Verifica saldo");
    }

    @Override
    public void e_verifica_saldo() {
        System.out.println("e_verifica_saldo: Verificando saldo");
    }

    @Override
    public void libera_produto() {
        /*assertTrue(saldo >= preco_produto);*/
        System.out.println("libera_produto: Produto liberado");
    }

    @Override
    public void espera_produto() {
        System.out.println("espera_produto: Esperando produto");
    }

    @Override
    public void e_insere_codigo() {
        System.out.println("e_insere_codigo: Inserindo código correto");
    }
    @Override
    public void e_insere_codigo_incorreto() {
        System.out.println("e_insere_codigo_incorreto: Inserindo código incorreto");
    }

    @Override
    public void e_produto_indisponivel() {
        System.out.println("e_produto_indisponivel: Produto indisponível");
    }

    @Override
    public void e_produtto_liberado() {
        System.out.println("e_produtto_liberado: Liberando produto");
    }
}
