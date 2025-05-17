package com.techelevator;

import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.java.annotation.GraphWalker;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Before;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

@GraphWalker(value = "random(edge_coverage(100))", start = "add_produto")
public class VendingMachineAddProdutoImplementacao extends ExecutionContext implements menu_add_produto {
    
    public final static Path MODEL_PATH = Paths.get("src/main/resources/Vending-Machine_HFSM_AddProduto.json");

    private VendingMachine vendingMachine;
    private boolean illegalStateException;
    
    private int produto_restante;
    private String produto_escolhido;

    @Before
    public void setUp() {
        try {
            vendingMachine = new VendingMachine();
        } catch (IOException e) {
            System.out.println("Erro ao iniciar a máquina de vendas: " + e.getMessage());
        }
        illegalStateException = false;
        produto_restante = 1;
        produto_escolhido = "";
    }

    public VendingMachineAddProdutoImplementacao() {
        try {
            vendingMachine = new VendingMachine(); // carrega inventário e log
        } catch (IOException e) {
            System.out.println("Erro ao iniciar a máquina de vendas: " + e.getMessage());
        }
        illegalStateException = false;
        produto_restante = 1;
        produto_escolhido = "";
    }

    @Before
    public void add_finaliza_acao(){
        System.out.println("add_finaliza_acao: Entrou no estado de finalizar ação");
    }

    @Before
    public void atualiza_quantidade(){
        System.out.println("atualiza_quantidade: Entrou no estado de atualizar quantidade");
    }

    @Before
    public void menu_principal(){
        System.out.println("menu_principal: Entrou no menu principal");
    }

    @Before
    public void espera_quantidade(){
        System.out.println("espera_quantidade: Entrou no estado de esperar quantidade");
    }

    @Before
    public void add_espera_produto(){
        System.out.println("add_espera_produto: Entrou no estado de esperar o produto");
    }

    @Before
    public void add_produto(){
        System.out.println("add_produto: Entrou no menu Adicionar quantidade de Produto");
    }

    @Before
    public void e_entra_menuPrincipal(){
        
    }

    @Before
    public void e_escolhe_opcao2(){
        System.out.println("e_escolhe_opcao2: Escolhendo a opcao 2");
    }
    
    @Before
    public void e_escolhe_opcao1(){
        System.out.println("e_escolhe_opcao1: Escolhendo a opcao 1");
    }

    @Before
    public void e_insere_codigo_incorreto(){
        produto_escolhido = "Z3";
        System.out.println("e_insere_codigo_incorreto: Inserindo codigo incorreto: " + produto_escolhido);

        assertTrue(!vendingMachine.getInventory().containsKey(produto_escolhido));
        illegalStateException = true;
    }

    @Before
    public void e_insere_codigo(){
        produto_escolhido = "A3";

        assertTrue(vendingMachine.getInventory().containsKey(produto_escolhido));
        System.out.println("e_insere_codigo: Inserindo codigo correto: " + produto_escolhido);

        illegalStateException = false;
    }

    @Before
    public void e_qtd_incorreta(){
        Item item = vendingMachine.getInventory().get(produto_escolhido);
        int quantidadeAntes = item.getQuantity();

        int qtdAdicionar = 20; // acima do limite
        if (quantidadeAntes + qtdAdicionar > 10) {
            System.out.println("e_qtd_incorreta: Tentou adicionar " + qtdAdicionar + " unidades, excedendo limite.");
            assertTrue(quantidadeAntes + qtdAdicionar > 10);
        }

        illegalStateException = true;
    }

    @Before
    public void e_qtd_correta(){
        Item item = vendingMachine.getInventory().get(produto_escolhido);
        int quantidadeAtual = item.getQuantity();

        int qtdAdicionar = 1;
        System.out.println("e_qtd_correta: verificando se é possível adicionar " + qtdAdicionar + " unidades. Quantidade atual no sistema: " + quantidadeAtual);

        assertTrue((quantidadeAtual + qtdAdicionar) <= 10);
        produto_restante = quantidadeAtual + qtdAdicionar;

        illegalStateException = false;
    }

    @Before
    public void e_atualiza_qnt() {
        Item item = vendingMachine.getInventory().get(produto_escolhido);
        int quantidadeAntes = item.getQuantity();
        int qtdAdicionar = 1;

        item.setQuantity(quantidadeAntes + qtdAdicionar); // Atualiza de fato
        int quantidadeDepois = item.getQuantity();

        System.out.println("e_atualiza_qnt: Adicionou " + qtdAdicionar + " unidades. Nova quantidade no sistema: " + quantidadeDepois);

        // Verifica se a atualização foi aplicada corretamente
        assertEquals(quantidadeAntes + qtdAdicionar, quantidadeDepois);

        produto_restante = quantidadeDepois;
        illegalStateException = false;
    }

}
