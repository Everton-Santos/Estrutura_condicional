package estrutura_condicional;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um n�mero: ");
		int num1 = ler.nextInt();
		System.out.print("Digite um n�mero: ");
		int num2 = ler.nextInt();
		
		if(num1 % num2 == 0 || num2 % num1 == 0) {
			System.out.println("S�o Multiplos!");
		}
		else {
			System.out.println("N�o s�o Multiplos!");
		}
		
		
	}

}
