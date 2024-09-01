package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student student = new Student();

		System.out.println(" digite uma nota ");

		student.name = sc.nextLine();
		student.grade1 = sc.nextDouble();
		student.grade2 = sc.nextDouble();
		student.grade3 = sc.nextDouble();

		System.out.printf("final grade : %.2f%n ", student.finalGrade());

		if (student.finalGrade() < 60.0) {
			System.out.println(" failed");
			System.out.printf(" missing %.2f point%n", student.missinPoints());
		} else {
			System.out.println(" pass");
		}

		sc.close();
	}

}
