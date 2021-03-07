package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class switchCase {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int num = ler.nextInt();
		
		String dia;
		
		switch (num) {
		case 1:
			dia = "Domingo!";
			break;
		case 2:
			dia = "Segunda!";
			break;
		case 3:
			dia = "Terça";
			break;
		case 4:
			dia = "Quarta";
			break;
		case 5:
			dia = "Quinta";
			break;
		case 6:
			dia = "Sexta!";
			break;
		case 7:
			dia = "Sábado!";
		default:
			dia = "Código Inválido!";
			break;
		}
		System.out.println("Dia da Semana: " + dia);
	}
}
