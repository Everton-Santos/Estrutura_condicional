package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class AtribuicaoAcumulativa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite a quantidade de minutos consumidos : ");
		int min = ler.nextInt();
		
		int franquia = 100;
		double valor = 50.0;
		
		if(min > franquia) {
			min -= 100;
			valor += (min * 2.00);
		}
		System.out.printf("Valor a pagar: R$ %.2f %n", valor);
		
	}

}
