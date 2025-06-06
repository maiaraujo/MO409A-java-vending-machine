package com.techelevator;
import org.junit.Test;

public class TesteMaquinaVendas{
  /* Chama a hierarquia do menu_principal */
  VendingMachineMenuPrincipalImplementacao menu_principal = new VendingMachineMenuPrincipalImplementacao();
  /* Chama a hierarquia do menu_compra */
  VendingMachineCompraImplementacao menu_compra = new VendingMachineCompraImplementacao();

  @Test
  public void Teste1() {
    menu_principal.menu_principal();
    menu_principal.e_escolhe_opcao2();
    menu_principal.menu_compra_inicio();
    menu_compra.menu_compra();
    menu_compra.e_escolhe_opcao3();
    menu_compra.finaliza_acao();
    menu_compra.e_devolve_troco();
    menu_compra.menu_principal();
    menu_principal.menu_principal();
    menu_principal.e_escolhe_opcao2();
    menu_principal.menu_compra_inicio();
    menu_compra.menu_compra();
    menu_compra.e_escolhe_opcao1();
    menu_compra.espera_moeda();
    menu_compra.e_insere_quantia();
    menu_compra.menu_compra();
    menu_compra.e_escolhe_opcao1();
    menu_compra.espera_moeda();
    menu_compra.e_insere_quantia();
    menu_compra.menu_compra();
    menu_compra.menu_compra();
    menu_compra.menu_compra();
    menu_compra.e_escolhe_opcao3();
    menu_compra.finaliza_acao();
    menu_compra.e_devolve_troco();
    menu_compra.menu_principal();
    menu_principal.menu_principal();
    menu_principal.e_escolhe_opcao2();
    menu_principal.menu_compra_inicio();
    menu_compra.menu_compra();
    menu_compra.e_escolhe_opcao3();
    menu_compra.finaliza_acao();
    menu_compra.e_devolve_troco();
    menu_compra.menu_principal();
    menu_principal.menu_principal();
    menu_principal.e_escolhe_opcao2();
    menu_principal.menu_compra_inicio();
    menu_compra.menu_compra();
    menu_compra.e_escolhe_opcao2();
    menu_compra.espera_produto();
    menu_compra.e_insere_codigo_incorreto();
    menu_compra.menu_compra();
    menu_compra.e_escolhe_opcao2();
    menu_compra.espera_produto();
    menu_compra.e_insere_codigo_incorreto();
    menu_compra.menu_compra();
    menu_compra.e_escolhe_opcao1();
    menu_compra.espera_moeda();
    menu_compra.e_insere_quantia();
    menu_compra.menu_compra();
    menu_compra.e_escolhe_opcao2();
    menu_compra.espera_produto();
    menu_compra.e_insere_codigo_incorreto();
    menu_compra.menu_compra();
    menu_compra.menu_compra();
    menu_compra.menu_compra();
    menu_compra.e_escolhe_opcao3();
    menu_compra.finaliza_acao();
    menu_compra.e_devolve_troco();
    menu_compra.menu_principal();
    menu_principal.menu_principal();
    menu_principal.e_escolhe_opcao2();
    menu_principal.menu_compra_inicio();
    menu_compra.menu_compra();
    menu_compra.e_escolhe_opcao3();
    menu_compra.finaliza_acao();
    menu_compra.e_devolve_troco();
    menu_compra.menu_principal();
    menu_principal.menu_principal();
    menu_principal.e_escolhe_opcao3();
    menu_principal.encerrar();
    menu_principal.e_salva_sales_report();
    menu_principal.sales_report();
    menu_principal.e_finalizar_programa();
    menu_principal.fim();
  }
  @Test
  public void Teste2() {
    menu_principal.e_restart();
    menu_principal.menu_principal();
    menu_principal.menu_principal();
    menu_principal.menu_principal();
    menu_principal.e_escolhe_opcao1();
    menu_principal.exibir_itens();
    menu_principal.e_volta_menu();
    menu_principal.menu_principal();
    menu_principal.e_escolhe_opcao1();
    menu_principal.exibir_itens();
    menu_principal.e_volta_menu();
    menu_principal.menu_principal();
    menu_principal.menu_principal();
    menu_principal.menu_principal();
    menu_principal.e_escolhe_opcao3();
    menu_principal.encerrar();
    menu_principal.e_salva_sales_report();
    menu_principal.sales_report();
    menu_principal.e_finalizar_programa();
    menu_principal.fim();
  }
  @Test
  public void Teste3() {
    menu_principal.e_restart();
    menu_principal.menu_principal();
    menu_principal.menu_principal();
    menu_principal.menu_principal();
    menu_principal.e_escolhe_opcao1();
    menu_principal.exibir_itens();
    menu_principal.e_volta_menu();
    menu_principal.menu_principal();
    menu_principal.e_escolhe_opcao2();
    menu_principal.menu_compra_inicio();
    menu_compra.menu_compra();
    menu_compra.e_escolhe_opcao1();
    menu_compra.espera_moeda();
    menu_compra.e_insere_quantia_invalida();
    menu_compra.menu_compra();
    menu_compra.menu_compra();
    menu_compra.menu_compra();
    menu_compra.e_escolhe_opcao2();
    menu_compra.espera_produto();
    menu_compra.e_insere_codigo();
    menu_compra.verifica_disponibilidade();
    menu_compra.e_produto_disponivel();
    menu_compra.verifica_saldo();
    menu_compra.e_verifica_saldo_insuficiente();
    menu_compra.menu_compra();
    menu_compra.menu_compra();
    menu_compra.menu_compra();
    menu_compra.e_escolhe_opcao2();
    menu_compra.espera_produto();
    menu_compra.e_insere_codigo();
    menu_compra.verifica_disponibilidade();
    menu_compra.e_produto_disponivel();
    menu_compra.verifica_saldo();
    menu_compra.e_verifica_saldo_insuficiente();
    menu_compra.menu_compra();
    menu_compra.menu_compra();
    menu_compra.menu_compra();
    menu_compra.e_escolhe_opcao2();
    menu_compra.espera_produto();
    menu_compra.e_insere_codigo();
    menu_compra.verifica_disponibilidade();
    menu_compra.e_produto_disponivel();
    menu_compra.verifica_saldo();
    menu_compra.e_verifica_saldo_insuficiente();
    menu_compra.menu_compra();
    menu_compra.menu_compra();
    menu_compra.menu_compra();
    menu_compra.e_escolhe_opcao2();
    menu_compra.espera_produto();
    menu_compra.e_insere_codigo();
    menu_compra.verifica_disponibilidade();
    menu_compra.e_produto_disponivel();
    menu_compra.verifica_saldo();
    menu_compra.e_verifica_saldo_insuficiente();
    menu_compra.menu_compra();
    menu_compra.e_escolhe_opcao3();
    menu_compra.finaliza_acao();
    menu_compra.e_devolve_troco();
    menu_compra.menu_principal();
    menu_principal.menu_principal();
    menu_principal.e_escolhe_opcao1();
    menu_principal.exibir_itens();
    menu_principal.e_volta_menu();
    menu_principal.menu_principal();
    menu_principal.e_escolhe_opcao3();
    menu_principal.encerrar();
    menu_principal.e_salva_sales_report();
    menu_principal.sales_report();
    menu_principal.e_finalizar_programa();
    menu_principal.fim();
  }
  @Test
  public void Teste4() {
    menu_principal.e_restart();
    menu_principal.menu_principal();
    menu_principal.e_escolhe_opcao2();
    menu_principal.menu_compra_inicio();
    menu_compra.menu_compra();
    menu_compra.e_escolhe_opcao2();
    menu_compra.espera_produto();
    menu_compra.e_insere_codigo();
    menu_compra.verifica_disponibilidade();
    menu_compra.e_produto_disponivel();
    menu_compra.verifica_saldo();
    menu_compra.e_verifica_saldo_insuficiente();
    menu_compra.menu_compra();
    menu_compra.menu_compra();
    menu_compra.menu_compra();
    menu_compra.e_escolhe_opcao2();
    menu_compra.espera_produto();
    menu_compra.e_insere_codigo();
    menu_compra.verifica_disponibilidade();
    menu_compra.e_produto_disponivel();
    menu_compra.verifica_saldo();
    menu_compra.e_verifica_saldo_insuficiente();
    menu_compra.menu_compra();
    menu_compra.menu_compra();
    menu_compra.menu_compra();
    menu_compra.e_escolhe_opcao3();
    menu_compra.finaliza_acao();
    menu_compra.e_devolve_troco();
    menu_compra.menu_principal();
    menu_principal.menu_principal();
    menu_principal.e_escolhe_opcao3();
    menu_principal.encerrar();
    menu_principal.e_salva_sales_report();
    menu_principal.sales_report();
    menu_principal.e_finalizar_programa();
    menu_principal.fim();
  }
  @Test
  public void Teste5() {
    menu_principal.e_restart();
    menu_principal.menu_principal();
    menu_principal.e_escolhe_opcao3();
    menu_principal.encerrar();
    menu_principal.e_salva_sales_report();
    menu_principal.sales_report();
    menu_principal.e_finalizar_programa();
    menu_principal.fim();
  }
  @Test
  public void Teste6() {
    menu_principal.e_restart();
    menu_principal.menu_principal();
    menu_principal.e_escolhe_opcao1();
    menu_principal.exibir_itens();
    menu_principal.e_volta_menu();
    menu_principal.menu_principal();
    menu_principal.e_escolhe_opcao2();
    menu_principal.menu_compra_inicio();
    menu_compra.menu_compra();
    menu_compra.e_escolhe_opcao1();
    menu_compra.espera_moeda();
    menu_compra.e_insere_quantia_invalida();
    menu_compra.menu_compra();
    menu_compra.e_escolhe_opcao2();
    menu_compra.espera_produto();
    menu_compra.e_insere_codigo_incorreto();
    menu_compra.menu_compra();
    menu_compra.e_escolhe_opcao3();
    menu_compra.finaliza_acao();
    menu_compra.e_devolve_troco();
    menu_compra.menu_principal();
    menu_principal.menu_principal();
    menu_principal.e_escolhe_opcao2();
    menu_principal.menu_compra_inicio();
    menu_compra.menu_compra();
    menu_compra.e_escolhe_opcao1();
    menu_compra.espera_moeda();
    menu_compra.e_insere_quantia();
    menu_compra.menu_compra();
    menu_compra.menu_compra();
    menu_compra.menu_compra();
    menu_compra.e_escolhe_opcao2();
    menu_compra.espera_produto();
    menu_compra.e_insere_codigo_incorreto();
    menu_compra.menu_compra();
    menu_compra.e_escolhe_opcao2();
    menu_compra.espera_produto();
    menu_compra.e_insere_codigo_incorreto();
    menu_compra.menu_compra();
    menu_compra.menu_compra();
    menu_compra.menu_compra();
    menu_compra.e_escolhe_opcao2();
    menu_compra.espera_produto();
    menu_compra.e_insere_codigo_incorreto();
    menu_compra.menu_compra();
    menu_compra.e_escolhe_opcao1();
    menu_compra.espera_moeda();
    menu_compra.e_insere_quantia();
    menu_compra.menu_compra();
    menu_compra.menu_compra();
    menu_compra.menu_compra();
    menu_compra.e_escolhe_opcao2();
    menu_compra.espera_produto();
    menu_compra.e_insere_codigo_incorreto();
    menu_compra.menu_compra();
    menu_compra.e_escolhe_opcao1();
    menu_compra.espera_moeda();
    menu_compra.e_insere_quantia();
    menu_compra.menu_compra();
    menu_compra.menu_compra();
    menu_compra.menu_compra();
    menu_compra.e_escolhe_opcao3();
    menu_compra.finaliza_acao();
    menu_compra.e_devolve_troco();
    menu_compra.menu_principal();
    menu_principal.menu_principal();
    menu_principal.e_escolhe_opcao2();
    menu_principal.menu_compra_inicio();
    menu_compra.menu_compra();
    menu_compra.e_escolhe_opcao3();
    menu_compra.finaliza_acao();
    menu_compra.e_devolve_troco();
    menu_compra.menu_principal();
    menu_principal.menu_principal();
    menu_principal.e_escolhe_opcao2();
    menu_principal.menu_compra_inicio();
    menu_compra.menu_compra();
    menu_compra.e_escolhe_opcao1();
    menu_compra.espera_moeda();
    menu_compra.e_insere_quantia();
    menu_compra.menu_compra();
    menu_compra.menu_compra();
    menu_compra.menu_compra();
    menu_compra.e_escolhe_opcao1();
    menu_compra.espera_moeda();
    menu_compra.e_insere_quantia_invalida();
    menu_compra.menu_compra();
    menu_compra.e_escolhe_opcao1();
    menu_compra.espera_moeda();
    menu_compra.e_insere_quantia_invalida();
    menu_compra.menu_compra();
    menu_compra.e_escolhe_opcao2();
    menu_compra.espera_produto();
    menu_compra.e_insere_codigo();
    menu_compra.verifica_disponibilidade();
    menu_compra.e_produto_disponivel();
    menu_compra.verifica_saldo();
    menu_compra.e_verifica_saldo();
    menu_compra.libera_produto();
  }
}