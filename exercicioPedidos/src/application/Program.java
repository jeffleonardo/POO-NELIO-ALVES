package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Order car = new Order();
		OrderStatus status = car.getStatus();
		OrderItem pedido = new OrderItem();
		Product item = new Product();
		
		
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		Client client = new Client(name, email, birthDate);
		System.out.println();
		System.out.println("Enter order data:");
		
		System.out.print("Status: \n"
				+ "0 - PENDING_PAYMENT\n"
				+ "1 - PROCESSING\n"
				+ "2 - SHIPPED\n"
				+ "3 - DELIVERED ");
		int opcao = sc.nextInt();
		if(opcao == 0) car.setStatus(OrderStatus.PENDING_PAYMENT);
		if(opcao == 1) car.setStatus(OrderStatus.PROCESSING);
		if(opcao == 2) car.setStatus(OrderStatus.SHIPPED);
		if(opcao == 3) car.setStatus(OrderStatus.DELIVERED);
		Order order = new Order(new Date(), status, client);
		System.out.print("How many items to this order?");
		int qtd = sc.nextInt();			
		for(int i=1; i<=qtd;i++) {	
			System.out.print("Enter #" + i + " item data: ");
			System.out.print("Product name: ");
			sc.nextLine();	
			String nameItem = sc.nextLine();
			System.out.print("Product price: ");
			double priceItem = sc.nextDouble();
			
			item = new Product(nameItem, priceItem);
			
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();			
			
			pedido = new OrderItem(quantity, priceItem, item);
			order.addItem(pedido);
			System.out.println();
		}
		System.out.println();
		System.out.println(order);
	
		sc.close();
	}

}
