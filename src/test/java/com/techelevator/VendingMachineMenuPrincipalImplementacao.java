package com.techelevator;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.java.annotation.GraphWalker;

@GraphWalker(value = "random(vertex_coverage(100))", start = "menu_principal")
public class VendingMachineMenuPrincipalImpementacao extends ExecutionContext implements vending_machine{
    
    @Override
    public void e_finalizar_programa(){
        System.out.println("Finalizou o programa");
    }

    @Override
    public void encerrar(){
        System.out.println("Entrou em encerrar");
    }

    @Override
    public void e_escolhe_opcao2(){
        System.out.println("Escolheu a opção 2");
    }

    @Override
    public void e_escolhe_opcao3(){
        System.out.println("Escolheu a opção 3");
    }

    @Override
    public void fim(){
        System.out.println("Fecho o programa");
    }

    @Override
    public void exibir_itens(){
        System.out.println("Entrou no Exibir itens");
    }

    @Override
    public void e_escolhe_opcao1(){
        System.out.println("Fecho o programa");
    }

    @Override
    public void e_restart(){
        System.out.println("Abriu novamente o programa");
    }

    @Override
    public void sales_report(){
        System.out.println("Entrou no Sales Report");
    }

    @Override
    public void menu_principal(){
        System.out.println("Entrou no menu principal");
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
