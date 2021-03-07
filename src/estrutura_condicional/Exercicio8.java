package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		System.out.print("Valor do Salario: ");
		double salario = ler.nextDouble();
		
		if(salario <= 2000.00) {
			System.out.println("Isento!");
		}
		else if(salario >= 2000.01 && salario <= 3000.00) {
			double descontoSalario = salario - 2000.00;
			double imposto = 0.08;
			double impostoDeRenda = descontoSalario * imposto;
			System.out.printf("Imposto de Renda: R$ %.2f %n", impostoDeRenda);
		}
		else if(salario >= 3000.01 && salario <= 4500.00) {
			double descontoSalario = salario - 2000.00;
			if(descontoSalario <= 1000.00) {
				double imposto = 0.08;
				double impostoDeRenda = descontoSalario * imposto;
				System.out.printf("Imposto de Renda: R$ %.2f %n", impostoDeRenda);
			}
			else {
				double descontoSalario2 = descontoSalario - 1000;
				double impostoDeRenda = 1000.00 * 0.08;
				double impostoDeRenda2 = descontoSalario2 * 0.18;
				double impostoDeRendaFinal = impostoDeRenda + impostoDeRenda2;
				System.out.printf("Imposto de Renda: R$ %.2f %n", impostoDeRendaFinal);
			}
		}
		else if(salario > 4500.01) {
			double descontoSalario = salario - 2000.00;
			descontoSalario = descontoSalario - 1000.00;
			double impostoDeRenda = 1000.00 * 0.08;
			descontoSalario = descontoSalario - 1500.00;
			double impostoDeRenda2 = 1500.00 * 0.18;
			double imposttoDeRenda3 = descontoSalario * 0.28;
			double impostoDeRendaFinal = impostoDeRenda + impostoDeRenda2 + imposttoDeRenda3;
			System.out.printf("Imposto de Renda: R$ %.2f %n", impostoDeRendaFinal);
		}

	}

}
