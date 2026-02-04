package entities;

public class FuncionarioClt implements Funcionario{

	private String nome;
	private Double salarioBase;

	public FuncionarioClt() {
	}

	public FuncionarioClt(String nome, Double salarioBase) {
		this.nome = nome;
		this.salarioBase = salarioBase;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalario(Double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public double salarioFinal(double salarioBase) {
		return salarioBase * 0.2;
	}

	@Override
	public Double calcularSalario() {
		return salarioBase * 1.20;
	}

	@Override
	public String getTipo() {
		return ("CLT");
	}
}
