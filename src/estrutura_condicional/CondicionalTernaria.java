package estrutura_condicional;

import java.util.Scanner;

public class CondicionalTernaria {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um n�mero: ");
		int num1 = ler.nextInt();
		System.out.print("Digite um segundo n�mero: ");
		int num2 = ler.nextInt();

		
		String resultado = (num1 > num2 ) ? "Valor maior" : "Valor menor";
		
		System.out.println(resultado);
		
	}

}
