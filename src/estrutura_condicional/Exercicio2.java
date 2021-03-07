package estrutura_condicional;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int num1 = ler.nextInt();
		
		if(num1 % 2 == 0) {
			System.out.println("Par!");
		}
		else {
			System.out.println("Impar!");
		}
	}

}
