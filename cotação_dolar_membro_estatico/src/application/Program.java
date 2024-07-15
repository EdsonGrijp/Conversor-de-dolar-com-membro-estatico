package application;

import java.util.Locale;
import java.util.Scanner;
import util.Calculator;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a cotação do dolar: ");
		double dolar = sc.nextDouble();
		
		System.out.println("Digite o quanto dejesa comprar em dolar: ");
		double quantidade = sc.nextDouble();
		
		double TCI = Calculator.dolarparareal(dolar,quantidade);
		
		System.out.println("Valor total sem impostos " +TCI);
		
		sc.close();
	}
}
