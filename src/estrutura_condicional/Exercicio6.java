package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um número: ");
		double num1 = ler.nextDouble();
		
		if(num1 >= 0.00 && num1 <= 25.00) {
			System.out.println("Intervalo (0,25]");
		}
		else if(num1 > 25.00 && num1 <= 50.00) {
			System.out.println("Intervalo (25,50]");
		}
		else if(num1 > 50.00 && num1 <= 75.00) {
			System.out.println("Intervalo (50,75]");	
		}
		else if(num1 > 75 && num1 <= 100.00) {
			System.out.println("Intervalo (75,100]");
		}
		else {
			System.out.println("Fora de intervalo!");
		}
	}

}
