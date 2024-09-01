package exerccicios_estrutura_condicionais;

import java.util.Locale;
import java.util.Scanner;

public class EExercício_6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		
		float valor = sc.nextFloat();
		
		
		if ( valor >= 0 &&  valor <= 25.00 ) {
			System.out.printf(" o valor digitado  foi  %.2f  ele se encontra entre ( 0,25] " , valor );
		}
		if( valor > 25.00 && valor <= 50.00) {
			System.out.printf(" o valor digitado foi  %.2f  ele se encontra entre ( 25,50] " , valor );
		}
		if ( valor >= 70 && valor <= 100) {
			System.out.printf(" o valor digitado foi %.2f ele se encontra entre ( 75,100]" , valor);
		}
		else if ( valor < 0 ) {
			System.out.println(" fora do intervalo");
		}
		
		
		
		
		sc.close();

	}

}
