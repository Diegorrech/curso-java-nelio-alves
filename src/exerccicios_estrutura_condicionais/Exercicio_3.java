package exerccicios_estrutura_condicionais;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int valor1;
		int valor2;

		System.out.println(" por favor digite um numero inteiro ");
		valor1 = sc.nextInt();

		System.out.println(" por favor digite ou numero inteiro ");
		valor2 = sc.nextInt();

		if (valor1 % valor2 == 0) {
			System.out.println(" numeros digitaos foi " + valor1 + " e " + valor2 + " esses numneros são multiplos ");

		}
		if (valor2 % valor1 == 0) {
			System.out.println(" numeros digitaos foi " + valor2 + " e " + valor1 + " esses numneros são multiplos ");
		}

		else if (valor1 / valor2 != 0 || valor2 / valor1 != 0) {
			System.out.println(" nao sao multiplos");
		}

		sc.close();
	}

}
