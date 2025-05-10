package com.techelevator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.java.annotation.AfterExecution;
import org.graphwalker.java.annotation.BeforeExecution;
import org.graphwalker.java.annotation.GraphWalker;
import org.junit.Before;


@GraphWalker(value = "random(vertex_coverage(100))", start = "menu_compra")
public class VendingMachineCompraImplementacao extends ExecutionContext implements menu_compra {

    private TesteMaquinaVendas insereQuantia;
    private boolean nullPointerException;
    private boolean illegalStateException;
    
    private int opcao;
    private int saldo;
    private int preco_produto;
    private int produto_disponivel;
    private String codigo_produto;
    private int quantia;

    private final List<Integer> quantiasValidas = Arrays.asList(1, 2, 5, 10, 20);
    private final List<String> codigosValidos = Arrays.asList("A1");

    @Before
    public void setUp() {
        insereQuantia = new TesteMaquinaVendas();
        nullPointerException = false;
        illegalStateException = false;
        saldo = 0;
        preco_produto = 0;
        produto_disponivel = 1;
        codigo_produto = "A1";
        quantia = 0;
    }

    @Override
    public void menu_principal() {
        System.out.println("Entrou no menu principal");
    }

    @Override
    public void e_escolhe_opcao2() {
        System.out.println("Escolheu a opcao 2");
    }

    @Override
    public void menu_compra() {
        /*assertTrue(quantiasValidas.contains(quantia));*/
        System.out.println("Entrou no menu de compra");
    }

    @Override
    public void e_escolhe_opcao3() {
        System.out.println("Escolheu a opcao 3");
    }

    @Override
    public void finaliza_acao() {
        System.out.println("Finalizou acao");
    }

    @Override
    public void e_devolve_troco() {
        /*saldo = 0;
        produto_disponivel = 1;
        preco_produto = 0;*/
        System.out.println("Devolvendo troco");
    }

    @Override
    public void espera_moeda() {
        System.out.println("Esperando moeda");
    }

    @Override
    public void e_insere_quantia() {
        /*try {
            Object o = new Object();  // ou poderia ser a própria quantia
            insereQuantia.enqueue(o); // <-- Aqui é onde você simula o comportamento da máquina
        } catch (IllegalArgumentException | IllegalStateException e) {
            illegalStateException = true;
        }*/
        System.out.println("Insere quantia valida");
    }
    @Override
    public void e_insere_quantia_invalida() {
        
        System.out.println("Insere quantia invalida");
    }

    @Override
    public void e_escolhe_opcao1() {
        System.out.println("Escolheu a opção 1");
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
        /*assertTrue(saldo >= preco_produto);*/
        System.out.println("Produto liberado");
    }

    @Override
    public void espera_produto() {
        System.out.println("Esperando produto");
    }

    @Override
    public void e_insere_codigo() {
        System.out.println("Codigo inserido");
    }
    @Override
    public void e_insere_codigo_incorreto() {
        System.out.println("Codigo inserido incorreto");
    }

    @Override
    public void e_produto_indisponivel() {
        System.out.println("Produto indisponível");
    }

    @Override
    public void e_produtto_liberado() {
        System.out.println("Produto foi liberado");
    }
}
