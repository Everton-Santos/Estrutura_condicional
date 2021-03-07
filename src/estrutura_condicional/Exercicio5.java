package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		System.out.printf("Código do ítem: ");
		int codigo = ler.nextInt();
		System.out.printf("Quantidade do ítem: ");
		int qtd = ler.nextInt();
		Locale.setDefault(Locale.US);
		
		if(codigo == 1) {
			double valorTotal = qtd * 4.00;
			System.out.printf("Código: %d - %d Cachorro Quente - Valor Total = "
					+ "R$ %.2f %n", codigo, qtd, valorTotal);
		}
		else if(codigo == 2) {
			double valorTotal = qtd * 4.50;	
			System.out.printf("Código: %d - %d X-Salada - Valor Total = "
					+ "R$ %.2f %n", codigo, qtd, valorTotal);
		}
		else if(codigo == 3) {
			double valorTotal = qtd * 5.00;
			System.out.printf("Código: %d - %d X-Bacon - Valor Total = "
					+ "R$ %.2f %n", codigo, qtd, valorTotal);
		}
		else if(codigo == 4) {
			double valorTotal = qtd * 2.00;
			System.out.printf("Código: %d - %d Torrada Simples - Valor Total = "
					+ "R$ %.2f %n", codigo, qtd, valorTotal);
		}
		else if(codigo == 5) {
			double valorTotal = qtd * 1.50;
			System.out.printf("Código: %d - %d Refrigerante - Valor Total = "
					+ "R$ %.2f %n", codigo, qtd, valorTotal);
		}

	}

}
