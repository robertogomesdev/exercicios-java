package exercicios_Java;

import java.util.Locale;
import java.util.Scanner;

public class uri1002 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double raio, area;
		double n = 3.14159;

		raio = sc.nextDouble();

		raio = Math.pow(raio, 2);
		area = (n * raio);

		System.out.printf("A=%.4f%n", area);

		sc.close();
	}

}

//calcular área de uma circunferência
