package entities;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

	List<Funcionario> list = new ArrayList<>();

	
    public void adicionarFuncionarioClt(FuncionarioClt funcionarioClt) {
        list.add(funcionarioClt);
    }
    
    public void adicionarFuncionarioPj(Funcionario pj) {
        list.add(pj);
    }

    public void listarFuncionarios() {
        for (Funcionario f : list) {
            System.out.println(f.getNome() 
            				+ " | Tipo: " 
            				+ f.getTipo()
            				+ " | Salário: R$ " 
            				+ f.calcularSalario());
            
        }
    }

    public double calcularFolhaPagamento() {
        double total = 0;
        for (Funcionario f : list) {
            total += f.calcularSalario();
        }
        return total;
    }

    public Funcionario buscarFuncionarioPorNome(String nome) {
        for (Funcionario f : list) {
            if (f.getNome().equalsIgnoreCase(nome)) {
                return f;
            }
        }
        return null;
    }
}
