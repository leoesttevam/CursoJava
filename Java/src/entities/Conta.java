package entities;

public class Conta {

	private int number;
	private String holder;
	private double saldo = 500.00;
	
	public Conta(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public Conta(int number, String holder, double dep) {
		this.number = number;
		this.holder = holder;
		deposito(dep);
	}
	

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void deposito(double deposit) {
		 saldo += deposit;
	}
	
	public void saque(double saques) {
		 saldo -= saques + 5;
	}

	@Override
	public String toString() {
		return "Conta " + number + ", Holder: " + holder + ", Balance: $ " + saldo;
	}
	
	
}
