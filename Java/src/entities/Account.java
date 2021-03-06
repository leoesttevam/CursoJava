package entities;

public class Account {

	private Integer number;
	private String titular;
	protected Double saldo;
	
	public Account() {
		
	}

	public Account(Integer number, String titular, Double saldo) {
		this.number = number;
		this.titular = titular;
		this.saldo = saldo;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void saque(double valor) {
		saldo -= valor + 5.0;
	}
	
	public void deposito(double valor) {
		saldo += valor;
	}
}
