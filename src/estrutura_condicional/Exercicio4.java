package estrutura_condicional;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		System.out.print("Hora inicial: ");
		int horaInicial = ler.nextInt();
		System.out.print("Hora final: ");
		int horaFinal = ler.nextInt();
		int horaJogada;
		
		if(horaInicial < horaFinal) {
			horaJogada = horaFinal - horaInicial;
			System.out.printf("O jogo durou %d horas %n", horaJogada);
		}
		else {
			horaJogada = (24 - horaInicial) +(horaFinal);
			System.out.printf("O jogo durou %d horas %n", horaJogada);
		}
					
	}

}
