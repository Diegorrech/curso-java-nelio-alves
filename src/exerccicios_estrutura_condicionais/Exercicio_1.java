package exerccicios_estrutura_condicionais;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int number;

		System.out.println(" por favor digite algum numero ");

		number = sc.nextInt();

		if (number < 0) {
			System.out.println(" numero digitado foi " + number + " este é negativo  ");
		}

		else {
			System.out.println(" o numero digitado foi " + number + " numero não negativo ");
		}

		sc.close();
	}

}
