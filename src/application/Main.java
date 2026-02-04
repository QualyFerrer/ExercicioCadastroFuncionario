package application;

import java.util.Scanner;

import entities.Empresa;
import entities.Funcionario;
import entities.FuncionarioClt;
import entities.FuncionarioPj;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Empresa empresa = new Empresa();

        int opcao = -1;

        while (opcao != 0) {

            System.out.println("\n===== MENU =====");
            System.out.println("1 - Adicionar Funcionário CLT");
            System.out.println("2 - Adicionar Funcionário PJ");
            System.out.println("3 - Listar Funcionários");
            System.out.println("4 - Calcular Folha de Pagamento");
            System.out.println("5 - Buscar Funcionário por Nome");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {

                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Salário base: ");
                    double salarioBase = sc.nextDouble();
                    sc.nextLine();

                    FuncionarioClt clt = new FuncionarioClt(nome, salarioBase);
                    empresa.adicionarFuncionarioClt(clt);
                    

                    System.out.println("Funcionário CLT adicionado com sucesso!");
                    break;

                case 2:
                    System.out.print("Nome: ");
                    String nomePJ = sc.nextLine();

                    System.out.print("Valor da hora: ");
                    double valorHora = sc.nextDouble();

                    System.out.print("Horas trabalhadas: ");
                    int horasTrabalhadas = sc.nextInt();
                    sc.nextLine();

                    Funcionario pj = new FuncionarioPj(nomePJ, valorHora, horasTrabalhadas);
                    empresa.adicionarFuncionarioPj(pj);

                    System.out.println("Funcionário PJ adicionado com sucesso!");
                    break;

                case 3:
                    System.out.println("\n📋 Lista de Funcionários:");
                    empresa.listarFuncionarios();
                    break;

                case 4:
                    System.out.println(
                            "\n💰 Folha de Pagamento Total: R$ "
                                    + empresa.calcularFolhaPagamento()
                    );
                    break;

                case 5:
                    System.out.print("Digite o nome do funcionário: ");
                    String nomeBusca = sc.nextLine();

                    Funcionario funcionario = empresa.buscarFuncionarioPorNome(nomeBusca);

                    if (funcionario != null) {
                        System.out.println(
                                "Nome: " + funcionario.getNome() +
                                " | Tipo: " + funcionario.getTipo() +
                                " | Salário: R$ " + funcionario.calcularSalario()
                        );
                    } else {
                        System.out.println("Funcionário não encontrado.");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        sc.close();
    }
}
