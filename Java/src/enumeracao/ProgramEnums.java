package enumeracao;

import java.util.Date;

import entities.OrderEnums;
import entities.enums.OrderStatus;

public class ProgramEnums {

	public static void main(String[] args) {
		
		OrderEnums order = new OrderEnums(1080, new Date(), OrderStatus.AGUARDANDO_PAGAMENTO);
		
		System.out.println(order);
		
	}
}
