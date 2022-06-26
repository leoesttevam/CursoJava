package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Resevation {

	private Integer numeroQuarto;
	private Date entrada;
	private Date saida;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Resevation(Integer numeroQuarto, Date entrada, Date saida) {
		this.numeroQuarto = numeroQuarto;
		this.entrada = entrada;
		this.saida = saida;
	}

	public Date getSaida() {
		return saida;
	}

	public void setSaida(Date saida) {
		this.saida = saida;
	}

	public Integer getNumeroQuarto() {
		return numeroQuarto;
	}

	public Date getEntrada() {
		return entrada;
	}
	
	public long duracao() {
		long dia = saida.getTime() - entrada.getTime();
		return TimeUnit.DAYS.convert(dia, TimeUnit.MILLISECONDS);
	}
	
	public String upDates(Date entrada, Date saida) {
		
		Date now = new Date();
		
		if(entrada.before(now) || saida.before(now)) {
			return "Error in reservation: Check-out date must be future dates";
		}if(!entrada.before(now) || saida.before(now)){
			return "Error in reservation: Check-out date must be after check-in date: ";
		}
		
		this.entrada = entrada;
		this.saida = saida;
		
		return null;
	}
	
	@Override
	public String toString() {
		return "Room " + numeroQuarto + ", check-in: " + sdf.format(entrada) + ", check-out" + sdf.format(saida) + ", " + duracao() + " nights.";
	}
}
