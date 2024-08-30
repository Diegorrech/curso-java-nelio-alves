package exerccicios_estrutura_condicionais;

import java.util.Scanner;

public class Exercico_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num;

		System.out.println(" Por favor digite um numero ");
		num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println(" numero digite foi " + num + " : este numero é Par");
		} else {
			System.out.println(" numero digitado foi " + num + " : este numro é Impar");
		}

		sc.close();
	}

}
