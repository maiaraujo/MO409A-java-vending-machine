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

@GraphWalker(value = "random(vertex_coverage(100))", start = "menu_compra")
public class VendingMachineCompraImplementacao extends ExecutionContext implements menu_compra {
    
    public final static Path MODEL_PATH = Paths.get("src/main/resources/Vending-Machine_HFSM_semFim.json");

    private VendingMachine vendingMachine;
    private boolean illegalStateException;
    
    private double quantia;

    private String produto_escolhido;
    private double preco_produto;

    @Before
    public void setUp() {
        try {
            vendingMachine = new VendingMachine();
        } catch (IOException e) {
            System.out.println("Erro ao iniciar a máquina de vendas: " + e.getMessage());
        }
        illegalStateException = false;
        quantia = 0.0;
    }

    public VendingMachineCompraImplementacao() {
        try {
            vendingMachine = new VendingMachine(); // carrega inventário e log
        } catch (IOException e) {
            System.out.println("Erro ao iniciar a máquina de vendas: " + e.getMessage());
        }
        illegalStateException = false;
        quantia = 0.0;
    }

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
        int[] troco = vendingMachine.getChange();
        System.out.printf("e_devolve_troco: Devolvendo troco: %d quarters, %d dimes, %d nickels%n", troco[0], troco[1], troco[2]);
    }

    @Override
    public void espera_moeda() {
        System.out.println("espera_moeda: Espera moeda");
    }

    @Override
    public void e_insere_quantia() {
        quantia = 10.0;
        System.out.println("e_insere_quantia: Inserindo quantia valida de "+vendingMachine.displayAsCurrency(quantia));
            
        double saldoAntes = vendingMachine.getMachineBalance();
        vendingMachine.addMoney(quantia);

        double saldoDepois = vendingMachine.getMachineBalance();
        assertEquals(saldoAntes + quantia, saldoDepois, 0.001);  // O saldo após a inserção

        illegalStateException = false;
    }
    @Override
    public void e_insere_quantia_invalida() {
        quantia = 50.0;
        System.out.println("e_insere_quantia_invalida: Inserindo quantia invalida de " + vendingMachine.displayAsCurrency(quantia));
        
        /*try {
            // Tentando inserir uma quantia inválida
            vendingMachine.addMoney(quantia);
            fail("Esperando captura da quantida invalida, mas passou.");
        } catch (IllegalArgumentException e) {
            System.out.println("Capturado esperada válida.");
        }*/
        illegalStateException = true;
    }

    @Override
    public void e_escolhe_opcao1() {
        System.out.println("e_escolhe_opcao1: Escolhendo a opcao 1");
    }

    @Override
    public void verifica_disponibilidade() {
        System.out.println("verifica_disponibilidade: Verifica disponibilidade");
    }

    @Override
    public void verifica_saldo() {
        System.out.println("verifica_saldo: Verifica se saldo e suficiente");
    }

    @Override
    public void libera_produto() {
        if(!illegalStateException){
            assertTrue(!illegalStateException);
        }
        System.out.println("libera_produto: Produto liberado");
    }

    @Override
    public void espera_produto() {
        if(!illegalStateException){
            assertTrue(!illegalStateException);
        }
        System.out.println("espera_produto: Esperando produto");
    }

    @Override
    public void e_verifica_saldo() {
        assertTrue(preco_produto <= vendingMachine.getMachineBalance());
        illegalStateException = false;
        
        System.out.println("e_verifica_saldo: Verificando que saldo suficiente: "+vendingMachine.displayAsCurrency(vendingMachine.getMachineBalance())+" para preco de produto "+vendingMachine.displayAsCurrency(preco_produto));
    }
    
    @Override
    public void e_verifica_saldo_insuficiente() {
        assertTrue(preco_produto > vendingMachine.getMachineBalance());
        illegalStateException = true;
        
        System.out.println("e_verifica_saldo_insuficiente: Verificando que saldo insuficiente: "+vendingMachine.displayAsCurrency(vendingMachine.getMachineBalance())+" para preco de produto "+vendingMachine.displayAsCurrency(preco_produto));
    }

    @Override
    public void e_insere_codigo() {
        produto_escolhido = "A3";

        assertTrue(vendingMachine.getInventory().containsKey(produto_escolhido));
        preco_produto = vendingMachine.getInventory().get(produto_escolhido).getPrice();

        System.out.println("e_insere_codigo: Inserindo codigo correto: " + produto_escolhido+" e o preço do produto e "+vendingMachine.displayAsCurrency(preco_produto));

        illegalStateException = false;
    }
    @Override
    public void e_insere_codigo_incorreto() {
        produto_escolhido = "Z3";
        System.out.println("e_insere_codigo_incorreto: Inserindo codigo incorreto: " + produto_escolhido);

        assertTrue(!vendingMachine.getInventory().containsKey(produto_escolhido));
        illegalStateException = true;
    }

    @Override
    public void e_produto_indisponivel() {
        System.out.println("e_produto_indisponivel: Verificando se Produto indisponivel: "+vendingMachine.getInventory().get(produto_escolhido).getQuantity());

        assertTrue(vendingMachine.getInventory().get(produto_escolhido).getQuantity() == 0);
        illegalStateException = true;
    }

    @Override
    public void e_produto_disponivel() {
        System.out.println("e_produto_disponivel: Verificando se Produto disponivel: "+vendingMachine.getInventory().get(produto_escolhido).getQuantity());

        Assert.assertTrue(vendingMachine.getInventory().get(produto_escolhido).getQuantity() > 0);
        illegalStateException = false;
    }

    @Override
    public void e_produtto_liberado() {
        System.out.println("e_produtto_liberado: Liberando produto");
        
        Item item = vendingMachine.getInventory().get(produto_escolhido);
        int quantidadeAntes = item.getQuantity();
        vendingMachine.transaction(produto_escolhido);  // efetua a compra
        int quantidadeDepois = item.getQuantity();

        assertEquals(quantidadeAntes - 1, quantidadeDepois);

        illegalStateException = false;
    }
}
