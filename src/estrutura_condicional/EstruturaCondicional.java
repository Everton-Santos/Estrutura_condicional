package estrutura_condicional;

import java.util.Scanner;

public class EstruturaCondicional {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int horas;
		
		System.out.println("Quantas horas?");
		horas = sc.nextInt();
		
		if(horas < 12) {
			System.out.println("Bom dia!");
		}
		else if(12 <= horas && horas < 18) {
			System.out.println("Boa Tarde!");
		}
		else {
			System.out.println("Boa Noite!");
		}
		
		
	}

}
