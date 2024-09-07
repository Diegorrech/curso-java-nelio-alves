package exerccicios_estrutura_condicionais;

import java.util.Scanner;

public class Exercicíco_7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double x, y;

		System.out.println(" digite um numero decimal");
		x = sc.nextDouble();

		System.out.println(" digite outro numero decimal");
		y = sc.nextDouble();

		if (x == 0 && y == 0) {
			System.out.println(" origem");
		} else if (x > 0 && y > 0) {
			System.out.println(" Q1");
		}
		if (x < 0 && y > 0) {
			System.out.println(" Q 2");
		}
		if (x < 0 && y < 0) {
			System.out.println("Q 3 ");
		} if( x > 0 && y <0 ) {
			System.out.println(" Q4");
		}

		sc.close();
	}

}
