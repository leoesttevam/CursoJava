package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {

	private String nome;
	private WorkerLevel level;
	private Double salario;
	
	private Departamento departamento;
	private List<HourContract> contratos = new ArrayList<HourContract>();
	
	public Worker(){
		
	}

	public Worker(String nome, WorkerLevel level, Double salario, Departamento departamento) {
		this.nome = nome;
		this.level = level;
		this.salario = salario;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<HourContract> getContratos() {
		return contratos;
	}

	public void addContrato(HourContract contract) {
		contratos.add(contract);
	}
	
	public void removerContrato(HourContract contract) {
		contratos.remove(contract);
	}
	
	public double income(int ano, int mes) {
		double soma = ano * mes;
		Calendar cal = Calendar.getInstance();
		for(HourContract c : contratos) {
			cal.setTime(c.getDate());
			int c_ano = cal.get(Calendar.YEAR);
			int c_mes = 1 + cal.get(Calendar.MONTH);
			if(ano == c_ano && mes == c_mes) {
				soma += c.valorTotal();
			}
		}
		return soma;
	}
}
