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
    
    private String produto_escolhido;
    private int produto_restante;

    @Before
    public void setUp() {
        try {
            vendingMachine = new VendingMachine();
        } catch (IOException e) {
            System.out.println("Erro ao iniciar a máquina de vendas: " + e.getMessage());
        }
        illegalStateException = false;
        produto_restante = 1;
    }

    public VendingMachineAddProdutoImplementacao() {
        try {
            vendingMachine = new VendingMachine(); // carrega inventário e log
        } catch (IOException e) {
            System.out.println("Erro ao iniciar a máquina de vendas: " + e.getMessage());
        }
        illegalStateException = false;
        produto_restante = 1;
    }

    @Before
    public void add_finaliza_acao(){
        
    }

    @Before
    public void atualiza_quantidade(){
        
    }

    @Before
    public void menu_principal(){
        
    }

    @Before
    public void espera_quantidade(){
        
    }

    @Before
    public void add_espera_produto(){
        
    }

    @Before
    public void add_produto(){
        
    }

    @Before
    public void e_qtd_correta(){
        
    }

    @Before
    public void e_qtd_incorreta(){
        
    }

    @Before
    public void e_entra_menuPrincipal(){
        
    }

    @Before
    public void e_escolhe_opcao2(){
        
    }

    @Before
    public void e_insere_codigo_incorreto(){
        
    }

    @Before
    public void e_escolhe_opcao1(){
        
    }

    @Before
    public void e_insere_codigo(){
        
    }

    @Before
    public void e_atualiza_qnt(){
        
    }

}
