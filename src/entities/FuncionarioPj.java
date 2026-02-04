package entities;

public class FuncionarioPj implements Funcionario{

	private String nome;
	private Double valorHora;
	private int horasTrabalhadas;
	
	public FuncionarioPj() {
	}

	public FuncionarioPj(String nome, Double valorHora, int horasTrabalhadas) {
		this.nome = nome;
		this.valorHora = valorHora;
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValorHora() {
		return valorHora;
	}

	public void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	public double salarioFinal(double valorHora) {
		return horasTrabalhadas * valorHora;
	}
	
	@Override
	public String getNome() {
		return nome;
	}
	
	@Override
	public Double calcularSalario() {
		return valorHora * horasTrabalhadas;
	}

	@Override
	public String getTipo() {
		return ("PJ");
	}
}
