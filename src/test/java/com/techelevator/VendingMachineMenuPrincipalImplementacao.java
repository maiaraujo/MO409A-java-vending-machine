package com.techelevator;

import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.java.annotation.GraphWalker;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

@GraphWalker(value = "random(edge_coverage(100))", start = "menu_principal")
public class VendingMachineMenuPrincipalImplementacao extends ExecutionContext implements vending_machine {

    public final static Path MODEL_PATH = Paths.get("src/main/resources/Vending-Machine_HFSM_AddProduto.json");

    private VendingMachine vendingMachine;
    private VendingMachineSalesReport salesReport;

    public VendingMachineMenuPrincipalImplementacao() {
        try {
            vendingMachine = new VendingMachine(); // carrega inventário e log
        } catch (IOException e) {
            throw new RuntimeException("Erro ao inicializar a máquina de vendas", e);
        }
    }

    @Override
    public void menu_principal() {
        System.out.println("menu_principal: Exibindo menu principal");
        // Aqui pode-se validar o estado da aplicação se houver flags
    }

    @Override
    public void menu_compra_inicio() {
        System.out.println("menu_compra_inicio: Entrando no menu de compra");
        // Simula o fluxo de entrada no menu de compra (por exemplo: alteração de estado interno se houver)
    }

    @Override
    public void add_produto() {
        System.out.println("add_produto: Exibindo menu para adicionar quantidade de produto");
        // Aqui pode-se validar o estado da aplicação se houver flags
    }

    @Override
    public void e_escolhe_opcao1() {
        System.out.println("e_escolhe_opcao1: Exibir inventário");
        vendingMachine.listInventory(); // lista os produtos
    }

    @Override
    public void e_escolhe_opcao2() {
        System.out.println("e_escolhe_opcao2: Ir para menu de compra");
        // nenhuma ação no backend diretamente, apenas transição visual
    }

    @Override
    public void e_escolhe_opcao3() {
        System.out.println("e_escolhe_opcao3: Salvar relatório de vendas");
        salesReport = new VendingMachineSalesReport(vendingMachine);
        try {
            salesReport.generateSalesReport();
        } catch (FileNotFoundException e) {
            System.out.println("Erro ao gerar relatório de vendas");
        }
    }

    @Override
    public void e_escolhe_opcao5() {
        System.out.println("e_escolhe_opcao5: Adicionar Produto");
        // nenhuma ação no backend diretamente, apenas transição visual
    }

    @Override
    public void e_salva_sales_report() {
        System.out.println("e_salva_sales_report: Confirmando geração do relatório");
    }

    @Override
    public void sales_report() {
        File folder = new File("sales-reports");
        File[] reports = folder.listFiles((dir, name) -> name.endsWith("_SALES_REPORT.txt"));
        assert reports != null;
        assertTrue("Nenhum relatório gerado", reports.length > 0);
    }


    @Override
    public void e_volta_menu() {
        System.out.println("e_volta_menu: Retornando ao menu principal");
        // simulação de navegação
    }

    @Override
    public void e_restart() {
        System.out.println("e_restart: Reiniciando sistema");
        try {
            vendingMachine = new VendingMachine();
        } catch (IOException e) {
            System.out.println("Erro ao reiniciar a máquina");
        }
    }

    @Override
    public void e_finalizar_programa() {
        System.out.println("e_finalizar_programa: Encerrando aplicação");
        // Simula encerramento, pode zerar dados ou encerrar loop, se aplicável
    }

    @Override
    public void encerrar() {
        System.out.println("encerrar: Pós-finalização");
        // validações ou simulação de fim de execução
    }

    @Override
    public void fim() {
        System.out.println("fim: Aplicação encerrada");
        // reforçando o estado final
    }

    @Override
    public void exibir_itens() {
        System.out.println("exibir_itens: Listando novamente os itens");
        vendingMachine.listInventory();
    }
}
