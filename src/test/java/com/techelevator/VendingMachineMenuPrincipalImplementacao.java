package com.techelevator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.java.annotation.GraphWalker;
import org.junit.Before;

import java.nio.file.Path;
import java.nio.file.Paths;

@GraphWalker(value = "random(vertex_coverage(100))", start = "menu_principal")
public class VendingMachineMenuPrincipalImplementacao extends ExecutionContext implements vending_machine{
    public final static Path MODEL_PATH = Paths.get("src/main/resources/Vending-Machine_HFSM_semFim.json");

    /*private VendingMachine testVM;*/

    @Before
    public void setUp() {
        /*testVM = new TesteMaquinaVendas();*/
    }

    @Override
    public void menu_principal(){
        System.out.println("menu_principal: Menu principal");
    }
    
    @Override
    public void e_finalizar_programa(){
        System.out.println("e_finalizar_programa: Finalizando o programa");
    }

    @Override
    public void encerrar(){
        System.out.println("encerrar: Encerrar");
    }

    @Override
    public void e_escolhe_opcao2(){
        System.out.println("e_escolhe_opcao2: Escolhendo a opcao 2");
    }

    @Override
    public void menu_compra_inicio() {
        System.out.println("menu_compra_inicio: Entra no menu de compra");
    }

    @Override
    public void e_escolhe_opcao3(){
        /*assertEquals(3, opcao);*/
        System.out.println("e_escolhe_opcao3: Escolhendo a opcao 3");
    }

    @Override
    public void fim(){
        System.out.println("fim: Encerra o programa");
    }

    @Override
    public void exibir_itens(){
        System.out.println("exibir_itens: Exibe itens");
    }

    @Override
    public void e_escolhe_opcao1(){
        /*assertEquals(1, opcao);*/
        System.out.println("e_escolhe_opcao1: Fechando o programa");
    }

    @Override
    public void e_restart(){
        System.out.println("e_restart: Abrindo o programa novamente");
        setUp();
    }

    @Override
    public void sales_report(){
        System.out.println("sales_report: Salva Sales Report");
    }

    @Override
    public void e_salva_sales_report(){
        System.out.println("e_salva_sales_report: Salvando o Sales Report");
    }

    @Override
    public void e_volta_menu(){
        System.out.println("e_volta_menu: Voltando ao menu");
    }

}
