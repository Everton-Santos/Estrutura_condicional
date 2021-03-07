package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um n�mero: ");
		double x = ler.nextDouble();
		System.out.print("Digite um n�mero: ");
		double y = ler.nextDouble();
		
		if(x > 0.0 && y > 0.0 ) {
			System.out.println("Q1");
		}
		else if(x > 0.0 && y < 0.0) {
			System.out.println("Q4");
		}
		else if(x < 0.0 && y > 0.0) {
			System.out.println("Q2");
		}
		else if(x < 0.0 && y < 0.0) {
			System.out.println("Q3");
		}
		else if(x == 0.0 && y == 0.0) {
			System.out.println("Origem");
		}
		else if(x == 0.0) {
			System.out.println("Eixo Y!");
		}
		else if(y == 0.0) {
			System.out.println("Eixo X!");
		}
	}

}
