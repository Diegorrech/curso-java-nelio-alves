package exerccicios_estrutura_condicionais;

import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double horaInicial = sc.nextDouble();
		double horaFinal = sc.nextDouble();

		double duracaoJogo;

		if (horaInicial < horaFinal) {
			duracaoJogo = horaFinal - horaInicial;
			System.out.println("duração do jogo foi de  " + duracaoJogo + " horas");
		} else {
			duracaoJogo = 24 - horaInicial + horaFinal;
			System.out.println(" duraçao do jogo foi de " + duracaoJogo + " horas");
		}
		sc.close();

	}

}
