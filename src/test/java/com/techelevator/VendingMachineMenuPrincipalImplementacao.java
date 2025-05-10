package com.techelevator;

import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.java.annotation.AfterExecution;
import org.graphwalker.java.annotation.BeforeExecution;
import org.graphwalker.java.annotation.GraphWalker;

import org.junit.Assert;
import org.junit.Before;
import static org.junit.Assert.*;

@GraphWalker(value = "random(vertex_coverage(100))", start = "menu_principal")
public class VendingMachineMenuPrincipalImplementacao extends ExecutionContext implements vending_machine{
    private TesteMaquinaVendas maquinaVendas;
    private boolean nullPointerException;
    private boolean illegalStateException;
    private int opcao;

    @Before
    public void setUp() {
        maquinaVendas = new TesteMaquinaVendas();
        nullPointerException = false;
        illegalStateException = false;
        opcao = 2;
    }

    @Override
    public void menu_principal(){
        System.out.println("Menu principal exibido");
    }
    
    @Override
    public void e_finalizar_programa(){
        System.out.println("Finalizou o programa");
    }

    @Override
    public void encerrar(){
        System.out.println("Encerra");
    }

    @Override
    public void e_escolhe_opcao2(){
        /*assertEquals(2, opcao);*/
        System.out.println("Escolheu a opcao 2");
    }

    @Override
    public void menu_compra_inicio() {
        System.out.println("Entra no menu de compra");
    }

    @Override
    public void e_escolhe_opcao3(){
        /*assertEquals(3, opcao);*/
        System.out.println("Escolheu a opcao 3");
    }

    @Override
    public void fim(){
        System.out.println("Encerra o programa");
    }

    @Override
    public void exibir_itens(){
        System.out.println("Exibe itens");
    }

    @Override
    public void e_escolhe_opcao1(){
        /*assertEquals(1, opcao);*/
        System.out.println("Fechou o programa");
    }

    @Override
    public void e_restart(){
        System.out.println("Abriu novamente o programa");
        setUp();
    }

    @Override
    public void sales_report(){
        System.out.println("Salva Sales Report");
    }

    @Override
    public void e_salva_sales_report(){
        System.out.println("Salvou o Sales Report");
    }

    @Override
    public void e_volta_menu(){
        System.out.println("Voltou no menu");
    }

}
