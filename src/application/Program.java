package application;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.interfaces.OnlinePaymentService;
import model.services.ContractService;
import model.services.PaypalService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter contract data");
		
		System.out.print("Number: ");
		
		try {
		int number = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		sc.nextLine();
		Date date = sdf.parse(sc.nextLine());
		System.out.print("Contract value: ");
		double contractValue = sc.nextDouble();
		System.out.print("Enter number of installments: ");
		
		//Instanciando Contrato
		Contract contract = new Contract(number, date, contractValue);
		
		int numberInstallments = sc.nextInt();
		ContractService contractService = new ContractService(new PaypalService());
		contractService.processContract(contract, numberInstallments);
		
		System.out.println("Installment:");
		for (Installment x : contract.getInstallments()) {
			System.out.println(x);
		}
		
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			sc.close();
		}
		
		
		
		
		
		
		
	}

}
