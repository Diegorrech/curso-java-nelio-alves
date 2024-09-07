package exerccicios_estrutura_condicionais;

import java.util.Scanner;

public class Exercício_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int codigo = sc.nextInt();
		int qtd = sc.nextInt();

		double contaPagar = .00;

		if (codigo == 1) {
			contaPagar = qtd * 4.00;

		}
		if (codigo == 2) {
			contaPagar = qtd * 4.50;
		}
		if (codigo == 3) {
			contaPagar = qtd * 5.00;
		}
		if (codigo == 4) {
			contaPagar = qtd * 2.00;
			
		} else  {
			contaPagar = qtd * 1.50;
		}
		System.out.printf("   a conta a pagar é no valor de :  R$%.2f ", contaPagar);

	}

}
